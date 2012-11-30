package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class Offre extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * ID offre
	 */
	private Integer idOffre;
	/**
	 * ID Type d'offre
	 */
	private Integer idTypeOffre;
	/**
	 * ID Contrat
	 */
	private Integer idContratOffre;
	/**
	 * ID Unit� de la dur�e
	 */
	private Integer idUniteDuree;
	/**
	 * ID niveau de qualification (FAP 4�me caract�re) 
	 */
	private Integer idQualificationSimplifiee;
	/**
	 * Code de la fap de niveau 3
	 */
	private String codeFAP_N3;
	/**
	 * Code ROM
	 */
	private Integer codeROM;
	/**
	 * ID Pays
	 */
	private Integer idLieuPays;
	/**
	 * ID Temps de travail
	 */
	private Integer idTempsTravail;
	/**
	 * Mode(s) de candidature
	 */
	private List<Integer> idsModeCandidature;
	/**
	 * ID du niveau de formation
	 */
	private Integer idNiveauFormation;
	/**
	 * ID de la structure
	 */
	private Integer idStructure;
	/**
	 * ID du centre de gestion
	 */
	private Integer idCentreGestion;
	/**
	 * ID du contact pour candidater
	 */
	private Integer idContactCand;
	/**
	 * ID du contact pour information
	 */
	private Integer idContactInfo;
	/**
	 * ID du contact proprietaire
	 */
	private Integer idContactProprio;
	/**
	 * ID du personnel r�f�rent
	 */
	private Integer idReferent;
	/**
	 * Mois de d�but
	 */
	private String moisDebut;
	/**
	 * Ann�e de d�but
	 */
	private String anneeDebut;
	/**
	 * Pr�cision sur le d�but de la mission
	 */
	private String precisionDebut;
	/**
	 * Dur�e du contrat si CDD
	 */
	private Integer duree;
	/**
	 * Intitul� de l'offre
	 */
	private String intitule;
	/**
	 * Description
	 */
	private String description;
	/**
	 * Commune de la mission principale
	 */
	private String lieuCommune;
	/**
	 * Code commune
	 */
	private Integer codeCommune;
	/**
	 * Code postal du lieu de la mission principale
	 */
	private String lieuCodePostal;
	/**
	 * vrai si d�placement � pr�voir
	 */
	private boolean deplacement;
	/**
	 * vrai si besoin du permis voiture
	 */
	private boolean permis;
	/**
	 * vrai si besoin d'une voiture
	 */
	private boolean voiture;
	/**
	 * R�mun�ration
	 */
	private boolean remuneration;
	/**
	 * Pr�cision sur la r�mun�ration
	 */
	private String precisionRemuneration;
	/**
	 * Avantages
	 */
	private String avantages;
	/**
	 * Quotit� de travail
	 */
	private String quotiteTravail;
	/**
	 * Commentaires sur le temps de travail
	 */
	private String commentaireTempsTravail;
	/**
	 * Observations
	 */
	private String observations;
	/**
	 * Comp�tences
	 */
	private String competences;
	/**
	 * R�f�rence de l'offre au sein de l'�tablissement
	 */
	private String referenceOffreEtablissement;
	/**
	 * Date de diffusion de l'offre
	 */
	private Date dateDiffusion;
	/**
	 * Date de fin de diffusion de l'offre
	 */
	private Date dateFinDiffusion;
	/**
	 * Date de validation de l'offre
	 */
	private Date dateValidation;
	/**
	 * Date de stopage/d�validation de l'offre
	 */
	private Date dateStopValidation;
	/**
	 * login de la personne ayant diffus�e l'offre
	 */
	private String loginDiffusion;
	/**
	 * login de la personne ayant arr�t�e la diffusion
	 */
	private String loginStopDiffusion;
	/**
	 * Date de stopage de la diffusion
	 */
	private Date dateStopDiffusion;
	/**
	 * login de la personne ayant valid�e
	 */
	private String loginValidation;
	/**
	 * login de la personne ayant stop�/d�valid� l'offre
	 */
	private String loginStopValidation;
	/**
	 * login de la personne ayant rejet� l'offre � la validation
	 */
	private String loginRejetValidation;
	/**
	 * vrai si l'offre est pourvue
	 */
	private boolean estPourvue;
	/**
	 * vrai si l'offre est diffus�e
	 */
	private boolean estDiffusee;
	/**
	 * vrai si l'offre est valid�e
	 */
	private boolean estValidee;
	/**
	 * Etat de la validation (si validation des offres)
	 * 0 : non valid�e
	 * 1 : valid�e
	 * 2 : en cours
	 * 3 : refus�e
	 */
	private Integer etatValidation;
	/**
	 * vrai si supprim�e
	 */
	private boolean estSupprimee;
	/**
	 * Indiquer si l�offre est accessible ou non aux �tudiants ayant une Reconnaissance 
	 * de Qualification de Travailleur Handicap� (RQTH)
	 */
	private boolean estAccessERQTH;
	/**
	 * Indiquer si l�offre est prioritaire ou non aux �tudiants ayant une Reconnaissance 
	 * de Qualification de Travailleur Handicap� (RQTH)
	 */
	private boolean estPrioERQTH;
	/**
	 * Pr�cision sur le handicapes
	 */
	private String precisionHandicap;
	/**
	 * Lien attach� 
	 */
	private String lienAttache;
	/**
	 * ID Fichier attach�
	 */
	private Integer idFichier;
	/**
	 * Vrai si offre avec fichier 
	 */
	private boolean avecFichier;
	/**
	 * Vrai si offre avec un lien
	 */
	private boolean avecLien;
	/**
	 * vrai si le t�l�phone du contact pour candidature doit �tre cach�
	 */
	private boolean cacherTelContactCand;
	/**
	 * vrai si le fax du contact pour candidature doit �tre cach�
	 */
	private boolean cacherFaxContactCand;
	/**
	 * vrai si le mail du contact pour candidature doit �tre cach�
	 */
	private boolean cacherMailContactCand;
	/**
	 * vrai si le t�l�phone du contact pour information doit �tre cach�
	 */
	private boolean cacherTelContactInfo;
	/**
	 * vrai si le fax du contact pour information doit �tre cach�
	 */
	private boolean cacherFaxContactInfo;
	/**
	 * vrai si le mail du contact pour information doit �tre cach�
	 */
	private boolean cacherMailContactInfo;
	/**
	 * vrai si le nom du contact pour candidature doit �tre cach�
	 */
	private boolean cacherNomContactCand;
	/**
	 * vrai si le nom du contact pour information doit �tre cach�
	 */
	private boolean cacherNomContactInfo;
	/**
	 * vrai si les coordonn�es de l'�tablissement sont cach�es (Raison Sociale, Adresse + Nom de Service)
	 */
	private boolean cacherEtablissement;
	/**
	 * Ann�e universit� xxxx/xxxx
	 */
	private String anneeUniversitaire;
	/* **
	 * Objets
	 */
	/**
	 * Structure
	 */
	private Structure structure;
	/**
	 * Contact pour candidature
	 */
	private Contact contactCand;
	/**
	 * 
	 */
	private Contact contactInfo;	
	/**
	 * Fichier associ� � l'offre
	 */
	private Fichier fichier;
	
	/**
	 * Centre de gestion
	 */
	private CentreGestion centreGestion;
	
	/**
	 * Constructeur
	 */
	public Offre(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the idOffre
	 */
	public Integer getIdOffre() {
		return idOffre;
	}
	/**
	 * @param idOffre the idOffre to set
	 */
	public void setIdOffre(Integer idOffre) {
		this.idOffre = idOffre;
	}
	/**
	 * @return the idTypeOffre
	 */
	public Integer getIdTypeOffre() {
		return idTypeOffre;
	}
	/**
	 * @param idTypeOffre the idTypeOffre to set
	 */
	public void setIdTypeOffre(Integer idTypeOffre) {
		this.idTypeOffre = idTypeOffre;
	}
	/**
	 * @return the idContratOffre
	 */
	public Integer getIdContratOffre() {
		return idContratOffre;
	}
	/**
	 * @param idContratOffre the idContratOffre to set
	 */
	public void setIdContratOffre(Integer idContratOffre) {
		this.idContratOffre = idContratOffre;
	}
	/**
	 * @return the idUniteDuree
	 */
	public Integer getIdUniteDuree() {
		return idUniteDuree;
	}
	/**
	 * @param idUniteDuree the idUniteDuree to set
	 */
	public void setIdUniteDuree(Integer idUniteDuree) {
		this.idUniteDuree = idUniteDuree;
	}
	/**
	 * @return the idQualificationSimplifiee
	 */
	public Integer getIdQualificationSimplifiee() {
		return idQualificationSimplifiee;
	}

	/**
	 * @param idQualificationSimplifiee the idQualificationSimplifiee to set
	 */
	public void setIdQualificationSimplifiee(Integer idQualificationSimplifiee) {
		this.idQualificationSimplifiee = idQualificationSimplifiee;
	}

	/**
	 * @return the codeFAP_N3
	 */
	public String getCodeFAP_N3() {
		return codeFAP_N3;
	}

	/**
	 * @param codeFAP_N3 the codeFAP_N3 to set
	 */
	public void setCodeFAP_N3(String codeFAP_N3) {
		this.codeFAP_N3 = codeFAP_N3;
	}

	/**
	 * @return the codeROM
	 */
	public Integer getCodeROM() {
		return codeROM;
	}
	/**
	 * @param codeROM the codeROM to set
	 */
	public void setCodeROM(Integer codeROM) {
		this.codeROM = codeROM;
	}
	/**
	 * @return the idLieuPays
	 */
	public Integer getIdLieuPays() {
		return idLieuPays;
	}
	/**
	 * @param idLieuPays the idLieuPays to set
	 */
	public void setIdLieuPays(Integer idLieuPays) {
		this.idLieuPays = idLieuPays;
	}
	/**
	 * @return the idTempsTravail
	 */
	public Integer getIdTempsTravail() {
		return idTempsTravail;
	}
	/**
	 * @param idTempsTravail the idTempsTravail to set
	 */
	public void setIdTempsTravail(Integer idTempsTravail) {
		this.idTempsTravail = idTempsTravail;
	}
	/**
	 * @return the idsModeCandidature
	 */
	public List<Integer> getIdsModeCandidature() {
		return idsModeCandidature;
	}

	/**
	 * @param idsModeCandidature the idsModeCandidature to set
	 */
	public void setIdsModeCandidature(List<Integer> idsModeCandidature) {
		this.idsModeCandidature = idsModeCandidature;
	}

	/**
	 * @return the idNiveauFormation
	 */
	public Integer getIdNiveauFormation() {
		return idNiveauFormation;
	}
	/**
	 * @param idNiveauFormation the idNiveauFormation to set
	 */
	public void setIdNiveauFormation(Integer idNiveauFormation) {
		this.idNiveauFormation = idNiveauFormation;
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
	 * @return the idContactCand
	 */
	public Integer getIdContactCand() {
		return idContactCand;
	}
	/**
	 * @param idContactCand the idContactCand to set
	 */
	public void setIdContactCand(Integer idContactCand) {
		this.idContactCand = idContactCand;
	}
	/**
	 * @return the idContactInfo
	 */
	public Integer getIdContactInfo() {
		return idContactInfo;
	}
	/**
	 * @param idContactInfo the idContactInfo to set
	 */
	public void setIdContactInfo(Integer idContactInfo) {
		this.idContactInfo = idContactInfo;
	}
	/**
	 * @return the idContactProprio
	 */
	public Integer getIdContactProprio() {
		return idContactProprio;
	}
	/**
	 * @param idContactProprio the idContactProprio to set
	 */
	public void setIdContactProprio(Integer idContactProprio) {
		this.idContactProprio = idContactProprio;
	}
	/**
	 * @return the idReferent
	 */
	public Integer getIdReferent() {
		return idReferent;
	}
	/**
	 * @param idReferent the idReferent to set
	 */
	public void setIdReferent(Integer idReferent) {
		this.idReferent = idReferent;
	}
	/**
	 * @return the moisDebut
	 */
	public String getMoisDebut() {
		return moisDebut;
	}
	/**
	 * @param moisDebut the moisDebut to set
	 */
	public void setMoisDebut(String moisDebut) {
		this.moisDebut = moisDebut;
	}
	/**
	 * @return the anneeDebut
	 */
	public String getAnneeDebut() {
		return anneeDebut;
	}
	/**
	 * @param anneeDebut the anneeDebut to set
	 */
	public void setAnneeDebut(String anneeDebut) {
		this.anneeDebut = anneeDebut;
	}
	/**
	 * @return the precisionDebut
	 */
	public String getPrecisionDebut() {
		return precisionDebut;
	}
	/**
	 * @param precisionDebut the precisionDebut to set
	 */
	public void setPrecisionDebut(String precisionDebut) {
		this.precisionDebut = precisionDebut;
	}
	/**
	 * @return the duree
	 */
	public Integer getDuree() {
		return duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		return intitule;
	}
	/**
	 * @param intitule the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the lieuCommune
	 */
	public String getLieuCommune() {
		return lieuCommune;
	}
	/**
	 * @param lieuCommune the lieuCommune to set
	 */
	public void setLieuCommune(String lieuCommune) {
		this.lieuCommune = lieuCommune;
	}
	/**
	 * @return the codeCommune
	 */
	public Integer getCodeCommune() {
		return codeCommune;
	}
	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(Integer codeCommune) {
		this.codeCommune = codeCommune;
	}
	/**
	 * @return the lieuCodePostal
	 */
	public String getLieuCodePostal() {
		return lieuCodePostal;
	}
	/**
	 * @param lieuCodePostal the lieuCodePostal to set
	 */
	public void setLieuCodePostal(String lieuCodePostal) {
		this.lieuCodePostal = lieuCodePostal;
	}
	/**
	 * @return the deplacement
	 */
	public boolean isDeplacement() {
		return deplacement;
	}

	/**
	 * @param deplacement the deplacement to set
	 */
	public void setDeplacement(boolean deplacement) {
		this.deplacement = deplacement;
	}

	/**
	 * @return the permis
	 */
	public boolean isPermis() {
		return permis;
	}

	/**
	 * @param permis the permis to set
	 */
	public void setPermis(boolean permis) {
		this.permis = permis;
	}

	/**
	 * @return the voiture
	 */
	public boolean isVoiture() {
		return voiture;
	}

	/**
	 * @param voiture the voiture to set
	 */
	public void setVoiture(boolean voiture) {
		this.voiture = voiture;
	}

	/**
	 * @return the remuneration
	 */
	public boolean isRemuneration() {
		return remuneration;
	}

	/**
	 * @param remuneration the remuneration to set
	 */
	public void setRemuneration(boolean remuneration) {
		this.remuneration = remuneration;
	}

	/**
	 * @return the precisionRemuneration
	 */
	public String getPrecisionRemuneration() {
		return precisionRemuneration;
	}
	/**
	 * @param precisionRemuneration the precisionRemuneration to set
	 */
	public void setPrecisionRemuneration(String precisionRemuneration) {
		this.precisionRemuneration = precisionRemuneration;
	}
	/**
	 * @return the avantages
	 */
	public String getAvantages() {
		return avantages;
	}

	/**
	 * @param avantages the avantages to set
	 */
	public void setAvantages(String avantages) {
		this.avantages = avantages;
	}

	/**
	 * @return the quotiteTravail
	 */
	public String getQuotiteTravail() {
		return quotiteTravail;
	}
	/**
	 * @param quotiteTravail the quotiteTravail to set
	 */
	public void setQuotiteTravail(String quotiteTravail) {
		this.quotiteTravail = quotiteTravail;
	}
	/**
	 * @return the commentaireTempsTravail
	 */
	public String getCommentaireTempsTravail() {
		return commentaireTempsTravail;
	}
	/**
	 * @param commentaireTempsTravail the commentaireTempsTravail to set
	 */
	public void setCommentaireTempsTravail(String commentaireTempsTravail) {
		this.commentaireTempsTravail = commentaireTempsTravail;
	}
	/**
	 * @return the observations
	 */
	public String getObservations() {
		return observations;
	}
	/**
	 * @param observations the observations to set
	 */
	public void setObservations(String observations) {
		this.observations = observations;
	}
	/**
	 * @return the competences
	 */
	public String getCompetences() {
		return competences;
	}
	/**
	 * @param competences the competences to set
	 */
	public void setCompetences(String competences) {
		this.competences = competences;
	}
	/**
	 * @return the referenceOffreEtablissement
	 */
	public String getReferenceOffreEtablissement() {
		return referenceOffreEtablissement;
	}
	/**
	 * @param referenceOffreEtablissement the referenceOffreEtablissement to set
	 */
	public void setReferenceOffreEtablissement(String referenceOffreEtablissement) {
		this.referenceOffreEtablissement = referenceOffreEtablissement;
	}
	/**
	 * @return the dateDiffusion
	 */
	public Date getDateDiffusion() {
		return dateDiffusion;
	}
	/**
	 * @param dateDiffusion the dateDiffusion to set
	 */
	public void setDateDiffusion(Date dateDiffusion) {
		this.dateDiffusion = dateDiffusion;
	}
	/**
	 * @return the dateFinDiffusion
	 */
	public Date getDateFinDiffusion() {
		return dateFinDiffusion;
	}
	/**
	 * @param dateFinDiffusion the dateFinDiffusion to set
	 */
	public void setDateFinDiffusion(Date dateFinDiffusion) {
		this.dateFinDiffusion = dateFinDiffusion;
	}
	/**
	 * @return the dateValidation
	 */
	public Date getDateValidation() {
		return dateValidation;
	}
	/**
	 * @param dateValidation the dateValidation to set
	 */
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}
	/**
	 * @return the dateStopValidation
	 */
	public Date getDateStopValidation() {
		return dateStopValidation;
	}
	/**
	 * @param dateStopValidation the dateStopValidation to set
	 */
	public void setDateStopValidation(Date dateStopValidation) {
		this.dateStopValidation = dateStopValidation;
	}
	/**
	 * @return the loginDiffusion
	 */
	public String getLoginDiffusion() {
		return loginDiffusion;
	}
	/**
	 * @param loginDiffusion the loginDiffusion to set
	 */
	public void setLoginDiffusion(String loginDiffusion) {
		this.loginDiffusion = loginDiffusion;
	}
	/**
	 * @return the loginStopDiffusion
	 */
	public String getLoginStopDiffusion() {
		return loginStopDiffusion;
	}
	/**
	 * @param loginStopDiffusion the loginStopDiffusion to set
	 */
	public void setLoginStopDiffusion(String loginStopDiffusion) {
		this.loginStopDiffusion = loginStopDiffusion;
	}
	/**
	 * @return the dateStopDiffusion
	 */
	public Date getDateStopDiffusion() {
		return dateStopDiffusion;
	}
	/**
	 * @param dateStopDiffusion the dateStopDiffusion to set
	 */
	public void setDateStopDiffusion(Date dateStopDiffusion) {
		this.dateStopDiffusion = dateStopDiffusion;
	}
	/**
	 * @return the loginValidation
	 */
	public String getLoginValidation() {
		return loginValidation;
	}
	/**
	 * @param loginValidation the loginValidation to set
	 */
	public void setLoginValidation(String loginValidation) {
		this.loginValidation = loginValidation;
	}
	/**
	 * @return the loginStopValidation
	 */
	public String getLoginStopValidation() {
		return loginStopValidation;
	}
	/**
	 * @param loginStopValidation the loginStopValidation to set
	 */
	public void setLoginStopValidation(String loginStopValidation) {
		this.loginStopValidation = loginStopValidation;
	}
	/**
	 * @return the loginRejetValidation
	 */
	public String getLoginRejetValidation() {
		return loginRejetValidation;
	}
	/**
	 * @param loginRejetValidation the loginRejetValidation to set
	 */
	public void setLoginRejetValidation(String loginRejetValidation) {
		this.loginRejetValidation = loginRejetValidation;
	}
	/**
	 * @return the estDiffusee
	 */
	public boolean isEstDiffusee() {
		return estDiffusee;
	}
	/**
	 * @param estDiffusee the estDiffusee to set
	 */
	public void setEstDiffusee(boolean estDiffusee) {
		this.estDiffusee = estDiffusee;
	}
	/**
	 * @return the estValidee
	 */
	public boolean isEstValidee() {
		return estValidee;
	}
	/**
	 * @param estValidee the estValidee to set
	 */
	public void setEstValidee(boolean estValidee) {
		this.estValidee = estValidee;
	}
	/**
	 * @return the etatValidation
	 */
	public Integer getEtatValidation() {
		return etatValidation;
	}
	/**
	 * @return the estSupprimee
	 */
	public boolean isEstSupprimee() {
		return estSupprimee;
	}
	/**
	 * @param estSupprimee the estSupprimee to set
	 */
	public void setEstSupprimee(boolean estSupprimee) {
		this.estSupprimee = estSupprimee;
	}
	/**
	 * @return the estAccessERQTH
	 */
	public boolean isEstAccessERQTH() {
		return estAccessERQTH;
	}
	/**
	 * @param estAccessERQTH the estAccessERQTH to set
	 */
	public void setEstAccessERQTH(boolean estAccessERQTH) {
		this.estAccessERQTH = estAccessERQTH;
	}
	/**
	 * @return the estPrioERQTH
	 */
	public boolean isEstPrioERQTH() {
		return estPrioERQTH;
	}
	/**
	 * @param estPrioERQTH the estPrioERQTH to set
	 */
	public void setEstPrioERQTH(boolean estPrioERQTH) {
		this.estPrioERQTH = estPrioERQTH;
	}
	/**
	 * @return the precisionHandicap
	 */
	public String getPrecisionHandicap() {
		return precisionHandicap;
	}

	/**
	 * @param precisionHandicap the precisionHandicap to set
	 */
	public void setPrecisionHandicap(String precisionHandicap) {
		this.precisionHandicap = precisionHandicap;
	}

	/**
	 * @return the lienAttache
	 */
	public String getLienAttache() {
		return lienAttache;
	}

	/**
	 * @param lienAttache the lienAttache to set
	 */
	public void setLienAttache(String lienAttache) {
		this.lienAttache = lienAttache;
	}

	/**
	 * @return the idFichier
	 */
	public Integer getIdFichier() {
		return idFichier;
	}

	/**
	 * @param idFichier the idFichier to set
	 */
	public void setIdFichier(Integer idFichier) {
		this.idFichier = idFichier;
	}

	/**
	 * @return the estPourvue
	 */
	public boolean isEstPourvue() {
		return estPourvue;
	}

	/**
	 * @param estPourvue the estPourvue to set
	 */
	public void setEstPourvue(boolean estPourvue) {
		this.estPourvue = estPourvue;
	}

	/**
	 * @return the avecFichier
	 */
	public boolean isAvecFichier() {
		return avecFichier;
	}

	/**
	 * @param avecFichier the avecFichier to set
	 */
	public void setAvecFichier(boolean avecFichier) {
		this.avecFichier = avecFichier;
	}

	/**
	 * @return the avecLien
	 */
	public boolean isAvecLien() {
		return avecLien;
	}

	/**
	 * @param avecLien the avecLien to set
	 */
	public void setAvecLien(boolean avecLien) {
		this.avecLien = avecLien;
	}

	/**
	 * @param etatValidation the etatValidation to set
	 */
	public void setEtatValidation(Integer etatValidation) {
		this.etatValidation = etatValidation;
	}
	/**
	 * @return the cacherTelContactCand
	 */
	public boolean isCacherTelContactCand() {
		return cacherTelContactCand;
	}
	/**
	 * @param cacherTelContactCand the cacherTelContactCand to set
	 */
	public void setCacherTelContactCand(boolean cacherTelContactCand) {
		this.cacherTelContactCand = cacherTelContactCand;
	}
	/**
	 * @return the cacherFaxContactCand
	 */
	public boolean isCacherFaxContactCand() {
		return cacherFaxContactCand;
	}
	/**
	 * @param cacherFaxContactCand the cacherFaxContactCand to set
	 */
	public void setCacherFaxContactCand(boolean cacherFaxContactCand) {
		this.cacherFaxContactCand = cacherFaxContactCand;
	}
	/**
	 * @return the cacherMailContactCand
	 */
	public boolean isCacherMailContactCand() {
		return cacherMailContactCand;
	}
	/**
	 * @param cacherMailContactCand the cacherMailContactCand to set
	 */
	public void setCacherMailContactCand(boolean cacherMailContactCand) {
		this.cacherMailContactCand = cacherMailContactCand;
	}
	/**
	 * @return the cacherTelContactInfo
	 */
	public boolean isCacherTelContactInfo() {
		return cacherTelContactInfo;
	}
	/**
	 * @param cacherTelContactInfo the cacherTelContactInfo to set
	 */
	public void setCacherTelContactInfo(boolean cacherTelContactInfo) {
		this.cacherTelContactInfo = cacherTelContactInfo;
	}
	/**
	 * @return the cacherFaxContactInfo
	 */
	public boolean isCacherFaxContactInfo() {
		return cacherFaxContactInfo;
	}
	/**
	 * @param cacherFaxContactInfo the cacherFaxContactInfo to set
	 */
	public void setCacherFaxContactInfo(boolean cacherFaxContactInfo) {
		this.cacherFaxContactInfo = cacherFaxContactInfo;
	}
	/**
	 * @return the cacherMailContactInfo
	 */
	public boolean isCacherMailContactInfo() {
		return cacherMailContactInfo;
	}
	/**
	 * @param cacherMailContactInfo the cacherMailContactInfo to set
	 */
	public void setCacherMailContactInfo(boolean cacherMailContactInfo) {
		this.cacherMailContactInfo = cacherMailContactInfo;
	}
	/**
	 * @return the cacherNomContactCand
	 */
	public boolean isCacherNomContactCand() {
		return cacherNomContactCand;
	}

	/**
	 * @param cacherNomContactCand the cacherNomContactCand to set
	 */
	public void setCacherNomContactCand(boolean cacherNomContactCand) {
		this.cacherNomContactCand = cacherNomContactCand;
	}

	/**
	 * @return the cacherNomContactInfo
	 */
	public boolean isCacherNomContactInfo() {
		return cacherNomContactInfo;
	}

	/**
	 * @param cacherNomContactInfo the cacherNomContactInfo to set
	 */
	public void setCacherNomContactInfo(boolean cacherNomContactInfo) {
		this.cacherNomContactInfo = cacherNomContactInfo;
	}

	/**
	 * @return the cacherEtablissement
	 */
	public boolean isCacherEtablissement() {
		return cacherEtablissement;
	}
	/**
	 * @param cacherEtablissement the cacherEtablissement to set
	 */
	public void setCacherEtablissement(boolean cacherEtablissement) {
		this.cacherEtablissement = cacherEtablissement;
	}
	/**
	 * @return the anneeUniversitaire
	 */
	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	/**
	 * @param anneeUniversitaire the anneeUniversitaire to set
	 */
	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	/**
	 * @return the structure
	 */
	public Structure getStructure() {
		return structure;
	}

	/**
	 * @param structure the structure to set
	 */
	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	/**
	 * @return the contactCand
	 */
	public Contact getContactCand() {
		return contactCand;
	}

	/**
	 * @param contactCand the contactCand to set
	 */
	public void setContactCand(Contact contactCand) {
		this.contactCand = contactCand;
	}

	/**
	 * @return the contactInfo
	 */
	public Contact getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the fichier
	 */
	public Fichier getFichier() {
		return fichier;
	}

	/**
	 * @param fichier the fichier to set
	 */
	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}

	/**
	 * @return the centreGestion
	 */
	public CentreGestion getCentreGestion() {
		return centreGestion;
	}

	/**
	 * @param centreGestion the centreGestion to set
	 */
	public void setCentreGestion(CentreGestion centreGestion) {
		this.centreGestion = centreGestion;
	}
	
	
	
}
