package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class PersonalAlreadyExistingForCentreException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public PersonalAlreadyExistingForCentreException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public PersonalAlreadyExistingForCentreException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
