package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class Contact extends Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	
	/**
	 * Id Service
	 */
	private Integer idService;
	/**
	 * Id du centre de gestion
	 */
	private Integer idCentreGestion;
	/**
	 * Fonction
	 */
	private String fonction;
	/**
	 * Derniere date indiquant que les informations sont � jour
	 */
	private Date infosAJour;
	/**
	 * Login de la personne ayant confirm� que les infos sont � jour
	 */
	private String loginInfosAJour;	
	/**
	 * Login
	 */
	private String login;
	/**
	 * Mot de passe
	 */
	private String mdp;
	/**
	 * Commentaire
	 */
	private String commentaire;
	/* **
	 * Objets
	 */
	/**
	 * Service
	 */
	private Service service;
	
	/**
	 * Constructeur
	 */
	public Contact(){
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
	 * @return the idCentreGestion
	 */
	public Integer getIdCentreGestion() {
		return idCentreGestion;
	}
	/**
	 * @param idCentreGestion the idCentreGestion to set
	 */
	public void setIdCentreGestion(Integer idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}
	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}
	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
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

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}
	
	
}
