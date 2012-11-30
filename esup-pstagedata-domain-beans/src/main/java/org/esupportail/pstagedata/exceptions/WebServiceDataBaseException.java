package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class WebServiceDataBaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public WebServiceDataBaseException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public WebServiceDataBaseException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
