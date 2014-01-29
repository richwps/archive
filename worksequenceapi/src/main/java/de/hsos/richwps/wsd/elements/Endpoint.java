package de.hsos.richwps.wsd.elements;

/**
 *
 * @author fbensman
 * @author dalcacer
 */
public class Endpoint {
    
    /**
     * Protocoll type for endpoint
     */
    private String protocol = null;
    /**
     * host name for endpoint
     */
    private String host = null;
    /**
     * Port of endpoint
     */
    private int port = -1;
    /**
     * Path to endpoint
     */
    private String path = null;
    
    public Endpoint(){}

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPathToEndPoint() {
        return path;
    }

    public void setPath(String pathToEndPoint) {
        this.path = pathToEndPoint;
    }

    @Override
    public String toString() {
        return "Endpoint{" + "protocoll=" + protocol + ", host=" + host + ", port=" + port + ", path=" + path + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endpoint other = (Endpoint) obj;
        if ((this.protocol == null) ? (other.protocol != null) : !this.protocol.equals(other.protocol)) {
            return false;
        }
        if ((this.host == null) ? (other.host != null) : !this.host.equals(other.host)) {
            return false;
        }
        if (this.port != other.port) {
            return false;
        }
        if ((this.path == null) ? (other.path != null) : !this.path.equals(other.path)) {
            return false;
        }
        return true;
    }
    
    
    
   
    
}
