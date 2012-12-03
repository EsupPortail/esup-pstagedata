package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CentreGestionSuperviseur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id du centre superviseur
	 */
	private int idCentreGestionSuperviseur;
	/**
	 * Nom du centre superviseur
	 */
	private String nomCentreGestionSuperviseur;
	
	/**
	 * Constructeur
	 */
	public CentreGestionSuperviseur(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	/**
	 * @param idCentreGestionSuperviseur the idCentreGestionSuperviseur to set
	 */
	public void setIdCentreGestionSuperviseur(int idCentreGestionSuperviseur) {
		this.idCentreGestionSuperviseur = idCentreGestionSuperviseur;
	}
	/**
	 * @return the idCentreGestionSuperviseur
	 */
	public int getIdCentreGestionSuperviseur() {
		return idCentreGestionSuperviseur;
	}
	/**
	 * @param nomCentreGestionSuperviseur the nomCentreGestionSuperviseur to set
	 */
	public void setNomCentreGestionSuperviseur(
			String nomCentreGestionSuperviseur) {
		this.nomCentreGestionSuperviseur = nomCentreGestionSuperviseur;
	}
	/**
	 * @return the nomCentreGestionSuperviseur
	 */
	public String getNomCentreGestionSuperviseur() {
		return nomCentreGestionSuperviseur;
	}
}
