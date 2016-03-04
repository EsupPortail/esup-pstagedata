package org.esupportail.pstagedata.exceptions;

/**
 * @author Maxime Ostrowski : maxime.ostrowski@univ-artois.fr
 */
public class DataReactivateException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param msg
     */
    public DataReactivateException(String msg){ super(msg); }

    /**
     * @param msg
     * @param cause
     */
    public DataReactivateException(String msg, Throwable cause){
        super(msg,cause);
    }

}
