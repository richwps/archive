package de.hsos.richwps.dsl.api;

import com.google.inject.Injector;
import de.hsos.richwps.DSLStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author dalcacer
 * @version v1
 */
public class Writer {

    /**
     * Goolge Guice injector, which is needed by XText.
     */
    private final Injector injector;
    /**
     * XText model of an actual worksequence.
     */
    private de.hsos.richwps.dSL.Worksequence xtext_ws;
    /**
     * A more convinient representation of the worksequence.
     */
    private de.hsos.richwps.dsl.api.elements.Worksequence worksequence;

    /**
     * Constructs a new writer-object.
     */
    public Writer() {
        this.injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = new ResourceSetImpl();
    }

    /**
     * Creates a script 
     * file from a path string.
     *
     * @param path path to wd-file.
     * @throws Exception When worksequence is not loadable.
     */
    public void create(final String path, de.hsos.richwps.dsl.api.elements.Worksequence ws) throws Exception {
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = null;
        try {
            resource = rs.createResource(URI.createFileURI(path));;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        
    }
}
