package org.esupportail.pstagedata.remote;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.esupportail.pstagedata.domain.AccordPartenariatDomainService;
import org.esupportail.pstagedata.domain.AdminStructureDomainService;
import org.esupportail.pstagedata.domain.AffectationDomainService;
import org.esupportail.pstagedata.domain.AssuranceDomainService;
import org.esupportail.pstagedata.domain.AvenantDomainService;
import org.esupportail.pstagedata.domain.CaisseRegimeDomainService;
import org.esupportail.pstagedata.domain.CentreGestionDomainService;
import org.esupportail.pstagedata.domain.CentreGestionSuperviseurDomainService;
import org.esupportail.pstagedata.domain.CiviliteDomainService;
import org.esupportail.pstagedata.domain.ConfidentialiteDomainService;
import org.esupportail.pstagedata.domain.ContactDomainService;
import org.esupportail.pstagedata.domain.ContratDomainService;
import org.esupportail.pstagedata.domain.ConventionDomainService;
import org.esupportail.pstagedata.domain.ConventionStatsDomaineManager;
import org.esupportail.pstagedata.domain.ConventionStatsDomaineService;
import org.esupportail.pstagedata.domain.CritereDomainService;
import org.esupportail.pstagedata.domain.CritereGestionDomainService;
import org.esupportail.pstagedata.domain.DroitAdministrationDomainService;
import org.esupportail.pstagedata.domain.DureeDiffusionDomainService;
import org.esupportail.pstagedata.domain.EffectifDomainService;
import org.esupportail.pstagedata.domain.EnseignantDomainService;
import org.esupportail.pstagedata.domain.EtapeDomainService;
import org.esupportail.pstagedata.domain.EtudiantDomainService;
import org.esupportail.pstagedata.domain.FapN1DomainService;
import org.esupportail.pstagedata.domain.FapN2DomainService;
import org.esupportail.pstagedata.domain.FapN3DomainService;
import org.esupportail.pstagedata.domain.FapQualificationDomainService;
import org.esupportail.pstagedata.domain.FapQualificationSimplifieeDomainService;
import org.esupportail.pstagedata.domain.FicheEvaluationDomainService;
import org.esupportail.pstagedata.domain.FichierDomainService;
import org.esupportail.pstagedata.domain.IndemnisationDomainService;
import org.esupportail.pstagedata.domain.LangueConventionDomainService;
import org.esupportail.pstagedata.domain.ModeCandidatureDomainService;
import org.esupportail.pstagedata.domain.ModeValidationStageDomainService;
import org.esupportail.pstagedata.domain.ModeVersGratificationDomainService;
import org.esupportail.pstagedata.domain.NafN1DomainService;
import org.esupportail.pstagedata.domain.NafN5DomainService;
import org.esupportail.pstagedata.domain.NatureTravailDomainService;
import org.esupportail.pstagedata.domain.NiveauCentreDomainService;
import org.esupportail.pstagedata.domain.NiveauFormationDomainService;
import org.esupportail.pstagedata.domain.OffreDiffusionDomainService;
import org.esupportail.pstagedata.domain.OffreDomainService;
import org.esupportail.pstagedata.domain.OffreModeCandidatureDomainService;
import org.esupportail.pstagedata.domain.OffreStatsDomaineManager;
import org.esupportail.pstagedata.domain.OffreStatsDomaineService;
import org.esupportail.pstagedata.domain.OrigineStageDomainService;
import org.esupportail.pstagedata.domain.PaysDomainService;
import org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService;
import org.esupportail.pstagedata.domain.ServiceDomainService;
import org.esupportail.pstagedata.domain.StatutJuridiqueDomainService;
import org.esupportail.pstagedata.domain.StructureDomainService;
import org.esupportail.pstagedata.domain.TempsTravailDomainService;
import org.esupportail.pstagedata.domain.ThemeDomainService;
import org.esupportail.pstagedata.domain.TicketStructureDomainService;
import org.esupportail.pstagedata.domain.TypeConventionDomainService;
import org.esupportail.pstagedata.domain.TypeOffreDomainService;
import org.esupportail.pstagedata.domain.TypeStructureDomainService;
import org.esupportail.pstagedata.domain.UfrDomainService;
import org.esupportail.pstagedata.domain.UniteDureeDomainService;
import org.esupportail.pstagedata.domain.UniteGratificationDomainService;
import org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO;
import org.esupportail.pstagedata.domain.dto.AdminStructureDTO;
import org.esupportail.pstagedata.domain.dto.AffectationDTO;
import org.esupportail.pstagedata.domain.dto.AssuranceDTO;
import org.esupportail.pstagedata.domain.dto.AvenantDTO;
import org.esupportail.pstagedata.domain.dto.CaisseRegimeDTO;
import org.esupportail.pstagedata.domain.dto.CentreGestionDTO;
import org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO;
import org.esupportail.pstagedata.domain.dto.CiviliteDTO;
import org.esupportail.pstagedata.domain.dto.ConfidentialiteDTO;
import org.esupportail.pstagedata.domain.dto.ContactDTO;
import org.esupportail.pstagedata.domain.dto.ContratOffreDTO;
import org.esupportail.pstagedata.domain.dto.ConventionDTO;
import org.esupportail.pstagedata.domain.dto.CritereDTO;
import org.esupportail.pstagedata.domain.dto.CritereGestionDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO;
import org.esupportail.pstagedata.domain.dto.DroitAdministrationDTO;
import org.esupportail.pstagedata.domain.dto.DureeDiffusionDTO;
import org.esupportail.pstagedata.domain.dto.EffectifDTO;
import org.esupportail.pstagedata.domain.dto.EnseignantDTO;
import org.esupportail.pstagedata.domain.dto.EtapeDTO;
import org.esupportail.pstagedata.domain.dto.EtudiantDTO;
import org.esupportail.pstagedata.domain.dto.FapN1DTO;
import org.esupportail.pstagedata.domain.dto.FapN2DTO;
import org.esupportail.pstagedata.domain.dto.FapN3DTO;
import org.esupportail.pstagedata.domain.dto.FapQualificationDTO;
import org.esupportail.pstagedata.domain.dto.FapQualificationSimplifieeDTO;
import org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.FichierDTO;
import org.esupportail.pstagedata.domain.dto.IndemnisationDTO;
import org.esupportail.pstagedata.domain.dto.LangueConventionDTO;
import org.esupportail.pstagedata.domain.dto.ModeCandidatureDTO;
import org.esupportail.pstagedata.domain.dto.ModeValidationStageDTO;
import org.esupportail.pstagedata.domain.dto.ModeVersGratificationDTO;
import org.esupportail.pstagedata.domain.dto.NafN1DTO;
import org.esupportail.pstagedata.domain.dto.NafN5DTO;
import org.esupportail.pstagedata.domain.dto.NatureTravailDTO;
import org.esupportail.pstagedata.domain.dto.NiveauCentreDTO;
import org.esupportail.pstagedata.domain.dto.NiveauFormationDTO;
import org.esupportail.pstagedata.domain.dto.OffreDTO;
import org.esupportail.pstagedata.domain.dto.OffreDiffusionDTO;
import org.esupportail.pstagedata.domain.dto.OrigineStageDTO;
import org.esupportail.pstagedata.domain.dto.PaysDTO;
import org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO;
import org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO;
import org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO;
import org.esupportail.pstagedata.domain.dto.ServiceDTO;
import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
import org.esupportail.pstagedata.domain.dto.StatutJuridiqueDTO;
import org.esupportail.pstagedata.domain.dto.StructureDTO;
import org.esupportail.pstagedata.domain.dto.TempsTravailDTO;
import org.esupportail.pstagedata.domain.dto.ThemeDTO;
import org.esupportail.pstagedata.domain.dto.TicketStructureDTO;
import org.esupportail.pstagedata.domain.dto.TypeConventionDTO;
import org.esupportail.pstagedata.domain.dto.TypeOffreDTO;
import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;
import org.esupportail.pstagedata.domain.dto.UfrDTO;
import org.esupportail.pstagedata.domain.dto.UniteDureeDTO;
import org.esupportail.pstagedata.domain.dto.UniteGratificationDTO;
import org.esupportail.pstagedata.exceptions.AccordAlreadyExistingForContactException;
import org.esupportail.pstagedata.exceptions.AccordAlreadyExistingForStructureException;
import org.esupportail.pstagedata.exceptions.AccountAlreadyExistingForCoupleMailStructureException;
import org.esupportail.pstagedata.exceptions.AdminStructureAccountException;
import org.esupportail.pstagedata.exceptions.AdminStructureLoginEppnAlreadyUsedException;
import org.esupportail.pstagedata.exceptions.AffectationAlreadyExistingForCodeException;
import org.esupportail.pstagedata.exceptions.CentreEntrepriseDejaExistantException;
import org.esupportail.pstagedata.exceptions.CentreEtablissementDejaExistantException;
import org.esupportail.pstagedata.exceptions.CentreReferenceException;
import org.esupportail.pstagedata.exceptions.ContactDeleteException;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.EtapeAlreadyExistingForCodeException;
import org.esupportail.pstagedata.exceptions.EtudiantAlreadyExistingForNumEtuCodeUnivException;
import org.esupportail.pstagedata.exceptions.MailAlreadyUsedForStructureException;
import org.esupportail.pstagedata.exceptions.PersonalAlreadyExistingForCentreException;
import org.esupportail.pstagedata.exceptions.RemoteException;
import org.esupportail.pstagedata.exceptions.ServiceDeleteException;
import org.esupportail.pstagedata.exceptions.StatsDomaineException;
import org.esupportail.pstagedata.exceptions.StructureDeleteException;
import org.esupportail.pstagedata.exceptions.StructureNumSiretException;
import org.esupportail.pstagedata.exceptions.UfrAlreadyExistingForCodeException;
import org.esupportail.pstagedata.exceptions.UnvalidNumSiretException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.utils.Utils;
import org.springframework.util.StringUtils;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
@WebService
public class RemoteServicesImpl implements RemoteServices{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* ****************************************************************************
	 * DOMAINS SERVICES
	 *****************************************************************************/
	/**
	 * AccordPartenariatDomainService
	 */
	private AccordPartenariatDomainService accordPartenariatDomainService;
	/**
	 * AdminStructureDomainService
	 */
	private AdminStructureDomainService adminStructureDomainService;
	/**
	 * AffectationDomainService
	 */
	private AffectationDomainService affectationDomainService;
	/**
	 * AvenantDomainService
	 */
	private AvenantDomainService avenantDomainService;
	/**
	 * CentreGestionDomainService
	 */
	private CentreGestionDomainService centreGestionDomainService;
	/**
	 * CentreGestionSuperviseurDomainService
	 */
	private CentreGestionSuperviseurDomainService centreGestionSuperviseurDomainService;
	/**
	 * CiviliteDomainService
	 */
	private CiviliteDomainService civiliteDomainService;
	/**
	 * ConfidentialiteDomainService
	 */
	private ConfidentialiteDomainService confidentialiteDomainService;
	/**
	 * ContactDomainService
	 */
	private ContactDomainService contactDomainService;
	/**
	 * ContratDomainService
	 */
	private ContratDomainService contratDomainService;
	/**
	 * CritereGestionDomainService
	 */
	private CritereGestionDomainService critereGestionDomainService;
	/**
	 * DroitAdministrationDomainService
	 */
	private DroitAdministrationDomainService droitAdministrationDomainService;
	/**
	 * DureeDiffusionDomainService
	 */
	private DureeDiffusionDomainService dureeDiffusionDomainService;
	/**
	 * EffectifDomainService
	 */
	private EffectifDomainService effectifDomainService;
	/**
	 * FapN1DomainService
	 */
	private FapN1DomainService fapN1DomainService;
	/**
	 * FapN2DomainService
	 */
	private FapN2DomainService fapN2DomainService;
	/**
	 * FapN3DomainService
	 */
	private FapN3DomainService fapN3DomainService;
	/**
	 * FapQualificationSimplifieeDomainService
	 */
	private FapQualificationSimplifieeDomainService fapQualificationSimplifieeDomainService;
	/**
	 * FapQualificationDomainService
	 */
	private FapQualificationDomainService fapQualificationDomainService;
	/**
	 * ModeCandidatureDomainService
	 */
	private ModeCandidatureDomainService modeCandidatureDomainService;
	/**
	 * NafN1DomainService
	 */
	private NafN1DomainService nafN1DomainService;
	/**
	 * NafN5DomainService
	 */
	private NafN5DomainService nafN5DomainService;
	/**
	 * NiveauCentreDomainService
	 */
	private NiveauCentreDomainService niveauCentreDomainService;
	/**
	 * NiveauFormationDomainService
	 */
	private NiveauFormationDomainService niveauFormationDomainService;
	/**
	 * OffreDomainService
	 */
	private OffreDomainService offreDomainService;
	/**
	 * FichierDomainService
	 */
	private FichierDomainService fichierDomainService;
	/**
	 * OffreModeCandidatureDomainService
	 */
	private OffreModeCandidatureDomainService offreModeCandidatureDomainService;
	/**
	 * OffreDiffusionDomainService
	 */
	private OffreDiffusionDomainService offreDiffusionDomainService;
	/**
	 * OffreStatsDomaineManager
	 */
	private OffreStatsDomaineManager offreStatsDomaineManager;

	/**
	 * Gestion des statistiques sur conventions
	 */
	private ConventionStatsDomaineManager  conventionStatsDomaineManager;

	private CritereDomainService critereDomainService;
	/**
	 * PaysDomainService
	 */
	private PaysDomainService paysDomainService;
	/**
	 * PersonnelCentreGestionDomainService
	 */
	private PersonnelCentreGestionDomainService personnelCentreGestionDomainService;
	/**
	 * ServiceDomainService
	 */
	private ServiceDomainService serviceDomainService;
	/**
	 * StatutJuridiqueDomainService
	 */
	private StatutJuridiqueDomainService statutJuridiqueDomainService;
	/**
	 * StructureDomainService
	 */
	private StructureDomainService structureDomainService;
	/**
	 * TempsTravailDomainService
	 */
	private TempsTravailDomainService tempsTravailDomainService;
	/**
	 * TypeOffreDomainService
	 */
	private TypeOffreDomainService typeOffreDomainService;
	/**
	 * TypeStructureDomainService
	 */
	private TypeStructureDomainService typeStructureDomainService;
	/**
	 * UniteDureeDomainService
	 */
	private UniteDureeDomainService uniteDureeDomainService;

	/**
	 * AssuranceDomainService
	 */
	private AssuranceDomainService assuranceDomainService;

	/**
	 * CaisseRegimeDomainService
	 */
	private CaisseRegimeDomainService caisseRegimeDomainService;

	/**
	 * IndemnisationDomainService
	 */
	private IndemnisationDomainService indemnisationDomainService;

	/**
	 * LangueConventionDomainService
	 */
	private LangueConventionDomainService langueConventionDomainService;

	/**
	 * ModeValidationStageDomainService
	 */
	private ModeValidationStageDomainService modeValidationStageDomainService;

	/**
	 * ModeVersGratificationDomainService
	 */
	private ModeVersGratificationDomainService modeVersGratificationDomainService;

	/**
	 * NatureTravailDomainService
	 */
	private NatureTravailDomainService natureTravailDomainService;

	/**
	 * ThemeDomainService
	 */
	private ThemeDomainService themeDomainService;

	/**
	 * TypeConventionDomainService
	 */
	private TypeConventionDomainService typeConventionDomainService;

	/**
	 * UniteGratificationDomainService
	 */
	private UniteGratificationDomainService uniteGratificationDomainService;

	/**
	 * UfrDomainService
	 */
	private UfrDomainService ufrDomainService;

	/**
	 * EtapeDomainService
	 */
	private EtapeDomainService etapeDomainService;

	/**
	 * ConventionDomainService
	 */
	private ConventionDomainService conventionDomainService;	

	/**
	 * EtudiantDomainService
	 */
	private EtudiantDomainService etudiantDomainService;

	/**
	 * EnseignantDomainService
	 */
	private EnseignantDomainService enseignantDomainService;

	/**
	 * OrigineStageDomainService
	 */
	private OrigineStageDomainService origineStageDomainService;

	/**
	 * TicketStructureDomainService
	 */
	private TicketStructureDomainService ticketStructureDomainService;
	/**
	 * FicheEvaluationDomainService
	 */
	private FicheEvaluationDomainService ficheEvaluationDomainService;

	/* ****************************************************************************
	 * Fiche Evaluation
	 *****************************************************************************/	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getFicheEvaluationFromIdCentre(java.lang.int)
	 */
	public FicheEvaluationDTO getFicheEvaluationFromIdCentre(int idCentreGestion) {
		return this.ficheEvaluationDomainService.getFicheEvaluationFromIdCentre(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addFicheEvaluation(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public int addFicheEvaluation(FicheEvaluationDTO fe) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		if (fe != null){
			tmp = this.ficheEvaluationDomainService.addFicheEvaluation(fe);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEtudiant(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEtudiant(FicheEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateFicheEvaluationEtudiant(fe);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEntreprise(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEntreprise(FicheEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateFicheEvaluationEntreprise(fe);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEnseignant(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEnseignant(FicheEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateFicheEvaluationEnseignant(fe);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteFicheEvaluation(int)
	 */
	public boolean deleteFicheEvaluation(int idFicheEvaluation) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		if (idFicheEvaluation > 0){
			b = this.ficheEvaluationDomainService.deleteFicheEvaluation(idFicheEvaluation);
		}
		return b;
	}

	/* ****************************************************************************
	 * Reponse Evaluation
	 *****************************************************************************/	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getReponseEvaluation(java.lang.int,java.lang.int)
	 */
	public ReponseEvaluationDTO getReponseEvaluation(int idFicheEvaluation, int idConvention) {
		return this.ficheEvaluationDomainService.getReponseEvaluation(idFicheEvaluation,idConvention);
	}
	/**
	 * @param idFicheEvaluation
	 * @return List<ReponseEvaluationDTO>
	 */
	public List<ReponseEvaluationDTO> getReponsesEvaluation(int idFicheEvaluation) {
		return this.ficheEvaluationDomainService.getReponsesEvaluation(idFicheEvaluation);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addReponseEvaluation(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public int addReponseEvaluation(ReponseEvaluationDTO fe) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		if (fe != null){
			tmp = this.ficheEvaluationDomainService.addReponseEvaluation(fe);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEtudiant(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEtudiant(ReponseEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateReponseEvaluationEtudiant(fe);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEntreprise(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEntreprise(ReponseEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateReponseEvaluationEntreprise(fe);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEnseignant(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEnseignant(ReponseEvaluationDTO fe) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if (fe != null){
			b = this.ficheEvaluationDomainService.updateReponseEvaluationEnseignant(fe);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteReponseEvaluation(int, int)
	 */
	public boolean deleteReponseEvaluation(int idFicheEvaluation, int idConvention) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		if (idFicheEvaluation > 0 && idConvention > 0){
			b = this.ficheEvaluationDomainService.deleteReponseEvaluation(idFicheEvaluation,idConvention);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEstImprimee()
	 */
	public boolean setImpressionEtudiant(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setImpressionEtudiant(idFicheEvaluation, idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEstImprimee()
	 */
	public boolean setImpressionEnseignant(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setImpressionEnseignant(idFicheEvaluation, idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEstImprimee()
	 */
	public boolean setImpressionEntreprise(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setImpressionEntreprise(idFicheEvaluation, idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEnvoiMailEtudiant()
	 */
	public boolean setEnvoiMailEtudiant(int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setEnvoiMailEtudiant(idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEnvoiMailEnseignant()
	 */
	public boolean setEnvoiMailEnseignant(int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setEnvoiMailEnseignant(idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setEnvoiMailEntreprise()
	 */
	public boolean setEnvoiMailEntreprise(int idConvention) throws DataUpdateException, WebServiceDataBaseException{
		return this.ficheEvaluationDomainService.setEnvoiMailEntreprise(idConvention);
	}

	/* ****************************************************************************
	 * Question Supplementaire
	 *****************************************************************************/	
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getQuestionsSupplementaires(int)
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementaires(int idFicheEvaluation) {
		return this.ficheEvaluationDomainService.getQuestionsSupplementaires(idFicheEvaluation);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getQuestionsSupplementairesFromIdPlacement(int, int)
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement) {
		return this.ficheEvaluationDomainService.getQuestionsSupplementairesFromIdPlacement(idFicheEvaluation, idPlacement);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addQuestionSupplementaire(org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO)
	 */
	public int addQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataAddException, WebServiceDataBaseException {
		int tmp = 0;
		if (qs != null){
			tmp = this.ficheEvaluationDomainService.addQuestionSupplementaire(qs);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateQuestionSupplementaire(org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO)
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if (qs != null){
			b = this.ficheEvaluationDomainService.updateQuestionSupplementaire(qs);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteQuestionSupplementaire(int)
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		if (idQuestionSupplementaire > 0){
			b = this.ficheEvaluationDomainService.deleteQuestionSupplementaire(idQuestionSupplementaire);
		}
		return b;
	}

	/* ****************************************************************************
	 * Reponse Supplementaire
	 *****************************************************************************/	
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getReponseSupplementaire(int, int)
	 */
	public ReponseSupplementaireDTO getReponseSupplementaire(int idQuestionSupplementaire, int idConvention) {
		return this.ficheEvaluationDomainService.getReponseSupplementaire(idQuestionSupplementaire,idConvention);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addReponseSupplementaire(org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO)
	 */
	public int addReponseSupplementaire(ReponseSupplementaireDTO rs) throws DataAddException, WebServiceDataBaseException {
		int tmp = 0;
		if (rs != null){
			tmp = this.ficheEvaluationDomainService.addReponseSupplementaire(rs);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addReponsesSupplementaires(org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO)
	 */
	public int addReponsesSupplementaires(List<ReponseSupplementaireDTO> lr) throws DataAddException, WebServiceDataBaseException {
		int tmp = 0;
		for (ReponseSupplementaireDTO reponse : lr){
			tmp = this.ficheEvaluationDomainService.addReponseSupplementaire(reponse);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateReponseSupplementaire(org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO)
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaireDTO rs) throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if (rs != null){
			b = this.ficheEvaluationDomainService.updateReponseSupplementaire(rs);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateReponsesSupplementaires(java.util.List)
	 */
	public boolean updateReponsesSupplementaires(List<ReponseSupplementaireDTO> lr) throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if (lr != null && !lr.isEmpty()){
			for(ReponseSupplementaireDTO reponse : lr){
				b = this.ficheEvaluationDomainService.updateReponseSupplementaire(reponse);
			}
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteReponseSupplementaire(int,int)
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire, int idConvention) throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		if (idQuestionSupplementaire > 0 && idConvention > 0){
			b = this.ficheEvaluationDomainService.deleteReponseSupplementaire(idQuestionSupplementaire,idConvention);
		}
		return b;
	}


	/* ****************************************************************************
	 * ACCORD PARTENARIAT
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAccordsNonValides()
	 */	
	public List<AccordPartenariatDTO> getAccordsNonValides(){
		return this.accordPartenariatDomainService.getAccordsNonValides();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAccordFromId(int)
	 */
	public AccordPartenariatDTO getAccordFromId(int id){
		AccordPartenariatDTO tmp=null;
		if(id>0){
			tmp=this.accordPartenariatDomainService.getAccordFromId(id);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAccordFromIdStructure(int)
	 */
	public AccordPartenariatDTO getAccordFromIdStructure(int idStructure){
		AccordPartenariatDTO tmp=null;
		if(idStructure>0){
			tmp=this.accordPartenariatDomainService.getAccordFromIdStructure(idStructure);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAccordFromIdContact(int)
	 */
	public AccordPartenariatDTO getAccordFromIdContact(int idContact){
		AccordPartenariatDTO tmp=null;
		if(idContact>0){
			tmp=this.accordPartenariatDomainService.getAccordFromIdContact(idContact);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#countAccordAValider()
	 */
	public int countAccordAValider(){
		return this.accordPartenariatDomainService.countAccordAValider();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addAccord(org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO)
	 */
	public int addAccord(AccordPartenariatDTO accord) throws DataAddException, WebServiceDataBaseException, AccordAlreadyExistingForContactException, AccordAlreadyExistingForStructureException{
		int b=0;
		if(accord!=null){
			if(accord.getIdStructure()>0 && accord.getIdContact()>0){
				AccordPartenariatDTO tmp = null;
				tmp=this.accordPartenariatDomainService.getAccordFromIdStructure(accord.getIdStructure());
				if(tmp!=null){
					throw new AccordAlreadyExistingForStructureException("Accord déjà existant pour cette structure : "+accord.getIdStructure());
				}
				tmp=this.accordPartenariatDomainService.getAccordFromIdContact(accord.getIdContact());
				if(tmp!=null){
					throw new AccordAlreadyExistingForContactException("Accord déjà existant pour ce contact : "+accord.getIdContact());
				}
				b = this.accordPartenariatDomainService.addAccord(accord);
			}
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateAccord(org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO)
	 */
	public boolean updateAccord(AccordPartenariatDTO accord) throws DataUpdateException, WebServiceDataBaseException, AccordAlreadyExistingForContactException, AccordAlreadyExistingForStructureException{
		boolean b = false;
		if(accord!=null){
			if(accord.getIdStructure()>0 && accord.getIdContact()>0){
				AccordPartenariatDTO tmp = null;
				tmp=this.accordPartenariatDomainService.getAccordFromIdStructure(accord.getIdStructure());
				if(tmp!=null && !tmp.equals(accord)){
					throw new AccordAlreadyExistingForStructureException("Accord déjà existant pour cette structure : "+accord.getIdStructure());
				}
				tmp=this.accordPartenariatDomainService.getAccordFromIdContact(accord.getIdContact());
				if(tmp!=null && !tmp.equals(accord)){
					throw new AccordAlreadyExistingForContactException("Accord déjà existant pour ce contact : "+accord.getIdContact());
				}
				b = this.accordPartenariatDomainService.updateAccord(accord);
			}
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteAccord(int)
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		if(idAccord>0){
			AccordPartenariatDTO a = this.accordPartenariatDomainService.getAccordFromId(idAccord);
			List<ServiceDTO> ls = this.serviceDomainService.getServicesFromIdStructure(a.getIdStructure());
			if(ls!=null){
				for(ServiceDTO s : ls){
					this.contactDomainService.deleteComptesContactFromIdService(s.getIdService());
				}
			}
			b = this.accordPartenariatDomainService.deleteAccord(idAccord);
		}
		return b;
	}


	/* ****************************************************************************
	 * ADMIN STRUCTURE
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAdminsStructure()
	 */
	public List<AdminStructureDTO> getAdminsStructure(){
		return this.adminStructureDomainService.getAdminsStructure();
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAdminStructureFromLogin(java.lang.String)
	 */
	public AdminStructureDTO getAdminStructureFromLogin(String login){
		AdminStructureDTO tmp=null;
		if(StringUtils.hasText(login)){
			tmp=this.adminStructureDomainService.getAdminStructureFromLogin(login);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAdminStructureFromEppn(java.lang.String)
	 */
	public AdminStructureDTO getAdminStructureFromEppn(String eppn){
		AdminStructureDTO tmp=null;
		if(StringUtils.hasText(eppn)){
			tmp=this.adminStructureDomainService.getAdminStructureFromEppn(eppn);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addAdminStructure(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public int addAdminStructure(AdminStructureDTO admin) throws DataAddException, WebServiceDataBaseException, AdminStructureLoginEppnAlreadyUsedException, AdminStructureAccountException{
		int b=0;
		if(admin!=null){
			if(StringUtils.hasText(admin.getLogin())
					&& StringUtils.hasText(admin.getEppn())){
				throw new AdminStructureAccountException("Un administrateur a soit un Login soit un EPPN");
			}
			if(StringUtils.hasText(admin.getLogin())){
				AdminStructureDTO tmp=null;
				tmp=this.adminStructureDomainService.getAdminStructureFromLogin(admin.getLogin());
				if(tmp!=null){
					AdminStructureLoginEppnAlreadyUsedException a = new AdminStructureLoginEppnAlreadyUsedException("Login déjà utilisé : "+admin.getLogin());
					a.setLogin(true);
					a.setEppn(false);
					throw a;
				}
			}
			if(StringUtils.hasText(admin.getEppn())){
				AdminStructureDTO tmp=null;
				tmp=this.adminStructureDomainService.getAdminStructureFromEppn(admin.getEppn());
				if(tmp!=null){
					AdminStructureLoginEppnAlreadyUsedException a = new AdminStructureLoginEppnAlreadyUsedException("EPPN déjà utilisé : "+admin.getEppn());
					a.setLogin(false);
					a.setEppn(true);
					throw a;
				}
			}
			b = this.adminStructureDomainService.addAdminStructure(admin);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateAdminStructure(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public boolean updateAdminStructure(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException, AdminStructureLoginEppnAlreadyUsedException, AdminStructureAccountException{
		boolean b = false;
		if(admin!=null && admin.getId()>0){
			if(StringUtils.hasText(admin.getLogin())
					&& StringUtils.hasText(admin.getEppn())){
				throw new AdminStructureAccountException("Un administrateur a soit un Login soit un EPPN");
			}
			if(StringUtils.hasText(admin.getLogin())){
				AdminStructureDTO tmp=null;
				tmp=this.adminStructureDomainService.getAdminStructureFromLogin(admin.getLogin());
				if(tmp!=null && !tmp.equals(admin)){
					AdminStructureLoginEppnAlreadyUsedException a = new AdminStructureLoginEppnAlreadyUsedException("Login déjà utilisé : "+admin.getLogin());
					a.setLogin(true);
					a.setEppn(false);
					throw a;
				}
			}
			if(StringUtils.hasText(admin.getEppn())){
				AdminStructureDTO tmp=null;
				tmp=this.adminStructureDomainService.getAdminStructureFromEppn(admin.getEppn());
				if(tmp!=null && !tmp.equals(admin)){
					AdminStructureLoginEppnAlreadyUsedException a = new AdminStructureLoginEppnAlreadyUsedException("EPPN déjà utilisé : "+admin.getEppn());
					a.setLogin(false);
					a.setEppn(true);
					throw a;
				}
			}
			b = this.adminStructureDomainService.updateAdminStructure(admin);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateAdminStructureDerniereConnexion(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(admin!=null && admin.getId()>0){
			b = this.adminStructureDomainService.updateAdminStructureDerniereConnexion(admin);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteAdminStructure(int)
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteException, WebServiceDataBaseException{
		boolean b=false;
		if(idAdminStructure>0){
			b = this.adminStructureDomainService.deleteAdminStructure(idAdminStructure);
		}
		return b;
	}

	/* ****************************************************************************
	 * AFFECTATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAffectation(java.lang.String)
	 */
	public List<AffectationDTO> getAffectationFromCodUniv(String codeUniversite) {
		return this.affectationDomainService.getAffectation(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAffectationFromCodeAffectation(java.lang.String, java.lang.String)
	 */
	public AffectationDTO getAffectationFromCodeAffectationCodUniv(String codeAffectation, String codeUniversite) {
		return this.affectationDomainService.getAffectationFromCodeAffectation(codeAffectation, codeUniversite);
	}	
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAffectation()
	 */
	public List<AffectationDTO> getAffectation(){
		return getAffectationFromCodUniv(" ");
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAffectationFromCodeAffectation(java.lang.String)
	 */
	public AffectationDTO getAffectationFromCodeAffectation(String codeAffectation){
		return getAffectationFromCodeAffectationCodUniv(codeAffectation, " ");
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreAffectation()
	 */
	public int getNombreAffectation() {
		return this.affectationDomainService.getNombreAffectation();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addAffectation(org.esupportail.pstagedata.domain.dto.AffectationDTO)
	 */
	public int addAffectation(AffectationDTO a) throws DataAddException,WebServiceDataBaseException,AffectationAlreadyExistingForCodeException{
		int b=0;
		if(a!=null){

			try {
				b = this.affectationDomainService.addAffectation(a);
			} catch (DataAddException e) {
				int error = ((SQLException)e.getCause()).getErrorCode();
				// cas  e.getMessage().contains("Duplicata du champ"), code erreur 1062
				if (error == 1062) {
					throw new AffectationAlreadyExistingForCodeException("Affectation deja existante pour code : "+a.getCode() );
				}
				throw e;
			}
		}
		return b;

	}


	/* ****************************************************************************
	 * AVENANT
	 *****************************************************************************/
	/**
	 * @return List<AvenantDTO>
	 */
	public List<AvenantDTO> getAvenant(int idConvention){
		return this.avenantDomainService.getAvenant(idConvention);
	}
	/**
	 * @return int
	 */
	public int getNombreAvenant(int idConvention){
		return this.avenantDomainService.getNombreAvenant(idConvention);
	}
	/**
	 * @param cg
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addAvenant(AvenantDTO a) throws DataAddException, WebServiceDataBaseException{
		int b=0;
		if(a!=null){
			b = this.avenantDomainService.addAvenant(a);
		}
		return b;
	}
	/**
	 * @param cg
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAvenant(AvenantDTO a) throws DataUpdateException,WebServiceDataBaseException{
		boolean b=false;
		if(a!=null){
			b = this.avenantDomainService.updateAvenant(a);
		}
		return b;
	}
	/**
	 * @param idAvenant
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteAvenant(int idAvenant) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		b = this.avenantDomainService.deleteAvenant(idAvenant);
		return b;
	}

	/* ****************************************************************************
	 * ASSURANCE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAssurances()
	 */
	public List<AssuranceDTO> getAssurances() {
		return this.assuranceDomainService.getAssurances();
	}

	/* ****************************************************************************
	 * CAISSE REGIME
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCaisseRegimes()
	 */

	public List<CaisseRegimeDTO> getCaisseRegimes() {
		return this.caisseRegimeDomainService.getCaisseRegimes();
	}

	/* ****************************************************************************
	 * CENTRE GESTION 
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreGestionList(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreGestionList(String codeUniversite) {
		List<CentreGestionDTO> tmp = null;
		if(StringUtils.hasText(codeUniversite)){
			tmp=this.centreGestionDomainService.getCentreGestionList(codeUniversite);
		}	
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreGestion(int)
	 */
	public CentreGestionDTO getCentreGestion(int idCentreGestion){
		CentreGestionDTO tmp = null;
		if(idCentreGestion>0){
			tmp=this.centreGestionDomainService.getCentreGestion(idCentreGestion);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreGestionFromNomCentre(String,String)
	 */
	public CentreGestionDTO getCentreGestionFromNomCentre(String nomCentre, String codeUniversite) {
		CentreGestionDTO tmp = null;
		if(StringUtils.hasText(nomCentre) && StringUtils.hasText(codeUniversite)){
			tmp=this.centreGestionDomainService.getCentreGestionFromNomCentre(nomCentre,codeUniversite);
		}	
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreCentreGestion(String)
	 */
	public int getNombreCentreGestion(String codeUniversite){
		return this.centreGestionDomainService.getNombreCentreGestion(codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreDroitEcriture(java.lang.String, java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreDroitEcritureFromCodUniv(String uidPersonnel, String codeUniversite){
		return this.centreGestionDomainService.getCentreDroitEcriture(uidPersonnel, codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreFromUid(java.lang.String, java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreFromUidFromCodUniv(String uidPersonnel, String codeUniversite){
		return this.centreGestionDomainService.getCentreFromUid(uidPersonnel, codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreEntreprise()
	 */
	public CentreGestionDTO getCentreEntreprise() {
		return this.centreGestionDomainService.getCentreEntreprise();
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreEtablissement(java.lang.String)
	 */
	public CentreGestionDTO getCentreEtablissement(String codeUniversite) {
		return this.centreGestionDomainService.getCentreEtablissement(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentresEtablissement(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentresEtablissementFromCodUniv(String codeUniversite){
		return this.centreGestionDomainService.getCentresEtablissement(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreFromCritere(java.lang.String, java.lang.String)
	 */
	public CentreGestionDTO getCentreFromCritere(String codeCritere,
			String codeUniversite) {

		return this.centreGestionDomainService.getCentreFromCritere(codeCritere, codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreDroitEcriture(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreDroitEcriture(String uidPersonnel){
		return getCentreDroitEcritureFromCodUniv(uidPersonnel, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreFromUid(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreFromUid(String uidPersonnel){
		return getCentreFromUidFromCodUniv(uidPersonnel, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentresEtablissement()
	 */
	public List<CentreGestionDTO> getCentresEtablissement(){
		return getCentresEtablissementFromCodUniv(null);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addCentreGestion(org.esupportail.pstagedata.domain.dto.CentreGestionDTO)
	 */
	public int addCentreGestion(CentreGestionDTO cg) throws DataAddException,WebServiceDataBaseException,CentreEtablissementDejaExistantException,CentreEntrepriseDejaExistantException{
		int b=0;
		if(cg!=null){
			CentreGestionDTO tmp = getCentreEtablissement(cg.getCodeUniversite());
			if( tmp != null
					&& cg.getIdNiveauCentre() == tmp.getIdNiveauCentre()){
				throw new CentreEtablissementDejaExistantException("Centre Etablissement déjà existant : " + tmp);
			}
			b = this.centreGestionDomainService.addCentreGestion(cg);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateCentreGestion(org.esupportail.pstagedata.domain.dto.CentreGestionDTO)
	 */
	public boolean updateCentreGestion(CentreGestionDTO cg) throws DataUpdateException,WebServiceDataBaseException,CentreEtablissementDejaExistantException,CentreEntrepriseDejaExistantException{
		boolean b=false;
		if(cg!=null){
			CentreGestionDTO tmp = getCentreEtablissement(cg.getCodeUniversite());
			if(tmp != null
					&& cg.getIdNiveauCentre() == tmp.getIdNiveauCentre()
					&& cg.getIdCentreGestion() != tmp.getIdCentreGestion()){
				throw new CentreEtablissementDejaExistantException("Centre Etablissement déjà existant : " + tmp);
			}
			b = this.centreGestionDomainService.updateCentreGestion(cg);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateIdFichier(int, int)
	 */
	public boolean updateIdFichier(int idCentreGestion, int idFichier) throws DataUpdateException,WebServiceDataBaseException{
		boolean b=false;
		if(idCentreGestion > 0 && idFichier > 0){
			b = this.centreGestionDomainService.updateIdFichier(idCentreGestion, idFichier);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#setIdFichierNull(int)
	 */
	public boolean setIdFichierNull(int idCentreGestion) throws DataUpdateException,WebServiceDataBaseException{
		boolean b=false;
		if(idCentreGestion > 0 ){
			b = this.centreGestionDomainService.setIdFichierNull(idCentreGestion);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteCentreGestion(int)
	 */
	public boolean deleteCentreGestion(int idCentreGestion) throws DataDeleteException,WebServiceDataBaseException,CentreReferenceException{
		boolean b = false;

		List<String> ref = this.centreGestionDomainService.centreGestionReference(idCentreGestion);

		if (ref.isEmpty()){
			b = this.centreGestionDomainService.deleteCentreGestion(idCentreGestion);
		} else {
			String raison = "";

			if (ref.size() == 1){
				raison = ref.get(0)+".";
			} else {
				for(int i=0; i<ref.size();i++){
					if (i==0){
						raison += ref.get(i);
					}else if(i == ref.size()-1){
						raison += (" et "+ref.get(i));
					} else {
						raison += ", "+ref.get(i);
					}
				}
			}

			throw new CentreReferenceException(raison);
		}
		return b;
	}

	/* ****************************************************************************
	 * CENTRE GESTION SUPERVISEUR
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCentreGestionSuperviseur()
	 */
	public List<CentreGestionSuperviseurDTO> getCentreGestionSuperviseur() {
		return this.centreGestionSuperviseurDomainService.getCentreGestionSuperviseur();
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addCentreGestionSuperviseur(org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO)
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseurDTO cg) throws DataAddException,WebServiceDataBaseException{
		int b=0;
		if(cg!=null){
			b = this.centreGestionSuperviseurDomainService.addCentreGestionSuperviseur(cg);
		}
		return b;
	}
	/* ****************************************************************************
	 * CIVILITE
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCivilites()
	 */
	public List<CiviliteDTO> getCivilites(){
		return this.civiliteDomainService.getCivilites();
	}

	/* ****************************************************************************
	 * CONFIDENTIALITE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConfidentialite()
	 */
	public List<ConfidentialiteDTO> getConfidentialite(){
		return this.confidentialiteDomainService.getConfidentialite();
	}

	/* ****************************************************************************
	 * CONTACT
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getContactFromId(int)
	 */
	public ContactDTO getContactFromId(int id){
		ContactDTO tmp=null;
		if(id>0){
			tmp=this.contactDomainService.getContactFromId(id);
		}	
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getContactsFromIdService(int, java.util.List, java.lang.String)
	 */
	public List<ContactDTO> getContactsFromIdService(int idService, List<Integer> idsCentresGestion, String codeUniversite){
		List<ContactDTO> l = null;
		if(idService>0 && idsCentresGestion!=null && !idsCentresGestion.isEmpty() && StringUtils.hasText(codeUniversite)){
			l = this.contactDomainService.getContactsFromIdService(idService, idsCentresGestion, codeUniversite);
		}
		return l;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getContactFromLogin(java.lang.String)
	 */
	public ContactDTO getContactFromLogin(String login){
		ContactDTO tmp=null;
		if(StringUtils.hasText(login)){
			tmp=this.contactDomainService.getContactFromLogin(login);
		}
		return tmp;
	}	

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getContactEntrepriseAvecCompteFromMailAndIdStructure(java.lang.String, int)
	 */
	public ContactDTO getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure) {
		ContactDTO tmp=null;
		if(StringUtils.hasText(mail) && idStructure>0){
			tmp=this.contactDomainService.getContactEntrepriseAvecCompteFromMailAndIdStructure(mail, idStructure);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreContactByCentreGestion(int)
	 */
	public int getNombreContactByCentreGestion(int idCentreGestion){
		return this.contactDomainService.getNombreContactByCentreGestion(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public int addContact(ContactDTO c) throws DataAddException, WebServiceDataBaseException, MailAlreadyUsedForStructureException{
		int b=0;
		if(c!=null){
			StructureDTO s = this.structureDomainService.getStructureFromIdService(c.getIdService());
			CentreGestionDTO cgEntr = getCentreEntreprise();
			if(cgEntr!=null && c.getIdCentreGestion()==cgEntr.getIdCentreGestion()
					&& StringUtils.hasText(c.getMail())){
				ContactDTO tmpC = this.contactDomainService.getContactEntrepriseFromMailAndIdStructure(c.getMail(), s.getIdStructure());
				if(tmpC!=null){
					throw new MailAlreadyUsedForStructureException("Ce mail est deja utilise pour un autre contact.");
				}
			}
			b = this.contactDomainService.addContact(c);
		}
		return b;
	}	

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public boolean updateContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException, MailAlreadyUsedForStructureException{
		boolean b = false;
		if(c!=null){
			StructureDTO s = this.structureDomainService.getStructureFromIdService(c.getIdService());
			CentreGestionDTO cgEntr = getCentreEntreprise();
			if(cgEntr!=null && c.getIdCentreGestion()==cgEntr.getIdCentreGestion()
					&& StringUtils.hasText(c.getMail())){
				ContactDTO tmpC = this.contactDomainService.getContactEntrepriseFromMailAndIdStructure(c.getMail(), s.getIdStructure());
				if(tmpC!=null && !c.equals(tmpC)){
					throw new MailAlreadyUsedForStructureException("Ce mail est deja utilise pour un autre contact.");
				}
			}
			b = this.contactDomainService.updateContact(c);
		}
		return b;
	}		

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateCompteContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public boolean updateCompteContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException, AccountAlreadyExistingForCoupleMailStructureException{
		boolean b = false;
		if(c!=null){
			if(StringUtils.hasText(c.getLogin()) && StringUtils.hasText(c.getMdp())){
				StructureDTO s = this.structureDomainService.getStructureFromIdService(c.getIdService());
				ContactDTO tmpC = this.contactDomainService.getContactEntrepriseAvecCompteFromMailAndIdStructure(c.getMail(), s.getIdStructure());
				if(tmpC!=null && !c.equals(tmpC)){
					throw new AccountAlreadyExistingForCoupleMailStructureException("Ce mail est déjà utilisé pour un autre contact.");
				}
			}
			b = this.contactDomainService.updateCompteContact(c);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateContactInfosAJour(int, java.lang.String)
	 */
	public boolean updateContactInfosAJour(int idContact, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idContact>0 && StringUtils.hasText(loginInfosAJour)){
			b = this.contactDomainService.updateContactInfosAJour(idContact, loginInfosAJour);
		}
		return b;
	}	

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateContactDerniereConnexion(int, java.util.Date)
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idContact>0){
			b = this.contactDomainService.updateContactDerniereConnexion(idContact, avantDerniereConnexion);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteContact(int)
	 */
	public boolean deleteContact(int idContact) throws DataDeleteException, WebServiceDataBaseException, ContactDeleteException{
		boolean b = false;
		if(idContact>0){
			int nbRefOffre = this.contactDomainService.countOffreRefContact(idContact);
			int nbRefConvention = this.contactDomainService.countConventionRefContact(idContact);
			AccordPartenariatDTO a = this.accordPartenariatDomainService.getAccordFromIdContact(idContact);
			ContactDTO c = this.contactDomainService.getContactFromId(idContact);
			if(nbRefOffre>0 || nbRefConvention>0 || a!=null || (StringUtils.hasText(c.getLogin()) && StringUtils.hasText(c.getMdp()))){
				throw new ContactDeleteException("Suppression impossible, contact référencé.", StringUtils.hasText(c.getLogin()) && StringUtils.hasText(c.getMdp()),
						a!=null, nbRefOffre>0, nbRefConvention>0);
			}
			b = this.contactDomainService.deleteContact(idContact);
		}
		return b;
	}

	/* ****************************************************************************
	 * CONTRAT
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getContrats()
	 */
	public List<ContratOffreDTO> getContrats(){
		return this.contratDomainService.getContrats();
	}

	/* ****************************************************************************
	 * Convention
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addConvention(org.esupportail.pstagedata.domain.dto.ConventionDTO)
	 */
	public int addConvention(ConventionDTO convention) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(convention!=null){
			b = this.conventionDomainService.addConvention(convention);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteConvention(int)
	 */
	public boolean deleteConvention(int idConvention)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		if(idConvention>0){
			b = this.conventionDomainService.deleteConvention(idConvention);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionFromId(int)
	 */
	public ConventionDTO getConventionFromId(int id) {
		ConventionDTO tmp=null;
		if(id>0){
			tmp=this.conventionDomainService.getConventionFromId(id);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAnneesConvention(java.lang.String)
	 */
	public List<String> getAnneesConventionFromCodUniv(String codeUniversite){
		return this.conventionDomainService.getAnneesConvention(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsFromCriteres(org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteres(CritereRechercheConventionDTO critereRechercheConvention){
		List<ConventionDTO> lo = null;
		if(critereRechercheConvention!=null && critereRechercheConvention.getIdsCentreGestion()!=null && !critereRechercheConvention.getIdsCentreGestion().isEmpty()){
			lo = this.conventionDomainService.getConventionsFromCriteres(critereRechercheConvention);
		}
		return lo;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsFromCriteresByEnseignantTuteur(int, org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteresByEnseignantTuteur(int idEnseignant, CritereRechercheConventionDTO critereRechercheConvention) {
		List<ConventionDTO> lo = null;
		if(critereRechercheConvention!=null){
			lo = this.conventionDomainService.getConventionsFromCriteresByEnseignantTuteur(idEnseignant, critereRechercheConvention);
		}
		return lo;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsFromCriteresExport(org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteresExport(CritereRechercheConventionDTO critereRechercheConvention){
		List<ConventionDTO> lo = null;
		if(critereRechercheConvention!=null && critereRechercheConvention.getIdsCentreGestion()!=null && !critereRechercheConvention.getIdsCentreGestion().isEmpty()){
			lo = this.conventionDomainService.getConventionsFromCriteresExport(critereRechercheConvention);
		}
		return lo;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionFromExport(int)
	 */
	//	public ConventionDTO getConventionFromExport(int id) {
	//		ConventionDTO tmp=null;
	//		if(id>0){
	//			tmp=this.conventionDomainService.getConventionFromExport(id);
	//		}
	//		return tmp;
	//	}
	public List<ConventionDTO> getConventionsFromExport(List<Integer> idsConventionsExport) {
		List<ConventionDTO> lc = null;
		if(idsConventionsExport != null && !idsConventionsExport.isEmpty()){
			lc=this.conventionDomainService.getConventionsFromExport(idsConventionsExport);
		}
		return lc;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventions(java.lang.String)
	 */
	public List<ConventionDTO> getConventionsFromCodUniv(String codeUniversite) {
		return this.conventionDomainService.getConventions(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsEtudiant(java.lang.String, java.lang.String)
	 */
	public List<ConventionDTO> getConventionsEtudiantFromCodUniv(String identEtudiant, String codeUniversite) {
		return this.conventionDomainService.getConventionsEtudiant(identEtudiant, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsByEnseignant(int, java.lang.String)
	 */
	public List<ConventionDTO> getConventionsByEnseignant(int idEnseignant, String annee) {
		return this.conventionDomainService.getConventionsByEnseignant(idEnseignant, annee);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreConventionByCentreGestion(int, java.lang.String)
	 */
	public int getNombreConventionByCentreGestionFromCodUniv(int idCentreGestion, String codeUniversite){
		return this.conventionDomainService.getNombreConventionByCentreGestion(idCentreGestion, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateConvention(org.esupportail.pstagedata.domain.dto.ConventionDTO)
	 */
	public boolean updateConvention(ConventionDTO convention)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if(convention!=null){
			b = this.conventionDomainService.updateConvention(convention);
		}
		return b;
	}
	public boolean updateCentreConventionByUfr(String code, int idCentreGestion) throws DataUpdateException, WebServiceDataBaseException{
		return updateCentreConventionByUfrCodUniv(code, idCentreGestion, null);
	}
	public boolean updateCentreConventionByEtape(String code, int idCentreGestion) throws DataUpdateException, WebServiceDataBaseException{
		return updateCentreConventionByEtapeCodUniv(code, idCentreGestion,null);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateCentreConventionByUfr(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByUfrCodUniv(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if(code!=null && idCentreGestion>0){
			b = this.conventionDomainService.updateCentreConventionByUfr(code,idCentreGestion, codeUniversite);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateCentreConventionByEtape(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByEtapeCodUniv(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if(code!=null && idCentreGestion>0){
			b = this.conventionDomainService.updateCentreConventionByEtape(code,idCentreGestion, codeUniversite);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCodeUFRFromCodeEtape(java.lang.String, java.lang.String)
	 */
	public String getCodeUFRFromCodeEtapeFromCodUniv(String codeEtape, String codeUniversite) {
		String tmp=null;
		if(!codeEtape.isEmpty()){
			tmp=this.conventionDomainService.getCodeUFRFromCodeEtape(codeEtape, codeUniversite);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventions()
	 */
	public List<ConventionDTO> getConventions(){
		return getConventionsFromCodUniv(null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAnneesConvention()
	 */
	public List<String> getAnneesConvention(){
		return getAnneesConventionFromCodUniv(null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getConventionsEtudiant(java.lang.String)
	 */
	public List<ConventionDTO> getConventionsEtudiant(String identEtudiant){
		return getConventionsEtudiantFromCodUniv(identEtudiant, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCodeUFRFromCodeEtape(java.lang.String)
	 */
	public String getCodeUFRFromCodeEtape(String codeEtape){
		return getCodeUFRFromCodeEtapeFromCodUniv(codeEtape, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreConventionByCentreGestion(int)
	 */
	public int getNombreConventionByCentreGestion(int idCentreGestion){
		return getNombreConventionByCentreGestionFromCodUniv(idCentreGestion, null);
	}
	/* ****************************************************************************
	 * CRITERE GESTION
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCritereGestion()
	 */
	public List<CritereGestionDTO> getCritereGestion() {
		return this.critereGestionDomainService.getCritereGestion();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCritereGestionFromIdCentre(int)
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentre(int idCentreGestion) {
		return this.critereGestionDomainService.getCritereGestionFromIdCentre(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreCritereGestion(int)
	 */
	public int getNombreCritereGestion(int idCentreGestion){
		return this.critereGestionDomainService.getNombreCritereGestion(idCentreGestion);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addCritere(org.esupportail.pstagedata.domain.dto.CritereGestionDTO)
	 */
	public int addCritere(CritereGestionDTO critere) throws DataAddException,WebServiceDataBaseException{
		int b=0;
		if(critere!=null){
			b = this.critereGestionDomainService.addCritere(critere);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteCritere(String)
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteException, WebServiceDataBaseException{
		boolean b=false;
		if(codeCritere != null && !(codeCritere.isEmpty())){
			b = this.critereGestionDomainService.deleteCritere(codeCritere);
		}
		return b;
	}
	/* ****************************************************************************
	 * DROIT ADMINISTRATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getDroitAdministration()
	 */
	public List<DroitAdministrationDTO> getDroitAdministration(){
		return this.droitAdministrationDomainService.getDroitAdministration();
	}

	/* ****************************************************************************
	 * DUREE DIFFUSION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getDureeDiffusion()
	 */
	public List<DureeDiffusionDTO> getDureeDiffusion(){
		return this.dureeDiffusionDomainService.getDureeDiffusion();
	}
	/* ****************************************************************************
	 * EFFECTIF
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEffectifs()
	 */
	public List<EffectifDTO> getEffectifs(){
		return this.effectifDomainService.getEffectifs();
	}

	/* ****************************************************************************
	 * Enseignant
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addEnseignant(org.esupportail.pstagedata.domain.dto.EnseignantDTO)
	 */
	public int addEnseignant(EnseignantDTO enseignant) throws DataAddException,	WebServiceDataBaseException {
		int b=0;
		if(enseignant!=null){
			try {
				b = this.enseignantDomainService.addEnseignant(enseignant);
			} catch (DataAddException e) {

				throw e;
			}
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteEnseignant(int)
	 */
	public boolean deleteEnseignant(int idEnseignant) throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		if(idEnseignant>0){
			b = this.enseignantDomainService.deleteEnseignant(idEnseignant);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEnseignantFromId(int)
	 */
	public EnseignantDTO getEnseignantFromId(int id) {
		EnseignantDTO tmp=null;
		if(id>0){
			tmp=this.enseignantDomainService.getEnseignantFromId(id);
		}
		return tmp;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEnseignantFromUid(java.lang.String, java.lang.String)
	 */
	public EnseignantDTO getEnseignantFromUid(String uidEnseignant,
			String codeUniversite) {
		EnseignantDTO tmp=null;
		if (uidEnseignant != null && codeUniversite != null) {
			tmp=this.enseignantDomainService.getEnseignantFromUid(uidEnseignant, codeUniversite);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreConventionByEnseignant(java.lang.String, java.lang.String)
	 */
	public int getNombreConventionByEnseignantFromCodUniv(String uidEnseignant, String codeUniversite){
		return this.enseignantDomainService.getNombreConventionByEnseignant(uidEnseignant, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEnseignants(java.lang.String)
	 */
	public List<EnseignantDTO> getEnseignantsFromCodUniv(String codeUniversite) {
		return this.enseignantDomainService.getEnseignants(codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEnseignants()
	 */
	public List<EnseignantDTO> getEnseignants(){
		return getEnseignantsFromCodUniv(null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreConventionByEnseignant(java.lang.String)
	 */
	public int getNombreConventionByEnseignant(String uidEnseignant){
		return getNombreConventionByEnseignantFromCodUniv(uidEnseignant, null);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateEnseignant(org.esupportail.pstagedata.domain.dto.EnseignantDTO)
	 */
	public boolean updateEnseignant(EnseignantDTO enseignant) throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if(enseignant!=null){
			b = this.enseignantDomainService.updateEnseignant(enseignant);
		}
		return b;
	}	
	/* ****************************************************************************
	 * Etape
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapes()
	 */
	public List<EtapeDTO> getEtapesFromCodUniv(String codeUniversite) {
		return this.etapeDomainService.getEtapes(codeUniversite);
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addEtape(org.esupportail.pstagedata.domain.dto.EtapeDTO)
	 */
	public int addEtape(EtapeDTO etape) throws DataAddException, WebServiceDataBaseException,EtapeAlreadyExistingForCodeException {
		int b=0;
		if(etape!=null){
			try {
				b = this.etapeDomainService.addEtape(etape);
			} catch (DataAddException e) {
				int error = ((SQLException)e.getCause()).getErrorCode();
				// cas  e.getMessage().contains("Duplicata du champ"), code erreur 1062
				if (error == 1062) {
					throw new EtapeAlreadyExistingForCodeException("Etape deja existante pour code : "+etape.getCode() );
				}
				throw e;
			}
		}		
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapeFromId(java.lang.String)
	 */
	public EtapeDTO getEtapeFromIdFromCodUniv(String code, String codeUniversite) {
		EtapeDTO tmp=null;
		if(code!=null){
			tmp=this.etapeDomainService.getEtapeFromId(code, codeUniversite);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapesFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestionFromCodUniv(List<Integer> idsCentreGestion, String codeUniversite){
		List<EtapeDTO> lu = null;
		if(idsCentreGestion!=null &&!idsCentreGestion.isEmpty()){
			lu=this.etapeDomainService.getEtapesFromIdsCentreGestion(idsCentreGestion, codeUniversite);
		}
		return lu;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapes()
	 */
	public List<EtapeDTO> getEtapes(){
		return getEtapesFromCodUniv(null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapesFromIdsCentreGestion(java.util.List)
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion){
		return getEtapesFromIdsCentreGestionFromCodUniv(idsCentreGestion, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtapeFromId(java.lang.String)
	 */
	public EtapeDTO getEtapeFromId(String code){
		return getEtapeFromIdFromCodUniv(code, null);
	}


	/* ****************************************************************************
	 * Etudiant
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public int addEtudiant(EtudiantDTO etudiant) throws DataAddException,WebServiceDataBaseException,EtudiantAlreadyExistingForNumEtuCodeUnivException{
		int b=0;
		if(etudiant!=null){
			try {
				b = this.etudiantDomainService.addEtudiant(etudiant);
			} catch (DataAddException e) {
				int error = ((SQLException)e.getCause()).getErrorCode();
				// cas  e.getMessage().contains("Duplicata du champ"), code erreur 1062 
				if (error == 1062) {
					throw new EtudiantAlreadyExistingForNumEtuCodeUnivException("Etudiant deja existant pour clef ident-codeUniv : "+etudiant.getId() + " "+etudiant.getIdentEtudiant() + " " + etudiant.getCodeUniversite());
				}
				throw e;
			}
		}		
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteEtudiant(int)
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b = false;
		if(idEtudiant>0){
			b = this.etudiantDomainService.deleteEtudiant(idEtudiant);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtudiantFromId(int)
	 */
	public EtudiantDTO getEtudiantFromId(int id) {
		EtudiantDTO tmp=null;
		if(id>0){
			tmp=this.etudiantDomainService.getEtudiantFromId(id);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getEtudiants()
	 */
	public List<EtudiantDTO> getEtudiants() {
		return this.etudiantDomainService.getEtudiants();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public boolean updateEtudiant(EtudiantDTO etudiant)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		if(etudiant!=null){
			b = this.etudiantDomainService.updateEtudiant(etudiant);
		}
		return b;
	}	

	/* ****************************************************************************
	 * FAPN1
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFapN1()
	 */
	public List<FapN1DTO> getFapN1(){
		return this.fapN1DomainService.getFapN1();
	}

	/* ****************************************************************************
	 * FAPN2
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFapN2()
	 */
	public List<FapN2DTO> getFapN2(){
		return this.fapN2DomainService.getFapN2();
	}

	/* ****************************************************************************
	 * FAPN3
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFapN3()
	 */
	public List<FapN3DTO> getFapN3(){
		return this.fapN3DomainService.getFapN3();
	}

	/* ****************************************************************************
	 * FAP QUALIFICATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFapQualifications()
	 */
	public List<FapQualificationDTO> getFapQualifications(){
		return this.fapQualificationDomainService.getFapQualifications();
	}

	/* ****************************************************************************
	 * FAP QUALIFICATION SIMPLIFIEE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFapQualificationsSimplifiees()
	 */
	public List<FapQualificationSimplifieeDTO> getFapQualificationsSimplifiees(){
		return this.fapQualificationSimplifieeDomainService.getFapQualificationsSimplifiees();
	}
	/* ****************************************************************************
	 * INDEMNISATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getIndemnisations()
	 */
	public List<IndemnisationDTO> getIndemnisations() {
		return this.indemnisationDomainService.getIndemnisations();
	}

	/* ****************************************************************************
	 * LANGUE CONVENTION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getLangueConventions()
	 */
	public List<LangueConventionDTO> getLangueConventions() {
		return this.langueConventionDomainService.getLangueConventions();
	}
	/* ****************************************************************************
	 * MODE CANDIDATURE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getModesCandidature()
	 */
	public List<ModeCandidatureDTO> getModesCandidature(){
		return this.modeCandidatureDomainService.getModesCandidature();
	}


	/* ****************************************************************************
	 * ModeValidationStage
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getModeValidationStages()
	 */

	public List<ModeValidationStageDTO> getModeValidationStages() {
		return this.modeValidationStageDomainService.getModeValidationStages();
	}

	/* ****************************************************************************
	 * ModeVersGratification
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getModeVersGratifications()
	 */
	public List<ModeVersGratificationDTO> getModeVersGratifications() {
		return this.modeVersGratificationDomainService.getModeVersGratifications();
	}

	/* ****************************************************************************
	 * NAFN1
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNafN1()
	 */
	public List<NafN1DTO> getNafN1(){
		return this.nafN1DomainService.getNafN1();
	}

	/* ****************************************************************************
	 * NAFN5
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNafN5()
	 */
	public List<NafN5DTO> getNafN5(){
		return this.nafN5DomainService.getNafN5();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNafN5FromCodeNafN1(java.lang.String)
	 */
	public List<NafN5DTO> getNafN5FromCodeNafN1(String code) {
		return this.nafN5DomainService.getNafN5FromCodeNafN1(code);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNafN5FromCodeNafN5(java.lang.String)
	 */
	public NafN5DTO getNafN5FromCodeNafN5(String code) {
		return this.nafN5DomainService.getNafN5FromCodeNafN5(code);
	}

	/* ****************************************************************************
	 * NatureTravail
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNatureTravails()
	 */
	public List<NatureTravailDTO> getNatureTravails() {
		return this.natureTravailDomainService.getNatureTravails();
	}

	/* ****************************************************************************
	 * NIVEAU CENTRE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNiveauCentre()
	 */
	public List<NiveauCentreDTO> getNiveauCentre(){
		return this.niveauCentreDomainService.getNiveauCentre();
	}

	/* ****************************************************************************
	 * NIVEAU FORMATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNiveauxFormation()
	 */
	public List<NiveauFormationDTO> getNiveauxFormation(){
		return this.niveauFormationDomainService.getNiveauxFormation();
	}

	/* ****************************************************************************
	 * OFFRE
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getOffresFromIdStructureAndIdsCentreGestion(int, java.util.List, boolean)
	 */
	public List<OffreDTO> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant){
		List<OffreDTO> l = null;
		if(idStructure>0){
			l = this.offreDomainService.getOffresFromIdStructureAndIdsCentreGestion(idStructure, idsCentreGestion, isEtudiant);
		}
		return l;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getOffreFromId(int)
	 */
	public OffreDTO getOffreFromId(int id){
		OffreDTO o = null;
		if(id>0){
			o = this.offreDomainService.getOffreFromId(id);
		}
		return o;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombreOffreByCentreGestion(int)
	 */
	public int getNombreOffreByCentreGestion(int idCentreGestion){
		return this.offreDomainService.getNombreOffreByCentreGestion(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getOffresFromCriteres(org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO)
	 */
	public List<OffreDTO> getOffresFromCriteres(CritereRechercheOffreDTO critereRechercheOffre){
		List<OffreDTO> lo = null;
		if(critereRechercheOffre!=null){
			lo = this.offreDomainService.getOffresFromCriteres(critereRechercheOffre);
		}
		return lo;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addOffre(org.esupportail.pstagedata.domain.dto.OffreDTO)
	 */
	public int addOffre(OffreDTO o) throws DataAddException, WebServiceDataBaseException{
		int b=0;
		if(o!=null){
			b = this.offreDomainService.addOffre(o);
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateOffre(org.esupportail.pstagedata.domain.dto.OffreDTO)
	 */
	public boolean updateOffre(OffreDTO o) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(o!=null){
			b = this.offreDomainService.updateOffre(o);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteOffreLogique(int)
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.deleteOffreLogique(idOffre);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateValidationOffre(int, java.lang.String)
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateValidationOffre(idOffre, loginValidation);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStopValidationOffre(int, java.lang.String)
	 */
	public boolean updateStopValidationOffre(int idOffre, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateStopValidationOffre(idOffre, loginStopValidation);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateDiffusionOffre(int, java.lang.String, java.util.Date)
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateDiffusionOffre(idOffre, loginDiffusion, dateFinDiffusion);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStopDiffusionOffre(int, java.lang.String)
	 */
	public boolean updateStopDiffusionOffre(int idOffre, String loginStopDiffusion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateStopDiffusionOffre(idOffre, loginStopDiffusion);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateRejetOffre(int, java.lang.String)
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateRejetOffre(idOffre, loginRejetValidation);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#countOffreADiffuser(java.util.List)
	 */
	public int countOffreADiffuser(List<Integer> idsCentreGestion){
		return this.offreDomainService.countOffreADiffuser(idsCentreGestion);
	}

	/* ****************************************************************************
	 * OFFRE FICHIER
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateOffrePourvue(int, boolean)
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDomainService.updateOffrePourvue(idOffre, estPourvue);
		}
		return b;
	}


	/* ****************************************************************************
	 * OFFRE FICHIER
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getFichierFromIdFichier(int)
	 */
	public FichierDTO getFichierFromIdFichier(int idFichier){
		return this.fichierDomainService.getFichierFromIdFichier(idFichier);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addFichier(org.esupportail.pstagedata.domain.dto.FichierDTO)
	 */
	public int addFichier(FichierDTO o) throws DataAddException, WebServiceDataBaseException{
		return this.fichierDomainService.addFichier(o);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateFichier(org.esupportail.pstagedata.domain.dto.FichierDTO)
	 */
	public boolean updateFichier(FichierDTO o) throws DataUpdateException, WebServiceDataBaseException{
		return this.fichierDomainService.updateFichier(o);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteFichier(int)
	 */
	public boolean deleteFichier(int idFichier) throws DataDeleteException, WebServiceDataBaseException{
		return this.fichierDomainService.deleteFichier(idFichier);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#cleanFichiers()
	 */
	public boolean cleanFichiers() throws DataDeleteException, WebServiceDataBaseException{
		return this.fichierDomainService.cleanFichiers();
	}
	/* ****************************************************************************
	 * OFFRE MODE CANDIDATURE
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addOffreModeCandidature(int, java.util.List)
	 */
	public int addOffreModeCandidature(int idOffre, List<Integer> idsModeCandidature) throws DataAddException, DataDeleteException, WebServiceDataBaseException{
		int b=0;
		if(idOffre>0){
			b = this.offreModeCandidatureDomainService.addOffreModeCandidature(idOffre, idsModeCandidature);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteOffreModeCandidatureFromId(int)
	 */
	public boolean deleteOffreModeCandidatureFromId(int idOffre) throws DataAddException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreModeCandidatureDomainService.deleteOffreModeCandidatureFromId(idOffre);
		}
		return b;
	}


	/* ****************************************************************************
	 * OFFRE DIFFUSION
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getOffreDiffusionFromIdOffre(int)
	 */
	public List<OffreDiffusionDTO> getOffreDiffusionFromIdOffre(int idOffre){
		List<OffreDiffusionDTO> l =null;
		if(idOffre>0){
			l=this.offreDiffusionDomainService.getOffreDiffusionFromIdOffre(idOffre);
		}
		return l;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addOffreDiffusion(java.util.List)
	 */
	public int addOffreDiffusion(List<OffreDiffusionDTO> lod) throws DataAddException, DataDeleteException, WebServiceDataBaseException{
		int b=0;
		if(lod!=null && !lod.isEmpty()){
			b = this.offreDiffusionDomainService.addOffreDiffusion(lod);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteOffreDiffusionFromId(int)
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		if(idOffre>0){
			b = this.offreDiffusionDomainService.deleteOffreDiffusionFromId(idOffre);
		}
		return b;
	}

	/* ****************************************************************************
	 * PAYS
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPays()
	 */
	public List<PaysDTO> getPays(){
		return this.paysDomainService.getPays();
	}

	/* ****************************************************************************
	 * PERSONNEL CENTRE GESTION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPersonnelCentreGestionList(int)
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionList(int idCentreGestion){
		return this.personnelCentreGestionDomainService.getPersonnelCentreGestionList(idCentreGestion);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNombrePersonnelCentreGestion(int)
	 */
	public int getNombrePersonnelCentreGestion(int idCentreGestion){
		return this.personnelCentreGestionDomainService.getNombrePersonnelCentreGestion(idCentreGestion);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPersonnelCentreGestion(int)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestion(int idPersonnelCentreGestion){
		return this.personnelCentreGestionDomainService.getPersonnelCentreGestion(idPersonnelCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getInterlocuteur(int)
	 */
	public List<PersonnelCentreGestionDTO> getInterlocuteur(int idCentreGestion){
		return this.personnelCentreGestionDomainService.getInterlocuteur(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPersonnelCentreGestionFromIdAndCentre(int,int)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromIdAndCentre(int idPersonnelCentreGestion, int idCentreGestion){
		return this.personnelCentreGestionDomainService.getPersonnelCentreGestionFromIdAndCentre(idPersonnelCentreGestion, idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPersonnelCentreGestionFromUid(String,String)
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionFromUid(String uidPersonnel,String codeUniversite){
		return this.personnelCentreGestionDomainService.getPersonnelCentreGestionFromUid(uidPersonnel, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getPersonnelCentreGestionFromNom(java.lang.String, java.lang.String)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromNom(String nom, String codeUniversite){
		return this.personnelCentreGestionDomainService.getPersonnelCentreGestionFromNom(nom, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addPersonnelCentreGestion(org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO)
	 */
	public int addPersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataAddException,WebServiceDataBaseException,PersonalAlreadyExistingForCentreException{
		int b=0;
		if(pg!=null){
			try{
				List<PersonnelCentreGestionDTO> tmp = getPersonnelCentreGestionFromUid(pg.getUidPersonnel(), pg.getCodeUniversite());

				if(tmp != null){
					for(int i=0; i<tmp.size();i++){
						if(pg.getUidPersonnel().equals(tmp.get(i).getUidPersonnel())
								&& pg.getIdCentreGestion() == tmp.get(i).getIdCentreGestion()){
							throw new PersonalAlreadyExistingForCentreException("Personnel déjàrattaché : " + tmp);
						}
					}
				}
			} catch (NullPointerException npe){
				// En cas de npe, le personnel n'est pas déjà rattaché, on continue donc l'ajout normalement.
			}
			b = this.personnelCentreGestionDomainService.addPersonnelCentreGestion(pg);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updatePersonnelCentreGestion(org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO)
	 */
	public boolean updatePersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		if(pg!=null && pg.getId()>0){
			b = this.personnelCentreGestionDomainService.updatePersonnelCentreGestion(pg);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deletePersonnelCentreGestion(int, int)
	 */
	public boolean deletePersonnelCentreGestion(int idCentreGestion, int idPersonnelCentreGestion) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		if(idPersonnelCentreGestion>0 && idCentreGestion>0){
			b = this.personnelCentreGestionDomainService.deletePersonnelCentreGestion(idCentreGestion, idPersonnelCentreGestion);
		}
		return b;
	}

	/* ****************************************************************************
	 * SERVICE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getServiceFromId(int)
	 */
	public ServiceDTO getServiceFromId(int id){
		ServiceDTO s = null;
		if(id>0){
			s=this.serviceDomainService.getServiceFromId(id);
		}
		return s;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getServiceFromIdContact(int)
	 */
	public ServiceDTO getServiceFromIdContact(int id){
		ServiceDTO s = null;
		if(id>0){
			s=this.serviceDomainService.getServiceFromIdContact(id);
		}
		return s;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getServicesFromIdStructure(int)
	 */
	public List<ServiceDTO> getServicesFromIdStructure(int id){
		List<ServiceDTO> l = null;
		if(id>0){
			l=this.serviceDomainService.getServicesFromIdStructure(id);
		}
		return l;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addService(org.esupportail.pstagedata.domain.dto.ServiceDTO)
	 */
	public int addService(ServiceDTO s) throws DataAddException, WebServiceDataBaseException{
		int b=0;
		if(s!=null){
			b = this.serviceDomainService.addService(s);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateService(org.esupportail.pstagedata.domain.dto.ServiceDTO)
	 */
	public boolean updateService(ServiceDTO s) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(s!=null){
			b = this.serviceDomainService.updateService(s);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateServiceInfosAJour(int, java.lang.String)
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idService>0){
			b = this.serviceDomainService.updateServiceInfosAJour(idService, loginInfosAJour);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteService(int)
	 */
	public boolean deleteService(int idService) throws DataDeleteException, WebServiceDataBaseException,ServiceDeleteException{
		boolean b = false;
		if(idService>0){
			int nbContactRefOffre = this.serviceDomainService.countContactRefOffre(idService);
			int nbContactRefConvention = this.serviceDomainService.countContactRefConvention(idService);
			int nbCompteContact = this.serviceDomainService.countContactAvecCompte(idService);
			int nbContactAccord = this.serviceDomainService.countContactRefAccord(idService);
			if(nbContactRefOffre>0 || nbContactRefConvention>0 || nbCompteContact>0 || nbContactAccord>0){
				throw new ServiceDeleteException("Suppression impossible, un ou plusieurs contacts sont référencés.", nbCompteContact>0, nbContactAccord>0, nbContactRefOffre>0, nbContactRefConvention>0);
			}
			b = this.serviceDomainService.deleteService(idService);
		}
		return b;

	}

	/* ****************************************************************************
	 * STATUT JURIDIQUE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStatutsJuridiques()
	 */
	public List<StatutJuridiqueDTO> getStatutsJuridiques(){
		return this.statutJuridiqueDomainService.getStatutsJuridiques();
	}

	/* ****************************************************************************
	 * STRUCTURE
	 *****************************************************************************/

	// Ajout moderation Entreprise
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromVerification(boolean)
	 */
	public List<StructureDTO> getStructuresFromVerification(boolean estValidee){
		return this.structureDomainService.getStructuresFromVerification(estValidee);
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructureFromId(int)
	 */
	public StructureDTO getStructureFromId(int id){
		StructureDTO s = null;
		if(id>0){
			s = this.structureDomainService.getStructureFromId(id);
		}
		return s;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructureFromIdService(int)
	 */
	public StructureDTO getStructureFromIdService(int id){
		StructureDTO s = null;
		if(id>0){
			s=this.structureDomainService.getStructureFromIdService(id);
		}
		return s;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromRaisonSociale(String raisonSociale){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(raisonSociale)){
			tmp=this.structureDomainService.getStructuresFromRaisonSociale(raisonSociale);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromRaisonSocialeEtPays(java.lang.String, int)
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int cog){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(raisonSociale)){
			if(cog>0){
				tmp=this.structureDomainService.getStructuresFromRaisonSocialeEtPays(raisonSociale, cog);
			}else{
				tmp=this.structureDomainService.getStructuresFromRaisonSociale(raisonSociale);
			}
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresPaysEtrangerFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(raisonSociale)){		
			tmp=this.structureDomainService.getStructuresPaysEtrangerFromRaisonSociale(raisonSociale);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructureFromNumSiret(java.lang.String)
	 */
	public StructureDTO getStructureFromNumSiret(String numeroSiret){
		StructureDTO tmp=null;
		if(StringUtils.hasText(numeroSiret) && Utils.validateNumSiret(numeroSiret)){
			tmp=this.structureDomainService.getStructureFromNumSiret(numeroSiret);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructureFromContactMailEntrepriseAvecCompte(java.lang.String)
	 */
	public List<StructureDTO> getStructureFromContactMailEntrepriseAvecCompte(String mail){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(mail)){
			tmp=this.structureDomainService.getStructureFromContactMailEntrepriseAvecCompte(mail);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructureAvecAccordFromId(int)
	 */
	public StructureDTO getStructureAvecAccordFromId(int id){
		StructureDTO tmp=null;
		if(id>0){
			tmp=this.structureDomainService.getStructureAvecAccordFromId(id);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromRaisonSocialeEtDepartement(java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(raisonSociale)){
			if(StringUtils.hasText(departement)){
				tmp=this.structureDomainService.getStructuresFromRaisonSocialeEtDepartement(raisonSociale, departement);
			}else{
				tmp=this.structureDomainService.getStructuresFromRaisonSociale(raisonSociale);
			}
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromNumSiren(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromNumSiren(String numSiren){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(numSiren) && Utils.validateNumSiren(numSiren)){
			tmp=this.structureDomainService.getStructuresFromNumSiren(numSiren);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromTelephone(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromTelephone(String telephone){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(telephone)){
			tmp=this.structureDomainService.getStructuresFromTelephone(telephone);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromFax(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromFax(String fax){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(fax)){
			tmp=this.structureDomainService.getStructuresFromFax(fax);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromAdresse(org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO)
	 */
	public List<StructureDTO> getStructuresFromAdresse(CritereRechercheStructureAdresseDTO c){
		List<StructureDTO> tmp=null;
		if(c!=null){
			tmp=this.structureDomainService.getStructuresFromAdresse(c);
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromNomServiceEtDepartement(java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromNomServiceEtDepartement(String nomService, String departement){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(nomService)){
			if(StringUtils.hasText(departement)){
				tmp=this.structureDomainService.getStructuresFromNomServiceEtDepartement(nomService, departement);
			}else{
				tmp=this.structureDomainService.getStructuresFromNomServiceEtDepartement(nomService,"");
			}
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresFromTypeStructureNafN1EtDepartement(int, java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement){
		List<StructureDTO> tmp=null;
		if(typeStructure>0 || StringUtils.hasText(nafN1)){
			if(StringUtils.hasText(departement)){
				tmp=this.structureDomainService.getStructuresFromTypeStructureNafN1EtDepartement(typeStructure, nafN1, departement);
			}else{
				tmp=this.structureDomainService.getStructuresFromTypeStructureNafN1EtDepartement(typeStructure, nafN1, "");
			}
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresAvecAccordAValiderFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	public List<StructureDTO> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		//Voir dao pour la gestion des dates
		List<StructureDTO> tmp=null;
		tmp=this.structureDomainService.getStructuresAvecAccordAValiderFromRaisonSociale(raisonSociale,
				dateDebut,dateFin);
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresAvecAccordValidesFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	public List<StructureDTO> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		//Voir dao pour la gestion des dates
		List<StructureDTO> tmp=null;
		tmp=this.structureDomainService.getStructuresAvecAccordValidesFromRaisonSociale(raisonSociale,
				dateDebut,dateFin);
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresSansAccordFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresSansAccordFromRaisonSociale(String raisonSociale){
		List<StructureDTO> tmp=null;
		if(StringUtils.hasText(raisonSociale)){
			tmp=this.structureDomainService.getStructuresSansAccordFromRaisonSociale(raisonSociale);
		}
		return tmp;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getStructuresAncien(org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO)
	 */
	public List<StructureDTO> getStructuresAncien(CritereRechercheStructureAncienDTO c) {
		List<StructureDTO> tmp=null;
		if(c!=null){
			tmp=this.structureDomainService.getStructuresAncien(c);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addStructure(org.esupportail.pstagedata.domain.dto.StructureDTO)
	 */
	public int addStructure(StructureDTO s) throws DataAddException, WebServiceDataBaseException, UnvalidNumSiretException, StructureNumSiretException{
		int b=0;
		if(s!=null){
			if(StringUtils.hasText(s.getNumeroSiret())){
				if(!Utils.validateNumSiret(s.getNumeroSiret())){
					throw new UnvalidNumSiretException("addStructure : Numero Siret Incorrect : "+s.getNumeroSiret());
				}
				if(getStructureFromNumSiret(s.getNumeroSiret())!=null){
					throw new StructureNumSiretException("addStructure : Structure deja existante avec ce Numero Siret : "+s.getNumeroSiret());
				}
			}
			b = this.structureDomainService.addStructure(s);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStructure(org.esupportail.pstagedata.domain.dto.StructureDTO)
	 */
	public boolean updateStructure(StructureDTO s) throws DataUpdateException, WebServiceDataBaseException, UnvalidNumSiretException, StructureNumSiretException{
		boolean b = false;
		if(s!=null && s.getIdStructure()>0){
			if(StringUtils.hasText(s.getNumeroSiret())){
				if(!Utils.validateNumSiret(s.getNumeroSiret())){
					throw new UnvalidNumSiretException("updateStructure : Numero Siret Incorrect : "+s.getNumeroSiret());
				}
				StructureDTO sTmp = getStructureFromNumSiret(s.getNumeroSiret());
				if(sTmp!=null && !sTmp.equals(s)){
					throw new StructureNumSiretException("updateStructure : Structure deja existante avec ce Numero Siret : "+s.getNumeroSiret());
				}
			}
			b = this.structureDomainService.updateStructure(s);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStructureInfosAJour(int, java.lang.String)
	 */
	public boolean updateStructureInfosAJour(int idStructure, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idStructure>0){
			b = this.structureDomainService.updateStructureInfosAJour(idStructure, loginInfosAJour);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStructureValidation(int, java.lang.String)
	 */
	public boolean updateStructureValidation(int idStructure, String loginValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idStructure>0){
			b = this.structureDomainService.updateStructureValidation(idStructure, loginValidation);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#updateStructureStopValidation(int, java.lang.String)
	 */
	public boolean updateStructureStopValidation(int idStructure, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		if(idStructure>0){
			b = this.structureDomainService.updateStructureStopValidation(idStructure, loginStopValidation);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteStructure(int)
	 */
	public boolean deleteStructure(int idStructure) throws DataDeleteException, WebServiceDataBaseException, StructureDeleteException{
		boolean b = false;
		if(idStructure>0){
			int nbCpt = this.structureDomainService.countCompteContactFromIdStructure(idStructure);
			int nbO = this.structureDomainService.countOffreFromIdStructure(idStructure);
			int nbCv = this.structureDomainService.countConventionFromIdStructure(idStructure);
			boolean accord = this.accordPartenariatDomainService.getAccordFromIdStructure(idStructure)!=null;
			if(nbCpt > 0 || nbO > 0 || nbCv > 0 || accord){
				throw new StructureDeleteException("Suppression impossible. Offres : "+nbCpt+", Comptes : "+nbO+", Conventions : "+nbCv+", Accord : "+accord,
						nbCpt,nbO,nbCv,accord);
			}
			List<ServiceDTO> ls = this.serviceDomainService.getServicesFromIdStructure(idStructure);
			if(ls!=null){
				for(ServiceDTO se : ls){
					b = this.contactDomainService.deleteContactFromIdService(se.getIdService());
				}
			}
			b = this.serviceDomainService.deleteServiceFromIdStructure(idStructure);
			b = this.structureDomainService.deleteStructure(idStructure);
		}
		return b;
	}

	/* ****************************************************************************
	 * TEMPS TRAVAIL
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTempsTravail()
	 */
	public List<TempsTravailDTO> getTempsTravail(){
		return this.tempsTravailDomainService.getTempsTravail();
	}

	/* ****************************************************************************
	 * Theme
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getThemes()
	 */
	public List<ThemeDTO> getThemes() {
		return this.themeDomainService.getThemes();
	}

	/* ****************************************************************************
	 * TypeConvention
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTypeConventions()
	 */
	public List<TypeConventionDTO> getTypeConventions() {
		return this.typeConventionDomainService.getTypeConventions();
	}
	/* ****************************************************************************
	 * TYPE OFFRE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTypesOffre()
	 */
	public List<TypeOffreDTO> getTypesOffre(){
		return this.typeOffreDomainService.getTypesOffre();
	}

	/* ****************************************************************************
	 * TYPE STRUCTURE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTypesStructure()
	 */
	public List<TypeStructureDTO> getTypesStructure(){
		return this.typeStructureDomainService.getTypesStructure();
	}

	/* ****************************************************************************
	 * Ufr
	 *****************************************************************************/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrs(java.lang.String)
	 */
	public List<UfrDTO> getUfrsFromCodUniv(String codeUniversite) {
		return this.ufrDomainService.getUfrs(codeUniversite);
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addUfr(org.esupportail.pstagedata.domain.dto.UfrDTO)
	 */
	public int addUfr(UfrDTO ufr) throws DataAddException,WebServiceDataBaseException,UfrAlreadyExistingForCodeException {
		int b=0;
		if(ufr!=null){
			try {
				b = this.ufrDomainService.addUfr(ufr);
			} catch (DataAddException e) {
				int error = ((SQLException)e.getCause()).getErrorCode();
				// cas  e.getMessage().contains("Duplicata du champ"), code erreur 1062 
				if (error == 1062) {
					throw new UfrAlreadyExistingForCodeException("Ufr deja existante pour code : "+ufr.getCode() );
				}
				throw e;
			}
		}		
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrFromId(java.lang.String, java.lang.String)
	 */
	public UfrDTO getUfrFromIdFromCodUniv(String code, String codeUniversite) {
		UfrDTO tmp=null;
		if(code!=null){
			tmp=this.ufrDomainService.getUfrFromId(code, codeUniversite);
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrsFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestionFromCodUniv(List<Integer> idsCentreGestion, String codeUniversite){
		List<UfrDTO> lu = null;
		if(idsCentreGestion!=null &&!idsCentreGestion.isEmpty()){
			lu=this.ufrDomainService.getUfrsFromIdsCentreGestion(idsCentreGestion, codeUniversite);
		}
		return lu;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrsFromIdsCentreGestion(java.util.List)
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion){
		return getUfrsFromIdsCentreGestionFromCodUniv(idsCentreGestion, null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrs()
	 */
	public List<UfrDTO> getUfrs(){
		return getUfrsFromCodUniv(null);
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUfrFromId(java.lang.String)
	 */
	public UfrDTO getUfrFromId(String code){
		return getUfrFromIdFromCodUniv(code, null);
	}

	/* ****************************************************************************
	 * UNITE DUREE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUnitesDurees()
	 */
	public List<UniteDureeDTO> getUnitesDurees(){
		return this.uniteDureeDomainService.getUnitesDurees();
	}

	/* ****************************************************************************
	 * UniteGratification
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getUniteGratifications()
	 */
	public List<UniteGratificationDTO> getUniteGratifications() {
		return this.uniteGratificationDomainService.getUniteGratifications();
	}

	/* ****************************************************************************
	 * OrigineStage
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getOrigineStages()
	 */
	public List<OrigineStageDTO> getOrigineStages() {
		return this.origineStageDomainService.getOrigineStages();
	}


	/* ****************************************************************************
	 * TicketStructure
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#addTicketStructure(org.esupportail.pstagedata.domain.dto.TicketStructureDTO)
	 */
	public int addTicketStructure(TicketStructureDTO ticketStructure)
			throws DataAddException, WebServiceDataBaseException {
		int b=0;
		if(ticketStructure!=null){
			b = this.ticketStructureDomainService.addTicketStructure(ticketStructure);
		}		
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#deleteTicketStructure(java.lang.String)
	 */
	public boolean deleteTicketStructure(String ticket)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		if(ticket != null){
			b = this.ticketStructureDomainService.deleteTicketStructure(ticket);
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTicketStructureValide(org.esupportail.pstagedata.domain.dto.TicketStructureDTO)
	 */
	public boolean getTicketStructureValide(TicketStructureDTO ticketStructure) {
		boolean b = false;
		if(ticketStructure != null){
			b = this.ticketStructureDomainService.getTicketStructureValide(ticketStructure);
		}
		return b;
	}

	/* ****************************************************************************
	 * GETTERS / SETTERS DOMAINS SERVICES
	 *****************************************************************************/

	/**
	 * @return the accordPartenariatDomainService
	 */
	public AccordPartenariatDomainService getAccordPartenariatDomainService() {
		return accordPartenariatDomainService;
	}

	/**
	 * @param accordPartenariatDomainService the accordPartenariatDomainService to set
	 */
	public void setAccordPartenariatDomainService(
			AccordPartenariatDomainService accordPartenariatDomainService) {
		this.accordPartenariatDomainService = accordPartenariatDomainService;
	}

	/**
	 * @return the adminStructureDomainService
	 */
	public AdminStructureDomainService getAdminStructureDomainService() {
		return adminStructureDomainService;
	}

	/**
	 * @param adminStructureDomainService the adminStructureDomainService to set
	 */
	public void setAdminStructureDomainService(
			AdminStructureDomainService adminStructureDomainService) {
		this.adminStructureDomainService = adminStructureDomainService;
	}

	/**
	 * @return the civiliteDomainService
	 */
	public CiviliteDomainService getCiviliteDomainService() {
		return civiliteDomainService;
	}

	/**
	 * @param civiliteDomainService the civiliteDomainService to set
	 */
	public void setCiviliteDomainService(CiviliteDomainService civiliteDomainService) {
		this.civiliteDomainService = civiliteDomainService;
	}

	/**
	 * @return the contactDomainService
	 */
	public ContactDomainService getContactDomainService() {
		return contactDomainService;
	}

	/**
	 * @param contactDomainService the contactDomainService to set
	 */
	public void setContactDomainService(ContactDomainService contactDomainService) {
		this.contactDomainService = contactDomainService;
	}

	/**
	 * @return the contratDomainService
	 */
	public ContratDomainService getContratDomainService() {
		return contratDomainService;
	}

	/**
	 * @param contratDomainService the contratDomainService to set
	 */
	public void setContratDomainService(ContratDomainService contratDomainService) {
		this.contratDomainService = contratDomainService;
	}

	/**
	 * @return the effectifDomainService
	 */
	public EffectifDomainService getEffectifDomainService() {
		return effectifDomainService;
	}

	/**
	 * @param effectifDomainService the effectifDomainService to set
	 */
	public void setEffectifDomainService(EffectifDomainService effectifDomainService) {
		this.effectifDomainService = effectifDomainService;
	}

	/**
	 * @return the fapN1DomainService
	 */
	public FapN1DomainService getFapN1DomainService() {
		return fapN1DomainService;
	}

	/**
	 * @param fapN1DomainService the fapN1DomainService to set
	 */
	public void setFapN1DomainService(FapN1DomainService fapN1DomainService) {
		this.fapN1DomainService = fapN1DomainService;
	}

	/**
	 * @return the fapN2DomainService
	 */
	public FapN2DomainService getFapN2DomainService() {
		return fapN2DomainService;
	}

	/**
	 * @param fapN2DomainService the fapN2DomainService to set
	 */
	public void setFapN2DomainService(FapN2DomainService fapN2DomainService) {
		this.fapN2DomainService = fapN2DomainService;
	}

	/**
	 * @return the fapN3DomainService
	 */
	public FapN3DomainService getFapN3DomainService() {
		return fapN3DomainService;
	}

	/**
	 * @param fapN3DomainService the fapN3DomainService to set
	 */
	public void setFapN3DomainService(FapN3DomainService fapN3DomainService) {
		this.fapN3DomainService = fapN3DomainService;
	}

	/**
	 * @return the fapQualificationSimplifieeDomainService
	 */
	public FapQualificationSimplifieeDomainService getFapQualificationSimplifieeDomainService() {
		return fapQualificationSimplifieeDomainService;
	}

	/**
	 * @param fapQualificationSimplifieeDomainService the fapQualificationSimplifieeDomainService to set
	 */
	public void setFapQualificationSimplifieeDomainService(
			FapQualificationSimplifieeDomainService fapQualificationSimplifieeDomainService) {
		this.fapQualificationSimplifieeDomainService = fapQualificationSimplifieeDomainService;
	}

	/**
	 * @return the fapQualificationDomainService
	 */
	public FapQualificationDomainService getFapQualificationDomainService() {
		return fapQualificationDomainService;
	}

	/**
	 * @param fapQualificationDomainService the fapQualificationDomainService to set
	 */
	public void setFapQualificationDomainService(
			FapQualificationDomainService fapQualificationDomainService) {
		this.fapQualificationDomainService = fapQualificationDomainService;
	}

	/**
	 * @return the modeCandidatureDomainService
	 */
	public ModeCandidatureDomainService getModeCandidatureDomainService() {
		return modeCandidatureDomainService;
	}

	/**
	 * @param modeCandidatureDomainService the modeCandidatureDomainService to set
	 */
	public void setModeCandidatureDomainService(
			ModeCandidatureDomainService modeCandidatureDomainService) {
		this.modeCandidatureDomainService = modeCandidatureDomainService;
	}

	/**
	 * @return the nafN1DomainService
	 */
	public NafN1DomainService getNafN1DomainService() {
		return nafN1DomainService;
	}

	/**
	 * @param nafN1DomainService the nafN1DomainService to set
	 */
	public void setNafN1DomainService(NafN1DomainService nafN1DomainService) {
		this.nafN1DomainService = nafN1DomainService;
	}

	/**
	 * @return the nafN5DomainService
	 */
	public NafN5DomainService getNafN5DomainService() {
		return nafN5DomainService;
	}

	/**
	 * @param nafN5DomainService the nafN5DomainService to set
	 */
	public void setNafN5DomainService(NafN5DomainService nafN5DomainService) {
		this.nafN5DomainService = nafN5DomainService;
	}

	/**
	 * @return the niveauFormationDomainService
	 */
	public NiveauFormationDomainService getNiveauFormationDomainService() {
		return niveauFormationDomainService;
	}

	/**
	 * @param niveauFormationDomainService the niveauFormationDomainService to set
	 */
	public void setNiveauFormationDomainService(
			NiveauFormationDomainService niveauFormationDomainService) {
		this.niveauFormationDomainService = niveauFormationDomainService;
	}

	/**
	 * @return the offreDomainService
	 */
	public OffreDomainService getOffreDomainService() {
		return offreDomainService;
	}

	/**
	 * @param offreDomainService the offreDomainService to set
	 */
	public void setOffreDomainService(OffreDomainService offreDomainService) {
		this.offreDomainService = offreDomainService;
	}

	/**
	 * @return the fichierDomainService
	 */
	public FichierDomainService getFichierDomainService() {
		return fichierDomainService;
	}

	/**
	 * @param fichierDomainService the fichierDomainService to set
	 */
	public void setFichierDomainService(
			FichierDomainService fichierDomainService) {
		this.fichierDomainService = fichierDomainService;
	}

	/**
	 * @return the offreModeCandidatureDomainService
	 */
	public OffreModeCandidatureDomainService getOffreModeCandidatureDomainService() {
		return offreModeCandidatureDomainService;
	}

	/**
	 * @param offreModeCandidatureDomainService the offreModeCandidatureDomainService to set
	 */
	public void setOffreModeCandidatureDomainService(
			OffreModeCandidatureDomainService offreModeCandidatureDomainService) {
		this.offreModeCandidatureDomainService = offreModeCandidatureDomainService;
	}

	/**
	 * @return the paysDomainService
	 */
	public PaysDomainService getPaysDomainService() {
		return paysDomainService;
	}

	/**
	 * @param paysDomainService the paysDomainService to set
	 */
	public void setPaysDomainService(PaysDomainService paysDomainService) {
		this.paysDomainService = paysDomainService;
	}

	/**
	 * @return the serviceDomainService
	 */
	public ServiceDomainService getServiceDomainService() {
		return serviceDomainService;
	}

	/**
	 * @param serviceDomainService the serviceDomainService to set
	 */
	public void setServiceDomainService(ServiceDomainService serviceDomainService) {
		this.serviceDomainService = serviceDomainService;
	}

	/**
	 * @return the statutJuridiqueDomainService
	 */
	public StatutJuridiqueDomainService getStatutJuridiqueDomainService() {
		return statutJuridiqueDomainService;
	}

	/**
	 * @param statutJuridiqueDomainService the statutJuridiqueDomainService to set
	 */
	public void setStatutJuridiqueDomainService(
			StatutJuridiqueDomainService statutJuridiqueDomainService) {
		this.statutJuridiqueDomainService = statutJuridiqueDomainService;
	}

	/**
	 * @return the structureDomainService
	 */
	public StructureDomainService getStructureDomainService() {
		return structureDomainService;
	}

	/**
	 * @param structureDomainService the structureDomainService to set
	 */
	public void setStructureDomainService(
			StructureDomainService structureDomainService) {
		this.structureDomainService = structureDomainService;
	}

	/**
	 * @return the tempsTravailDomainService
	 */
	public TempsTravailDomainService getTempsTravailDomainService() {
		return tempsTravailDomainService;
	}

	/**
	 * @param tempsTravailDomainService the tempsTravailDomainService to set
	 */
	public void setTempsTravailDomainService(
			TempsTravailDomainService tempsTravailDomainService) {
		this.tempsTravailDomainService = tempsTravailDomainService;
	}

	/**
	 * @return the typeOffreDomainService
	 */
	public TypeOffreDomainService getTypeOffreDomainService() {
		return typeOffreDomainService;
	}

	/**
	 * @param typeOffreDomainService the typeOffreDomainService to set
	 */
	public void setTypeOffreDomainService(
			TypeOffreDomainService typeOffreDomainService) {
		this.typeOffreDomainService = typeOffreDomainService;
	}

	/**
	 * @return the typeStructureDomainService
	 */
	public TypeStructureDomainService getTypeStructureDomainService() {
		return typeStructureDomainService;
	}

	/**
	 * @param typeStructureDomainService the typeStructureDomainService to set
	 */
	public void setTypeStructureDomainService(
			TypeStructureDomainService typeStructureDomainService) {
		this.typeStructureDomainService = typeStructureDomainService;
	}

	/**
	 * @return the uniteDureeDomainService
	 */
	public UniteDureeDomainService getUniteDureeDomainService() {
		return uniteDureeDomainService;
	}

	/**
	 * @param uniteDureeDomainService the uniteDureeDomainService to set
	 */
	public void setUniteDureeDomainService(
			UniteDureeDomainService uniteDureeDomainService) {
		this.uniteDureeDomainService = uniteDureeDomainService;
	}

	/**
	 * @return the affectationDomainService
	 */
	public AffectationDomainService getAffectationDomainService() {
		return affectationDomainService;
	}

	/**
	 * @param affectationDomainService the affectationDomainService to set
	 */
	public void setAffectationDomainService(
			AffectationDomainService affectationDomainService) {
		this.affectationDomainService = affectationDomainService;
	}

	/**
	 * @return the centreGestionDomainService
	 */
	public CentreGestionDomainService getCentreGestionDomainService() {
		return centreGestionDomainService;
	}

	/**
	 * @param centreGestionDomainService the centreGestionDomainService to set
	 */
	public void setCentreGestionDomainService(
			CentreGestionDomainService centreGestionDomainService) {
		this.centreGestionDomainService = centreGestionDomainService;
	}

	/**
	 * @return the centreGestionSuperviseurDomainService
	 */
	public CentreGestionSuperviseurDomainService getCentreGestionSuperviseurDomainService() {
		return centreGestionSuperviseurDomainService;
	}

	/**
	 * @param centreGestionSuperviseurDomainService the centreGestionSuperviseurDomainService to set
	 */
	public void setCentreGestionSuperviseurDomainService(
			CentreGestionSuperviseurDomainService centreGestionSuperviseurDomainService) {
		this.centreGestionSuperviseurDomainService = centreGestionSuperviseurDomainService;
	}

	/**
	 * @return the confidentialiteDomainService
	 */
	public ConfidentialiteDomainService getConfidentialiteDomainService() {
		return confidentialiteDomainService;
	}

	/**
	 * @param confidentialiteDomainService the confidentialiteDomainService to set
	 */
	public void setConfidentialiteDomainService(
			ConfidentialiteDomainService confidentialiteDomainService) {
		this.confidentialiteDomainService = confidentialiteDomainService;
	}

	/**
	 * @return the droitAdministrationDomainService
	 */
	public DroitAdministrationDomainService getDroitAdministrationDomainService() {
		return droitAdministrationDomainService;
	}

	/**
	 * @param droitAdministrationDomainService the droitAdministrationDomainService to set
	 */
	public void setDroitAdministrationDomainService(
			DroitAdministrationDomainService droitAdministrationDomainService) {
		this.droitAdministrationDomainService = droitAdministrationDomainService;
	}

	/**
	 * @return the niveauCentreDomainService
	 */
	public NiveauCentreDomainService getNiveauCentreDomainService() {
		return niveauCentreDomainService;
	}

	/**
	 * @param niveauCentreDomainService the niveauCentreDomainService to set
	 */
	public void setNiveauCentreDomainService(
			NiveauCentreDomainService niveauCentreDomainService) {
		this.niveauCentreDomainService = niveauCentreDomainService;
	}

	/**
	 * @return the offreDiffusionDomainService
	 */
	public OffreDiffusionDomainService getOffreDiffusionDomainService() {
		return offreDiffusionDomainService;
	}

	/**
	 * @param offreDiffusionDomainService the offreDiffusionDomainService to set
	 */
	public void setOffreDiffusionDomainService(
			OffreDiffusionDomainService offreDiffusionDomainService) {
		this.offreDiffusionDomainService = offreDiffusionDomainService;
	}

	/**
	 * @return the offreStatsDomaineManager
	 */
	public OffreStatsDomaineManager getOffreStatsDomaineManager() {
		return offreStatsDomaineManager;
	}

	/**
	 * @return the personnelCentreGestionDomainService
	 */
	public PersonnelCentreGestionDomainService getPersonnelCentreGestionDomainService() {
		return personnelCentreGestionDomainService;
	}

	/**
	 * @param personnelCentreGestionDomainService the personnelCentreGestionDomainService to set
	 */
	public void setPersonnelCentreGestionDomainService(
			PersonnelCentreGestionDomainService personnelCentreGestionDomainService) {
		this.personnelCentreGestionDomainService = personnelCentreGestionDomainService;
	}

	/**
	 * @return the assuranceDomainService
	 */
	public AssuranceDomainService getAssuranceDomainService() {
		return assuranceDomainService;
	}

	/**
	 * @param assuranceDomainService the assuranceDomainService to set
	 */
	public void setAssuranceDomainService(
			AssuranceDomainService assuranceDomainService) {
		this.assuranceDomainService = assuranceDomainService;
	}

	/**
	 * @return the caisseRegimeDomainService
	 */
	public CaisseRegimeDomainService getCaisseRegimeDomainService() {
		return caisseRegimeDomainService;
	}

	/**
	 * @param caisseRegimeDomainService the caisseRegimeDomainService to set
	 */
	public void setCaisseRegimeDomainService(
			CaisseRegimeDomainService caisseRegimeDomainService) {
		this.caisseRegimeDomainService = caisseRegimeDomainService;
	}

	/**
	 * @return the indemnisationDomainService
	 */
	public IndemnisationDomainService getIndemnisationDomainService() {
		return indemnisationDomainService;
	}

	/**
	 * @param indemnisationDomainService the indemnisationDomainService to set
	 */
	public void setIndemnisationDomainService(
			IndemnisationDomainService indemnisationDomainService) {
		this.indemnisationDomainService = indemnisationDomainService;
	}


	/**
	 * @return the langueConventionDomainService
	 */
	public LangueConventionDomainService getLangueConventionDomainService() {
		return langueConventionDomainService;
	}

	/**
	 * @param langueConventionDomainService the langueConventionDomainService to set
	 */
	public void setLangueConventionDomainService(
			LangueConventionDomainService langueConventionDomainService) {
		this.langueConventionDomainService = langueConventionDomainService;
	}



	/**
	 * @return the modeValidationStageDomainService
	 */
	public ModeValidationStageDomainService getModeValidationStageDomainService() {
		return modeValidationStageDomainService;
	}

	/**
	 * @param modeValidationStageDomainService the modeValidationStageDomainService to set
	 */
	public void setModeValidationStageDomainService(
			ModeValidationStageDomainService modeValidationStageDomainService) {
		this.modeValidationStageDomainService = modeValidationStageDomainService;
	}

	/**
	 * @return the modeVersGratificationDomainService
	 */
	public ModeVersGratificationDomainService getModeVersGratificationDomainService() {
		return modeVersGratificationDomainService;
	}

	/**
	 * @param modeVersGratificationDomainService the modeVersGratificationDomainService to set
	 */
	public void setModeVersGratificationDomainService(
			ModeVersGratificationDomainService modeVersGratificationDomainService) {
		this.modeVersGratificationDomainService = modeVersGratificationDomainService;
	}

	/**
	 * @return the natureTravailDomainService
	 */
	public NatureTravailDomainService getNatureTravailDomainService() {
		return natureTravailDomainService;
	}

	/**
	 * @param natureTravailDomainService the natureTravailDomainService to set
	 */
	public void setNatureTravailDomainService(
			NatureTravailDomainService natureTravailDomainService) {
		this.natureTravailDomainService = natureTravailDomainService;
	}

	/**
	 * @return the themeDomainService
	 */
	public ThemeDomainService getThemeDomainService() {
		return themeDomainService;
	}

	/**
	 * @param themeDomainService the themeDomainService to set
	 */
	public void setThemeDomainService(ThemeDomainService themeDomainService) {
		this.themeDomainService = themeDomainService;
	}

	/**
	 * @return the typeConventionDomainService
	 */
	public TypeConventionDomainService getTypeConventionDomainService() {
		return typeConventionDomainService;
	}

	/**
	 * @param typeConventionDomainService the typeConventionDomainService to set
	 */
	public void setTypeConventionDomainService(
			TypeConventionDomainService typeConventionDomainService) {
		this.typeConventionDomainService = typeConventionDomainService;
	}



	/**
	 * @return the uniteGratificationDomainService
	 */
	public UniteGratificationDomainService getUniteGratificationDomainService() {
		return uniteGratificationDomainService;
	}

	/**
	 * @param uniteGratificationDomainService the uniteGratificationDomainService to set
	 */
	public void setUniteGratificationDomainService(
			UniteGratificationDomainService uniteGratificationDomainService) {
		this.uniteGratificationDomainService = uniteGratificationDomainService;
	}


	/**
	 * @return the ufrDomainService
	 */
	public UfrDomainService getUfrDomainService() {
		return ufrDomainService;
	}

	/**
	 * @param ufrDomainService the ufrDomainService to set
	 */
	public void setUfrDomainService(UfrDomainService ufrDomainService) {
		this.ufrDomainService = ufrDomainService;
	}

	/**
	 * @return the etapeDomainService
	 */
	public EtapeDomainService getEtapeDomainService() {
		return etapeDomainService;
	}

	/**
	 * @param etapeDomainService the etapeDomainService to set
	 */
	public void setEtapeDomainService(EtapeDomainService etapeDomainService) {
		this.etapeDomainService = etapeDomainService;
	}

	/**
	 * @return the conventionDomainService
	 */
	public ConventionDomainService getConventionDomainService() {
		return conventionDomainService;
	}

	/**
	 * @param conventionDomainService the conventionDomainService to set
	 */
	public void setConventionDomainService(
			ConventionDomainService conventionDomainService) {
		this.conventionDomainService = conventionDomainService;
	}

	/**
	 * @return the etudiantDomainService
	 */
	public EtudiantDomainService getEtudiantDomainService() {
		return etudiantDomainService;
	}

	/**
	 * @param etudiantDomainService the etudiantDomainService to set
	 */
	public void setEtudiantDomainService(EtudiantDomainService etudiantDomainService) {
		this.etudiantDomainService = etudiantDomainService;
	}

	/**
	 * @return the enseignantDomainService
	 */
	public EnseignantDomainService getEnseignantDomainService() {
		return enseignantDomainService;
	}

	/**
	 * @param enseignantDomainService the enseignantDomainService to set
	 */
	public void setEnseignantDomainService(
			EnseignantDomainService enseignantDomainService) {
		this.enseignantDomainService = enseignantDomainService;
	}

	/**
	 * @return the critereGestionDomainService
	 */
	public CritereGestionDomainService getCritereGestionDomainService() {
		return critereGestionDomainService;
	}

	/**
	 * @param critereGestionDomainService the critereGestionDomainService to set
	 */
	public void setCritereGestionDomainService(
			CritereGestionDomainService critereGestionDomainService) {
		this.critereGestionDomainService = critereGestionDomainService;
	}


	/**
	 * @return the origineStageDomainService
	 */
	public OrigineStageDomainService getOrigineStageDomainService() {
		return origineStageDomainService;
	}

	/**
	 * @param origineStageDomainService the origineStageDomainService to set
	 */
	public void setOrigineStageDomainService(
			OrigineStageDomainService origineStageDomainService) {
		this.origineStageDomainService = origineStageDomainService;
	}

	/**
	 * @return the avenantDomainService
	 */
	public AvenantDomainService getAvenantDomainService() {
		return avenantDomainService;
	}

	/**
	 * @param avenantDomainService the avenantDomainService to set
	 */
	public void setAvenantDomainService(AvenantDomainService avenantDomainService) {
		this.avenantDomainService = avenantDomainService;
	}

	/**
	 * @return the ticketStructureDomainService
	 */
	public TicketStructureDomainService getTicketStructureDomainService() {
		return ticketStructureDomainService;
	}

	/**
	 * @param ticketStructureDomainService the ticketStructureDomainService to set
	 */
	public void setTicketStructureDomainService(
			TicketStructureDomainService ticketStructureDomainService) {
		this.ticketStructureDomainService = ticketStructureDomainService;
	}


	/* ********************************************************************************************************************************************
	 ***************************************************************** STATISTIQUES **************************************************************** 
	 ***********************************************************************************************************************************************/



	/**
	 * @param critereDomainService
	 */
	public void setCritereDomainService(CritereDomainService critereDomainService) {
		this.critereDomainService = critereDomainService;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getCriteresParCategorieEtParNiveau(java.lang.Integer, java.lang.Integer)
	 */
	public List<CritereDTO> getCriteresParCategorieEtParNiveau(Integer typeCategorie,Integer niveau){
		List<CritereDTO> criteresParCategorieEtParNiveau = this.critereDomainService.getCriteresParCategorieEtParNiveau(typeCategorie, niveau);
		return criteresParCategorieEtParNiveau;
	}

	/**
	 * @param offreStatsDomaineManager the offreStatsDomaineManager to set
	 */
	public void setOffreStatsDomaineManager(
			OffreStatsDomaineManager offreStatsDomaineManager) {
		this.offreStatsDomaineManager = offreStatsDomaineManager;
	}







	/**
	 * @param conventionStatsDomaineManager
	 */
	//Partie statistiques sur les conventions

	public void setConventionStatsDomaineManager(
			ConventionStatsDomaineManager conventionStatsDomaineManager) {
		this.conventionStatsDomaineManager = conventionStatsDomaineManager;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getAnneesConventions(java.lang.Integer, java.lang.String)
	 */
	public List<String> getAnneesConventions(Integer idCentreGestion, String type)throws RemoteException{
		List<String> anneees =null;
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(type);

		try {
			anneees = cStatsDomaineService.getYears(idCentreGestion);
		} catch (StatsDomaineException statsEx) {	
			throw new RemoteException(statsEchecMsg(""), statsEx);
		}

		return anneees;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventions(java.lang.Integer, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventions(Integer idCentreGestion, String etab)throws RemoteException{

		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventions(idCentreGestion);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg(""), statsExc);
		}
		return totalCvts;
	}
	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParType(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParType(Integer idCentreGestion, String annee, String etab)throws RemoteException{

		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByType(idCentreGestion, annee);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg(" par type "), statsExc);
		}
		return totalCvts;
	}

	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParTheme(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParTheme(Integer idCentreGestion, String annee, String etab)throws RemoteException{

		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByTheme(idCentreGestion, annee);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg(" par theme "), statsExc);
		}
		return totalCvts;
	}

	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParIndemnite(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParIndemnite(Integer idCentreGestion, String annee,String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByIndemnity(idCentreGestion, annee);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("indemnit&#233"), statsExc);
		}
		return totalCvts;
	}

	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParTpsDeTravail(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParTpsDeTravail(Integer idCentreGestion, String annee,String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByWorkDuration(idCentreGestion, annee);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("temps de travail"), statsExc);
		}
		return totalCvts;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParJourSemaine(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParJourSemaine(Integer idCentreGestion, String annee, String etab)  throws RemoteException {
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByNbDaysPerWeek(idCentreGestion, annee);
		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("nbre de jours"), statsExc);
		}
		return totalCvts;
	}

	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParOrigineStage(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParOrigineStage(Integer idCentreGestion, String annee,String etab) throws RemoteException {
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByWayToFind(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("origine du stage"), statsExc);
		}
		return totalCvts;
	}

	//
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParEnseignantTuteur(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParEnseignantTuteur(Integer idCentreGestion, String annee, String etab) throws RemoteException {
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByTeacherGuide(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("enseignant"), statsExc);
		}
		return totalCvts;
	}

	/**
	 * @param msg
	 * @return
	 */
	private String statsEchecMsg(String msg){
		StringBuilder sb = new StringBuilder("Probl&#232;me d'acces distant:  ");
		if(StringUtils.hasText(msg)){
			sb.append(" Recherche  nombre  de conventions par ");
			sb.append(msg);
		}
		else {
			sb.append("Recherche  nombre  de conventions");
		}
		sb.append(" : ECHEC !!! ");
		return sb.toString();
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParStructure(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParStructure(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStructure(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("structure"), statsExc);
		}
		return totalCvts;

	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParStructureType(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParStructureActivite(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStructureActivity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("structure activite"), statsExc);
		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParStructureType(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParStructureType(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStructureType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("structure type"), statsExc);
		}
		return totalCvts;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParTailleStructure(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParTailleStructure(Integer idCentreGestion, String annee, String etab)throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStructureSize(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("taille de la structure"), statsExc);
		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParDepLieuStage(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParDepLieuStage(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByServiceDep(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("taille de la structure"), statsExc);
		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getTotalConventionsParPaysDuService(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getTotalConventionsParPaysDuService(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByServiceCountry(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("pays de la structure"), statsExc);

		}
		return totalCvts;
	}

	/*** UFR ***/

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudy(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudy(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudy(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("par filiere"), statsExc);

		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndType(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et &#233;tape d'&#233;tude "), statsExc);

		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndIndemnity(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndIndemnity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et &#233;tape d'&#233;tude et indemnit&#233; "), statsExc);

		}
		return totalCvts;
	}


	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndNbDaysPerWeek(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndNbDaysPerWeek(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et nb de jours hebdo "), statsExc);

		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndWayToFind(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWayToFind(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndWayToFind(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et lieu de stage"), statsExc);

		}
		return totalCvts;
	}

	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndTeacherGuide(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndTeacherGuide(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et enseignant tuteur"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWorkDuration(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndWorkDuration(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et duree de travail"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndStructure(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et Structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndActivity(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndActivity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et activite de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndStructureType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et type de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndStructureSize(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et taille de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndServiceDep(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et departement du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndServiceCountry(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et pays du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndTheme(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("filiere et theme"), statsExc);

		}
		return totalCvts;
	}


	/*** DEPARTEMENT ***/

	public List<StatisticItemDTO> getNumberOfConventionsByDepartment(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartment(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("par departement"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et type "), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndActivity(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndActivity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et activite de la structure "), statsExc);

		}
		return totalCvts;
	}


	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndIndemnity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et indemnite "), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWorkDuration(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndWorkDuration(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et duree de travail"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndNbDaysPerWeek(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et nb de jours hebod travailles"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWayToFind(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndWayToFind(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et origine du stage"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndTeacherGuide(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et ensignant-tuteur"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndStructure(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndStructureType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et type de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndStructureSize(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et taille de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndServiceDep(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et departement du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndServiceCountry(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et pays du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndTheme(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("departement et theme"), statsExc);

		}
		return totalCvts;
	}

	/*** ETAPE ***/

	public List<StatisticItemDTO> getNumberOfConventionsByStep(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStep(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("par etape"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et type "), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndActivity(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndActivity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et activite de la structure "), statsExc);

		}
		return totalCvts;
	}


	public List<StatisticItemDTO> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndIndemnity(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et indemnite "), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWorkDuration(Integer idCentreGestion, String annee, String etab)  throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndWorkDuration(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et duree de travail"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndNbDaysPerWeek(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et nb de jours hebod travailles"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWayToFind(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndWayToFind(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et origine du stage"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndTeacherGuide(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et ensignant-tuteur"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndStructure(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndStructureType(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et type de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndStructureSize(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et taille de la structure"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndServiceDep(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et etape du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndServiceCountry(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et pays du service"), statsExc);

		}
		return totalCvts;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndTheme(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et theme"), statsExc);

		}
		return totalCvts;
	}

	/*** OFFRES ***/

	public List<String> getAnneesOffres(Integer idCenter, String etatoffre) throws RemoteException {	
		List<String> offerYears =null;
		OffreStatsDomaineService offreStatsDomaineService = this.offreStatsDomaineManager.create(etatoffre);

		try {
			offerYears = offreStatsDomaineService.getOfferYears(idCenter);
		} catch (StatsDomaineException statsEx) {	
			throw new RemoteException(" Probleme d'acces distant, impossible de recuperer les annees existant dans les offres ", statsEx);
		}

		return offerYears;
	}


	public List<String> getAnneesUnivOffres() {
		return this.offreDomainService.getAnneesUnivOffres();
	}


	public List<StatisticItemDTO> getNumberOfOffers(Integer idCenter,
			String etatOffre) throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> numberOfOffers =null;
		try {
			numberOfOffers = offreStatsDS.getNumberOfOffers(idCenter);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant, recherche de la quantite d'offres a echoue : ", statsEx);
		}
		return numberOfOffers;
	}

	public List<StatisticItemDTO> getNumberOfOffersByActivity(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {
		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> numberOfOffers =null;
		try {
			numberOfOffers = offreStatsDS.getNumberOfOffersByActivity(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant, impossible de recup&#232;rer le total des offres par cctivite ", statsEx);
		}

		return numberOfOffers;
	}

	public List<StatisticItemDTO>  getNumberOfOffersByType(Integer idCentreDeGestion, String annee,String etatOffre, boolean validation, boolean publication) throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> numberOfOffers =null;
		try {
			numberOfOffers = offreStatsDS.getNumberOfOffersByType(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant, impossible de recup&#232;rer le total des offres par type  ", statsEx);
		}

		return numberOfOffers;
	}

	public List<StatisticItemDTO> getNumberOfOffersByStructure(Integer idCentreDeGestion, String annee,String etatOffre, boolean validation, boolean publication) throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> numberOfOffers =null;
		try {
			numberOfOffers = offreStatsDS.getNumberOfOffersByStructure(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant, impossible de recup&#232;rer le total des offres par structure ", statsEx);
		}

		return numberOfOffers;
	}


	public List<StatisticItemDTO> getNumberOfOffersByStructureType(Integer idCentreDeGestion, String annee ,String etatOffre, boolean validation, boolean publication) throws RemoteException{
		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByStructureType(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant : impossible de recup&#232;rer le total des offres par statut juridique de la structure ", statsEx);
		}
		return nbOffresParStType;
	}


	public List<StatisticItemDTO> getNumberOfOffersByStructureSize(Integer idCentreDeGestion, String annee,String etatOffre, boolean validation, boolean publication) throws RemoteException{

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByStructureSize(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant, impossible de recup&#232;rer le total des offres par taille de la structure ", statsEx);
		}

		return nbOffresParStType;

	}


	public List<StatisticItemDTO> getNumberOfOffersByStructureDep(Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication) throws RemoteException{

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByStructureDep(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  des offres par departement de l'etablissement  impossible ", statsEx);
		}

		return nbOffresParStType;
	}


	public List<StatisticItemDTO> getNumberOfOffersByStructureCountry(Integer idCentreDeGestion, String annee,String etatOffre, boolean validation, boolean publication) throws RemoteException{


		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByStructureCountry(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par pays  impossible ", statsEx);
		}

		return nbOffresParStType;


	}


	public List<StatisticItemDTO> getNumberOfOffersByFormation(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByFormation(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par niveau de formation  impossible ", statsEx);
		}

		return nbOffresParStType;
	}



	public List<StatisticItemDTO> getNumberOfOffersByFunction(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByFunction(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par fonction  impossible ", statsEx);
		}

		return nbOffresParStType;
	}


	public List<StatisticItemDTO> getNumberOfOffersByValidation(
			Integer idCentreDeGestion, String annee, String etatOffre)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByValidation(idCentreDeGestion, annee);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par validation  impossible ", statsEx);
		}

		return nbOffresParStType;
	}

	public List<StatisticItemDTO> getNumberOfOffersByPublication(
			Integer idCentreDeGestion, String annee, String etatOffre)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByPublication(idCentreDeGestion, annee);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par publication  impossible ", statsEx);
		}

		return nbOffresParStType;
	}

	public List<StatisticItemDTO> getNumberOfOffersByCandidateFound(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByCandidateFound(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par candidat  impossible ", statsEx);
		}

		return nbOffresParStType;
	}

	public List<StatisticItemDTO> getNumberOfOffersByLocalStudent(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByLocalStudent(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par �tudiant  impossible ", statsEx);
		}

		return nbOffresParStType;
	}

	public List<StatisticItemDTO> getNumberOfOffersByLevel(
			Integer idCentreDeGestion, String annee, String etatOffre, boolean validation, boolean publication)
					throws RemoteException {

		OffreStatsDomaineService offreStatsDS= this.offreStatsDomaineManager.create(etatOffre);
		List<StatisticItemDTO> nbOffresParStType =null;
		try {
			nbOffresParStType = offreStatsDS.getNumberOfOffersByLevel(idCentreDeGestion, annee, validation, publication);
		} catch (StatsDomaineException statsEx) {
			throw new RemoteException(" Probl&#232;me d'acces distant. Recherche  du nombre  d'offres par niveau  impossible ", statsEx);
		}

		return nbOffresParStType;
	}


	/**
	 * @return the dureeDiffusionDomainService
	 */
	public DureeDiffusionDomainService getDureeDiffusionDomainService() {
		return dureeDiffusionDomainService;
	}

	/**
	 * @param dureeDiffusionDomainService the dureeDiffusionDomainService to set
	 */
	public void setDureeDiffusionDomainService(
			DureeDiffusionDomainService dureeDiffusionDomainService) {
		this.dureeDiffusionDomainService = dureeDiffusionDomainService;
	}


	/*Ajout duree*/
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByNbWeeks(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByNbWeeks(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByNbWeeks(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("nb weeks "), statsExc);

		}
		return totalCvts;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStudyAndNbWeeks(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbWeeks(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStudyAndNbWeeks(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("study et nb weeks "), statsExc);

		}
		return totalCvts;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByDepartmentAndNbWeeks(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbWeeks(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByDepartmentAndNbWeeks(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("department et nb weeks "), statsExc);

		}
		return totalCvts;
	}
	/**
	 * @see org.esupportail.pstagedata.remote.RemoteServices#getNumberOfConventionsByStepAndNbWeeks(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbWeeks(Integer idCentreGestion, String annee, String etab)  throws RemoteException
	{
		ConventionStatsDomaineService cStatsDomaineService = this.conventionStatsDomaineManager.creer(etab);
		List<StatisticItemDTO> totalCvts =null;
		try {
			totalCvts = cStatsDomaineService.getNumberOfConventionsByStepAndNbWeeks(idCentreGestion, annee);

		} catch (StatsDomaineException statsExc) {
			throw new RemoteException(statsEchecMsg("etape et nb weeks "), statsExc);
		}
		return totalCvts;
	}

	/***********************************/
	/*** AJOUTS/UPDATES/SUPPRESSIONS ***/
	/***********************************/
	@Override
	public int addCaisseRegime(CaisseRegimeDTO cr) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(cr!=null){
			b = this.caisseRegimeDomainService.addCaisseRegime(cr);
		}
		return b;
	}

	@Override
	public boolean updateCaisseRegime(CaisseRegimeDTO cr, String codeCaisse)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(cr!=null){
			b = this.caisseRegimeDomainService.updateCaisseRegime(cr, codeCaisse);
		}
		return b;
	}

	@Override
	public boolean deleteCaisseRegime(String codeCaisse)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b=false;
		if(codeCaisse!=null){
			b = this.caisseRegimeDomainService.deleteCaisseRegime(codeCaisse);
		}
		return b;
	}

	@Override
	public int addNiveauFormation(NiveauFormationDTO nf)
			throws DataAddException, WebServiceDataBaseException {
		int b=0;
		if(nf!=null){
			b = this.niveauFormationDomainService.addNiveauFormation(nf);
		}
		return b;
	}

	@Override
	public boolean updateNiveauFormation(NiveauFormationDTO nf)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(nf!=null){
			b = this.niveauFormationDomainService.updateNiveauFormation(nf);
		}
		return b;
	}

	@Override
	public boolean deleteNiveauFormation(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.niveauFormationDomainService.deleteNiveauFormation(id);
		}
		return b;
	}

	@Override
	public int addEffectif(EffectifDTO ef) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(ef!=null){
			b = this.effectifDomainService.addEffectif(ef);
		}
		return b;
	}

	@Override
	public boolean updateEffectif(EffectifDTO ef) throws DataUpdateException,
	WebServiceDataBaseException {
		boolean b=false;
		if(ef!=null){
			b = this.effectifDomainService.updateEffectif(ef);
		}
		return b;
	}

	@Override
	public boolean deleteEffectif(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.effectifDomainService.deleteEffectif(id);
		}
		return b;
	}

	@Override
	public int addTempsTravail(TempsTravailDTO tt) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(tt!=null){
			b = this.tempsTravailDomainService.addTempsTravail(tt);
		}
		return b;
	}

	@Override
	public boolean updateTempsTravail(TempsTravailDTO tt)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(tt!=null){
			b = this.tempsTravailDomainService.updateTempsTravail(tt);
		}
		return b;
	}

	@Override
	public boolean deleteTempsTravail(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.tempsTravailDomainService.deleteTempsTravail(id);
		}
		return b;
	}

	@Override
	public int addOrigineStage(OrigineStageDTO os) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(os!=null){
			b = origineStageDomainService.addOrigineStage(os);
		}
		return b;
	}

	@Override
	public boolean updateOrigineStage(OrigineStageDTO os)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(os!=null){
			b = this.origineStageDomainService.updateOrigineStage(os);
		}
		return b;
	}

	@Override
	public boolean deleteOrigineStage(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.origineStageDomainService.deleteOrigineStage(id);
		}
		return b;
	}

	@Override
	public int addTypeConvention(TypeConventionDTO tc) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(tc!=null){
			b = this.typeConventionDomainService.addTypeConvention(tc);
		}
		return b;
	}

	@Override
	public boolean updateTypeConvention(TypeConventionDTO tc)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(tc!=null){
			b = this.typeConventionDomainService.updateTypeConvention(tc);
		}
		return b;
	}

	@Override
	public boolean deleteTypeConvention(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.typeConventionDomainService.deleteTypeConvention(id);
		}
		return b;
	}

	@Override
	public int addTypeStructure(TypeStructureDTO ts) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(ts!=null){
			b = this.typeStructureDomainService.addTypeStructure(ts);
		}
		return b;
	}

	@Override
	public boolean updateTypeStructure(TypeStructureDTO ts)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(ts!=null){
			b = this.typeStructureDomainService.updateTypeStructure(ts);
		}
		return b;
	}

	@Override
	public boolean deleteTypeStructure(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.typeStructureDomainService.deleteTypeStructure(id);
		}
		return b;
	}

	@Override
	public int addStatutJuridique(StatutJuridiqueDTO sj)
			throws DataAddException, WebServiceDataBaseException {
		int b=0;
		if(sj!=null){
			b = this.statutJuridiqueDomainService.addStatutJuridique(sj);
		}
		return b;
	}

	@Override
	public boolean updateStatutJuridique(StatutJuridiqueDTO sj)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(sj!=null){
			b = this.statutJuridiqueDomainService.updateStatutJuridique(sj);
		}
		return b;
	}

	@Override
	public boolean deleteStatutJuridique(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.statutJuridiqueDomainService.deleteStatutJuridique(id);
		}
		return b;
	}

	@Override
	public int addTypeOffre(TypeOffreDTO to) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(to!=null){
			b = this.typeOffreDomainService.addTypeOffre(to);
		}
		return b;
	}

	@Override
	public boolean updateTypeOffre(TypeOffreDTO to) throws DataUpdateException,
	WebServiceDataBaseException {
		boolean b=false;
		if(to!=null){
			b = this.typeOffreDomainService.updateTypeOffre(to);
		}
		return b;
	}

	@Override
	public boolean deleteTypeOffre(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.typeOffreDomainService.deleteTypeOffre(id);
		}
		return b;
	}

	@Override
	public int addContratOffre(ContratOffreDTO co) throws DataAddException,
	WebServiceDataBaseException {
		int b=0;
		if(co!=null){
			b = this.contratDomainService.addContratOffre(co);
		}
		return b;
	}

	@Override
	public boolean updateContratOffre(ContratOffreDTO co)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(co!=null){
			b = this.contratDomainService.updateContratOffre(co);
		}
		return b;
	}

	@Override
	public boolean deleteContratOffre(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.contratDomainService.deleteContratOffre(id);
		}
		return b;
	}

	@Override
	public int addModeValidationStage(ModeValidationStageDTO mv)
			throws DataAddException, WebServiceDataBaseException {
		int b=0;
		if(mv!=null){
			b = this.modeValidationStageDomainService.addModeValidationStage(mv);
		}
		return b;
	}

	@Override
	public boolean updateModeValidationStage(ModeValidationStageDTO mv)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b=false;
		if(mv!=null){
			b = this.modeValidationStageDomainService.updateModeValidationStage(mv);
		}
		return b;
	}

	@Override
	public boolean deleteModeValidationStage(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b=false;
		if(id>0){
			b = this.modeValidationStageDomainService.deleteModeValidationStage(id);
		}
		return b;
	}


	/**
	 * @return the ficheEvaluationDomainService
	 */
	public FicheEvaluationDomainService getFicheEvaluationDomainService() {
		return ficheEvaluationDomainService;
	}


	/**
	 * @param ficheEvaluationDomainService the ficheEvaluationDomainService to set
	 */
	public void setFicheEvaluationDomainService(
			FicheEvaluationDomainService ficheEvaluationDomainService) {
		this.ficheEvaluationDomainService = ficheEvaluationDomainService;
	}

}

