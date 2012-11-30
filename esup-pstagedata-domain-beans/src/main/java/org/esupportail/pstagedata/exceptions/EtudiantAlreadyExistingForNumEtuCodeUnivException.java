package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtudiantAlreadyExistingForNumEtuCodeUnivException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public EtudiantAlreadyExistingForNumEtuCodeUnivException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public EtudiantAlreadyExistingForNumEtuCodeUnivException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
