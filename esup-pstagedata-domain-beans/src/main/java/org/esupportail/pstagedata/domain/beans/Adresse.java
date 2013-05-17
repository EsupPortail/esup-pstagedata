package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class Adresse extends ObjetMetiers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Proprietes
	 ****************************************************************/
	
	/**
	 * Batiment/Residence/Z.I./Immeuble
	 */
	private String batimentResidence;
	/**
	 * Voie
	 */
	private String voie;
	/**
	 * Commune
	 */
	private String commune;
	/**
	 * Code postal
	 */
	private String codePostal;
	/**
	 * ID du pays
	 */
	private Integer idPays;
	/**
	 * Code commune
	 */
	private String codeCommune;
	/**
	 * Libelle Cedex
	 */
	private String libCedex;
	
	/**
	 * Constructeur
	 */
	public Adresse(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the batimentResidence
	 */
	public String getBatimentResidence() {
		return batimentResidence;
	}

	/**
	 * @param batimentResidence the batimentResidence to set
	 */
	public void setBatimentResidence(String batimentResidence) {
		this.batimentResidence = batimentResidence;
	}

	/**
	 * @return the voie
	 */
	public String getVoie() {
		return voie;
	}

	/**
	 * @param voie the voie to set
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}

	/**
	 * @return the commune
	 */
	public String getCommune() {
		return commune;
	}

	/**
	 * @param commune the commune to set
	 */
	public void setCommune(String commune) {
		this.commune = commune;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the idPays
	 */
	public Integer getIdPays() {
		return idPays;
	}

	/**
	 * @param idPays the idPays to set
	 */
	public void setIdPays(Integer idPays) {
		this.idPays = idPays;
	}

	/**
	 * @return the libCedex
	 */
	public String getLibCedex() {
		return libCedex;
	}

	/**
	 * @param libCedex the libCedex to set
	 */
	public void setLibCedex(String libCedex) {
		this.libCedex = libCedex;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
		
	
}
