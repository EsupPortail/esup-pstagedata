package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructureLoginEppnAlreadyUsedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Vrai si login déjà utilisé
	 */
	private boolean login=false;
	/**
	 * Vrai si eppn déjà utilisé
	 */
	private boolean eppn=false;
	
	/**
	 * @param msg
	 */
	public AdminStructureLoginEppnAlreadyUsedException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AdminStructureLoginEppnAlreadyUsedException(String msg, Throwable cause){
		super(msg,cause);
	}

	/**
	 * @return the login
	 */
	public boolean isLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(boolean login) {
		this.login = login;
	}

	/**
	 * @return the eppn
	 */
	public boolean isEppn() {
		return eppn;
	}

	/**
	 * @param eppn the eppn to set
	 */
	public void setEppn(boolean eppn) {
		this.eppn = eppn;
	}
	
	
	
}
