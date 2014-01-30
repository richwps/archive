package de.hsos.richwps.dsl.api;

import com.google.inject.Injector;
import de.hsos.richwps.DSLStandaloneSetup;
import de.hsos.richwps.dSL.ExecInput;
import de.hsos.richwps.dSL.ExecOutput;
import de.hsos.richwps.dsl.api.elements.Assignment;
import de.hsos.richwps.dsl.api.elements.Binding;
import de.hsos.richwps.dsl.api.elements.Endpoint;
import de.hsos.richwps.dsl.api.elements.Execute;
import de.hsos.richwps.dsl.api.elements.IOperation;
import de.hsos.richwps.dsl.api.elements.InReference;
import de.hsos.richwps.dsl.api.elements.OutReference;
import de.hsos.richwps.dsl.api.elements.Reference;
import de.hsos.richwps.dsl.api.elements.VarReference;
import de.hsos.richwps.dsl.api.elements.Worksequence;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import de.hsos.richwps.dsl.api.exceptions.UnsupportedSyntaxException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * An reader for RichWPS DSL files.
 * <ol>
 * <li>load</li>
 * <li>inspect</li>
 * <li>get</li>
 * </ol>
 *
 * @author dalcacer
 * @version draft
 */
public class Reader {

    /**
     * XText model of an actual worksequence.
     */
    private de.hsos.richwps.dSL.Worksequence xtext_ws;
    /**
     * A more convinient representation of the worksequence.
     */
    private Worksequence worksequence;
    /**
     * Goolge Guice injector, which is needed by XText.
     */
    private final Injector injector;

    private int stat_bindings = 0;
    private int stat_executes = 0;
    private int stat_assingments = 0;

    /**
     * Constructs a new reader-object.
     */
    public Reader() {
        this.xtext_ws = null;
        this.worksequence = new Worksequence();
        this.injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        this.stat_bindings = 0;
        this.stat_executes = 0;
        this.stat_assingments = 0;
    }

    /**
     * Loads a script file from a path string.
     *
     * @param path path to wd-file.
     * @throws Exception When worksequence is not loadable.
     */
    public void load(final String path) throws Exception {
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = null;
        try {
            resource = rs.getResource(URI.createFileURI(path), true);
        } catch (Exception e) {
            throw new UnsupportedSyntaxException("The file has an unsupported syntax.", e);
        }

        if (resource == null) {
            throw new Exception("The script could not be loaded.");
        }

        this.xtext_ws = (de.hsos.richwps.dSL.Worksequence) resource.getContents().get(0);

        if (this.xtext_ws == null) {
            throw new Exception("The script could not be loaded.");
        }
    }

    /**
     * Loads a scriptfile from an java file object.
     *
     * @param file filehandle to wd-file.
     * @throws Exception When worksequence isn't loadable.
     */
    public void load(final java.io.File file) throws Exception {
        String abspath = file.getAbsolutePath();
        this.load(abspath);
    }

    /**
     * Once loaded the DSL file can be validated.
     *
     * @throws Exception
     */
    public void validate() throws Exception {
        //todo further consistency checks beyond XText syntax.
        throw new UnsupportedOperationException("Not implemented, yet.");
    }

    /**
     * Inspects the loaded DSL file and creates a sequential
     * higher-level representation.
     */
    public void inspect() throws Exception {
        TreeIterator<EObject> iterator = this.xtext_ws.eAllContents();

        while (iterator.hasNext()) {
            final EObject eo = iterator.next();
            IOperation elem = null;
            if (eo instanceof de.hsos.richwps.dSL.LocalBinding) {
                this.stat_bindings += 1;
                final de.hsos.richwps.dSL.LocalBinding lb = (de.hsos.richwps.dSL.LocalBinding) eo;
                System.out.println("local binding found: " + lb.toString());
                elem = this.createBinding(lb);
            } else if (eo instanceof de.hsos.richwps.dSL.RemoteBinding) {
                this.stat_bindings += 1;
                final de.hsos.richwps.dSL.RemoteBinding rb = (de.hsos.richwps.dSL.RemoteBinding) eo;
                System.out.println("remote binding found: " + rb.toString());
                elem = this.createBinding(rb);
            } else if (eo instanceof de.hsos.richwps.dSL.ExecuteStatement) {
                this.stat_executes += 1;
                final de.hsos.richwps.dSL.ExecuteStatement es = (de.hsos.richwps.dSL.ExecuteStatement) eo;
                System.out.println("execute statement found: " + es.toString());
                elem = this.createExecute(es);
            } else if (eo instanceof de.hsos.richwps.dSL.Assignment) {
                this.stat_assingments += 1;
                final de.hsos.richwps.dSL.Assignment as = (de.hsos.richwps.dSL.Assignment) eo;
                System.out.println("assigment statement found: " + as.toString());
                elem = this.createAssignment(as);
            }
            if (elem != null) {
                this.worksequence.add(elem);
            }
        }
    }

    /**
     * Converts an XText local binding to a binding object.
     *
     * @param lb Xtext local binding
     * @return binding.
     */
    private Binding createBinding(de.hsos.richwps.dSL.LocalBinding lb) {
        Binding b = new Binding(lb.getHandle(), lb.getProcessid());
        return b;
    }

    /**
     * Converts an XText remote binding to a binding object.
     *
     * @param rb Xtext remote binding
     * @return binding.
     */
    private Binding createBinding(de.hsos.richwps.dSL.RemoteBinding rb) {
        Binding b = new Binding();
        b.setHandle(rb.getHandle());
        b.setProcessId(rb.getProcessid());
        Endpoint ep = new Endpoint();
        ep.setHost(rb.getHost());
        ep.setPort(rb.getPort());
        ep.setProtocol(rb.getProtocol());
        ep.setPath(rb.getPath());
        b.setEndpoint(ep);
        return b;
    }

    /**
     * Converts an XText assingment to an assingment object.
     * <code>FIXME Testpurpose only. Reinmplement.</code>
     *
     * @param as Xtext assingment
     * @return assingment.
     */
    private Assignment createAssignment(de.hsos.richwps.dSL.Assignment as) throws Exception {
        Assignment oas = null;
        String lefthand_str = as.getLefthand();
        //FIXME Thought XText would produce objects instead of strings :( 
        System.out.println("Inspecting: "+lefthand_str);
        de.hsos.richwps.dsl.api.elements.Reference lefthand = null;
        if (lefthand_str.contains("in.")) {
            String identifier = lefthand_str.substring(2);
            lefthand = new InReference(identifier);
        } else if (lefthand_str.contains("out.")) {
            String identifier = lefthand_str.substring(3);
            lefthand = new OutReference(identifier);
        } else if (lefthand_str.contains("var.")) {
            String identifier = lefthand_str.substring(3);
            lefthand = new VarReference(identifier);
        }
        Reference righthand = null;
        String righthand_str = as.getRighthand();
        if (righthand_str != null) {
            if (righthand_str.contains("in.")) {
                String identifier = righthand_str.substring(2);
                righthand = new InReference(identifier);
            } else if (lefthand_str.contains("out.")) {
                String identifier = righthand_str.substring(3);
                righthand = new OutReference(identifier);
            } else if (righthand_str.contains("var.")) {
                String identifier = righthand_str.substring(3);
                righthand = new VarReference(identifier);
            }
        }

        if (righthand instanceof Reference) {
            oas = new Assignment(lefthand, (Reference) righthand);
        } else {
            if (as.getVal_s() != null) {
                oas = new Assignment(lefthand, as.getVal_s());
            } else {
                oas = new Assignment(lefthand, new Integer(as.getVal_i()));
            }
        }

        return oas;
    }

    /**
     * Converts an XText execute statement to an executes object.
     *
     * @param as Xtext execute statement
     * @return execute.
     */
    private Execute createExecute(de.hsos.richwps.dSL.ExecuteStatement es) throws Exception {
        Execute oas = new Execute(es.getHandle());
        EList<ExecInput> inputs = es.getExecinputs();
        EList<ExecOutput> outputs = es.getExecoutputs();

        for (ExecInput input : inputs) {
            String wpsid = input.getWpsid();
            String reference_str = input.getReference();
            Reference ref = null;
            if (reference_str.contains("in.")) {
                String identifier = reference_str.substring(2);
                ref = new InReference(identifier);
            } else if (reference_str.contains("var.")) {
                String identifier = reference_str.substring(2);
                ref = new VarReference(identifier);
            }
            oas.addInput(ref, wpsid);
        }

        for (ExecOutput output : outputs) {
            String wpsid = output.getWpsid();
            String reference_str = output.getReference();
            Reference ref = null;
            if (reference_str.contains("out.")) {
                String identifier = reference_str.substring(2);
                ref = new OutReference(identifier);
            } else if (reference_str.contains("var.")) {
                String identifier = reference_str.substring(2);
                ref = new VarReference(identifier);
            }
            oas.addOutput(wpsid, ref);

        }
        return oas;
    }

    /**
     * Returns the worksequence.
     *
     * @return worksequence the worksequence.
     *
     */
    public Worksequence getWorksequence() {
        return this.worksequence;
    }
}
