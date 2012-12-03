package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Enseignant;

/**
 * @author  Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EnseignantDTO extends PersonneDTO implements Serializable{
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
	 * Objets Affectation
	 */
	
	/**
	 * AffectationDTO
	 */
	private AffectationDTO affectation;
	
	/**
	 * Constructeur
	 */
	public EnseignantDTO(){
		super();
	}
	
	
	/**
	 * Constructeur
	 * @param e
	 */
	public EnseignantDTO(Enseignant e){
		super(e,false);
		if(e!=null){
			this.uidEnseignant=e.getUidEnseignant();
			this.campus= e.getCampus();
			this.bureau = e.getBureau();
			this.batiment=e.getBatiment();
			this.codeAffectation=e.getCodeAffectation();
			this.codeUniversiteAffectation=e.getCodeUniversiteAffectation();
		}
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.PersonneDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"uidEnseignant : "+uidEnseignant+", "+
		"campus : "+campus+", "+
		"bureau : "+bureau +", "+
		"batiment : "+batiment+", "+
		"codeAffectation : "+codeAffectation+", "+
		", "+super.toString();

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
	 * @return the affectation
	 */
	public AffectationDTO getAffectation() {
		return affectation;
	}


	/**
	 * @param affectation the affectation to set
	 */
	public void setAffectation(AffectationDTO affectation) {
		this.affectation = affectation;
	}




}
