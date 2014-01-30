package de.hsos.richwps.dsl.api.elements;

import java.util.ArrayList;

/**
 * @author dalcacer
 */
public class Worksequence extends ArrayList<IOperation> {

   /**
     * Creates a new <b>sequential</b> Worksequence.
     */
    public Worksequence() {
        super();
    }

    public int countBindings() {
        int bindings = 0;
        for (Object o : this) {
            if (o instanceof Binding) {
                bindings++;
            }
        }
        return bindings;
    }

    public int countAssignments() {
        int assingments = 0;
        for (Object o : this) {
            if (o instanceof Assignment) {
                assingments++;
            }
        }
        return assingments;
    }

    public int countExecutes() {
        int executes = 0;
        for (Object o : this) {
            if (o instanceof Execute) {
                executes++;
            }
        }
        return executes;
    }

}
