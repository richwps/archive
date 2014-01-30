package de.hsos.richwps.dsl.elements;

import de.hsos.richwps.dsl.exceptions.UnsupportedSyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an execute-statement:  <code>
 * execute $org/name$
 * with
 * $runtimereference{in/var}$ as wps-input-identifier-targetprocess
 * . . .
 * $runtimereference{in/var}$ as wps-input-identifier-targetprocess
 * store
 * wps-output-identifier-targetprocess as $runtimereference{out/var}$
 * . . .
 * wps-output-identifier-targetprocess as $runtimereference{out/var}$
 * </code>
 *
 * @author fbensmann
 * @author dalcacer
 */
public class Execute implements IOperation {

    private String handle;
    private List<String> inputnames = null;
    private List<String> outputnames = null;
    private List<Reference> inputreferences = null;
    private List<Reference> outputreferences = null;

    public Execute(String handle) {
        this.handle = handle;
        inputnames = new ArrayList<String>();
        outputnames = new ArrayList<String>();
        inputreferences = new ArrayList<Reference>();
        outputreferences = new ArrayList<Reference>();
    }

    /**
     *
     * @param from inreference or outreference
     * @param wpsto wps-input-parameter
     */
    public void addInput(Reference from, String wpsto) throws Exception {
        if (from instanceof OutReference) {
            throw new UnsupportedSyntaxException("Binding wps-outputs to worksequence inputs is not allowed.");
        }
        inputnames.add(wpsto);
        inputreferences.add(from);
    }

    /**
     *
     * @param wpsfrom wps-output-parameter
     * @param to outrefernce or varrefernce.
     */
    public void addOutput(String wpsfrom, Reference to) throws Exception {
        if (to instanceof InReference) {
            throw new UnsupportedSyntaxException("Binding wps-outputs to worksequence inputs is not allowed.");
        }
        outputnames.add(wpsfrom);
        outputreferences.add(to);
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public List<String> getInputnames() {
        return inputnames;
    }

    public void setInputnames(List<String> inputnames) {
        this.inputnames = inputnames;
    }

    public List<String> getOutputnames() {
        return outputnames;
    }

    public void setOutputnames(List<String> outputnames) {
        this.outputnames = outputnames;
    }

    public List<Reference> getInputreferences() {
        return inputreferences;
    }

    public void setInputreferences(List<Reference> inputreferences) {
        this.inputreferences = inputreferences;
    }

    public List<Reference> getOutputreferences() {
        return outputreferences;
    }

    public void setOutputreferences(List<Reference> outputreferences) {
        this.outputreferences = outputreferences;
    }
    
    

}
