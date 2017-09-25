package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PersonnelCentreGestionDTO extends PersonneDTO implements Serializable{
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
	private int idCentreGestion;
	/**
	 * ID du droit d'administration
	 */
	private int idDroitAdmin;
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
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Centre de gestion
	 */
	private CentreGestionDTO centreGestion;
	/**
	 * Droit d'administration
	 */
	private DroitAdministrationDTO droitAdmin;
	/**
	 * Affectation
	 */
	private AffectationDTO affectation;
	
	/**
	 * Constructeur
	 */
	public PersonnelCentreGestionDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param p 
	 */
	public PersonnelCentreGestionDTO(PersonnelCentreGestion p){
		super(p,false);
		if(p!=null){
			if(p.getIdCentreGestion() != null )
				idCentreGestion=p.getIdCentreGestion();
			uidPersonnel=p.getUidPersonnel();
			fonction=p.getFonction();
			if(p.getIdDroitAdmin() != null )
				idDroitAdmin=p.getIdDroitAdmin();
			impressionConvention=p.getImpressionConvention();
			alertesMail=p.isAlertesMail();
			droitEvaluationEtudiant=p.isDroitEvaluationEtudiant();
			droitEvaluationEnseignant=p.isDroitEvaluationEnseignant();
			droitEvaluationEntreprise=p.isDroitEvaluationEntreprise();
			campus=p.getCampus();
			batiment=p.getBatiment();
			bureau=p.getBureau();
			codeAffectation=p.getCodeAffectation();
			codeUniversiteAffectation=p.getCodeUniversiteAffectation();
			if(p.getAffectation()!=null) 
				affectation=new AffectationDTO(p.getAffectation());
			if(p.getDroitAdmin()!=null) 
				droitAdmin=new DroitAdministrationDTO(p.getDroitAdmin());
		}
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
		"alertesMail : "+alertesMail+", "+
		"droitEvaluationEtudiant : "+droitEvaluationEtudiant+", "+
		"droitEvaluationEnseignant : "+droitEvaluationEnseignant+", "+
		"droitEvaluationEntreprise : "+droitEvaluationEntreprise+", "+
		"impressionConvention : "+impressionConvention+", "+super.toString();
	}
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof PersonnelCentreGestionDTO){
			r = this.getId()==((PersonnelCentreGestionDTO)o).getId();
		}
		return r;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	
	/**
	 * @return the idCentreGestion
	 */
	public int getIdCentreGestion() {
		return idCentreGestion;
	}
	/**
	 * @param idCentreGestion the idCentreGestion to set
	 */
	public void setIdCentreGestion(int idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}
	/**
	 * @return the idDroitAdmin
	 */
	public int getIdDroitAdmin() {
		return idDroitAdmin;
	}
	/**
	 * @param idDroitAdmin the idDroitAdmin to set
	 */
	public void setIdDroitAdmin(int idDroitAdmin) {
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
	 * @return the centreGestion
	 */
	public CentreGestionDTO getCentreGestion() {
		return centreGestion;
	}

	/**
	 * @param centreGestion the centreGestion to set
	 */
	public void setCentreGestion(CentreGestionDTO centreGestion) {
		this.centreGestion = centreGestion;
	}

	/**
	 * @return the droitAdmin
	 */
	public DroitAdministrationDTO getDroitAdmin() {
		return droitAdmin;
	}

	/**
	 * @param droitAdmin the droitAdmin to set
	 */
	public void setDroitAdmin(DroitAdministrationDTO droitAdmin) {
		this.droitAdmin = droitAdmin;
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
	/**
	 * @param impressionConvention the impressionConvention to set
	 */
	public void setImpressionConvention(boolean impressionConvention) {
		this.impressionConvention = impressionConvention;
	}
	/**
	 * @return the Impression Convention
	 */
	public boolean getImpressionConvention() {
		return impressionConvention;
	}
	/**
	 * @param codeAffectation the codeAffectation to set
	 */
	public void setCodeAffectation(String codeAffectation) {
		this.codeAffectation = codeAffectation;
	}
	/**
	 * @return the codeAffectation
	 */
	public String getCodeAffectation() {
		return codeAffectation;
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
