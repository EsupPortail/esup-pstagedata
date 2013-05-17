package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.Offre;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDTO extends ObjetMetiersDTO implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Proprietes
	 ****************************************************************/
	/**
	 * ID offre
	 */
	private int idOffre;
	/**
	 * ID Type d'offre
	 */
	private int idTypeOffre;
	/**
	 * ID Contrat
	 */
	private int idContratOffre;
	/**
	 * ID Unite de la duree
	 */
	private int idUniteDuree;
	/**
	 * ID niveau de qualification (FAP 4eme caractere) 
	 */
	private int idQualificationSimplifiee;
	/**
	 * Code de la fap de niveau 3
	 */
	private String codeFAP_N3;
	/**
	 * Code ROM
	 */
	private int codeROM;
	/**
	 * ID Pays
	 */
	private int idLieuPays;
	/**
	 * ID Temps de travail
	 */
	private int idTempsTravail;
	/**
	 * Mode(s) de candidature
	 */
	private List<Integer> idsModeCandidature;
	/**
	 * ID du niveau de formation
	 */
	private int idNiveauFormation;
	/**
	 * ID de la structure
	 */
	private int idStructure;
	/**
	 * ID du centre de gestion
	 */
	private int idCentreGestion;
	/**
	 * ID du contact pour candidater
	 */
	private int idContactCand;
	/**
	 * ID du contact pour information
	 */
	private int idContactInfo;
	/**
	 * ID du contact proprietaire
	 */
	private int idContactProprio;
	/**
	 * ID du personnel referent
	 */
	private int idReferent;
	/**
	 * Mois de debut
	 */
	private String moisDebut;
	/**
	 * Annee de debut
	 */
	private String anneeDebut;
	/**
	 * Precision sur le debut de la mission
	 */
	private String precisionDebut;
	/**
	 * Duree du contrat si CDD
	 */
	private int duree;
	/**
	 * Intitule de l'offre
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
	private String codeCommune;
	/**
	 * Code postal du lieu de la mission principale
	 */
	private String lieuCodePostal;
	/**
	 * vrai si deplacement e prevoir
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
	 * Remuneration
	 */
	private boolean remuneration;
	/**
	 * Precision sur la remuneration
	 */
	private String precisionRemuneration;
	/**
	 * Avantages
	 */
	private String avantages;
	/**
	 * Quotite de travail
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
	 * Competences
	 */
	private String competences;
	/**
	 * Reference de l'offre au sein de l'etablissement
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
	 * Date de stopage/devalidation de l'offre
	 */
	private Date dateStopValidation;
	/**
	 * login de la personne ayant diffusee l'offre
	 */
	private String loginDiffusion;
	/**
	 * login de la personne ayant arretee la diffusion
	 */
	private String loginStopDiffusion;
	/**
	 * Date de stopage de la diffusion
	 */
	private Date dateStopDiffusion;
	/**
	 * login de la personne ayant validee
	 */
	private String loginValidation;
	/**
	 * login de la personne ayant stope/devalide l'offre
	 */
	private String loginStopValidation;
	/**
	 * login de la personne ayant rejete l'offre e la validation
	 */
	private String loginRejetValidation;
	/**
	 * Vrai si l'offre est pourvue
	 */
	private boolean estPourvue;
	/**
	 * vrai si l'offre est diffusee
	 */
	private boolean estDiffusee;
	/**
	 * vrai si l'offre est validee
	 */
	private boolean estValidee;
	/**
	 * Etat de la validation (si validation des offres)
	 * 0 : non validee
	 * 1 : validee
	 * 2 : en cours
	 * 3 : refusee
	 */
	private int etatValidation;
	/**
	 * vrai si supprimee
	 */
	private boolean estSupprimee;
	/**
	 * Indiquer si leoffre est accessible ou non aux etudiants ayant une Reconnaissance 
	 * de Qualification de Travailleur Handicape (RQTH)
	 */
	private boolean estAccessERQTH;
	/**
	 * Indiquer si leoffre est prioritaire ou non aux etudiants ayant une Reconnaissance 
	 * de Qualification de Travailleur Handicape (RQTH)
	 */
	private boolean estPrioERQTH;
	/**
	 * Precision sur le handicapes
	 */
	private String precisionHandicap;
	/**
	 * Lien attache 
	 */
	private String lienAttache;
	/**
	 * ID Fichier attache
	 */
	private int idFichier;
	/**
	 * Vrai si offre avec fichier
	 */
	private boolean avecFichier;
	/**
	 * Vrai si offre avec lien
	 */
	private boolean avecLien;
	/**
	 * vrai si le telephone du contact pour candidature doit etre cache
	 */
	private boolean cacherTelContactCand;
	/**
	 * vrai si le fax du contact pour candidature doit etre cache
	 */
	private boolean cacherFaxContactCand;
	/**
	 * vrai si le mail du contact pour candidature doit etre cache
	 */
	private boolean cacherMailContactCand;
	/**
	 * vrai si le telephone du contact pour information doit etre cache
	 */
	private boolean cacherTelContactInfo;
	/**
	 * vrai si le fax du contact pour information doit etre cache
	 */
	private boolean cacherFaxContactInfo;
	/**
	 * vrai si le mail du contact pour information doit etre cache
	 */
	private boolean cacherMailContactInfo;
	/**
	 * vrai si le nom du contact pour candidature doit etre cache
	 */
	private boolean cacherNomContactCand;
	/**
	 * vrai si le nom du contact pour information doit etre cache
	 */
	private boolean cacherNomContactInfo;
	/**
	 * vrai si les coordonnees de l'etablissement sont cachees (Raison Sociale, Adresse + Nom de Service)
	 */
	private boolean cacherEtablissement;
	/**
	 * Annee universtaire
	 */
	private String anneeUniversitaire;
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Type d'offre
	 */
	private TypeOffreDTO typeOffre;
	/**
	 * Contrat de l'offre
	 */
	private ContratOffreDTO contratOffre;
	/**
	 * Unite duree
	 */
	private UniteDureeDTO uniteDuree;
	/**
	 * Qualification simplifee
	 */
	private FapQualificationSimplifieeDTO fapQualificationSimplifiee;
	/**
	 * Fap N1
	 */
	private FapN1DTO fapN1;
	/**
	 * Fap N3
	 */
	private FapN3DTO fapN3;
	/**
	 * Lieu-Pays
	 */
	private PaysDTO lieuPays;
	/**
	 * Temps de travail
	 */
	private TempsTravailDTO tempsTravail;
	/**
	 * Mode(s) de Candidature
	 */
	private List<ModeCandidatureDTO> modesCandidature;
	/**
	 * Niveau de formation
	 */
	private NiveauFormationDTO niveauFormation;
	/**
	 * Structure 
	 */
	private StructureDTO structure;
	/**
	 * Contact candidature
	 */
	private ContactDTO contactCand;
	/**
	 * Contact information
	 */
	private ContactDTO contactInfo;
	/**
	 * Contact 
	 */
	private ContactDTO contactProprio;
	/**
	 * Fichier Attache
	 */
	private FichierDTO fichier;
	/**
	 * Centre de gestion
	 */
	private CentreGestionDTO centreGestion;
	/**
	 * Diffusion de l'offre
	 */
	private List<OffreDiffusionDTO> offresDiffusion;
	
	/**
	 * Constructeur
	 */
	public OffreDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param o 
	 * @param light : donnees minimales
	 */
	public OffreDTO(Offre o, boolean light){
		super(o);
		if(o!=null){
			idOffre=o.getIdOffre();
			idStructure=o.getIdStructure();	
			idCentreGestion=o.getIdCentreGestion();
			idTypeOffre=o.getIdTypeOffre();
			if(o.getIdContratOffre()!=null)idContratOffre=o.getIdContratOffre();
			else idContratOffre=0;
			if(o.getIdLieuPays()!=null){
				idLieuPays=o.getIdLieuPays();
			}else idLieuPays=0;
			intitule=o.getIntitule();
			lieuCommune=o.getLieuCommune();
			lieuCodePostal=o.getLieuCodePostal();
			dateDiffusion=o.getDateDiffusion();
			dateFinDiffusion=o.getDateFinDiffusion();
			estSupprimee=o.isEstSupprimee();
			estDiffusee=o.isEstDiffusee();
			estValidee=o.isEstValidee();
			etatValidation=o.getEtatValidation();
			estAccessERQTH=o.isEstAccessERQTH();
			estPrioERQTH=o.isEstPrioERQTH();
			avecFichier=o.isAvecFichier();
			avecLien=o.isAvecLien();
			if(o.getStructure()!=null){
				structure=new StructureDTO(o.getStructure(),true);
			}
			if (o.getCentreGestion() != null) {
				centreGestion = new CentreGestionDTO(o.getCentreGestion());
			}
			
			if(!light){
				if(o.getCodeCommune()!=null){
					codeCommune=o.getCodeCommune();
				}else codeCommune="0";
				if(o.getIdUniteDuree()!=null)idUniteDuree=o.getIdUniteDuree();
				else idUniteDuree=0;
				if(o.getIdQualificationSimplifiee()!=null){
					idQualificationSimplifiee=o.getIdQualificationSimplifiee();
				}else idQualificationSimplifiee=0;
				codeFAP_N3=o.getCodeFAP_N3();
				if(o.getCodeROM()!=null)codeROM=o.getCodeROM();
				else codeROM=0;
				
				if(o.getIdTempsTravail()!=null)idTempsTravail=o.getIdTempsTravail();
				else idTempsTravail=0;
				idsModeCandidature=o.getIdsModeCandidature();
				if(o.getIdNiveauFormation()!=null)idNiveauFormation=o.getIdNiveauFormation();
				else idNiveauFormation=0;

				if(o.getIdContactCand()!=null)idContactCand=o.getIdContactCand();
				else idContactCand=0;
				if(o.getIdContactInfo()!=null)idContactInfo=o.getIdContactInfo();
				else idContactInfo=0;
				if(o.getIdContactProprio()!=null)idContactProprio=o.getIdContactProprio();
				else idContactProprio=0;
				if(o.getIdReferent()!=null)idReferent=o.getIdReferent();
				else idReferent=0;
				moisDebut=o.getMoisDebut();
				anneeDebut=o.getAnneeDebut();
				precisionDebut=o.getPrecisionDebut();
				duree=o.getDuree();
				
				description=o.getDescription();

				deplacement=o.isDeplacement();
				permis=o.isPermis();
				voiture=o.isVoiture();
				remuneration=o.isRemuneration();
				precisionRemuneration=o.getPrecisionRemuneration();
				avantages=o.getAvantages();
				quotiteTravail=o.getQuotiteTravail();
				commentaireTempsTravail=o.getCommentaireTempsTravail();
				observations=o.getObservations();
				competences=o.getCompetences();
				referenceOffreEtablissement=o.getReferenceOffreEtablissement();

				dateValidation=o.getDateValidation();
				dateStopValidation=o.getDateStopValidation();
				loginDiffusion=o.getLoginDiffusion();
				loginStopDiffusion=o.getLoginStopDiffusion();
				dateStopDiffusion=o.getDateStopDiffusion();
				loginValidation=o.getLoginValidation();
				loginStopValidation=o.getLoginStopValidation();
				loginRejetValidation=o.getLoginRejetValidation();
				estPourvue=o.isEstPourvue();

				precisionHandicap=o.getPrecisionHandicap();
				lienAttache=o.getLienAttache();
				idFichier=o.getIdFichier();
				cacherTelContactCand=o.isCacherTelContactCand();
				cacherFaxContactCand=o.isCacherFaxContactCand();
				cacherMailContactCand=o.isCacherMailContactCand();
				cacherTelContactInfo=o.isCacherTelContactInfo();
				cacherFaxContactInfo=o.isCacherFaxContactInfo();
				cacherMailContactInfo=o.isCacherMailContactInfo();
				cacherNomContactCand=o.isCacherNomContactCand();
				cacherNomContactInfo=o.isCacherNomContactInfo();
				cacherEtablissement=o.isCacherEtablissement();
				
				if(o.getFichier()!=null)fichier=new FichierDTO(o.getFichier());
				else fichier=null;
				if(o.getContactCand()!=null)contactCand=new ContactDTO(o.getContactCand());
				else contactCand=null;
				if(o.getContactInfo()!=null)contactInfo= new ContactDTO(o.getContactInfo());
				else contactInfo=null;
				anneeUniversitaire=o.getAnneeUniversitaire();
			}
		}
	}
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof OffreDTO){
			r = this.idOffre==((OffreDTO)o).getIdOffre();
		}
		return r;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"idOffre : "+idOffre+", "+
		"idTypeOffre : "+idTypeOffre+", "+
		"idContratOffre : "+idContratOffre+", "+
		"idUniteDuree : "+idUniteDuree+", "+
		"idQualificationSimplifiee : "+idQualificationSimplifiee+", "+
		"codeFAP_N3 : "+codeFAP_N3+", "+
		"codeROM : "+codeROM+", "+
		"idLieuPays : "+idLieuPays+", "+
		"idTempsTravail : "+idTempsTravail+", "+
		"idsModeCandidature : "+idsModeCandidature+", "+
		"idNiveauFormation : "+idNiveauFormation+", "+
		"idStructure : "+idStructure+", "+
		"idCentreGestion : "+idCentreGestion+", "+
		"idContactCand : "+idContactCand+", "+
		"idContactInfo : "+idContactInfo+", "+
		"idContactProprio : "+idContactProprio+", "+
		"idReferent : "+idReferent+", "+
		"moisDebut : "+moisDebut+", "+
		"anneeDebut : "+anneeDebut+", "+
		"precisionDebut : "+precisionDebut+", "+
		"duree : "+duree+", "+
		"intitule : "+intitule+", "+
		"description : "+description+", "+
		"lieuCommune : "+lieuCommune+", "+
		"codeCommune : "+codeCommune+", "+
		"lieuCodePostal : "+lieuCodePostal+", "+
		"deplacement : "+deplacement+", "+
		"permis : "+permis+", "+
		"voiture : "+voiture+", "+
		"remuneration : "+remuneration+", "+
		"precisionRemuneration : "+precisionRemuneration+", "+
		"quotiteTravail : "+quotiteTravail+", "+
		"commentaireTempsTravail : "+commentaireTempsTravail+", "+
		"observations : "+observations+", "+
		"competences : "+competences+", "+
		"referenceOffreEtablissement : "+referenceOffreEtablissement+", "+
		"dateDiffusion : "+dateDiffusion+", "+
		"dateFinDiffusion : "+dateFinDiffusion+", "+
		"dateValidation : "+dateValidation+", "+
		"dateStopValidation : "+dateStopValidation+", "+
		"loginDiffusion : "+loginDiffusion+", "+
		"loginStopDiffusion : "+loginStopDiffusion+", "+
		"dateStopDiffusion : "+dateStopDiffusion+", "+
		"loginValidation : "+loginValidation+", "+
		"loginStopValidation : "+loginStopValidation+", "+
		"loginRejetValidation : "+loginRejetValidation+", "+
		"estPourvue : "+estPourvue+", "+
		"estDiffusee : "+estDiffusee+", "+
		"estValidee : "+estValidee+", "+
		"estSupprimee : "+estSupprimee+", "+
		"estAccessERQTH : "+estAccessERQTH+", "+
		"estPrioERQTH : "+estPrioERQTH+", "+
		"avecFichier : "+avecFichier+", "+
		"avecLien : "+avecLien+", "+
		"lienAttache : "+lienAttache+", "+
		"idFichier : "+idFichier+", "+
		"cacherTelContactCand : "+cacherTelContactCand+", "+
		"cacherFaxContactCand : "+cacherFaxContactCand+", "+
		"cacherMailContactCand : "+cacherMailContactCand+", "+
		"cacherTelContactInfo : "+cacherTelContactInfo+", "+
		"cacherFaxContactInfo : "+cacherFaxContactInfo+", "+
		"cacherMailContactInfo : "+cacherMailContactInfo+", "+
		"cacherEtablissement : "+cacherEtablissement+", "+super.toString();
	}

	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone(){
		try {
			return super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	} 
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the idOffre
	 */
	public int getIdOffre() {
		return idOffre;
	}
	/**
	 * @param idOffre the idOffre to set
	 */
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	/**
	 * @return the idTypeOffre
	 */
	public int getIdTypeOffre() {
		return idTypeOffre;
	}
	/**
	 * @param idTypeOffre the idTypeOffre to set
	 */
	public void setIdTypeOffre(int idTypeOffre) {
		this.idTypeOffre = idTypeOffre;
	}
	/**
	 * @return the idContratOffre
	 */
	public int getIdContratOffre() {
		return idContratOffre;
	}
	/**
	 * @param idContratOffre the idContratOffre to set
	 */
	public void setIdContratOffre(int idContratOffre) {
		this.idContratOffre = idContratOffre;
	}
	/**
	 * @return the idUniteDuree
	 */
	public int getIdUniteDuree() {
		return idUniteDuree;
	}
	/**
	 * @param idUniteDuree the idUniteDuree to set
	 */
	public void setIdUniteDuree(int idUniteDuree) {
		this.idUniteDuree = idUniteDuree;
	}
	/**
	 * @return the idQualificationSimplifiee
	 */
	public int getIdQualificationSimplifiee() {
		return idQualificationSimplifiee;
	}

	/**
	 * @param idQualificationSimplifiee the idQualificationSimplifiee to set
	 */
	public void setIdQualificationSimplifiee(int idQualificationSimplifiee) {
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
	public int getCodeROM() {
		return codeROM;
	}
	/**
	 * @param codeROM the codeROM to set
	 */
	public void setCodeROM(int codeROM) {
		this.codeROM = codeROM;
	}
	/**
	 * @return the idLieuPays
	 */
	public int getIdLieuPays() {
		return idLieuPays;
	}
	/**
	 * @param idLieuPays the idLieuPays to set
	 */
	public void setIdLieuPays(int idLieuPays) {
		this.idLieuPays = idLieuPays;
	}
	/**
	 * @return the idTempsTravail
	 */
	public int getIdTempsTravail() {
		return idTempsTravail;
	}
	/**
	 * @param idTempsTravail the idTempsTravail to set
	 */
	public void setIdTempsTravail(int idTempsTravail) {
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
	public int getIdNiveauFormation() {
		return idNiveauFormation;
	}
	/**
	 * @param idNiveauFormation the idNiveauFormation to set
	 */
	public void setIdNiveauFormation(int idNiveauFormation) {
		this.idNiveauFormation = idNiveauFormation;
	}
	/**
	 * @return the idStructure
	 */
	public int getIdStructure() {
		return idStructure;
	}
	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(int idStructure) {
		this.idStructure = idStructure;
	}
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
	 * @return the idContactCand
	 */
	public int getIdContactCand() {
		return idContactCand;
	}
	/**
	 * @param idContactCand the idContactCand to set
	 */
	public void setIdContactCand(int idContactCand) {
		this.idContactCand = idContactCand;
	}
	/**
	 * @return the idContactInfo
	 */
	public int getIdContactInfo() {
		return idContactInfo;
	}
	/**
	 * @param idContactInfo the idContactInfo to set
	 */
	public void setIdContactInfo(int idContactInfo) {
		this.idContactInfo = idContactInfo;
	}
	/**
	 * @return the idContactProprio
	 */
	public int getIdContactProprio() {
		return idContactProprio;
	}
	/**
	 * @param idContactProprio the idContactProprio to set
	 */
	public void setIdContactProprio(int idContactProprio) {
		this.idContactProprio = idContactProprio;
	}
	/**
	 * @return the idReferent
	 */
	public int getIdReferent() {
		return idReferent;
	}
	/**
	 * @param idReferent the idReferent to set
	 */
	public void setIdReferent(int idReferent) {
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
	public int getDuree() {
		return duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
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
	public int getEtatValidation() {
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
		if(!estAccessERQTH)this.estPrioERQTH=false;
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
		if(estPrioERQTH) this.estAccessERQTH=true;
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
	public int getIdFichier() {
		return idFichier;
	}

	/**
	 * @param idFichier the idFichier to set
	 */
	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	/**
	 * @param etatValidation the etatValidation to set
	 */
	public void setEtatValidation(int etatValidation) {
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
	 * @return the typeOffre
	 */
	public TypeOffreDTO getTypeOffre() {
		return typeOffre;
	}

	/**
	 * @param typeOffre the typeOffre to set
	 */
	public void setTypeOffre(TypeOffreDTO typeOffre) {
		this.typeOffre = typeOffre;
	}

	/**
	 * @return the contratOffre
	 */
	public ContratOffreDTO getContratOffre() {
		return contratOffre;
	}

	/**
	 * @param contratOffre the contratOffre to set
	 */
	public void setContratOffre(ContratOffreDTO contratOffre) {
		this.contratOffre = contratOffre;
	}

	/**
	 * @return the uniteDuree
	 */
	public UniteDureeDTO getUniteDuree() {
		return uniteDuree;
	}

	/**
	 * @param uniteDuree the uniteDuree to set
	 */
	public void setUniteDuree(UniteDureeDTO uniteDuree) {
		this.uniteDuree = uniteDuree;
	}

	/**
	 * @return the fapQualificationSimplifiee
	 */
	public FapQualificationSimplifieeDTO getFapQualificationSimplifiee() {
		return fapQualificationSimplifiee;
	}

	/**
	 * @param fapQualificationSimplifiee the fapQualificationSimplifiee to set
	 */
	public void setFapQualificationSimplifiee(
			FapQualificationSimplifieeDTO fapQualificationSimplifiee) {
		this.fapQualificationSimplifiee = fapQualificationSimplifiee;
	}

	/**
	 * @return the fapN1
	 */
	public FapN1DTO getFapN1() {
		return fapN1;
	}

	/**
	 * @param fapN1 the fapN1 to set
	 */
	public void setFapN1(FapN1DTO fapN1) {
		this.fapN1 = fapN1;
	}

	/**
	 * @return the fapN3
	 */
	public FapN3DTO getFapN3() {
		return fapN3;
	}

	/**
	 * @param fapN3 the fapN3 to set
	 */
	public void setFapN3(FapN3DTO fapN3) {
		this.fapN3 = fapN3;
	}

	/**
	 * @return the lieuPays
	 */
	public PaysDTO getLieuPays() {
		return lieuPays;
	}

	/**
	 * @param lieuPays the lieuPays to set
	 */
	public void setLieuPays(PaysDTO lieuPays) {
		this.lieuPays = lieuPays;
	}

	/**
	 * @return the tempsTravail
	 */
	public TempsTravailDTO getTempsTravail() {
		return tempsTravail;
	}

	/**
	 * @param tempsTravail the tempsTravail to set
	 */
	public void setTempsTravail(TempsTravailDTO tempsTravail) {
		this.tempsTravail = tempsTravail;
	}

	/**
	 * @return the modesCandidature
	 */
	public List<ModeCandidatureDTO> getModesCandidature() {
		return modesCandidature;
	}

	/**
	 * @param modesCandidature the modesCandidature to set
	 */
	public void setModesCandidature(List<ModeCandidatureDTO> modesCandidature) {
		this.modesCandidature = modesCandidature;
	}

	/**
	 * @return the niveauFormation
	 */
	public NiveauFormationDTO getNiveauFormation() {
		return niveauFormation;
	}

	/**
	 * @param niveauFormation the niveauFormation to set
	 */
	public void setNiveauFormation(NiveauFormationDTO niveauFormation) {
		this.niveauFormation = niveauFormation;
	}

	/**
	 * @return the structure
	 */
	public StructureDTO getStructure() {
		return structure;
	}

	/**
	 * @param structure the structure to set
	 */
	public void setStructure(StructureDTO structure) {
		this.structure = structure;
	}

	/**
	 * @return the contactCand
	 */
	public ContactDTO getContactCand() {
		return contactCand;
	}

	/**
	 * @param contactCand the contactCand to set
	 */
	public void setContactCand(ContactDTO contactCand) {
		this.contactCand = contactCand;
	}

	/**
	 * @return the contactInfo
	 */
	public ContactDTO getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(ContactDTO contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the contactProprio
	 */
	public ContactDTO getContactProprio() {
		return contactProprio;
	}

	/**
	 * @param contactProprio the contactProprio to set
	 */
	public void setContactProprio(ContactDTO contactProprio) {
		this.contactProprio = contactProprio;
	}

	/**
	 * @return the fichier
	 */
	public FichierDTO getFichier() {
		return fichier;
	}

	/**
	 * @param fichier the fichier to set
	 */
	public void setFichier(FichierDTO fichier) {
		this.fichier = fichier;
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
	 * @return the offresDiffusion
	 */
	public List<OffreDiffusionDTO> getOffresDiffusion() {
		return offresDiffusion;
	}

	/**
	 * @param offresDiffusion the offresDiffusion to set
	 */
	public void setOffresDiffusion(List<OffreDiffusionDTO> offresDiffusion) {
		this.offresDiffusion = offresDiffusion;
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
