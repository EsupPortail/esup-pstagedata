package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Login de la personne ayant cr��
	 */
	private String loginCreation;
	/**
	 * Login de la derni�re personne ayant modifi� 
	 */
	private String loginModif;
	/**
	 * Date cr�ation
	 */
	private Date dateCreation;
	/**
	 * Derni�re date de modification
	 */
	private Date dateModif;
	
	/**
	 * Constructeur
	 */
	public ObjetMetiers(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the loginCreation
	 */
	public String getLoginCreation() {
		return loginCreation;
	}
	/**
	 * @param loginCreation the loginCreation to set
	 */
	public void setLoginCreation(String loginCreation) {
		this.loginCreation = loginCreation;
	}
	/**
	 * @return the loginModif
	 */
	public String getLoginModif() {
		return loginModif;
	}
	/**
	 * @param loginModif the loginModif to set
	 */
	public void setLoginModif(String loginModif) {
		this.loginModif = loginModif;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * @return the dateModif
	 */
	public Date getDateModif() {
		return dateModif;
	}
	/**
	 * @param dateModif the dateModif to set
	 */
	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}
	
	
}
