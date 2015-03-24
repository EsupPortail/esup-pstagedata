package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccountAlreadyExistingForCoupleMailStructureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public AccountAlreadyExistingForCoupleMailStructureException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AccountAlreadyExistingForCoupleMailStructureException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
