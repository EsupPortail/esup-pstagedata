package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordAlreadyExistingForContactException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public AccordAlreadyExistingForContactException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AccordAlreadyExistingForContactException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
