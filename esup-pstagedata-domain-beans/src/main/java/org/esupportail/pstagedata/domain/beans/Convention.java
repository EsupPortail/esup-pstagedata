package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class Convention extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/* ***************************************************************
	 * Proprietes
	 ****************************************************************/
	/**
	 * idConvention
	 */
	private Integer idConvention;
	/**
	 *idEtudiant
	 */
	private Integer idEtudiant;
	/**
	 * idCentreGestion
	 */
	private Integer idCentreGestion;
	/**
	 * codeUFR
	 */
	private String codeUFR;
	/**
	 * codeUniversite
	 */
	private String codeUniversiteUFR;
	/**
	 * codeDepartement
	 */
	private String codeDepartement;
	/**
	 * codeEtape
	 */
	private String codeEtape;
	/**
	 * codeUniversite
	 */
	private String codeUniversiteEtape;
	/**
	 * idEnseignant
	 */
	private Integer idEnseignant;
	/**
	 * idStructure
	 */
	private Integer idStructure;
	/**
	 * idService
	 */
	private Integer idService;
	/**
	 * idContact
	 */
	private Integer idContact;
	/**
	 * idSignataire
	 */
	private Integer idSignataire;
	/**
	 * idTypeConvention
	 */
	private Integer idTypeConvention;
	/**
	 * idOffre
	 */
	private Integer idOffre;
	/**
	 * sujetStage
	 */
	private String sujetStage;
	/**
	 * dateDebutStage
	 */
	private Date dateDebutStage;
	/**
	 * dateFinStage
	 */
	private Date dateFinStage;
	/**
	 * interruptionStage
	 */
	private boolean interruptionStage;
	/**
	 * dateDebutInterruption
	 */
	private Date dateDebutInterruption;
	/**
	 * dateFinInterruption
	 */
	private Date dateFinInterruption;
	/**
	 * nbJoursHebdo
	 */
	private String nbJoursHebdo;
	/**
	 * idTempsTravail
	 */
	private Integer idTempsTravail;
	/**
	 * commentaireDureeTravail
	 */
	private String commentaireDureeTravail;
	/**
	 * codeLangueConvention
	 */
	private String codeLangueConvention;
	/**
	 * idOrigineStage
	 */
	private Integer idOrigineStage;
	/**
	 * idTheme
	 */
	private Integer idTheme;
	/**
	 * conventionStructure
	 */
	private boolean conventionStructure;
	/**
	 * validationConvention
	 */
	private boolean validationConvention;
	/**
	 * conversionEnContrat
	 */
	private boolean conversionEnContrat;
	/**
	 * commentaireStage
	 */
	private String commentaireStage;
	/**
	 * adresseEtudiant
	 */
	private String adresseEtudiant;
	/**
	 * codePostalEtudiant
	 */
	private String codePostalEtudiant;
	/**
	 * villeEtudiant
	 */
	private String villeEtudiant;
	/**
	 * paysEtudiant
	 */
	private String paysEtudiant;
	/**
	 * courrielPersoEtudiant
	 */
	private String courrielPersoEtudiant;
	/**
	 * telEtudiant
	 */
	private String telEtudiant;
	/**
	 * telPortableEtudiant
	 */
	private String telPortableEtudiant;
	/**
	 * idIndemnisation
	 */
	private Integer idIndemnisation;
	/**
	 * montantGratification
	 */
	private String montantGratification;
	/**
	 * fonctionsEtTaches
	 */
	private String fonctionsEtTaches;
	/**
	 * details
	 */
	private String details;
	/**
	 * details
	 */
	private String annee;
	/**
	 * idAssurance
	 */
	private Integer idAssurance;
	/**
	 * insee
	 */
	private String insee;
	/**
	 * codeCaisse
	 */
	private String codeCaisse;
	/**
	 * temConfSujetTeme
	 */
	private String temConfSujetTeme;
	/**
	 * nbHeuresHebdo
	 */
	private String nbHeuresHebdo;
	/**
	 * quotiteTravail
	 */
	private Integer quotiteTravail;
	/**
	 * modeEncadreSuivi
	 */
	private String modeEncadreSuivi;
	/**
	 * idModeVersGratification
	 */
	private Integer idModeVersGratification;
	/**
	 * avantagesNature
	 */
	private String avantagesNature;
	/**
	 * idNatureTravail
	 */
	private Integer idNatureTravail;
	/**
	 * idModeValidationStage
	 */
	private Integer idModeValidationStage;
	/**
	 * codeElp
	 */
	private String codeElp;
	/**
	 * libelleELP
	 */
	private String libelleELP;
	/**
	 * creditECTS
	 */
	private BigDecimal creditECTS;
	/**
	 * travailNuitFerie
	 */
	private String travailNuitFerie;
	/**
	 * dureeStage
	 */
	private Integer dureeStage;
	/**
	 * nomEtabRef
	 */
	private String nomEtabRef;
	/**
	 * adresseEtabRef
	 */
	private String adresseEtabRef;
	/**
	 * nomSignataireComposante
	 */
	private String nomSignataireComposante;
	/**
	 * qualiteSignataire
	 */
	private String qualiteSignataire;
	/**
	 * libelleCPAM
	 */
	private String libelleCPAM;
	/**
	 * dureeExceptionnelle
	 */
	private String dureeExceptionnelle;
	/**
	 * idUniteDureeExceptionnelle
	 */
	private Integer idUniteDureeExceptionnelle;
	/**
	 * idUniteGratification
	 */
	private Integer idUniteGratification;
	/**
	 * codeFinalite
	 */
	private String codeFinalite;
	/**
	 * libelleFinalite
	 */
	private String libelleFinalite;
	/**
	 * codeCursusLMD
	 */
	private String codeCursusLMD;
	/**
	 * priseEnChargeFraisMission
	 */
	private boolean priseEnChargeFraisMission;
	/**
	 * idFicheEvaluation
	 */
	private Integer idFicheEvaluation;
	/**
	 * codeRGI - regime inscription
	 */
	private String codeRGI;
	/**
	 * loginValidation
	 */
	private String loginValidation;
	/**
	 * dateValidation
	 */
	private Date dateValidation;
	/**
	 * loginSignature
	 */
	private String loginSignature;
	/**
	 * dateSignature
	 */
	private Date dateSignature;


	/* **
	 * Objets
	 */
	/**
	 * Structure
	 */
	private Structure structure;
	/**
	 * Etudiant
	 */
	private Etudiant etudiant;
	/**
	 * Ufr
	 */
	private Ufr ufr;
	/**
	 * Etape
	 */
	private Etape etape;
	
	/**
	 * contact
	 */
	private Contact contact;
	
	/**
	 * Service 
	 */
	private Service service;
	
	/**
	 * enseigant
	 */
	private Enseignant enseignant;
	
	/**
	 * signataire
	 */
	private Contact signataire;
	
	
	/**
	 * nombre avenant
	 */
	private int nbAvenant;

	/**
	 * Constructeur
	 */
	public Convention(){
		super();
	}


	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	/**
	 * @return the idConvention
	 */
	public Integer getIdConvention() {
		return idConvention;
	}

	/**
	 * @param idConvention the idConvention to set
	 */
	public void setIdConvention(Integer idConvention) {
		this.idConvention = idConvention;
	}


	/**
	 * @return the idEtudiant
	 */
	public Integer getIdEtudiant() {
		return idEtudiant;
	}


	/**
	 * @param idEtudiant the idEtudiant to set
	 */
	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
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
	 * @return the codeUFR
	 */
	public String getCodeUFR() {
		return codeUFR;
	}

	/**
	 * @param codeUFR the codeUFR to set
	 */
	public void setCodeUFR(String codeUFR) {
		this.codeUFR = codeUFR;
	}

	/**
	 * @return the codeUniversiteUFR
	 */
	public String getCodeUniversiteUFR() {
		return codeUniversiteUFR;
	}


	/**
	 * @param codeUniversiteUFR the codeUniversiteUFR to set
	 */
	public void setCodeUniversiteUFR(String codeUniversiteUFR) {
		this.codeUniversiteUFR = codeUniversiteUFR;
	}


	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * @return the codeEtape
	 */
	public String getCodeEtape() {
		return codeEtape;
	}

	/**
	 * @param codeEtape the codeEtape to set
	 */
	public void setCodeEtape(String codeEtape) {
		this.codeEtape = codeEtape;
	}

	/**
	 * @return the codeUniversiteEtape
	 */
	public String getCodeUniversiteEtape() {
		return codeUniversiteEtape;
	}


	/**
	 * @param codeUniversiteEtape the codeUniversiteEtape to set
	 */
	public void setCodeUniversiteEtape(String codeUniversiteEtape) {
		this.codeUniversiteEtape = codeUniversiteEtape;
	}

	/**
	 * @return the idEnseignant
	 */
	public Integer getIdEnseignant() {
		return idEnseignant;
	}

	/**
	 * @param idEnseignant the idEnseignant to set
	 */
	public void setIdEnseignant(Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
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
	 * @return the idContact
	 */
	public Integer getIdContact() {
		return idContact;
	}

	/**
	 * @param idContact the idContact to set
	 */
	public void setIdContact(Integer idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return the idSignataire
	 */
	public Integer getIdSignataire() {
		return idSignataire;
	}

	/**
	 * @param idSignataire the idSignataire to set
	 */
	public void setIdSignataire(Integer idSignataire) {
		this.idSignataire = idSignataire;
	}

	/**
	 * @return the idTypeConvention
	 */
	public Integer getIdTypeConvention() {
		return idTypeConvention;
	}

	/**
	 * @param idTypeConvention the idTypeConvention to set
	 */
	public void setIdTypeConvention(Integer idTypeConvention) {
		this.idTypeConvention = idTypeConvention;
	}

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
	 * @return the sujetStage
	 */
	public String getSujetStage() {
		return sujetStage;
	}

	/**
	 * @param sujetStage the sujetStage to set
	 */
	public void setSujetStage(String sujetStage) {
		this.sujetStage = sujetStage;
	}

	/**
	 * @return the dateDebutStage
	 */
	public Date getDateDebutStage() {
		return dateDebutStage;
	}

	/**
	 * @param dateDebutStage the dateDebutStage to set
	 */
	public void setDateDebutStage(Date dateDebutStage) {
		this.dateDebutStage = dateDebutStage;
	}

	/**
	 * @return the dateFinStage
	 */
	public Date getDateFinStage() {
		return dateFinStage;
	}

	/**
	 * @param dateFinStage the dateFinStage to set
	 */
	public void setDateFinStage(Date dateFinStage) {
		this.dateFinStage = dateFinStage;
	}

	/**
	 * @return the interruptionStage
	 */
	public boolean isInterruptionStage() {
		return interruptionStage;
	}

	/**
	 * @param interruptionStage the interruptionStage to set
	 */
	public void setInterruptionStage(boolean interruptionStage) {
		this.interruptionStage = interruptionStage;
	}

	/**
	 * @return the dateDebutInterruption
	 */
	public Date getDateDebutInterruption() {
		return dateDebutInterruption;
	}

	/**
	 * @param dateDebutInterruption the dateDebutInterruption to set
	 */
	public void setDateDebutInterruption(Date dateDebutInterruption) {
		this.dateDebutInterruption = dateDebutInterruption;
	}

	/**
	 * @return the dateFinInterruption
	 */
	public Date getDateFinInterruption() {
		return dateFinInterruption;
	}

	/**
	 * @param dateFinInterruption the dateFinInterruption to set
	 */
	public void setDateFinInterruption(Date dateFinInterruption) {
		this.dateFinInterruption = dateFinInterruption;
	}

	/**
	 * @return the nbJoursHebdo
	 */
	public String getNbJoursHebdo() {
		return nbJoursHebdo;
	}

	/**
	 * @param nbJoursHebdo the nbJoursHebdo to set
	 */
	public void setNbJoursHebdo(String nbJoursHebdo) {
		this.nbJoursHebdo = nbJoursHebdo;
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
	 * @return the commentaireDureeTravail
	 */
	public String getCommentaireDureeTravail() {
		return commentaireDureeTravail;
	}

	/**
	 * @param commentaireDureeTravail the commentaireDureeTravail to set
	 */
	public void setCommentaireDureeTravail(String commentaireDureeTravail) {
		this.commentaireDureeTravail = commentaireDureeTravail;
	}

	/**
	 * @return the codeLangueConvention
	 */
	public String getCodeLangueConvention() {
		return codeLangueConvention;
	}

	/**
	 * @param codeLangueConvention the codeLangueConvention to set
	 */
	public void setCodeLangueConvention(String codeLangueConvention) {
		this.codeLangueConvention = codeLangueConvention;
	}



	/**
	 * @return the idOrigineStage
	 */
	public Integer getIdOrigineStage() {
		return idOrigineStage;
	}


	/**
	 * @param idOrigineStage the idOrigineStage to set
	 */
	public void setIdOrigineStage(Integer idOrigineStage) {
		this.idOrigineStage = idOrigineStage;
	}


	/**
	 * @return the idTheme
	 */
	public Integer getIdTheme() {
		return idTheme;
	}

	/**
	 * @param idTheme the idTheme to set
	 */
	public void setIdTheme(Integer idTheme) {
		this.idTheme = idTheme;
	}

	/**
	 * @return the conventionStructure
	 */
	public boolean isConventionStructure() {
		return conventionStructure;
	}

	/**
	 * @param conventionStructure the conventionStructure to set
	 */
	public void setConventionStructure(boolean conventionStructure) {
		this.conventionStructure = conventionStructure;
	}

	/**
	 * @return the validationConvention
	 */
	public boolean isValidationConvention() {
		return validationConvention;
	}

	/**
	 * @param validationConvention the validationConvention to set
	 */
	public void setValidationConvention(boolean validationConvention) {
		this.validationConvention = validationConvention;
	}

	/**
	 * @return the conversionEnContrat
	 */
	public boolean isConversionEnContrat() {
		return conversionEnContrat;
	}

	/**
	 * @param conversionEnContrat the conversionEnContrat to set
	 */
	public void setConversionEnContrat(boolean conversionEnContrat) {
		this.conversionEnContrat = conversionEnContrat;
	}

	/**
	 * @return the commentaireStage
	 */
	public String getCommentaireStage() {
		return commentaireStage;
	}

	/**
	 * @param commentaireStage the commentaireStage to set
	 */
	public void setCommentaireStage(String commentaireStage) {
		this.commentaireStage = commentaireStage;
	}

	/**
	 * @return the adresseEtudiant
	 */
	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}

	/**
	 * @param adresseEtudiant the adresseEtudiant to set
	 */
	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}

	/**
	 * @return the codePostalEtudiant
	 */
	public String getCodePostalEtudiant() {
		return codePostalEtudiant;
	}

	/**
	 * @param codePostalEtudiant the codePostalEtudiant to set
	 */
	public void setCodePostalEtudiant(String codePostalEtudiant) {
		this.codePostalEtudiant = codePostalEtudiant;
	}

	/**
	 * @return the villeEtudiant
	 */
	public String getVilleEtudiant() {
		return villeEtudiant;
	}

	/**
	 * @param villeEtudiant the villeEtudiant to set
	 */
	public void setVilleEtudiant(String villeEtudiant) {
		this.villeEtudiant = villeEtudiant;
	}

	/**
	 * @return the paysEtudiant
	 */
	public String getPaysEtudiant() {
		return paysEtudiant;
	}

	/**
	 * @param paysEtudiant the paysEtudiant to set
	 */
	public void setPaysEtudiant(String paysEtudiant) {
		this.paysEtudiant = paysEtudiant;
	}

	/**
	 * @return the courrielPersoEtudiant
	 */
	public String getCourrielPersoEtudiant() {
		return courrielPersoEtudiant;
	}

	/**
	 * @param courrielPersoEtudiant the courrielPersoEtudiant to set
	 */
	public void setCourrielPersoEtudiant(String courrielPersoEtudiant) {
		this.courrielPersoEtudiant = courrielPersoEtudiant;
	}

	/**
	 * @return the telEtudiant
	 */
	public String getTelEtudiant() {
		return telEtudiant;
	}

	/**
	 * @param telEtudiant the telEtudiant to set
	 */
	public void setTelEtudiant(String telEtudiant) {
		this.telEtudiant = telEtudiant;
	}

	/**
	 * @return the telPortableEtudiant
	 */
	public String getTelPortableEtudiant() {
		return telPortableEtudiant;
	}

	/**
	 * @param telPortableEtudiant the telPortableEtudiant to set
	 */
	public void setTelPortableEtudiant(String telPortableEtudiant) {
		this.telPortableEtudiant = telPortableEtudiant;
	}

	/**
	 * @return the idIndemnisation
	 */
	public Integer getIdIndemnisation() {
		return idIndemnisation;
	}

	/**
	 * @param idIndemnisation the idIndemnisation to set
	 */
	public void setIdIndemnisation(Integer idIndemnisation) {
		this.idIndemnisation = idIndemnisation;
	}

	/**
	 * @return the montantGratification
	 */
	public String getMontantGratification() {
		return montantGratification;
	}

	/**
	 * @param montantGratification the montantGratification to set
	 */
	public void setMontantGratification(String montantGratification) {
		this.montantGratification = montantGratification;
	}

	/**
	 * @return the fonctionsEtTaches
	 */
	public String getFonctionsEtTaches() {
		return fonctionsEtTaches;
	}

	/**
	 * @param fonctionsEtTaches the fonctionsEtTaches to set
	 */
	public void setFonctionsEtTaches(String fonctionsEtTaches) {
		this.fonctionsEtTaches = fonctionsEtTaches;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}

	/**
	 * @return the idAssurance
	 */
	public Integer getIdAssurance() {
		return idAssurance;
	}

	/**
	 * @param idAssurance the idAssurance to set
	 */
	public void setIdAssurance(Integer idAssurance) {
		this.idAssurance = idAssurance;
	}

	/**
	 * @return the insee
	 */
	public String getInsee() {
		return insee;
	}

	/**
	 * @param insee the insee to set
	 */
	public void setInsee(String insee) {
		this.insee = insee;
	}


	/**
	 * @return the codeCaisse
	 */
	public String getCodeCaisse() {
		return codeCaisse;
	}


	/**
	 * @param codeCaisse the codeCaisse to set
	 */
	public void setCodeCaisse(String codeCaisse) {
		this.codeCaisse = codeCaisse;
	}


	/**
	 * @return the temConfSujetTeme
	 */
	public String getTemConfSujetTeme() {
		return temConfSujetTeme;
	}

	/**
	 * @param temConfSujetTeme the temConfSujetTeme to set
	 */
	public void setTemConfSujetTeme(String temConfSujetTeme) {
		this.temConfSujetTeme = temConfSujetTeme;
	}

	/**
	 * @return the nbHeuresHebdo
	 */
	public String getNbHeuresHebdo() {
		return nbHeuresHebdo;
	}

	/**
	 * @param nbHeuresHebdo the nbHeuresHebdo to set
	 */
	public void setNbHeuresHebdo(String nbHeuresHebdo) {
		this.nbHeuresHebdo = nbHeuresHebdo;
	}

	/**
	 * @return the quotiteTravail
	 */
	public Integer getQuotiteTravail() {
		return quotiteTravail;
	}

	/**
	 * @param quotiteTravail the quotiteTravail to set
	 */
	public void setQuotiteTravail(Integer quotiteTravail) {
		this.quotiteTravail = quotiteTravail;
	}

	/**
	 * @return the modeEncadreSuivi
	 */
	public String getModeEncadreSuivi() {
		return modeEncadreSuivi;
	}

	/**
	 * @param modeEncadreSuivi the modeEncadreSuivi to set
	 */
	public void setModeEncadreSuivi(String modeEncadreSuivi) {
		this.modeEncadreSuivi = modeEncadreSuivi;
	}

	/**
	 * @return the idModeVersGratification
	 */
	public Integer getIdModeVersGratification() {
		return idModeVersGratification;
	}

	/**
	 * @param idModeVersGratification the idModeVersGratification to set
	 */
	public void setIdModeVersGratification(Integer idModeVersGratification) {
		this.idModeVersGratification = idModeVersGratification;
	}

	/**
	 * @return the avantagesNature
	 */
	public String getAvantagesNature() {
		return avantagesNature;
	}

	/**
	 * @param avantagesNature the avantagesNature to set
	 */
	public void setAvantagesNature(String avantagesNature) {
		this.avantagesNature = avantagesNature;
	}

	/**
	 * @return the idNatureTravail
	 */
	public Integer getIdNatureTravail() {
		return idNatureTravail;
	}

	/**
	 * @param idNatureTravail the idNatureTravail to set
	 */
	public void setIdNatureTravail(Integer idNatureTravail) {
		this.idNatureTravail = idNatureTravail;
	}

	/**
	 * @return the idModeValidationStage
	 */
	public Integer getIdModeValidationStage() {
		return idModeValidationStage;
	}

	/**
	 * @param idModeValidationStage the idModeValidationStage to set
	 */
	public void setIdModeValidationStage(Integer idModeValidationStage) {
		this.idModeValidationStage = idModeValidationStage;
	}

	/**
	 * @return the codeElp
	 */
	public String getCodeElp() {
		return codeElp;
	}

	/**
	 * @param codeElp the codeElp to set
	 */
	public void setCodeElp(String codeElp) {
		this.codeElp = codeElp;
	}

	/**
	 * @return the libelleELP
	 */
	public String getLibelleELP() {
		return libelleELP;
	}

	/**
	 * @param libelleELP the libelleELP to set
	 */
	public void setLibelleELP(String libelleELP) {
		this.libelleELP = libelleELP;
	}



	/**
	 * @return the creditECTS
	 */
	public BigDecimal getCreditECTS() {
		return creditECTS;
	}


	/**
	 * @param creditECTS the creditECTS to set
	 */
	public void setCreditECTS(BigDecimal creditECTS) {
		this.creditECTS = creditECTS;
	}


	/**
	 * @return the travailNuitFerie
	 */
	public String getTravailNuitFerie() {
		return travailNuitFerie;
	}

	/**
	 * @param travailNuitFerie the travailNuitFerie to set
	 */
	public void setTravailNuitFerie(String travailNuitFerie) {
		this.travailNuitFerie = travailNuitFerie;
	}

	/**
	 * @return the dureeStage
	 */
	public Integer getDureeStage() {
		return dureeStage;
	}

	/**
	 * @param dureeStage the dureeStage to set
	 */
	public void setDureeStage(Integer dureeStage) {
		this.dureeStage = dureeStage;
	}

	/**
	 * @return the nomEtabRef
	 */
	public String getNomEtabRef() {
		return nomEtabRef;
	}

	/**
	 * @param nomEtabRef the nomEtabRef to set
	 */
	public void setNomEtabRef(String nomEtabRef) {
		this.nomEtabRef = nomEtabRef;
	}

	/**
	 * @return the adresseEtabRef
	 */
	public String getAdresseEtabRef() {
		return adresseEtabRef;
	}

	/**
	 * @param adresseEtabRef the adresseEtabRef to set
	 */
	public void setAdresseEtabRef(String adresseEtabRef) {
		this.adresseEtabRef = adresseEtabRef;
	}

	/**
	 * @return the nomSignataireComposante
	 */
	public String getNomSignataireComposante() {
		return nomSignataireComposante;
	}

	/**
	 * @param nomSignataireComposante the nomSignataireComposante to set
	 */
	public void setNomSignataireComposante(String nomSignataireComposante) {
		this.nomSignataireComposante = nomSignataireComposante;
	}

	/**
	 * @return the qualiteSignataire
	 */
	public String getQualiteSignataire() {
		return qualiteSignataire;
	}

	/**
	 * @param qualiteSignataire the qualiteSignataire to set
	 */
	public void setQualiteSignataire(String qualiteSignataire) {
		this.qualiteSignataire = qualiteSignataire;
	}

	/**
	 * @return the libelleCPAM
	 */
	public String getLibelleCPAM() {
		return libelleCPAM;
	}

	/**
	 * @param libelleCPAM the libelleCPAM to set
	 */
	public void setLibelleCPAM(String libelleCPAM) {
		this.libelleCPAM = libelleCPAM;
	}

	/**
	 * @return the dureeExceptionnelle
	 */
	public String getDureeExceptionnelle() {
		return dureeExceptionnelle;
	}

	/**
	 * @param dureeExceptionnelle the dureeExceptionnelle to set
	 */
	public void setDureeExceptionnelle(String dureeExceptionnelle) {
		this.dureeExceptionnelle = dureeExceptionnelle;
	}

	/**
	 * @return the idUniteDureeExceptionnelle
	 */
	public Integer getIdUniteDureeExceptionnelle() {
		return idUniteDureeExceptionnelle;
	}

	/**
	 * @param idUniteDureeExceptionnelle the idUniteDureeExceptionnelle to set
	 */
	public void setIdUniteDureeExceptionnelle(Integer idUniteDureeExceptionnelle) {
		this.idUniteDureeExceptionnelle = idUniteDureeExceptionnelle;
	}

	/**
	 * @return the idUniteGratification
	 */
	public Integer getIdUniteGratification() {
		return idUniteGratification;
	}

	/**
	 * @param idUniteGratification the idUniteGratification to set
	 */
	public void setIdUniteGratification(Integer idUniteGratification) {
		this.idUniteGratification = idUniteGratification;
	}

	/**
	 * @return the codeFinalite
	 */
	public String getCodeFinalite() {
		return codeFinalite;
	}

	/**
	 * @param codeFinalite the codeFinalite to set
	 */
	public void setCodeFinalite(String codeFinalite) {
		this.codeFinalite = codeFinalite;
	}

	/**
	 * @return the libelleFinalite
	 */
	public String getLibelleFinalite() {
		return libelleFinalite;
	}

	/**
	 * @param libelleFinalite the libelleFinalite to set
	 */
	public void setLibelleFinalite(String libelleFinalite) {
		this.libelleFinalite = libelleFinalite;
	}

	/**
	 * @return the codeCursusLMD
	 */
	public String getCodeCursusLMD() {
		return codeCursusLMD;
	}

	/**
	 * @param codeCursusLMD the codeCursusLMD to set
	 */
	public void setCodeCursusLMD(String codeCursusLMD) {
		this.codeCursusLMD = codeCursusLMD;
	}

	/**
	 * @return the priseEnChargeFraisMission
	 */
	public boolean isPriseEnChargeFraisMission() {
		return priseEnChargeFraisMission;
	}

	/**
	 * @param priseEnChargeFraisMission the priseEnChargeFraisMission to set
	 */
	public void setPriseEnChargeFraisMission(boolean priseEnChargeFraisMission) {
		this.priseEnChargeFraisMission = priseEnChargeFraisMission;
	}

	/**
	 * @return the idFicheEvaluation
	 */
	public Integer getIdFicheEvaluation() {
		return idFicheEvaluation;
	}

	/**
	 * @param idFicheEvaluation the idFicheEvaluation to set
	 */
	public void setIdFicheEvaluation(Integer idFicheEvaluation) {
		this.idFicheEvaluation = idFicheEvaluation;
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
	 * @return the loginSignature
	 */
	public String getLoginSignature() {
		return loginSignature;
	}

	/**
	 * @param loginSignature the loginSignature to set
	 */
	public void setLoginSignature(String loginSignature) {
		this.loginSignature = loginSignature;
	}

	/**
	 * @return the dateSignature
	 */
	public Date getDateSignature() {
		return dateSignature;
	}

	/**
	 * @param dateSignature the dateSignature to set
	 */
	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}


	/**
	 * @return the codeRGI
	 */
	public String getCodeRGI() {
		return codeRGI;
	}


	/**
	 * @param codeRGI the codeRGI to set
	 */
	public void setCodeRGI(String codeRGI) {
		this.codeRGI = codeRGI;
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
	 * @return the etudiant
	 */
	public Etudiant getEtudiant() {
		return etudiant;
	}


	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	/**
	 * @return the ufr
	 */
	public Ufr getUfr() {
		return ufr;
	}


	/**
	 * @param ufr the ufr to set
	 */
	public void setUfr(Ufr ufr) {
		this.ufr = ufr;
	}


	/**
	 * @return the etape
	 */
	public Etape getEtape() {
		return etape;
	}


	/**
	 * @param etape the etape to set
	 */
	public void setEtape(Etape etape) {
		this.etape = etape;
	}


	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}


	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
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


	/**
	 * @return the enseignant
	 */
	public Enseignant getEnseignant() {
		return enseignant;
	}


	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}


	/**
	 * @return the signataire
	 */
	public Contact getSignataire() {
		return signataire;
	}


	/**
	 * @param signataire the signataire to set
	 */
	public void setSignataire(Contact signataire) {
		this.signataire = signataire;
	}


	/**
	 * @return the nbAvenant
	 */
	public int getNbAvenant() {
		return nbAvenant;
	}


	/**
	 * @param nbAvenant the nbAvenant to set
	 */
	public void setNbAvenant(int nbAvenant) {
		this.nbAvenant = nbAvenant;
	}

}
