package de.hsos.richwps.wsd.elements;

/**
 * Represents a reference (in/out/var) which can be used by assingments, and
 * execute statements.
 *
 * @author dalcacer
 */
public class OutReference extends Reference {

    public OutReference(String identifier) {
        super(identifier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        OutReference other = (OutReference) obj;
        if (this.getId().equals(other.getId())) {
            return true;
        }

        return false;
    }

}
