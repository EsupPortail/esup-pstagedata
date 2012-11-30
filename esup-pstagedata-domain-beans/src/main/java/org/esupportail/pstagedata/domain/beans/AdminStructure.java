package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructure extends Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * Login/UID
	 */
	private String login;
	/**
	 * EPPN
	 */
	private String eppn;
	/**
	 * Mot de passe
	 */
	private String mdp;
	
	/**
	 * Constructeur
	 */
	public AdminStructure(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the eppn
	 */
	public String getEppn() {
		return eppn;
	}

	/**
	 * @param eppn the eppn to set
	 */
	public void setEppn(String eppn) {
		this.eppn = eppn;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	
	
}
