package de.hsos.richwps.dsl.api.elements;

/**
 * Represents a reference (in/out/var) which can be used by assingments, and
 * execute statements.
 *
 * @author dalcacer
 */
public class InReference extends Reference {

    public InReference(String identifier) {
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

        InReference other = (InReference) obj;
        if (this.getId().equals(other.getId())) {
            return true;

        }
        return false;
    }
}
