package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;


/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PersonnelCentreGestion extends Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * ID Centre de gestion
	 */
	private Integer idCentreGestion;
	/**
	 * ID du droit d'administration
	 */
	private Integer idDroitAdmin;
	/**
	 * UID de la personne
	 */
	private String uidPersonnel;
	/**
	 * Fonction
	 */
	private String fonction;
	/**
	 * Campus
	 */
	private String campus;
	/**
	 * Batiment
	 */
	private String batiment;
	/**
	 * Bureau
	 */
	private String bureau;
	/**
	 * Impression Convention
	 */
	private boolean impressionConvention;
	/**
	 * Code Affectation
	 */
	private String codeAffectation;
	/**
	 * codeUniversite
	 */
	private String codeUniversiteAffectation;
	/**
	 * alertes mail
	 */
	private boolean alertesMail;
	/**
	 * droitEvaluationEtudiant
	 */
	private boolean droitEvaluationEtudiant;
	/**
	 * droitEvaluationEnseignant
	 */
	private boolean droitEvaluationEnseignant;
	/**
	 * droitEvaluationEntreprise
	 */
	private boolean droitEvaluationEntreprise;
	
	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * Centre de gestion
	 */
	private CentreGestion centreGestion;
	/**
	 * Droits d'administration du personnel
	 */
	private DroitAdministration droitAdmin;
	/**
	 * Affectation
	 */
	private Affectation affectation;
	/**
	 * Civilite
	 */
	private Civilite civilite;

	/**
	 * Constructeur
	 */
	public PersonnelCentreGestion(){
		super();
	}

	/**
	 * @see org.esupportail.pstagedata.domain.dto.PersonneDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"uidPersonnel : "+uidPersonnel+", "+
		"idCentreGestion : "+idCentreGestion+", "+
		"idDroitAdministration : "+idDroitAdmin+", "+
		"batiment : "+batiment+", "+
		"bureau : "+bureau+", "+
		"campus : "+campus+", "+
		"fonction : "+fonction+", "+
		"codeAffectation : "+codeAffectation+", "+
		"impressionConvention : "+impressionConvention+", "+
		"droitEvaluationEtudiant : "+droitEvaluationEtudiant+", "+
		"droitEvaluationEnseignant : "+droitEvaluationEnseignant+", "+
		"droitEvaluationEntreprise : "+droitEvaluationEntreprise+", "+
		"alertesMail : "+alertesMail+", "+super.toString();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	
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
	 * @return the idDroitAdmin
	 */
	public Integer getIdDroitAdmin() {
		return idDroitAdmin;
	}
	/**
	 * @param idDroitAdmin the idDroitAdmin to set
	 */
	public void setIdDroitAdmin(Integer idDroitAdmin) {
		this.idDroitAdmin = idDroitAdmin;
	}
	/**
	 * @return the uidPersonnel
	 */
	public String getUidPersonnel() {
		return uidPersonnel;
	}
	/**
	 * @param uidPersonnel the uidPersonnel to set
	 */
	public void setUidPersonnel(String uidPersonnel) {
		this.uidPersonnel = uidPersonnel;
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
	 * @return the impressionConvention
	 */
	public boolean getImpressionConvention() {
		return impressionConvention;
	}
	/**
	 * @param impressionConvention the impressionConvention to set
	 */
	public void setImpressionConvention(boolean impressionConvention) {
		this.impressionConvention = impressionConvention;
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
	 * @param droitAdmin the droitAdmin to set
	 */
	public void setDroitAdmin(DroitAdministration droitAdmin) {
		this.droitAdmin = droitAdmin;
	}

	/**
	 * @return the droitAdmin
	 */
	public DroitAdministration getDroitAdmin() {
		return droitAdmin;
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

	/**
	 * @param centreGestion the centreGestion to set
	 */
	public void setCentreGestion(CentreGestion centreGestion) {
		this.centreGestion = centreGestion;
	}

	/**
	 * @return the centreGestion
	 */
	public CentreGestion getCentreGestion() {
		return centreGestion;
	}

	/**
	 * @param civilite the civilite to set
	 */
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	/**
	 * @return the civilite
	 */
	public Civilite getCivilite() {
		return civilite;
	}

	/**
	 * @return the alertesMail
	 */
	public boolean isAlertesMail() {
		return alertesMail;
	}

	/**
	 * @param alertesMail the alertesMail to set
	 */
	public void setAlertesMail(boolean alertesMail) {
		this.alertesMail = alertesMail;
	}

	/**
	 * @return the droitEvaluationEtudiant
	 */
	public boolean isDroitEvaluationEtudiant() {
		return droitEvaluationEtudiant;
	}

	/**
	 * @param droitEvaluationEtudiant the droitEvaluationEtudiant to set
	 */
	public void setDroitEvaluationEtudiant(boolean droitEvaluationEtudiant) {
		this.droitEvaluationEtudiant = droitEvaluationEtudiant;
	}

	/**
	 * @return the droitEvaluationEnseignant
	 */
	public boolean isDroitEvaluationEnseignant() {
		return droitEvaluationEnseignant;
	}

	/**
	 * @param droitEvaluationEnseignant the droitEvaluationEnseignant to set
	 */
	public void setDroitEvaluationEnseignant(boolean droitEvaluationEnseignant) {
		this.droitEvaluationEnseignant = droitEvaluationEnseignant;
	}

	/**
	 * @return the droitEvaluationEntreprise
	 */
	public boolean isDroitEvaluationEntreprise() {
		return droitEvaluationEntreprise;
	}

	/**
	 * @param droitEvaluationEntreprise the droitEvaluationEntreprise to set
	 */
	public void setDroitEvaluationEntreprise(boolean droitEvaluationEntreprise) {
		this.droitEvaluationEntreprise = droitEvaluationEntreprise;
	}
}
