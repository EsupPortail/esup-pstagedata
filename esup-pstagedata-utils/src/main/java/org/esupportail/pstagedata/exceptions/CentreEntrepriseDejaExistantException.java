package org.esupportail.pstagedata.exceptions;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreEntrepriseDejaExistantException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public CentreEntrepriseDejaExistantException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public CentreEntrepriseDejaExistantException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
