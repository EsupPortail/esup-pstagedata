package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.Convention;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class ConventionDTO extends ObjetMetiersDTO implements Serializable{
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
	 * codeVersionEtape
	 */
	private String codeVersionEtape;
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
	 * nombre avenant
	 */
	private int nbAvenant;

	/**
	 * variable pour la listCheckBox de validation en masse
	 */
	private boolean selected;
	
	/**
	 * competences
	 */
	private String competences;
	/**
	 * nbConges
	 */
	private String nbConges;
	/**
	 * idUniteDureeGratification
	 */
	private Integer idUniteDureeGratification;
	/**
	 * monnaieGratification
	 */
	private String monnaieGratification;

	/* **
	 * Objets
	 */

	/**
	 * etudiant
	 */
	private EtudiantDTO etudiant;

	/**
	 * centreGestion
	 */
	private CentreGestionDTO centreGestion;

	/**
	 * Structure 
	 */
	private StructureDTO structure;

	/**
	 * Service 
	 */
	private ServiceDTO service;

	/**
	 * contact
	 */
	private ContactDTO contact;

	/**
	 * signataire entreprise
	 */
	private ContactDTO signataire;

	/**
	 * enseigant
	 */
	private EnseignantDTO enseignant;

	/**
	 * etape
	 */
	private EtapeDTO etape;

	/**
	 * ufr
	 */
	private UfrDTO ufr;

	/**
	 * ficheEvaluation
	 */
	private FicheEvaluationDTO ficheEvaluation;

	/**
	 * reponseEvaluation
	 */
	private ReponseEvaluationDTO reponseEvaluation;

	/**
	 * questionsSupplementaires
	 */
	private List<QuestionSupplementaireDTO> questionsSupplementaires;
	
	/* **
	 * Objets Nomenclature
	 */

	/**
	 * typeConvention
	 */
	private TypeConventionDTO typeConvention;

	/**
	 * theme
	 */
	private ThemeDTO theme;

	/**
	 * uniteDuree
	 */
	private UniteDureeDTO uniteDuree;

	/**
	 * uniteDureeGratification
	 */
	private UniteDureeDTO uniteDureeGratification;
	
	/**
	 * tempsTravail
	 */
	private TempsTravailDTO tempsTravail;

	/**
	 * indemnisation
	 */
	private IndemnisationDTO indemnisation;

	/**
	 * uniteGratification
	 */
	private UniteGratificationDTO uniteGratification;

	/**
	 * modeVersGratification
	 */
	private ModeVersGratificationDTO modeVersGratification;

	/**
	 * natureTravail
	 */
	private NatureTravailDTO natureTravail;

	/**
	 * modeValidationStage
	 */
	private ModeValidationStageDTO modeValidationStage;

	/**
	 * origineStage
	 */
	private OrigineStageDTO origineStage;

	/**
	 * assurance
	 */
	private AssuranceDTO assurance;

	/**
	 * caisseRegime
	 */
	private CaisseRegimeDTO caisseRegime;

	/**
	 * langueConvention
	 */
	private LangueConventionDTO langueConvention;

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
	 * Constructeur
	 */
	public ConventionDTO(){
		super();
		this.setIdEnseignant(0);
		this.setIdStructure(0);
		this.setIdService(0);
		this.setIdContact(0);
		this.setIdSignataire(0);
		this.setIdOffre(0);
		this.setIdOrigineStage(0);
		this.setIdUniteDureeExceptionnelle(0);
		this.setIdUniteDureeGratification(0);
		this.setIdUniteGratification(0);
	}


	/**
	 * @param c
	 * @param light 
	 */
	public ConventionDTO(Convention c, boolean light){
		super(c);
		if(c!=null){
			this.idEtudiant=c.getIdEtudiant();
			this.idStructure=c.getIdStructure();
			this.idConvention=c.getIdConvention();
			this.dateDebutStage=c.getDateDebutStage();
			this.dateFinStage=c.getDateFinStage();
			this.validationConvention=c.isValidationConvention();
			this.validationPedagogique=c.isValidationPedagogique();
			this.annee=c.getAnnee();
			this.codeUFR=c.getCodeUFR();
			this.codeUniversiteUFR=c.getCodeUniversiteUFR();
			this.codeEtape=c.getCodeEtape();
			this.codeVersionEtape=c.getCodeVersionEtape();
			this.codeUniversiteEtape=c.getCodeUniversiteEtape();
			this.idCentreGestion=c.getIdCentreGestion();
			// ajouts evaluation
			this.envoiMailEtudiant = c.isEnvoiMailEtudiant();
			this.dateEnvoiMailEtudiant = c.getDateEnvoiMailEtudiant();
			this.envoiMailTuteurPedago = c.isEnvoiMailTuteurPedago();
			this.dateEnvoiMailTuteurPedago = c.getDateEnvoiMailTuteurPedago();
			this.envoiMailTuteurPro = c.isEnvoiMailTuteurPro();
			this.dateEnvoiMailTuteurPro = c.getDateEnvoiMailTuteurPro();
			if(!light){
				this.codeDepartement=c.getCodeDepartement();
				this.idEnseignant=c.getIdEnseignant();
				this.idService=c.getIdService();
				this.idContact=c.getIdContact();
				this.idSignataire=c.getIdSignataire();
				this.idTypeConvention=c.getIdTypeConvention();
				this.idOffre=c.getIdOffre();
				this.sujetStage=c.getSujetStage();
				this.interruptionStage=c.isInterruptionStage();
				this.dateDebutInterruption=c.getDateDebutInterruption();
				this.dateFinInterruption=c.getDateFinInterruption();
				this.nbJoursHebdo=c.getNbJoursHebdo();
				this.idTempsTravail=c.getIdTempsTravail();
				this.commentaireDureeTravail=c.getCommentaireDureeTravail();
				this.codeLangueConvention=c.getCodeLangueConvention();
				this.idOrigineStage=c.getIdOrigineStage();
				this.idTheme=c.getIdTheme();
				this.conventionStructure=c.isConventionStructure();
				this.conversionEnContrat=c.isConversionEnContrat();
				this.commentaireStage=c.getCommentaireStage();
				this.adresseEtudiant=c.getAdresseEtudiant();
				this.codePostalEtudiant=c.getCodePostalEtudiant();
				this.villeEtudiant=c.getVilleEtudiant();
				this.paysEtudiant=c.getPaysEtudiant();
				this.courrielPersoEtudiant=c.getCourrielPersoEtudiant();
				this.telEtudiant=c.getTelEtudiant();
				this.telPortableEtudiant=c.getTelPortableEtudiant();
				this.idIndemnisation=c.getIdIndemnisation();
				this.montantGratification=c.getMontantGratification();
				this.fonctionsEtTaches=c.getFonctionsEtTaches();
				this.details=c.getDetails();

				this.idAssurance=c.getIdAssurance();
				this.insee=c.getInsee();
				this.codeCaisse=c.getCodeCaisse();
				this.temConfSujetTeme=c.getTemConfSujetTeme();
				this.nbHeuresHebdo=c.getNbHeuresHebdo();
				this.quotiteTravail=c.getQuotiteTravail();
				this.modeEncadreSuivi=c.getModeEncadreSuivi();
				this.idModeVersGratification=c.getIdModeVersGratification();
				this.avantagesNature=c.getAvantagesNature();
				this.idNatureTravail=c.getIdNatureTravail();
				this.idModeValidationStage=c.getIdModeValidationStage();
				this.codeElp=c.getCodeElp();
				this.libelleELP=c.getLibelleELP();
				this.creditECTS=c.getCreditECTS();
				this.travailNuitFerie=c.getTravailNuitFerie();
				this.dureeStage=c.getDureeStage();
				this.nomEtabRef=c.getNomEtabRef();
				this.adresseEtabRef=c.getAdresseEtabRef();
				this.nomSignataireComposante=c.getNomSignataireComposante();
				this.qualiteSignataire=c.getQualiteSignataire();
				this.libelleCPAM=c.getLibelleCPAM();
				this.dureeExceptionnelle=c.getDureeExceptionnelle();
				this.idUniteDureeExceptionnelle=c.getIdUniteDureeExceptionnelle();
				this.idUniteDureeGratification=c.getIdUniteDureeGratification();
				this.idUniteGratification=c.getIdUniteGratification();
				this.codeFinalite=c.getCodeFinalite();
				this.libelleFinalite=c.getLibelleFinalite();
				this.codeCursusLMD=c.getCodeCursusLMD();
				this.priseEnChargeFraisMission=c.isPriseEnChargeFraisMission();
				this.codeRGI=c.getCodeRGI();
				this.loginValidation=c.getLoginValidation();
				this.dateValidation=c.getDateValidation();
				this.loginSignature=c.getLoginSignature();
				this.dateSignature=c.getDateSignature();
				this.nbAvenant = c.getNbAvenant();
				if (c.getStructure() != null) {
					this.structure=new StructureDTO(c.getStructure(),false);
				}
				if (c.getEtudiant() != null) {
					this.etudiant = new EtudiantDTO(c.getEtudiant(),false);
				}
				if (c.getUfr() != null) {
					this.ufr = new UfrDTO(c.getUfr());
				}
				if (c.getEtape() != null) {
					this.etape = new EtapeDTO(c.getEtape());
				}
				if (c.getService() != null) {
					this.service = new ServiceDTO(c.getService());
				}
				if (c.getEnseignant() != null) {
					this.enseignant = new EnseignantDTO(c.getEnseignant());
				}
				if (c.getContact() != null) {
					this.contact = new ContactDTO(c.getContact());
				}
				if (c.getSignataire() != null) {
					this.signataire = new ContactDTO(c.getSignataire());
				}
				
				// Ajout nouvelle convention
				this.nbConges = c.getNbConges();
				this.competences = c.getCompetences();
				
				this.monnaieGratification = c.getMonnaieGratification();
			}else{
				this.structure=new StructureDTO(c.getStructure(),true);
				this.etudiant=new EtudiantDTO(c.getEtudiant(),true);
				this.ufr=new UfrDTO(c.getUfr());
				this.etape=new EtapeDTO(c.getEtape());
				this.nbAvenant = c.getNbAvenant();
			}
		}
	}

	/**
	 * Constructeur pour l'export excel
	 * @param c
	 */
	public ConventionDTO(Convention c){
		super(c);
		if(c!=null){
			this.idEtudiant=c.getIdEtudiant();
			this.idStructure=c.getIdStructure();
			this.idConvention=c.getIdConvention();
			this.dateDebutStage=c.getDateDebutStage();
			this.dateFinStage=c.getDateFinStage();
			this.validationConvention=c.isValidationConvention();
			this.validationPedagogique=c.isValidationPedagogique();
			this.annee=c.getAnnee();
			this.codeUFR=c.getCodeUFR();
			this.codeUniversiteUFR=c.getCodeUniversiteUFR();
			this.codeEtape=c.getCodeEtape();
			this.codeVersionEtape=c.getCodeVersionEtape();
			this.codeUniversiteEtape=c.getCodeUniversiteEtape();
			this.codeDepartement=c.getCodeDepartement();
			this.idEnseignant=c.getIdEnseignant();
			this.idService=c.getIdService();
			this.idContact=c.getIdContact();
			this.idSignataire=c.getIdSignataire();
			this.idTypeConvention=c.getIdTypeConvention();
			this.sujetStage=c.getSujetStage();
			this.interruptionStage=c.isInterruptionStage();
			this.dateDebutInterruption=c.getDateDebutInterruption();
			this.dateFinInterruption=c.getDateFinInterruption();
			this.nbJoursHebdo=c.getNbJoursHebdo();
			this.idTempsTravail=c.getIdTempsTravail();
			this.commentaireDureeTravail=c.getCommentaireDureeTravail();
			this.commentaireStage=c.getCommentaireStage();
			this.idTheme=c.getIdTheme();
			this.adresseEtudiant=c.getAdresseEtudiant();
			this.codePostalEtudiant=c.getCodePostalEtudiant();
			this.villeEtudiant=c.getVilleEtudiant();
			this.paysEtudiant=c.getPaysEtudiant();
			this.courrielPersoEtudiant=c.getCourrielPersoEtudiant();
			this.telEtudiant=c.getTelEtudiant();
			this.telPortableEtudiant=c.getTelPortableEtudiant();
			this.idIndemnisation=c.getIdIndemnisation();
			this.montantGratification=c.getMontantGratification();
			this.fonctionsEtTaches=c.getFonctionsEtTaches();
			this.details=c.getDetails();
//			this.idAssurance=c.getIdAssurance();
//			this.insee=c.getInsee();
//			this.codeCaisse=c.getCodeCaisse();
//			this.temConfSujetTeme=c.getTemConfSujetTeme();
//			this.nbHeuresHebdo=c.getNbHeuresHebdo();
//			this.quotiteTravail=c.getQuotiteTravail();
//			this.modeEncadreSuivi=c.getModeEncadreSuivi();
//			this.idModeVersGratification=c.getIdModeVersGratification();
			this.avantagesNature=c.getAvantagesNature();
//			this.idNatureTravail=c.getIdNatureTravail();
//			this.idModeValidationStage=c.getIdModeValidationStage();
			this.codeElp=c.getCodeElp();
			this.libelleELP=c.getLibelleELP();
//			this.creditECTS=c.getCreditECTS();
//			this.travailNuitFerie=c.getTravailNuitFerie();
			this.dureeStage=c.getDureeStage();
//			this.nomEtabRef=c.getNomEtabRef();
//			this.adresseEtabRef=c.getAdresseEtabRef();
//			this.nomSignataireComposante=c.getNomSignataireComposante();
//			this.qualiteSignataire=c.getQualiteSignataire();
//			this.libelleCPAM=c.getLibelleCPAM();
			this.dureeExceptionnelle=c.getDureeExceptionnelle();
			this.idUniteDureeExceptionnelle=c.getIdUniteDureeExceptionnelle();
			this.idUniteDureeGratification=c.getIdUniteDureeGratification();
			this.idUniteGratification=c.getIdUniteGratification();
			this.monnaieGratification=c.getMonnaieGratification();
//			this.codeFinalite=c.getCodeFinalite();
//			this.libelleFinalite=c.getLibelleFinalite();
//			this.codeCursusLMD=c.getCodeCursusLMD();
//			this.priseEnChargeFraisMission=c.isPriseEnChargeFraisMission();
//			this.idFicheEvaluation=c.getIdFicheEvaluation();
//			this.codeRGI=c.getCodeRGI();
//			this.loginValidation=c.getLoginValidation();
//			this.dateValidation=c.getDateValidation();
//			this.loginSignature=c.getLoginSignature();
//			this.dateSignature=c.getDateSignature();
//			this.verificationConvention=c.isVerificationConvention();
			this.nbAvenant = c.getNbAvenant();
			if (c.getStructure() != null) {
				this.structure=new StructureDTO(c.getStructure(),false);
			}
			if (c.getEtudiant() != null) {
				this.etudiant = new EtudiantDTO(c.getEtudiant(),false);
			}
			if (c.getUfr() != null) {
				this.ufr = new UfrDTO(c.getUfr());
			}
			if (c.getEtape() != null) {
				this.etape = new EtapeDTO(c.getEtape());
			}
			if (c.getService() != null) {
				this.service = new ServiceDTO(c.getService());
			}
			if (c.getEnseignant() != null) {
				this.enseignant = new EnseignantDTO(c.getEnseignant());
			}
			if (c.getContact() != null) {
				this.contact = new ContactDTO(c.getContact());
			}
			if (c.getSignataire() != null) {
				this.signataire = new ContactDTO(c.getSignataire());
			}
		}
	}


	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return 
				"idConvention : "+idConvention+", "+
				"idEtudiant : "+idEtudiant+", "+
				"idCentreGestion : "+idCentreGestion+", "+
				"codeUFR : "+codeUFR+", "+
				"codeDepartement : "+codeDepartement+", "+
				"codeEtape : "+codeEtape+", "+
				"codeVersionEtape : "+codeVersionEtape+", "+
				"idStructure : "+idStructure+", "+
				"idService: "+idService+", "+
				"idContact : "+idContact+", "+
				"idSignataire : "+idSignataire+", "+
				"idTypeConvention : "+idTypeConvention+", "+
				"idOffre : "+idOffre+", "+
				"sujetStage : "+sujetStage+", "+
				"dateDebutStage : "+dateDebutStage+", "+
				"dateFinStage : "+dateFinStage+", "+
				"interruptionStage : "+interruptionStage+", "+
				"dateDebutInterruption : "+dateDebutInterruption+", "+
				"dateFinInterruption : "+dateFinInterruption+", "+
				"nbJoursHebdo : "+nbJoursHebdo+", "+
				"idTempsTravail : "+idTempsTravail+", "+
				"commentaireDureeTravail : "+commentaireDureeTravail+", "+
				"codeLangueConvention : "+codeLangueConvention+", "+
				"idOrigineStage : "+idOrigineStage+", "+
				"idTheme : "+idTheme+", "+
				"conventionStructure : "+conventionStructure+", "+
				"validationConvention : "+validationConvention+", "+
				"validationPedagogique : "+validationPedagogique+", "+
				"conversionEnContrat : "+conversionEnContrat+", "+
				"commentaireStage : "+commentaireStage+", "+
				"adresseEtudiant : "+adresseEtudiant+", "+
				"codePostalEtudiant : "+codePostalEtudiant+", "+
				"villeEtudiant : "+villeEtudiant+", "+
				"paysEtudiant : "+paysEtudiant+", "+
				"courrielPersoEtudiant : "+courrielPersoEtudiant+", "+
				"telEtudiant : "+telEtudiant+", "+
				"telPortableEtudiant : "+telPortableEtudiant+", "+
				"idIndemnisation : "+idIndemnisation+", "+
				"montantGratification : "+montantGratification+", "+
				"fonctionsEtTaches : "+fonctionsEtTaches+", "+
				"details : "+details+", "+
				"annee : "+annee+", "+
				"idAssurance : "+idAssurance+", "+
				"insee : "+insee+", "+
				"codeCaisse : "+codeCaisse+", "+
				"temConfSujetTeme : "+temConfSujetTeme+", "+
				"nbHeuresHebdo : "+nbHeuresHebdo+", "+
				"quotiteTravail : "+quotiteTravail+", "+
				"modeEncadreSuivi : "+modeEncadreSuivi+", "+
				"idModeVersGratification : "+idModeVersGratification+", "+
				"avantagesNature : "+avantagesNature+", "+
				"idNatureTravail : "+idNatureTravail+", "+
				"idModeValidationStage : "+idModeValidationStage+", "+
				"codeElp : "+codeElp+", "+
				"libelleELP : "+libelleELP+", "+
				"creditECTS : "+creditECTS+", "+
				"travailNuitFerie : "+travailNuitFerie+", "+
				"dureeStage : "+dureeStage+", "+
				"nomEtabRef : "+nomEtabRef+", "+
				"adresseEtabRef : "+adresseEtabRef+", "+
				"nomSignataireComposante : "+nomSignataireComposante+", "+
				"qualiteSignataire : "+qualiteSignataire+", "+
				"libelleCPAM: "+libelleCPAM+", "+
				"dureeExceptionnelle : "+dureeExceptionnelle+", "+
				"idUniteDureeExceptionnelle : "+idUniteDureeExceptionnelle+", "+
				"idUniteDureeGratification : "+idUniteDureeGratification+", "+
				"monnaieGratification : "+monnaieGratification+", "+
				"idUniteGratification : "+idUniteGratification+", "+
				"codeFinalite : "+codeFinalite+", "+
				"libelleFinalite : "+libelleFinalite+", "+
				"codeCursusLMD : "+codeCursusLMD+", "+
				"priseEnChargeFraisMission : "+priseEnChargeFraisMission+", "+
				"codeRGI : "+codeRGI+", "+
				"loginValidation : "+loginValidation+", "+
				"dateValidation : "+dateValidation+", "+
				"loginSignature : "+loginSignature+", "+
				"dateSignature : "+dateSignature+", "+
				"envoiMailEtudiant : "+envoiMailEtudiant+", "+
				"dateEnvoiMailEtudiant : "+dateEnvoiMailEtudiant+", "+
				"envoiMailTuteurPedago : "+envoiMailTuteurPedago+", "+
				"dateEnvoiMailTuteurPedago : "+dateEnvoiMailTuteurPedago+", "+
				"envoiMailTuteurPro : "+envoiMailTuteurPro+", "+
				"dateEnvoiMailTuteurPro : "+dateEnvoiMailTuteurPro+", "+
				", "+super.toString();

	}



	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idConvention == null) ? 0 : idConvention.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConventionDTO other = (ConventionDTO) obj;
		if (idConvention == null) {
			if (other.idConvention != null)
				return false;
		} else if (!idConvention.equals(other.idConvention))
			return false;
		return true;
	}


	/* ***************************************************************
	 * Methodes pour export , boolean
	 ****************************************************************/	

	/**
	 * @return isInterruptionStage
	 */
	public boolean getInterruptionStageExport() {
		return isInterruptionStage();
	}

	/**
	 * @return isValidationConvention
	 */
	public boolean getValidationConventionExport() {
		return isValidationConvention();
	}
	
	/**
	 * 
	 * @return isValidationPedagogique
	 */
	public boolean getValidationPedagogiqueExport() {
		return isValidationPedagogique();
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
	 * @return the etudiant
	 */
	public EtudiantDTO getEtudiant() {
		return etudiant;
	}

	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(EtudiantDTO etudiant) {
		this.etudiant = etudiant;
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
	 * @return the service
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(ServiceDTO service) {
		this.service = service;
	}

	/**
	 * @return the contact
	 */
	public ContactDTO getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	/**
	 * @return the signataire
	 */
	public ContactDTO getSignataire() {
		return signataire;
	}

	/**
	 * @param signataire the signataire to set
	 */
	public void setSignataire(ContactDTO signataire) {
		this.signataire = signataire;
	}

	/**
	 * @return the enseignant
	 */
	public EnseignantDTO getEnseignant() {
		return enseignant;
	}

	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(EnseignantDTO enseignant) {
		this.enseignant = enseignant;
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
	 * @return the typeConvention
	 */
	public TypeConventionDTO getTypeConvention() {
		return typeConvention;
	}


	/**
	 * @param typeConvention the typeConvention to set
	 */
	public void setTypeConvention(TypeConventionDTO typeConvention) {
		this.typeConvention = typeConvention;
	}


	/**
	 * @return the theme
	 */
	public ThemeDTO getTheme() {
		return theme;
	}


	/**
	 * @param theme the theme to set
	 */
	public void setTheme(ThemeDTO theme) {
		this.theme = theme;
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
	 * @return the indemnisation
	 */
	public IndemnisationDTO getIndemnisation() {
		return indemnisation;
	}


	/**
	 * @param indemnisation the indemnisation to set
	 */
	public void setIndemnisation(IndemnisationDTO indemnisation) {
		this.indemnisation = indemnisation;
	}


	/**
	 * @return the uniteGratification
	 */
	public UniteGratificationDTO getUniteGratification() {
		return uniteGratification;
	}


	/**
	 * @param uniteGratification the uniteGratification to set
	 */
	public void setUniteGratification(UniteGratificationDTO uniteGratification) {
		this.uniteGratification = uniteGratification;
	}


	/**
	 * @return the modeVersGratification
	 */
	public ModeVersGratificationDTO getModeVersGratification() {
		return modeVersGratification;
	}


	/**
	 * @param modeVersGratification the modeVersGratification to set
	 */
	public void setModeVersGratification(
			ModeVersGratificationDTO modeVersGratification) {
		this.modeVersGratification = modeVersGratification;
	}


	/**
	 * @return the natureTravail
	 */
	public NatureTravailDTO getNatureTravail() {
		return natureTravail;
	}


	/**
	 * @param natureTravail the natureTravail to set
	 */
	public void setNatureTravail(NatureTravailDTO natureTravail) {
		this.natureTravail = natureTravail;
	}


	/**
	 * @return the modeValidationStage
	 */
	public ModeValidationStageDTO getModeValidationStage() {
		return modeValidationStage;
	}


	/**
	 * @param modeValidationStage the modeValidationStage to set
	 */
	public void setModeValidationStage(ModeValidationStageDTO modeValidationStage) {
		this.modeValidationStage = modeValidationStage;
	}


	/**
	 * @return the origineStage
	 */
	public OrigineStageDTO getOrigineStage() {
		return origineStage;
	}


	/**
	 * @param origineStage the origineStage to set
	 */
	public void setOrigineStage(OrigineStageDTO origineStage) {
		this.origineStage = origineStage;
	}


	/**
	 * @return the assurance
	 */
	public AssuranceDTO getAssurance() {
		return assurance;
	}


	/**
	 * @param assurance the assurance to set
	 */
	public void setAssurance(AssuranceDTO assurance) {
		this.assurance = assurance;
	}


	/**
	 * @return the caisseRegime
	 */
	public CaisseRegimeDTO getCaisseRegime() {
		return caisseRegime;
	}


	/**
	 * @param caisseRegime the caisseRegime to set
	 */
	public void setCaisseRegime(CaisseRegimeDTO caisseRegime) {
		this.caisseRegime = caisseRegime;
	}


	/**
	 * @return the etape
	 */
	public EtapeDTO getEtape() {
		return etape;
	}


	/**
	 * @param etape the etape to set
	 */
	public void setEtape(EtapeDTO etape) {
		this.etape = etape;
	}


	/**
	 * @return the ufr
	 */
	public UfrDTO getUfr() {
		return ufr;
	}


	/**
	 * @param ufr the ufr to set
	 */
	public void setUfr(UfrDTO ufr) {
		this.ufr = ufr;
	}


	/**
	 * @return the langueConvention
	 */
	public LangueConventionDTO getLangueConvention() {
		return langueConvention;
	}


	/**
	 * @param langueConvention the langueConvention to set
	 */
	public void setLangueConvention(LangueConventionDTO langueConvention) {
		this.langueConvention = langueConvention;
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
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}


	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
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
	 * @return the ficheEvaluation
	 */
	public FicheEvaluationDTO getFicheEvaluation() {
		return ficheEvaluation;
	}

	/**
	 * @param ficheEvaluation the ficheEvaluation to set
	 */
	public void setFicheEvaluation(FicheEvaluationDTO ficheEvaluation) {
		this.ficheEvaluation = ficheEvaluation;
	}


	/**
	 * @return the reponseEvaluation
	 */
	public ReponseEvaluationDTO getReponseEvaluation() {
		return reponseEvaluation;
	}


	/**
	 * @param reponseEvaluation the reponseEvaluation to set
	 */
	public void setReponseEvaluation(ReponseEvaluationDTO reponseEvaluation) {
		this.reponseEvaluation = reponseEvaluation;
	}


	/**
	 * @return the questionsSupplementaires
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementaires() {
		return questionsSupplementaires;
	}


	/**
	 * @param questionsSupplementaires the questionsSupplementaires to set
	 */
	public void setQuestionsSupplementaires(List<QuestionSupplementaireDTO> questionsSupplementaires) {
		this.questionsSupplementaires = questionsSupplementaires;
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


	public UniteDureeDTO getUniteDureeGratification() {
		return uniteDureeGratification;
	}


	public void setUniteDureeGratification(UniteDureeDTO uniteDureeGratification) {
		this.uniteDureeGratification = uniteDureeGratification;
	}


	public String getMonnaieGratification() {
		return monnaieGratification;
	}


	public void setMonnaieGratification(String monnaieGratification) {
		this.monnaieGratification = monnaieGratification;
	}

}
