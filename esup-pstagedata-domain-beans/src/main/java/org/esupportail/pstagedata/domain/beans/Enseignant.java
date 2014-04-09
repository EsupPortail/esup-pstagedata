package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author  Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class Enseignant extends Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * uidEnseignant
	 */
	private String uidEnseignant;

	/**
	 * CampusEnseignant
	 */
	private String campus;
	/**
	 * BureauEnseignant
	 */
	private String bureau;
	/**
	 * BatimentEnseignant
	 */
	private String batiment;

	/**
	 * Code Affectation
	 */
	private String 	codeAffectation;
	/**
	 * codeUniversite
	 */
	private String codeUniversiteAffectation;
	
	/* **
	 * Objets
	 */
	
	/**
	 * Affectation
	 */
	private Affectation affectation;
	
	/**
	 * Constructeur
	 */
	public Enseignant(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

	/**
	 * @return the uidEnseignant
	 */
	public String getUidEnseignant() {
		return uidEnseignant;
	}


	/**
	 * @param uidEnseignant the uidEnseignant to set
	 */
	public void setUidEnseignant(String uidEnseignant) {
		this.uidEnseignant = uidEnseignant;
	}


	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}


	/**
	 * @param campus the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}


	/**
	 * @return the bureau
	 */
	public String getBureau() {
		return bureau;
	}


	/**
	 * @param bureau the bureau to set
	 */
	public void setBureau(String bureau) {
		this.bureau = bureau;
	}


	/**
	 * @return the batiment
	 */
	public String getBatiment() {
		return batiment;
	}


	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}


	/**
	 * @return the codeAffectation
	 */
	public String getCodeAffectation() {
		return codeAffectation;
	}


	/**
	 * @param codeAffectation the codeAffectation to set
	 */
	public void setCodeAffectation(String codeAffectation) {
		this.codeAffectation = codeAffectation;
	}

	/**
	 * @return the codeUniversiteAffectation
	 */
	public String getCodeUniversiteAffectation() {
		return codeUniversiteAffectation;
	}

	/**
	 * @param codeUniversiteAffectation the codeUniversiteAffectation to set
	 */
	public void setCodeUniversiteAffectation(String codeUniversiteAffectation) {
		this.codeUniversiteAffectation = codeUniversiteAffectation;
	}

	/**
	 * @param affectation the affectation to set
	 */
	public void setAffectation(Affectation affectation) {
		this.affectation = affectation;
	}

	/**
	 * @return the affectation
	 */
	public Affectation getAffectation() {
		return affectation;
	}




}
