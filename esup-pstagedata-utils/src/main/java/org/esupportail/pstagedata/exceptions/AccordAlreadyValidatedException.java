package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordAlreadyValidatedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public AccordAlreadyValidatedException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AccordAlreadyValidatedException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
