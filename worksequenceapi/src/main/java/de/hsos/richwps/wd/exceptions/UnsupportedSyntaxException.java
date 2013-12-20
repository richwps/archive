package de.hsos.richwps.wd.exceptions;

/**
 *
 * @author dalcacer
 */
public class UnsupportedSyntaxException extends Exception{
 
    
    public UnsupportedSyntaxException(){
    }
    
    public UnsupportedSyntaxException(String message){
       super(message);
    }
    
    public UnsupportedSyntaxException(Throwable cause){
        super(cause);
    }
    
    public UnsupportedSyntaxException(String message, Throwable cause){
        super(message,cause);
    }
}
