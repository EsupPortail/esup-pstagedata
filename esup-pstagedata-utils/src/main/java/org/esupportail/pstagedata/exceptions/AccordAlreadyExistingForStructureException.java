package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordAlreadyExistingForStructureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public AccordAlreadyExistingForStructureException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AccordAlreadyExistingForStructureException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
