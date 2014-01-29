package de.hsos.richwps.wsd.elements;

/**
 * Represents a local or remote binding.
 *
 * @author fbensmann
 * @author dalcacer
 */
public class Binding implements IOperation {

    /**
     * The bindings unique handle.
     */
    private String handle = null;
    /**
     * Endpoint this binding connects to
     */
    private Endpoint endpoint = null;
    private String processid = null;

    public Binding() {
        this.handle = "";
        this.processid = "";
        this.endpoint = null;
    }

    public Binding(String handle, String processid) {
        this.handle = handle;
        this.processid = processid;
        this.endpoint = null;
    }

    public boolean isLocal() {
        if (this.endpoint == null) {
            return true;
        }
        return false;
    }

    public String getHandle() {
        return this.handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint processEndpoint) {
        this.endpoint = processEndpoint;
    }

    public String getProcessId() {
        return processid;
    }

    public void setProcessId(String process) {
        this.processid = process;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Binding other = (Binding) obj;
        if ((this.handle == null) ? (other.handle != null) : !this.handle.equals(other.handle)) {
            return false;
        }
        if (this.endpoint != other.endpoint && (this.endpoint == null || !this.endpoint.equals(other.endpoint))) {
            return false;
        }
        if ((this.processid == null) ? (other.processid != null) : !this.processid.equals(other.processid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Binding{" + "handle=" + handle + ", endpoint=" + endpoint + ", processid=" + processid + '}';
    }

}
