package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class MailAlreadyUsedForStructureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public MailAlreadyUsedForStructureException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public MailAlreadyUsedForStructureException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
