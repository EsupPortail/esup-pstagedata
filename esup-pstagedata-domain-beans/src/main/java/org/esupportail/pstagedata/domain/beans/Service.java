package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class Service extends Adresse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * ID
	 */
	private Integer idService;
	/**
	 * Id Structure
	 */
	private Integer idStructure;
	/**
	 * Nom
	 */
	private String nom;
	/**
	 * Derniere date indiquant que les informations sont � jour
	 */
	private Date infosAJour;
	/**
	 * Login de la personne ayant confirm� que les infos sont � jour
	 */
	private String loginInfosAJour;	
	/* **
	 * Objets
	 */
	
	/**
	 * Constructeur
	 */
	public Service(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the idService
	 */
	public Integer getIdService() {
		return idService;
	}
	/**
	 * @param idService the idService to set
	 */
	public void setIdService(Integer idService) {
		this.idService = idService;
	}
	/**
	 * @return the idStructure
	 */
	public Integer getIdStructure() {
		return idStructure;
	}
	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(Integer idStructure) {
		this.idStructure = idStructure;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the infosAJour
	 */
	public Date getInfosAJour() {
		return infosAJour;
	}

	/**
	 * @param infosAJour the infosAJour to set
	 */
	public void setInfosAJour(Date infosAJour) {
		this.infosAJour = infosAJour;
	}

	/**
	 * @return the loginInfosAJour
	 */
	public String getLoginInfosAJour() {
		return loginInfosAJour;
	}

	/**
	 * @param loginInfosAJour the loginInfosAJour to set
	 */
	public void setLoginInfosAJour(String loginInfosAJour) {
		this.loginInfosAJour = loginInfosAJour;
	}
	
	
	
}
