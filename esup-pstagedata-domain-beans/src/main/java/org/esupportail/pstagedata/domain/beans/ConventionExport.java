package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class ConventionExport extends ObjetMetiers implements Serializable{
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
	 * libelleUFR
	 */
	private String libelleUFR;
	/**
	 * codeDepartement
	 */
	private String codeDepartement;
	/**
	 * codeEtape
	 */
	private String codeEtape;
	/**
	 * Code universite
	 */
	private String codeVersionEtape;
	/**
	 * libelleEtape
	 */
	private String libelleEtape;
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
	 * validationPedagogique
	 */
	private boolean validationPedagogique;
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
	/**
	 * idUniteDureeGratification
	 */
	private Integer idUniteDureeGratification;
	/**
	 * monnaieGratification
	 */
	private String monnaieGratification;

	private Integer STRUCTURE_idStructure;

	private String STRUCTURE_raisonSociale;

	private String STRUCTURE_numeroSiret;

	private int STRUCTURE_idEffectif;

	private int STRUCTURE_idTypeStructure;

	private Integer STRUCTURE_idStatutJuridique;

	private String STRUCTURE_codeNAF_N5;

	private String STRUCTURE_telephone;

	private String STRUCTURE_fax;

	private String STRUCTURE_mail;

	private String STRUCTURE_siteWeb;

	private String STRUCTURE_batimentResidence;

	private String STRUCTURE_voie;

	private String STRUCTURE_commune;

	private String STRUCTURE_codePostal;

	private String STRUCTURE_libCedex;

	private Integer STRUCTURE_idPays;

	private String ETUDIANT_numEtudiant;

	private String ETUDIANT_codeSexe;

	private Integer ETUDIANT_id;

	private String ETUDIANT_nom;

	private String ETUDIANT_prenom;

	private String ETUDIANT_mail;

	private Integer SERVICE_idService;

	private String SERVICE_nom;

	private String SERVICE_telephone;

	private String SERVICE_batimentResidence;

	private String SERVICE_voie;

	private String SERVICE_commune;

	private String SERVICE_codeCommune;

	private String SERVICE_codePostal;

	private Integer SERVICE_idPays;

	private String ENSEIGNANT_uidEnseignant;

	private Integer ENSEIGNANT_id;

	private String ENSEIGNANT_nom;

	private String ENSEIGNANT_prenom;

	private String ENSEIGNANT_mail;

	private String ENSEIGNANT_tel;

	private String CONTACT_fonction;

	private Integer CONTACT_idService;

	private Integer CONTACT_idCentreGestion;

	private Integer CONTACT_id;

	private Integer CONTACT_idCivilite;

	private String CONTACT_nom;

	private String CONTACT_prenom;

	private String CONTACT_mail;

	private String CONTACT_tel;

	private String SIGNATAIRE_fonction;

	private Integer SIGNATAIRE_idService;

	private Integer SIGNATAIRE_idCentreGestion;

	private Integer SIGNATAIRE_id;

	private Integer SIGNATAIRE_idCivilite;

	private String SIGNATAIRE_nom;

	private String SIGNATAIRE_prenom;

	private String SIGNATAIRE_mail;

	private String SIGNATAIRE_tel;

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
	 * envoiMailEtudiant
	 */
	private boolean envoiMailEtudiant;
	/**
	 * dateEnvoiMailTuteurPedago
	 */
	private Date dateEnvoiMailEtudiant;
	/**
	 * envoiMailTuteurPedago
	 */
	private boolean envoiMailTuteurPedago;
	/**
	 * dateEnvoiMailTuteurPro
	 */
	private Date dateEnvoiMailTuteurPedago;
	/**
	 * envoiMailTuteurPro
	 */
	private boolean envoiMailTuteurPro;
	/**
	 * dateEnvoiMailTuteurPro
	 */
	private Date dateEnvoiMailTuteurPro;
	/**
	 * competences
	 */
	private String competences;
	/**
	 * nbConges
	 */
	private String nbConges;

	/**
	 * Constructeur
	 */
	public ConventionExport(){
		super();
	}


	public Convention getConvention() {
		Convention c = new Convention();
		c.setAdresseEtabRef(this.adresseEtabRef);
		c.setAdresseEtudiant(this.adresseEtudiant);
		c.setAnnee(this.annee);
		c.setAvantagesNature(this.avantagesNature);
		c.setCodeCaisse(this.codeCaisse);
		c.setCodeCursusLMD(this.codeCursusLMD);
		c.setCodeDepartement(this.codeDepartement);
		c.setCodeElp(this.codeElp);
		c.setCodeEtape(this.codeEtape);
		c.setCodeFinalite(this.codeFinalite);
		c.setCodeLangueConvention(this.codeLangueConvention);
		c.setCodePostalEtudiant(this.codePostalEtudiant);
		c.setCodeRGI(this.codeRGI);
		c.setCodeUFR(this.codeUFR);
		c.setCodeUniversiteEtape(this.codeUniversiteEtape);
		c.setCodeUniversiteUFR(this.codeUniversiteUFR);
		c.setCodeVersionEtape(this.codeVersionEtape);
		c.setCommentaireDureeTravail(this.commentaireDureeTravail);
		c.setCommentaireStage(this.commentaireStage);
		c.setCompetences(this.competences);
		c.setDateCreation(this.getDateCreation());
		c.setDateModif(this.getDateModif());
		c.setLoginCreation(this.getLoginCreation());
		c.setLoginModif(this.getLoginModif());

		Ufr u = new Ufr();
		u.setCodeUniversite(this.codeUniversiteUFR);
		u.setCode(this.codeUFR);
		u.setLibelle(this.libelleUFR);
		c.setUfr(u);

		Etape e = new Etape();
		e.setCodeUniversite(this.codeUniversiteEtape);
		e.setCode(this.codeEtape);
		e.setLibelle(this.libelleEtape);
		e.setCodeVersionEtape(this.codeVersionEtape);
		c.setEtape(e);

		Contact contact = new Contact();
		contact.setFonction(this.CONTACT_fonction);
		contact.setId(this.CONTACT_id);
		contact.setIdCentreGestion(this.CONTACT_idCentreGestion);
		contact.setIdCivilite(this.CONTACT_idCivilite);
		contact.setIdService(this.CONTACT_idService);
		contact.setMail(this.CONTACT_mail);
		contact.setNom(this.CONTACT_nom);
		contact.setPrenom(this.CONTACT_prenom);
		contact.setTel(this.CONTACT_tel);
		c.setContact(contact);

		c.setConventionStructure(this.conventionStructure);
		c.setConversionEnContrat(this.conversionEnContrat);
		c.setCourrielPersoEtudiant(this.courrielPersoEtudiant);
		c.setCreditECTS(this.creditECTS);
		c.setDateDebutInterruption(this.dateDebutInterruption);
		c.setDateDebutStage(this.dateDebutStage);
		c.setDateEnvoiMailEtudiant(this.dateEnvoiMailEtudiant);
		c.setDateEnvoiMailTuteurPedago(this.dateEnvoiMailTuteurPedago);
		c.setDateEnvoiMailTuteurPro(this.dateEnvoiMailTuteurPro);
		c.setDateFinInterruption(this.dateFinInterruption);
		c.setDateFinStage(this.dateFinStage);
		c.setDateSignature(this.dateSignature);
		c.setDateValidation(this.dateValidation);
		c.setDetails(this.details);
		c.setDureeExceptionnelle(this.dureeExceptionnelle);
		c.setDureeStage(this.dureeStage);

		Enseignant ens = new Enseignant();
		ens.setId(this.ENSEIGNANT_id);
		ens.setMail(this.ENSEIGNANT_mail);
		ens.setNom(this.ENSEIGNANT_nom);
		ens.setPrenom(this.ENSEIGNANT_prenom);
		ens.setTel(this.ENSEIGNANT_tel);
		ens.setUidEnseignant(this.ENSEIGNANT_uidEnseignant);
		c.setEnseignant(ens);

		c.setEnvoiMailEtudiant(this.envoiMailEtudiant);
		c.setEnvoiMailTuteurPedago(this.envoiMailTuteurPedago);
		c.setEnvoiMailTuteurPro(this.envoiMailTuteurPro);

		Etudiant etu = new Etudiant();
		etu.setCodeSexe(this.ETUDIANT_codeSexe);
		etu.setId(this.ETUDIANT_id);
		etu.setMail(this.ETUDIANT_mail);
		etu.setNom(this.ETUDIANT_nom);
		etu.setNumEtudiant(this.ETUDIANT_numEtudiant);
		etu.setPrenom(this.ETUDIANT_prenom);
		c.setEtudiant(etu);

		c.setFonctionsEtTaches(this.fonctionsEtTaches);
		c.setIdAssurance(this.idAssurance);
		c.setIdCentreGestion(this.idCentreGestion);
		c.setIdContact(this.idContact);
		c.setIdConvention(this.idConvention);
		c.setIdEnseignant(this.idEnseignant);
		c.setIdIndemnisation(this.idIndemnisation);
		c.setIdModeValidationStage(this.idModeValidationStage);
		c.setIdModeVersGratification(this.idModeVersGratification);
		c.setIdNatureTravail(this.idNatureTravail);
		c.setIdOffre(this.idOffre);
		c.setIdOrigineStage(this.idOrigineStage);
		c.setIdService(this.idService);
		c.setIdSignataire(this.idSignataire);
		c.setIdStructure(this.idStructure);
		c.setIdTempsTravail(this.idTempsTravail);
		c.setIdTheme(this.idTheme);
		c.setIdTypeConvention(this.idTypeConvention);
		c.setIdUniteDureeExceptionnelle(this.idUniteDureeExceptionnelle);
		c.setIdUniteDureeGratification(this.idUniteDureeGratification);
		c.setIdUniteGratification(this.idUniteGratification);
		c.setInsee(this.insee);
		c.setInterruptionStage(this.interruptionStage);
		c.setLibelleCPAM(this.libelleCPAM);
		c.setLibelleELP(this.libelleELP);
		c.setLibelleFinalite(this.libelleFinalite);
		c.setLoginSignature(this.loginSignature);
		c.setLoginValidation(this.loginValidation);
		c.setModeEncadreSuivi(this.modeEncadreSuivi);
		c.setMonnaieGratification(this.monnaieGratification);
		c.setMontantGratification(this.montantGratification);
		c.setNbAvenant(this.nbAvenant);

		System.out.println("nbAvenant : " + c.getNbAvenant());

		c.setNbConges(this.nbConges);
		c.setNbHeuresHebdo(this.nbHeuresHebdo);
		c.setNbJoursHebdo(this.nbJoursHebdo);
		c.setNomEtabRef(this.nomEtabRef);
		c.setNomSignataireComposante(this.nomSignataireComposante);
		c.setPaysEtudiant(this.paysEtudiant);
		c.setPriseEnChargeFraisMission(this.priseEnChargeFraisMission);
		c.setQualiteSignataire(this.qualiteSignataire);
		c.setQuotiteTravail(this.quotiteTravail);

		Service ser = new Service();
		ser.setBatimentResidence(this.SERVICE_batimentResidence);
		ser.setCodeCommune(this.SERVICE_codeCommune);
		ser.setCodePostal(this.SERVICE_codePostal);
		ser.setCommune(this.SERVICE_commune);
		ser.setIdPays(this.SERVICE_idPays);
		ser.setIdService(this.SERVICE_idService);
		ser.setNom(this.SERVICE_nom);
		ser.setTelephone(this.SERVICE_telephone);
		ser.setVoie(this.SERVICE_voie);
		c.setService(ser);

		Contact sig = new Contact();
		sig.setFonction(this.SIGNATAIRE_fonction);
		sig.setId(this.SIGNATAIRE_id);
		sig.setIdCentreGestion(this.SIGNATAIRE_idCentreGestion);
		sig.setIdCivilite(this.SIGNATAIRE_idCivilite);
		sig.setIdService(this.SIGNATAIRE_idService);
		sig.setMail(this.SIGNATAIRE_mail);
		sig.setNom(this.SIGNATAIRE_nom);
		sig.setPrenom(this.SIGNATAIRE_prenom);
		sig.setTel(this.SIGNATAIRE_tel);
		c.setSignataire(sig);

		Structure struct = new Structure();
		struct.setBatimentResidence(this.STRUCTURE_batimentResidence);
		struct.setCodeNAF_N5(this.STRUCTURE_codeNAF_N5);
		struct.setCodePostal(this.STRUCTURE_codePostal);
		struct.setCommune(this.STRUCTURE_commune);
		struct.setFax(this.STRUCTURE_fax);
		struct.setIdEffectif(this.STRUCTURE_idEffectif);
		struct.setIdPays(this.STRUCTURE_idPays);
		struct.setIdStatutJuridique(this.STRUCTURE_idStatutJuridique);
		struct.setIdStructure(this.STRUCTURE_idStructure);
		struct.setIdTypeStructure(this.STRUCTURE_idTypeStructure);
		struct.setLibCedex(this.STRUCTURE_libCedex);
		struct.setMail(this.STRUCTURE_mail);
		struct.setNumeroSiret(this.STRUCTURE_numeroSiret);
		struct.setRaisonSociale(this.STRUCTURE_raisonSociale);
		struct.setSiteWeb(this.STRUCTURE_siteWeb);
		struct.setTelephone(this.STRUCTURE_telephone);
		struct.setVoie(this.STRUCTURE_voie);
		c.setStructure(struct);

		c.setSujetStage(this.sujetStage);
		c.setTelEtudiant(this.telEtudiant);
		c.setTelPortableEtudiant(this.telPortableEtudiant);
		c.setTemConfSujetTeme(this.temConfSujetTeme);
		c.setTravailNuitFerie(this.travailNuitFerie);
		c.setValidationConvention(this.validationConvention);
		c.setValidationPedagogique(this.validationPedagogique);
		c.setVilleEtudiant(this.villeEtudiant);
		return c;
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

	public Integer getIdStructure() {
		return idStructure;
	}

	public void setIdStructure(Integer idStructure) {
		this.idStructure = idStructure;
	}

	public String getSTRUCTURE_raisonSociale() {
		return STRUCTURE_raisonSociale;
	}

	public void setSTRUCTURE_raisonSociale(String STRUCTURE_raisonSociale) {
		this.STRUCTURE_raisonSociale = STRUCTURE_raisonSociale;
	}

	public String getSTRUCTURE_numeroSiret() {
		return STRUCTURE_numeroSiret;
	}

	public void setSTRUCTURE_numeroSiret(String STRUCTURE_numeroSiret) {
		this.STRUCTURE_numeroSiret = STRUCTURE_numeroSiret;
	}

	public int getSTRUCTURE_idEffectif() {
		return STRUCTURE_idEffectif;
	}

	public void setSTRUCTURE_idEffectif(int STRUCTURE_idEffectif) {
		this.STRUCTURE_idEffectif = STRUCTURE_idEffectif;
	}

	public int getSTRUCTURE_idTypeStructure() {
		return STRUCTURE_idTypeStructure;
	}

	public void setSTRUCTURE_idTypeStructure(int STRUCTURE_idTypeStructure) {
		this.STRUCTURE_idTypeStructure = STRUCTURE_idTypeStructure;
	}

	public Integer getSTRUCTURE_idStatutJuridique() {
		return STRUCTURE_idStatutJuridique;
	}

	public void setSTRUCTURE_idStatutJuridique(Integer STRUCTURE_idStatutJuridique) {
		this.STRUCTURE_idStatutJuridique = STRUCTURE_idStatutJuridique;
	}

	public String getSTRUCTURE_codeNAF_N5() {
		return STRUCTURE_codeNAF_N5;
	}

	public void setSTRUCTURE_codeNAF_N5(String STRUCTURE_codeNAF_N5) {
		this.STRUCTURE_codeNAF_N5 = STRUCTURE_codeNAF_N5;
	}

	public String getSTRUCTURE_telephone() {
		return STRUCTURE_telephone;
	}

	public void setSTRUCTURE_telephone(String STRUCTURE_telephone) {
		this.STRUCTURE_telephone = STRUCTURE_telephone;
	}

	public String getSTRUCTURE_fax() {
		return STRUCTURE_fax;
	}

	public void setSTRUCTURE_fax(String STRUCTURE_fax) {
		this.STRUCTURE_fax = STRUCTURE_fax;
	}

	public String getSTRUCTURE_mail() {
		return STRUCTURE_mail;
	}

	public void setSTRUCTURE_mail(String STRUCTURE_mail) {
		this.STRUCTURE_mail = STRUCTURE_mail;
	}

	public String getSTRUCTURE_siteWeb() {
		return STRUCTURE_siteWeb;
	}

	public void setSTRUCTURE_siteWeb(String STRUCTURE_siteWeb) {
		this.STRUCTURE_siteWeb = STRUCTURE_siteWeb;
	}

	public String getSTRUCTURE_batimentResidence() {
		return STRUCTURE_batimentResidence;
	}

	public void setSTRUCTURE_batimentResidence(String STRUCTURE_batimentResidence) {
		this.STRUCTURE_batimentResidence = STRUCTURE_batimentResidence;
	}

	public String getSTRUCTURE_voie() {
		return STRUCTURE_voie;
	}

	public void setSTRUCTURE_voie(String STRUCTURE_voie) {
		this.STRUCTURE_voie = STRUCTURE_voie;
	}

	public String getSTRUCTURE_commune() {
		return STRUCTURE_commune;
	}

	public void setSTRUCTURE_commune(String STRUCTURE_commune) {
		this.STRUCTURE_commune = STRUCTURE_commune;
	}

	public String getSTRUCTURE_codePostal() {
		return STRUCTURE_codePostal;
	}

	public void setSTRUCTURE_codePostal(String STRUCTURE_codePostal) {
		this.STRUCTURE_codePostal = STRUCTURE_codePostal;
	}

	public String getSTRUCTURE_libCedex() {
		return STRUCTURE_libCedex;
	}

	public void setSTRUCTURE_libCedex(String STRUCTURE_libCedex) {
		this.STRUCTURE_libCedex = STRUCTURE_libCedex;
	}

	public Integer getSTRUCTURE_idPays() {
		return STRUCTURE_idPays;
	}

	public void setSTRUCTURE_idPays(Integer STRUCTURE_idPays) {
		this.STRUCTURE_idPays = STRUCTURE_idPays;
	}

	public String getETUDIANT_numEtudiant() {
		return ETUDIANT_numEtudiant;
	}

	public void setETUDIANT_numEtudiant(String ETUDIANT_numEtudiant) {
		this.ETUDIANT_numEtudiant = ETUDIANT_numEtudiant;
	}

	public String getETUDIANT_codeSexe() {
		return ETUDIANT_codeSexe;
	}

	public void setETUDIANT_codeSexe(String ETUDIANT_codeSexe) {
		this.ETUDIANT_codeSexe = ETUDIANT_codeSexe;
	}

	public Integer getETUDIANT_id() {
		return ETUDIANT_id;
	}

	public void setETUDIANT_id(Integer ETUDIANT_id) {
		this.ETUDIANT_id = ETUDIANT_id;
	}

	public String getETUDIANT_nom() {
		return ETUDIANT_nom;
	}

	public void setETUDIANT_nom(String ETUDIANT_nom) {
		this.ETUDIANT_nom = ETUDIANT_nom;
	}

	public String getETUDIANT_prenom() {
		return ETUDIANT_prenom;
	}

	public void setETUDIANT_prenom(String ETUDIANT_prenom) {
		this.ETUDIANT_prenom = ETUDIANT_prenom;
	}

	public String getETUDIANT_mail() {
		return ETUDIANT_mail;
	}

	public void setETUDIANT_mail(String ETUDIANT_mail) {
		this.ETUDIANT_mail = ETUDIANT_mail;
	}

	public Integer getSERVICE_idService() {
		return SERVICE_idService;
	}

	public void setSERVICE_idService(Integer SERVICE_idService) {
		this.SERVICE_idService = SERVICE_idService;
	}

	public String getSERVICE_nom() {
		return SERVICE_nom;
	}

	public void setSERVICE_nom(String SERVICE_nom) {
		this.SERVICE_nom = SERVICE_nom;
	}

	public String getSERVICE_telephone() {
		return SERVICE_telephone;
	}

	public void setSERVICE_telephone(String SERVICE_telephone) {
		this.SERVICE_telephone = SERVICE_telephone;
	}

	public String getSERVICE_batimentResidence() {
		return SERVICE_batimentResidence;
	}

	public void setSERVICE_batimentResidence(String SERVICE_batimentResidence) {
		this.SERVICE_batimentResidence = SERVICE_batimentResidence;
	}

	public String getSERVICE_voie() {
		return SERVICE_voie;
	}

	public void setSERVICE_voie(String SERVICE_voie) {
		this.SERVICE_voie = SERVICE_voie;
	}

	public String getSERVICE_commune() {
		return SERVICE_commune;
	}

	public void setSERVICE_commune(String SERVICE_commune) {
		this.SERVICE_commune = SERVICE_commune;
	}

	public String getSERVICE_codeCommune() {
		return SERVICE_codeCommune;
	}

	public void setSERVICE_codeCommune(String SERVICE_codeCommune) {
		this.SERVICE_codeCommune = SERVICE_codeCommune;
	}

	public String getSERVICE_codePostal() {
		return SERVICE_codePostal;
	}

	public void setSERVICE_codePostal(String SERVICE_codePostal) {
		this.SERVICE_codePostal = SERVICE_codePostal;
	}

	public Integer getSERVICE_idPays() {
		return SERVICE_idPays;
	}

	public void setSERVICE_idPays(Integer SERVICE_idPays) {
		this.SERVICE_idPays = SERVICE_idPays;
	}

	public String getENSEIGNANT_uidEnseignant() {
		return ENSEIGNANT_uidEnseignant;
	}

	public void setENSEIGNANT_uidEnseignant(String ENSEIGNANT_uidEnseignant) {
		this.ENSEIGNANT_uidEnseignant = ENSEIGNANT_uidEnseignant;
	}

	public Integer getENSEIGNANT_id() {
		return ENSEIGNANT_id;
	}

	public void setENSEIGNANT_id(Integer ENSEIGNANT_id) {
		this.ENSEIGNANT_id = ENSEIGNANT_id;
	}

	public String getENSEIGNANT_nom() {
		return ENSEIGNANT_nom;
	}

	public void setENSEIGNANT_nom(String ENSEIGNANT_nom) {
		this.ENSEIGNANT_nom = ENSEIGNANT_nom;
	}

	public String getENSEIGNANT_prenom() {
		return ENSEIGNANT_prenom;
	}

	public void setENSEIGNANT_prenom(String ENSEIGNANT_prenom) {
		this.ENSEIGNANT_prenom = ENSEIGNANT_prenom;
	}

	public String getENSEIGNANT_mail() {
		return ENSEIGNANT_mail;
	}

	public void setENSEIGNANT_mail(String ENSEIGNANT_mail) {
		this.ENSEIGNANT_mail = ENSEIGNANT_mail;
	}

	public String getENSEIGNANT_tel() {
		return ENSEIGNANT_tel;
	}

	public void setENSEIGNANT_tel(String ENSEIGNANT_tel) {
		this.ENSEIGNANT_tel = ENSEIGNANT_tel;
	}

	public String getCONTACT_fonction() {
		return CONTACT_fonction;
	}

	public void setCONTACT_fonction(String CONTACT_fonction) {
		this.CONTACT_fonction = CONTACT_fonction;
	}

	public Integer getCONTACT_idService() {
		return CONTACT_idService;
	}

	public void setCONTACT_idService(Integer CONTACT_idService) {
		this.CONTACT_idService = CONTACT_idService;
	}

	public Integer getCONTACT_idCentreGestion() {
		return CONTACT_idCentreGestion;
	}

	public void setCONTACT_idCentreGestion(Integer CONTACT_idCentreGestion) {
		this.CONTACT_idCentreGestion = CONTACT_idCentreGestion;
	}

	public Integer getCONTACT_id() {
		return CONTACT_id;
	}

	public void setCONTACT_id(Integer CONTACT_id) {
		this.CONTACT_id = CONTACT_id;
	}

	public Integer getCONTACT_idCivilite() {
		return CONTACT_idCivilite;
	}

	public void setCONTACT_idCivilite(Integer CONTACT_idCivilite) {
		this.CONTACT_idCivilite = CONTACT_idCivilite;
	}

	public String getCONTACT_nom() {
		return CONTACT_nom;
	}

	public void setCONTACT_nom(String CONTACT_nom) {
		this.CONTACT_nom = CONTACT_nom;
	}

	public String getCONTACT_prenom() {
		return CONTACT_prenom;
	}

	public void setCONTACT_prenom(String CONTACT_prenom) {
		this.CONTACT_prenom = CONTACT_prenom;
	}

	public String getCONTACT_mail() {
		return CONTACT_mail;
	}

	public void setCONTACT_mail(String CONTACT_mail) {
		this.CONTACT_mail = CONTACT_mail;
	}

	public String getCONTACT_tel() {
		return CONTACT_tel;
	}

	public void setCONTACT_tel(String CONTACT_tel) {
		this.CONTACT_tel = CONTACT_tel;
	}

	public String getSIGNATAIRE_fonction() {
		return SIGNATAIRE_fonction;
	}

	public void setSIGNATAIRE_fonction(String SIGNATAIRE_fonction) {
		this.SIGNATAIRE_fonction = SIGNATAIRE_fonction;
	}

	public Integer getSIGNATAIRE_idService() {
		return SIGNATAIRE_idService;
	}

	public void setSIGNATAIRE_idService(Integer SIGNATAIRE_idService) {
		this.SIGNATAIRE_idService = SIGNATAIRE_idService;
	}

	public Integer getSIGNATAIRE_idCentreGestion() {
		return SIGNATAIRE_idCentreGestion;
	}

	public void setSIGNATAIRE_idCentreGestion(Integer SIGNATAIRE_idCentreGestion) {
		this.SIGNATAIRE_idCentreGestion = SIGNATAIRE_idCentreGestion;
	}

	public Integer getSIGNATAIRE_id() {
		return SIGNATAIRE_id;
	}

	public void setSIGNATAIRE_id(Integer SIGNATAIRE_id) {
		this.SIGNATAIRE_id = SIGNATAIRE_id;
	}

	public Integer getSIGNATAIRE_idCivilite() {
		return SIGNATAIRE_idCivilite;
	}

	public void setSIGNATAIRE_idCivilite(Integer SIGNATAIRE_idCivilite) {
		this.SIGNATAIRE_idCivilite = SIGNATAIRE_idCivilite;
	}

	public String getSIGNATAIRE_nom() {
		return SIGNATAIRE_nom;
	}

	public void setSIGNATAIRE_nom(String SIGNATAIRE_nom) {
		this.SIGNATAIRE_nom = SIGNATAIRE_nom;
	}

	public String getSIGNATAIRE_prenom() {
		return SIGNATAIRE_prenom;
	}

	public void setSIGNATAIRE_prenom(String SIGNATAIRE_prenom) {
		this.SIGNATAIRE_prenom = SIGNATAIRE_prenom;
	}

	public String getSIGNATAIRE_mail() {
		return SIGNATAIRE_mail;
	}

	public void setSIGNATAIRE_mail(String SIGNATAIRE_mail) {
		this.SIGNATAIRE_mail = SIGNATAIRE_mail;
	}

	public String getSIGNATAIRE_tel() {
		return SIGNATAIRE_tel;
	}

	public void setSIGNATAIRE_tel(String SIGNATAIRE_tel) {
		this.SIGNATAIRE_tel = SIGNATAIRE_tel;
	}

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
	public Integer getSTRUCTURE_idStructure() {
		return STRUCTURE_idStructure;
	}

	/**
	 * @param STRUCTURE_idStructure the idStructure to set
	 */
	public void setSTRUCTURE_idStructure(Integer STRUCTURE_idStructure) {
		this.STRUCTURE_idStructure = STRUCTURE_idStructure;
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


	/**
	 * @return the validationPedagogique
	 */
	public boolean isValidationPedagogique() {
		return validationPedagogique;
	}


	/**
	 * @param validationPedagogique the validationPedagogique to set
	 */
	public void setValidationPedagogique(boolean validationPedagogique) {
		this.validationPedagogique = validationPedagogique;
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
	 * @return the codeVersionEtape
	 */
	public String getCodeVersionEtape() {
		return codeVersionEtape;
	}


	/**
	 * @param codeVersionEtape the codeVersionEtape to set
	 */
	public void setCodeVersionEtape(String codeVersionEtape) {
		this.codeVersionEtape = codeVersionEtape;
	}


	/**
	 * @return the envoiMailEtudiant
	 */
	public boolean isEnvoiMailEtudiant() {
		return envoiMailEtudiant;
	}


	/**
	 * @param envoiMailEtudiant the envoiMailEtudiant to set
	 */
	public void setEnvoiMailEtudiant(boolean envoiMailEtudiant) {
		this.envoiMailEtudiant = envoiMailEtudiant;
	}


	/**
	 * @return the dateEnvoiMailEtudiant
	 */
	public Date getDateEnvoiMailEtudiant() {
		return dateEnvoiMailEtudiant;
	}


	/**
	 * @param dateEnvoiMailEtudiant the dateEnvoiMailEtudiant to set
	 */
	public void setDateEnvoiMailEtudiant(Date dateEnvoiMailEtudiant) {
		this.dateEnvoiMailEtudiant = dateEnvoiMailEtudiant;
	}


	/**
	 * @return the envoiMailTuteurPedago
	 */
	public boolean isEnvoiMailTuteurPedago() {
		return envoiMailTuteurPedago;
	}


	/**
	 * @param envoiMailTuteurPedago the envoiMailTuteurPedago to set
	 */
	public void setEnvoiMailTuteurPedago(boolean envoiMailTuteurPedago) {
		this.envoiMailTuteurPedago = envoiMailTuteurPedago;
	}


	/**
	 * @return the dateEnvoiMailTuteurPedago
	 */
	public Date getDateEnvoiMailTuteurPedago() {
		return dateEnvoiMailTuteurPedago;
	}


	/**
	 * @param dateEnvoiMailTuteurPedago the dateEnvoiMailTuteurPedago to set
	 */
	public void setDateEnvoiMailTuteurPedago(Date dateEnvoiMailTuteurPedago) {
		this.dateEnvoiMailTuteurPedago = dateEnvoiMailTuteurPedago;
	}


	/**
	 * @return the envoiMailTuteurPro
	 */
	public boolean isEnvoiMailTuteurPro() {
		return envoiMailTuteurPro;
	}


	/**
	 * @param envoiMailTuteurPro the envoiMailTuteurPro to set
	 */
	public void setEnvoiMailTuteurPro(boolean envoiMailTuteurPro) {
		this.envoiMailTuteurPro = envoiMailTuteurPro;
	}


	/**
	 * @return the dateEnvoiMailTuteurPro
	 */
	public Date getDateEnvoiMailTuteurPro() {
		return dateEnvoiMailTuteurPro;
	}


	/**
	 * @param dateEnvoiMailTuteurPro the dateEnvoiMailTuteurPro to set
	 */
	public void setDateEnvoiMailTuteurPro(Date dateEnvoiMailTuteurPro) {
		this.dateEnvoiMailTuteurPro = dateEnvoiMailTuteurPro;
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
	 * @return the nbConges
	 */
	public String getNbConges() {
		return nbConges;
	}


	/**
	 * @param nbConges the nbConges to set
	 */
	public void setNbConges(String nbConges) {
		this.nbConges = nbConges;
	}


	public Integer getIdUniteDureeGratification() {
		return idUniteDureeGratification;
	}


	public void setIdUniteDureeGratification(Integer idUniteDureeGratification) {
		this.idUniteDureeGratification = idUniteDureeGratification;
	}


	public String getMonnaieGratification() {
		return monnaieGratification;
	}


	public void setMonnaieGratification(String monnaieGratification) {
		this.monnaieGratification = monnaieGratification;
	}

	public String getLibelleUFR() {
		return libelleUFR;
	}

	public void setLibelleUFR(String libelleUFR) {
		this.libelleUFR = libelleUFR;
	}

	public String getLibelleEtape() {
		return libelleEtape;
	}

	public void setLibelleEtape(String libelleEtape) {
		this.libelleEtape = libelleEtape;
	}
}
