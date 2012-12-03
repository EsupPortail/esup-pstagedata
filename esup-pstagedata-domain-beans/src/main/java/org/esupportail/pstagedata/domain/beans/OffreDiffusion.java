package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDiffusion extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID Centre Gestion
	 */
	private Integer idCentreGestion;
	/**
	 * ID offre
	 */
	private Integer idOffre;
	/**
	 * Nom du centre
	 */
	private String nomCentre;
	/**
	 * vrai si mise en Avant
	 */
	private boolean estMiseEnAvant;
	
	/**
	 * Constructeur
	 */
	public OffreDiffusion(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @param idCentreGestion
	 */
	public void setIdCentreGestion(Integer idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}

	/**
	 * @return Integer
	 */
	public Integer getIdCentreGestion() {
		return idCentreGestion;
	}

	/**
	 * @param idOffre
	 */
	public void setIdOffre(Integer idOffre) {
		this.idOffre = idOffre;
	}

	/**
	 * @return Integer
	 */
	public Integer getIdOffre() {
		return idOffre;
	}

	/**
	 * @return the nomCentre
	 */
	public String getNomCentre() {
		return nomCentre;
	}

	/**
	 * @param nomCentre the nomCentre to set
	 */
	public void setNomCentre(String nomCentre) {
		this.nomCentre = nomCentre;
	}

	/**
	 * @param estMiseEnAvant
	 */
	public void setEstMiseEnAvant(boolean estMiseEnAvant) {
		this.estMiseEnAvant = estMiseEnAvant;
	}

	/**
	 * @return boolean
	 */
	public boolean isEstMiseEnAvant() {
		return estMiseEnAvant;
	}
}
