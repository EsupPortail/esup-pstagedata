package org.esupportail.pstagedata.remote;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
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
import org.esupportail.pstagedata.exceptions.StructureDeleteException;
import org.esupportail.pstagedata.exceptions.StructureNumSiretException;
import org.esupportail.pstagedata.exceptions.UfrAlreadyExistingForCodeException;
import org.esupportail.pstagedata.exceptions.UnvalidNumSiretException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
@WebService
public interface RemoteServices extends Serializable{

	/* ****************************************************************************
	 * Fiche Evaluation
	 *****************************************************************************/
	/**
	 * @return List<FicheEvaluationDTO>
	 */
	public FicheEvaluationDTO getFicheEvaluationFromIdCentre(int idCentreGestion);

	/**
	 * @param fe
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addFicheEvaluation(FicheEvaluationDTO fe) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateFicheEvaluationEtudiant(FicheEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateFicheEvaluationEntreprise(FicheEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateFicheEvaluationEnseignant(FicheEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idFicheEvaluation
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteFicheEvaluation(int idFicheEvaluation) throws DataDeleteException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * REPONSE EVALUATION
	 *****************************************************************************/
	/**
	 * @return ReponseEvaluationDTO
	 */
	public ReponseEvaluationDTO getReponseEvaluation(int idFicheEvaluation, int idConvention);
	/**
	 * @return List<ReponseEvaluationDTO>
	 */
	public List<ReponseEvaluationDTO> getReponsesEvaluation(int idFicheEvaluation);
	/**
	 * @param fe
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addReponseEvaluation(ReponseEvaluationDTO fe) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateReponseEvaluationEtudiant(ReponseEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateReponseEvaluationEntreprise(ReponseEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param fe
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateReponseEvaluationEnseignant(ReponseEvaluationDTO fe) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idFicheEvaluation
	 * @param idConvention
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteReponseEvaluation(int idFicheEvaluation, int idConvention) throws DataDeleteException, WebServiceDataBaseException;

	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEtudiant(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEnseignant(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEntreprise(int idFicheEvaluation, int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEtudiant(int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEnseignant(int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEntreprise(int idConvention) throws DataUpdateException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * QUESTION SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @return List<QuestionSupplementaireDTO>
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementaires(int idFicheEvaluation);
	/**
	 * @return List<QuestionSupplementaireDTO>
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement);
	/**
	 * @param qs
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param qs
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idQuestionSupplementaire
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * REPONSE SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @return ReponseSupplementaireDTO
	 */
	public ReponseSupplementaireDTO getReponseSupplementaire(int idQuestionSupplementaire, int idConvention);
	/**
	 * @param rs
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addReponseSupplementaire(ReponseSupplementaireDTO rs) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param lr
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addReponsesSupplementaires(List<ReponseSupplementaireDTO> lr) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param rs
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaireDTO rs) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param lr
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateReponsesSupplementaires(List<ReponseSupplementaireDTO> lr) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idQuestionSupplementaire
	 * @param idConvention
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire, int idConvention) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * NOMENCLATURES
	 *****************************************************************************/
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCaisseRegime(CaisseRegimeDTO cr) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCaisseRegime(CaisseRegimeDTO cr, String codeCaisse) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteCaisseRegime(String codeCaisse) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addNiveauFormation(NiveauFormationDTO nf) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateNiveauFormation(NiveauFormationDTO nf) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteNiveauFormation(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addEffectif(EffectifDTO ef) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateEffectif(EffectifDTO ef) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteEffectif(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTempsTravail(TempsTravailDTO tt) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTempsTravail(TempsTravailDTO tt) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTempsTravail(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOrigineStage(OrigineStageDTO os) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateOrigineStage(OrigineStageDTO os) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteOrigineStage(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeConvention(TypeConventionDTO tc) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeConvention(TypeConventionDTO tc) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeConvention(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeStructure(TypeStructureDTO ts) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeStructure(TypeStructureDTO ts) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeStructure(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addStatutJuridique(StatutJuridiqueDTO sj) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStatutJuridique(StatutJuridiqueDTO sj) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteStatutJuridique(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeOffre(TypeOffreDTO to) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeOffre(TypeOffreDTO to) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeOffre(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addContratOffre(ContratOffreDTO co) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContratOffre(ContratOffreDTO co) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteContratOffre(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addModeValidationStage(ModeValidationStageDTO mv) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateModeValidationStage(ModeValidationStageDTO mv) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteModeValidationStage(int id) throws DataDeleteException,WebServiceDataBaseException;

	/* ****************************************************************************
	 * ACCORD PARTENARIAT
	 *****************************************************************************/
	/**
	 * @return List<AccordPartenariatDTO>
	 */
	public List<AccordPartenariatDTO> getAccordsNonValides();
	/**
	 * @param id 
	 * @return AccordPartenariatDTO
	 */
	public AccordPartenariatDTO getAccordFromId(int id);
	/**
	 * @param idStructure 
	 * @return AccordPartenariatDTO
	 */
	public AccordPartenariatDTO getAccordFromIdStructure(int idStructure);
	/**
	 * @param idContact 
	 * @return AccordPartenariatDTO
	 */
	public AccordPartenariatDTO getAccordFromIdContact(int idContact);
	/**
	 * @return int
	 */
	public int countAccordAValider();
	/**
	 * @param accord
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 * @throws AccordAlreadyExistingForContactException 
	 * @throws AccordAlreadyExistingForStructureException 
	 */
	public int addAccord(AccordPartenariatDTO accord) throws DataAddException, WebServiceDataBaseException, AccordAlreadyExistingForContactException, AccordAlreadyExistingForStructureException;
	/**
	 * @param accord
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 * @throws AccordAlreadyExistingForContactException 
	 * @throws AccordAlreadyExistingForStructureException 
	 */
	public boolean updateAccord(AccordPartenariatDTO accord) throws DataUpdateException, WebServiceDataBaseException, AccordAlreadyExistingForContactException, AccordAlreadyExistingForStructureException;
	/**
	 * @param idAccord
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * ADMIN STRUCTURE
	 *****************************************************************************/
	/**
	 * @return List<AdminStructureDTO>
	 */
	public List<AdminStructureDTO> getAdminsStructure();
	/**
	 * @param login 
	 * @return AdminStructureDTO
	 */
	public AdminStructureDTO getAdminStructureFromLogin(String login);
	/**
	 * @param eppn 
	 * @return AdminStructureDTO
	 */
	public AdminStructureDTO getAdminStructureFromEppn(String eppn);
	/**
	 * @param admin 
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 * @throws AdminStructureLoginEppnAlreadyUsedException 
	 * @throws AdminStructureAccountException 
	 */
	public int addAdminStructure(AdminStructureDTO admin) throws DataAddException, WebServiceDataBaseException, AdminStructureLoginEppnAlreadyUsedException, AdminStructureAccountException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 * @throws AdminStructureLoginEppnAlreadyUsedException 
	 * @throws AdminStructureAccountException 
	 */
	public boolean updateAdminStructure(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException, AdminStructureLoginEppnAlreadyUsedException, AdminStructureAccountException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idAdminStructure 
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * AFFECTATION
	 *****************************************************************************/
	/**
	 * @param codeUniversite 
	 * @return List<AffectationDTO>
	 */
	public List<AffectationDTO> getAffectationFromCodUniv(String codeUniversite);
	/**
	 * @param codeAffectation
	 * @param codeUniversite 
	 * @return AffectationDTO
	 */
	public AffectationDTO getAffectationFromCodeAffectationCodUniv(String codeAffectation, String codeUniversite);

	/**
	 * @return List<Affectation>
	 */
	public List<AffectationDTO> getAffectation();
	/**
	 * @param codeAffectation
	 * @return Affectation
	 */
	public AffectationDTO getAffectationFromCodeAffectation(String codeAffectation);
	/**
	 * @return int
	 */
	public int getNombreAffectation();
	/**
	 * @param a
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException
	 * @throws AffectationAlreadyExistingForCodeException 
	 */
	public int addAffectation(AffectationDTO a) throws DataAddException, WebServiceDataBaseException, AffectationAlreadyExistingForCodeException;

	/* ****************************************************************************
	 * AVENANT
	 *****************************************************************************/
	/**
	 * @return List<AvenantDTO>
	 */
	public List<AvenantDTO> getAvenant(int idConvention);
	/**
	 * @return int
	 */
	public int getNombreAvenant(int idConvention);
	/**
	 * @param cg
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addAvenant(AvenantDTO a) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param cg
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAvenant(AvenantDTO a) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @param idAvenant
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteAvenant(int idAvenant) throws DataDeleteException,WebServiceDataBaseException;
	/* ****************************************************************************
	 * CENTRE GESTION
	 *****************************************************************************/
	/**
	 * @param codeUniversite
	 * @return List<CentreGestion>
	 */
	public List<CentreGestionDTO> getCentreGestionList(String codeUniversite);
	/**
	 * @param idCentreGestion
	 * @return CentreGestionDTO
	 */
	public CentreGestionDTO getCentreGestion(int idCentreGestion);
	/**
	 * @param nomCentre 
	 * @param codeUniversite
	 * @return CentreGestionDTO
	 */
	public CentreGestionDTO getCentreGestionFromNomCentre(String nomCentre, String codeUniversite);
	/**
	 * @param codeUniversite
	 * @return int
	 */
	public int getNombreCentreGestion(String codeUniversite);

	/**
	 * Recupere les centres de gestion correspondant a l'uid ldap d'un personnel
	 * ayant les droits en ecriture ou en admin pour ces centres
	 * 
	 * @param uidPersonnel
	 * @param codeUniversite 
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentreDroitEcritureFromCodUniv(String uidPersonnel, String codeUniversite);
	/**
	 * Recupere les centres de gestion correspondant a l'uid ldap d'un personnel
	 * ayant des droits pour ces centres
	 * 
	 * @param uidPersonnel
	 * @param codeUniversite 
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentreFromUidFromCodUniv(String uidPersonnel, String codeUniversite);
	/**
	 * Recupere les centres de gestion correspondant a l'uid ldap d'un personnel
	 * ayant les droits en ecriture ou en admin pour ces centres
	 * 
	 * @param uidPersonnel
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentreDroitEcriture(String uidPersonnel);
	/**
	 * Recupere les centres de gestion correspondant a l'uid ldap d'un personnel
	 * ayant des droits pour ces centres
	 * 
	 * @param uidPersonnel
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentreFromUid(String uidPersonnel);

	/**
	 * @return CentreGestionDTO
	 */
	public CentreGestionDTO getCentreEntreprise();

	/**
	 * @param codeUniversite 
	 * @return CentreGestionDTO
	 */
	public CentreGestionDTO getCentreEtablissement(String codeUniversite);

	/**
	 * @param codeUniversite 
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentresEtablissementFromCodUniv(String codeUniversite);
	/**
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionDTO> getCentresEtablissement();

	/**
	 * @param cg
	 * @return int : l'id du centre ajout�
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 * @throws CentreEtablissementDejaExistantException
	 * @throws CentreEntrepriseDejaExistantException
	 */
	public int addCentreGestion(CentreGestionDTO cg) throws DataAddException, WebServiceDataBaseException,CentreEtablissementDejaExistantException,CentreEntrepriseDejaExistantException;
	/**
	 * @param cg
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 * @throws CentreEtablissementDejaExistantException
	 * @throws CentreEntrepriseDejaExistantException
	 */
	public boolean updateCentreGestion(CentreGestionDTO cg) throws DataUpdateException,WebServiceDataBaseException,CentreEtablissementDejaExistantException,CentreEntrepriseDejaExistantException;
	/**
	 * @param idCentreGestion, idFichier
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateIdFichier(int idCentreGestion, int idFichier) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @param idCentreGestion
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean setIdFichierNull(int idCentreGestion) throws DataUpdateException,WebServiceDataBaseException;

	/**
	 * @param idCentreGestion
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 * @throws CentreReferenceException
	 */
	public boolean deleteCentreGestion(int idCentreGestion) throws DataDeleteException,WebServiceDataBaseException,CentreReferenceException;

	/* ****************************************************************************
	 * CENTRE GESTION SUPERVISEUR
	 *****************************************************************************/
	/**
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionSuperviseurDTO> getCentreGestionSuperviseur();
	/**
	 * @param cg
	 * @return int : l'id du centre ajout�
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseurDTO cg) throws DataAddException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * CIVILITE
	 *****************************************************************************/
	/**
	 * @return List<CiviliteDTO>
	 */
	public List<CiviliteDTO> getCivilites();

	/* ****************************************************************************
	 * CONFIDENTIALITE
	 *****************************************************************************/
	/**
	 * @return List<ConfidentialiteDTO>
	 */
	public List<ConfidentialiteDTO> getConfidentialite();

	/* ****************************************************************************
	 * CONTACT
	 *****************************************************************************/

	/**
	 * @param idService
	 * @param idsCentresGestion
	 * @param codeUniversite
	 * @return List<ContactDTO>
	 */
	public List<ContactDTO> getContactsFromIdService(int idService, List<Integer> idsCentresGestion, String codeUniversite);
	/**
	 * @param id
	 * @return ContactDTO
	 */
	public ContactDTO getContactFromId(int id);

	/**
	 * @param login
	 * @return ContactDTO
	 */
	public ContactDTO getContactFromLogin(String login);

	/**
	 * @param mail
	 * @param idStructure 
	 * @return List<ContactDTO>
	 */ 
	public ContactDTO getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure);

	/**
	 * @param idCentreGestion
	 * @return int
	 */ 
	public int getNombreContactByCentreGestion(int idCentreGestion);

	/**
	 * @param c
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 * @throws MailAlreadyUsedForStructureException 
	 */
	public int addContact(ContactDTO c) throws DataAddException, WebServiceDataBaseException, MailAlreadyUsedForStructureException;

	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 * @throws MailAlreadyUsedForStructureException 
	 */
	public boolean updateContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException, MailAlreadyUsedForStructureException;
	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 * @throws AccountAlreadyExistingForCoupleMailStructureException 
	 */
	public boolean updateCompteContact(ContactDTO c) throws  DataUpdateException, WebServiceDataBaseException, AccountAlreadyExistingForCoupleMailStructureException;
	/**
	 * @param idContact 
	 * @param loginInfosAJour 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContactInfosAJour(int idContact, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idContact 
	 * @param avantDerniereConnexion 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idContact 
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 * @throws ContactDeleteException 
	 */
	public boolean deleteContact(int idContact) throws DataDeleteException, WebServiceDataBaseException, ContactDeleteException;

	/* ****************************************************************************
	 * CONTRAT
	 *****************************************************************************/
	/**
	 * @return List<ContratOffreDTO>
	 */
	public List<ContratOffreDTO> getContrats();
	/* ****************************************************************************
	 * CRITERE GESTION
	 *****************************************************************************/
	/**
	 * @return List<CritereGestionDTO>
	 */
	public List<CritereGestionDTO> getCritereGestion();
	/**
	 * @param idCentreGestion
	 * @return CritereGestionDTO
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentre(int idCentreGestion);
	/**
	 * 
	 * @param idCentreGestion
	 * @param anneeUniv
	 * @return
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentreAndAnnee(int idCentreGestion, String anneeUniv);	
	/**
	 * @param codeEtape
	 * @return CritereGestionDTO
	 */
	public CritereGestionDTO getCritereGestionSansVetFromCodeEtape(String codeEtape);
	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreCritereGestion(int idCentreGestion);
	/**
	 * @param critere
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException
	 */
	public int addCritere(CritereGestionDTO critere) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param codeCritere
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * DROIT ADMINISTRATION
	 *****************************************************************************/
	/**
	 * @return List<DroitAdministrationDTO>
	 */
	public List<DroitAdministrationDTO> getDroitAdministration();

	/* ****************************************************************************
	 * DUREE DIFFUSION
	 *****************************************************************************/
	/**
	 * @return List<DureeDiffusionDTO>
	 */
	public List<DureeDiffusionDTO> getDureeDiffusion();


	/* ****************************************************************************
	 * EFFECTIF
	 *****************************************************************************/
	/**
	 * @return List<EffectifDTO>
	 */
	public List<EffectifDTO> getEffectifs();
	/* ****************************************************************************
	 * FAPN1
	 *****************************************************************************/
	/**
	 * @return List<FapN1DTO>
	 */
	public List<FapN1DTO> getFapN1();

	/* ****************************************************************************
	 * FAPN2
	 *****************************************************************************/
	/**
	 * @return List<FapN2DTO>
	 */
	public List<FapN2DTO> getFapN2();

	/* ****************************************************************************
	 * FAPN3
	 *****************************************************************************/
	/**
	 * @return List<FapN3DTO>
	 */
	public List<FapN3DTO> getFapN3();

	/* ****************************************************************************
	 * FAP QUALIFICATION
	 *****************************************************************************/
	/**
	 * @return List<FapQualificationDTO>
	 */
	public List<FapQualificationDTO> getFapQualifications();

	/* ****************************************************************************
	 * FAP QUALIFICATION SIMPLIFIEE
	 *****************************************************************************/
	/**
	 * @return List<FapQualificationSimplifieeDTO>
	 */
	public List<FapQualificationSimplifieeDTO> getFapQualificationsSimplifiees();

	/* ****************************************************************************
	 * MODE CANDIDATURE
	 *****************************************************************************/
	/**
	 * @return List<ModeCandidatureDTO>
	 */
	public List<ModeCandidatureDTO> getModesCandidature();
	/* ****************************************************************************
	 * NAFN1
	 *****************************************************************************/
	/**
	 * @return List<NafN1DTO>
	 */
	public List<NafN1DTO> getNafN1();

	/* ****************************************************************************
	 * NAFN5
	 *****************************************************************************/
	/**
	 * @return List<NafN5DTO>
	 */
	public List<NafN5DTO> getNafN5();

	/**
	 * @param code
	 * @return List<NafN5DTO> a partir codeNafN1
	 */
	public List<NafN5DTO> getNafN5FromCodeNafN1(String code) ;

	/**
	 * @param code 
	 * @return NafN5DTO a partir codeNafN5
	 */
	public NafN5DTO getNafN5FromCodeNafN5(String code);

	/* ****************************************************************************
	 * NIVEAU CENTRE
	 *****************************************************************************/
	/**
	 * @return List<NiveauCentreDTO>
	 */
	public List<NiveauCentreDTO> getNiveauCentre();

	/* ****************************************************************************
	 * NIVEAU FORMATION
	 *****************************************************************************/
	/**
	 * @return List<NiveauFormationDTO>
	 */
	public List<NiveauFormationDTO> getNiveauxFormation();
	/* ****************************************************************************
	 * OFFRE
	 *****************************************************************************/
	/**
	 * @param idStructure
	 * @param idsCentreGestion 
	 * @param isEtudiant 
	 * @return List<OffreDTO>
	 */
	public List<OffreDTO> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant);
	/**
	 * @param id
	 * @return OffreDTO
	 */
	public OffreDTO getOffreFromId(int id);	
	/**
	 * @param idCentreGestion
	 * @return int
	 */ 
	public int getNombreOffreByCentreGestion(int idCentreGestion);
	/**
	 * @param critereRechercheOffre
	 * @return List<OffreDTO>
	 */
	public List<OffreDTO> getOffresFromCriteres(CritereRechercheOffreDTO critereRechercheOffre);
	/**
	 * @param o
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOffre(OffreDTO o) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateOffre(OffreDTO o) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStopValidationOffre(int idOffre, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginDiffusion
	 * @param dateFinDiffusion 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginStopDiffusion
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStopDiffusionOffre(int idOffre, String loginStopDiffusion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginRejetValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param estPourvue
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @return int
	 * @param idsCentreGestion
	 */
	public int countOffreADiffuser(List<Integer> idsCentreGestion);
	/* ****************************************************************************
	 * FICHIER
	 *****************************************************************************/
	/**
	 * @param idFichier
	 * @return OffreFichier
	 */
	public FichierDTO getFichierFromIdFichier(int idFichier);

	/**
	 * @param o
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addFichier(FichierDTO o) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateFichier(FichierDTO o) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idFichier
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteFichier(int idFichier) throws DataDeleteException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean cleanFichiers() throws DataDeleteException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * OFFRE MODE CANDIDATURE
	 *****************************************************************************/
	/**
	 * @param idOffre
	 * @param idsModeCandidature 
	 * @return int
	 * @throws DataAddException 
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOffreModeCandidature(int idOffre, List<Integer> idsModeCandidature) throws DataAddException, DataDeleteException, WebServiceDataBaseException;

	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteOffreModeCandidatureFromId(int idOffre) throws DataAddException, WebServiceDataBaseException;

	/**
	 * @param lod
	 * @return int
	 * @throws DataAddException
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	/* ****************************************************************************
	 * OFFRE DIFFUSION
	 *****************************************************************************/
	/**
	 * @param idOffre
	 * @return List<OffreDiffusionDTO>
	 */
	public List<OffreDiffusionDTO> getOffreDiffusionFromIdOffre(int idOffre);
	/**
	 * @param lod
	 * @return int
	 * @throws DataAddException
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public int addOffreDiffusion(List<OffreDiffusionDTO> lod) throws DataAddException, DataDeleteException, WebServiceDataBaseException;

	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * PAYS
	 *****************************************************************************/
	/**
	 * @return List<PaysDTO>
	 */
	public List<PaysDTO> getPays();

	/* ****************************************************************************
	 * PERSONNEL CENTRE GESTION
	 *****************************************************************************/
	/**
	 * @param idCentreGestion
	 * @return List<PersonnelCentreGestionDTO>
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionList(int idCentreGestion);
	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombrePersonnelCentreGestion(int idCentreGestion);
	/**
	 * @param idPersonnelCentreGestion
	 * @return PersonnelCentreGestionDTO
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestion(int idPersonnelCentreGestion);
	/**
	 * @param idCentreGestion
	 * @return List<PersonnelCentreGestionDTO>
	 */
	public List<PersonnelCentreGestionDTO> getInterlocuteur(int idCentreGestion);
	/**
	 * @param idPersonnelCentreGestion 
	 * @param idCentreGestion
	 * @return List<PersonnelCentreGestionDTO>
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromIdAndCentre(int idPersonnelCentreGestion, int idCentreGestion);
	/**
	 * @param uidPersonnel 
	 * @param codeUniversite 
	 * @return List<PersonnelCentreGestionDTO>
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionFromUid(String uidPersonnel,String codeUniversite);
	/**
	 * @param nom 
	 * @param codeUniversite 
	 * @return PersonnelCentreGestionDTO
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromNom(String nom, String codeUniversite);

	/**
	 * @param codeCritere
	 * @param codeUniversite
	 * @return CentreGestionDTO
	 */
	public CentreGestionDTO getCentreFromCritere(String codeCritere, String codeUniversite);
	/**
	 * @param pg
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException
	 */
	public int addPersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataAddException,WebServiceDataBaseException, PersonalAlreadyExistingForCentreException;
	/**
	 * @param pg 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean updatePersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @param idCentreGestion 
	 * @param idPersonnelCentreGestion
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deletePersonnelCentreGestion(int idCentreGestion, int idPersonnelCentreGestion) throws DataDeleteException,WebServiceDataBaseException;

	/* ****************************************************************************
	 * SERVICE
	 *****************************************************************************/
	/**
	 * @param id
	 * @return ServiceDTO
	 */
	public ServiceDTO getServiceFromId(int id);
	/**
	 * @param id
	 * @return ServiceDTO
	 */ 
	public ServiceDTO getServiceFromIdContact(int id);
	/**
	 * @param id
	 * @return List<ServiceDTO>
	 */
	public List<ServiceDTO> getServicesFromIdStructure(int id);
	/**
	 * @param s
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addService(ServiceDTO s) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateService(ServiceDTO s) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteService(int idService) throws DataDeleteException, WebServiceDataBaseException,ServiceDeleteException;
	/* ****************************************************************************
	 * STATUT JURIDIQUE
	 *****************************************************************************/
	/**
	 * @return List<StatutJuridiqueDTO>
	 */
	public List<StatutJuridiqueDTO> getStatutsJuridiques();

	/* ****************************************************************************
	 * STRUCTURE
	 *****************************************************************************/
	// Ajout moderation Entreprise
	/**
	 * @param estValidee
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromVerification(int estValidee);

	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureFromId(int id);
	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureFromIdService(int id);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSociale(String raisonSociale);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @param cog : peut �tre vide (==0)
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int cog);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale);
	/**
	 * @param numeroSiret
	 * @return StructureDTO
	 */
	public StructureDTO getStructureFromNumSiret(String numeroSiret);
	/**
	 * Retourne les structures dont les contacts associ�s au centre ENTREPRISE
	 * ont l'adresse mail �gale � "mail" 
	 * Limitée à 200 résultats
	 * @param mail
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructureFromContactMailEntrepriseAvecCompte(String mail);
	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureAvecAccordFromId(int id);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @param departement : peut �tre vide
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @param departement : peut �tre vide
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartementFr(String raisonSociale, String departement);
	/**
	 * Limitée à 200 résultats
	 * @param numSiren
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromNumSiren(String numSiren);
	/**
	 * Limitée à 200 résultats
	 * @param telephone
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromTelephone(String telephone);
	/**
	 * Limitée à 200 résultats
	 * @param fax
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromFax(String fax);
	/**
	 * @param c
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromAdresse(CritereRechercheStructureAdresseDTO c);
	/**
	 * Limitée à 200 résultats
	 * @param nomService
	 * @param departement : peut �tre vide
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromNomServiceEtDepartement(String nomService, String departement);
	/**
	 * Limitée à 200 résultats
	 * @param typeStructure
	 * @param nafN1
	 * @param departement : peut �tre vide
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale : peut �tre vide
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale : peut �tre vide
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * Limitée à 200 résultats
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresSansAccordFromRaisonSociale(String raisonSociale);

	/**
	 * @param c
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAncien(CritereRechercheStructureAncienDTO c);
	/**
	 * @param s
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 * @throws UnvalidNumSiretException 
	 * @throws StructureNumSiretException 
	 */
	public int addStructure(StructureDTO s) throws DataAddException, WebServiceDataBaseException, UnvalidNumSiretException, StructureNumSiretException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 * @throws UnvalidNumSiretException 
	 * @throws StructureNumSiretException 
	 */
	public boolean updateStructure(StructureDTO s) throws DataUpdateException, WebServiceDataBaseException, UnvalidNumSiretException, StructureNumSiretException;
	/**
	 * @param idStructure
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureInfosAJour(int idStructure, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure 
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureValidation(int idStructure, String loginValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure 
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureStopValidation(int idStructure, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 * @throws StructureDeleteException 
	 */
	public boolean deleteStructureBase(int idStructure) throws DataDeleteException, WebServiceDataBaseException, StructureDeleteException;	
	/**
	 * 
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 * @throws StructureDeleteException
	 */
	public boolean deleteStructure(int idStructure, String loginCurrentUser) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * 
	 * @return List<String>
	 */
	public List<String> getRaisonsSociales(String raisonSociale);

	/**
	 * @return List<Structure>
	 */
	public List<StructureDTO> getStructuresTemEnServFalse();

	/* ****************************************************************************
	 * TEMPS TRAVAIL
	 *****************************************************************************/
	/**
	 * @return List<TempsTravailDTO>
	 */
	public List<TempsTravailDTO> getTempsTravail();

	/* ****************************************************************************
	 * TICKET STRUCTURE
	 *****************************************************************************/
	/**
	 * @param ticketStructure 
	 * @return boolean
	 */
	public boolean getTicketStructureValide(TicketStructureDTO ticketStructure);


	/**
	 * @param ticketStructure
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addTicketStructure(TicketStructureDTO ticketStructure) throws DataAddException, WebServiceDataBaseException;

	/**
	 * @param ticket
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTicketStructure(String ticket) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * TYPE OFFRE
	 *****************************************************************************/
	/**
	 * @return List<TypeOffreDTO>
	 */
	public List<TypeOffreDTO> getTypesOffre();
	/* ****************************************************************************
	 * TYPE STRUCTURE
	 *****************************************************************************/
	/**
	 * @return List<TypeStructureDTO>
	 */
	public List<TypeStructureDTO> getTypesStructure();
	/* ****************************************************************************
	 * UNITE DUREE
	 *****************************************************************************/
	/**
	 * @return List<UniteDureeDTO>
	 */
	public List<UniteDureeDTO> getUnitesDurees();
	/* ****************************************************************************
	 * ASSURANCE
	 *****************************************************************************/

	/**
	 * @return List<AssuranceDTO>
	 */
	public List<AssuranceDTO> getAssurances();

	/* ****************************************************************************
	 * CAISSE REGIME
	 *****************************************************************************/

	/**
	 * @return List<CaisseRegimeDTO>
	 */
	public List<CaisseRegimeDTO> getCaisseRegimes();

	/* ****************************************************************************
	 * INDEMNISATION
	 *****************************************************************************/
	/**
	 * @return List<IndemnisationDTO>
	 */
	public List<IndemnisationDTO> getIndemnisations();

	/* ****************************************************************************
	 * LANGUE CONVENTION
	 *****************************************************************************/
	/**
	 * @return List<LangueConventionDTO>
	 */
	public List<LangueConventionDTO> getLangueConventions();

	/* ****************************************************************************
	 * MODE VADIDATION STAGE
	 *****************************************************************************/
	/**
	 * @return List<ModeValidationStageDTO>
	 */
	public List<ModeValidationStageDTO> getModeValidationStages();

	/* ****************************************************************************
	 * ModeVersGratification
	 *****************************************************************************/
	/**
	 * @return List<ModeValidationStageDTO>
	 */
	public List<ModeVersGratificationDTO> getModeVersGratifications();

	/* ****************************************************************************
	 * NatureTravail
	 *****************************************************************************/
	/**
	 * @return List<NatureTravailDTO>
	 */
	public List<NatureTravailDTO> getNatureTravails();
	/* ****************************************************************************
	 * Theme
	 *****************************************************************************/
	/**
	 * @return List<ThemeDTO>
	 */
	public List<ThemeDTO> getThemes();

	/* ****************************************************************************
	 * OrigineStage
	 *****************************************************************************/
	/**
	 * @return List<OrigineStageDTO>
	 */
	public List<OrigineStageDTO> getOrigineStages();
	/* ****************************************************************************
	 * TypeConvention
	 *****************************************************************************/
	/**
	 * @return List<TypeConventionDTO>
	 */
	public List<TypeConventionDTO> getTypeConventions();

	/* ****************************************************************************
	 * UniteGratification
	 *****************************************************************************/
	/**
	 * @return List<UniteGratificationDTO>
	 */
	public List<UniteGratificationDTO> getUniteGratifications();

	/* ****************************************************************************
	 * Ufr
	 *****************************************************************************/
	/**
	 * @param codeUniversite 
	 * @return List<UfrDTO>
	 */
	public List<UfrDTO> getUfrsFromCodUniv(String codeUniversite);

	/**
	 * @param code
	 * @param codeUniversite 
	 * @return UfrDTO
	 */
	public UfrDTO getUfrFromIdFromCodUniv(String code, String codeUniversite);

	/**
	 * @param idsCentreGestion
	 * @param codeUniversite 
	 * @return List<UfrDTO>
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestionFromCodUniv(List<Integer> idsCentreGestion, String codeUniversite);
	/**
	 * @param idsCentreGestion
	 * @return List
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion);
	/**
	 * @return List
	 */
	public List<UfrDTO> getUfrs();
	/**
	 * @param code
	 * @return UfrDTO
	 */
	public UfrDTO getUfrFromId(String code);

	/**
	 * @param ufr
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 * @throws UfrAlreadyExistingForCodeException 
	 */
	public int addUfr(UfrDTO ufr) throws DataAddException, WebServiceDataBaseException,UfrAlreadyExistingForCodeException;

	/* ****************************************************************************
	 * Etape
	 *****************************************************************************/
	/**
	 * @param codeUniversite 
	 * @return List<EtapeDTO>
	 */
	public List<EtapeDTO> getEtapesFromCodUniv(String codeUniversite);

	/**
	 * @param etape
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 * @throws EtapeAlreadyExistingForCodeException 
	 */
	public int addEtape(EtapeDTO etape) throws DataAddException, WebServiceDataBaseException, EtapeAlreadyExistingForCodeException;

	/**
	 * @param code
	 * @param codeUniversite 
	 * @return EtapeDTO
	 */
	public EtapeDTO getEtapeFromIdFromCodUniv(String code, String codeUniversite);

	/**
	 * @param idsCentreGestion
	 * @param codeUniversite 
	 * @return List<EtapeDTO>
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestionFromCodUniv(List<Integer> idsCentreGestion, String codeUniversite);
	/**
	 * @return List
	 */
	public List<EtapeDTO> getEtapes();
	/**
	 * @param idsCentreGestion
	 * @return List
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion);
	/**
	 * @param code
	 * @return EtapeDTO
	 */
	public EtapeDTO getEtapeFromId(String code);

	/* ****************************************************************************
	 * Convention
	 *****************************************************************************/
	/**
	 * @param codeUniversite 
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsFromCodUniv(String codeUniversite);
	/**
	 * @param id
	 * @return ConventionDTO
	 */
	public ConventionDTO getConventionFromId(int id);
	/**
	 * @param codeUniversite 
	 * @return List<String>
	 */
	public List<String> getAnneesConventionFromCodUniv(String codeUniversite);
	/**
	 * @param critereRechercheConvention
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsFromCriteres(CritereRechercheConventionDTO critereRechercheConvention);

	/**
	 * @param idEnseignant 
	 * @param critereRechercheConvention
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsFromCriteresByEnseignantTuteur(int idEnseignant, 
			CritereRechercheConventionDTO critereRechercheConvention);

	/**
	 * @param critereRechercheConvention
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsFromCriteresExport(CritereRechercheConventionDTO critereRechercheConvention);

	/**
	 * @param id
	 * @return ConventionDTO pour export
	 */
	//	public ConventionDTO getConventionFromExport(int id);
	public List<ConventionDTO> getConventionsFromExport(List<Integer> idsConventionsExport);

	/**
	 * @param identEtudiant
	 * @param codeUniversite 
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsEtudiantFromCodUniv(String identEtudiant, String codeUniversite);

	/**
	 * @param idCentreGestion
	 * @param codeUniversite 
	 * @return int
	 */ 
	public int getNombreConventionByCentreGestionFromCodUniv(int idCentreGestion, String codeUniversite);

	/**
	 * @param annee
	 * @param identEtudiant
	 * @param codeUniversite 
	 * @return int
	 */ 
	public int getNbConventionsByAnneeAndEtu(String annee, String identEtudiant, String codeUniversite);

	/**
	 * @param idEnseignant
	 * @param annee
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsByEnseignant(int idEnseignant, String annee);
	/**
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventions();
	/**
	 * @return List<String>
	 */
	public List<String> getAnneesConvention();
	/**
	 * @param identEtudiant
	 * @return List<ConventionDTO>
	 */
	public List<ConventionDTO> getConventionsEtudiant(String identEtudiant);
	/**
	 * @param codeEtape 
	 * @return String
	 */
	public String getCodeUFRFromCodeEtape(String codeEtape);

	/**
	 * @param idCentreGestion
	 * @return int
	 */ 
	public int getNombreConventionByCentreGestion(int idCentreGestion);
	/**
	 * @param convention
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addConvention(ConventionDTO convention) throws DataAddException, WebServiceDataBaseException;

	/**
	 * @param convention
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateConvention(ConventionDTO convention) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param code 
	 * @param idCentreGestion 
	 * @param codeUniversite 
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCentreConventionByUfrCodUniv(String code, int idCentreGestion, String codeUniversite) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param code 
	 * @param idCentreGestion 
	 * @param codeUniversite 
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCentreConventionByEtapeCodUniv(String code, int idCentreGestion, String codeUniversite) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param code
	 * @param idCentreGestion
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCentreConventionByUfr(String code, int idCentreGestion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param code
	 * @param idCentreGestion
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCentreConventionByEtape(String code, int idCentreGestion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idConvention
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteConvention(int idConvention) throws DataDeleteException, WebServiceDataBaseException;

	/**
	 * @param codeEtape 
	 * @param codeUniversite 
	 * @return String
	 */
	public String getCodeUFRFromCodeEtapeFromCodUniv(String codeEtape, String codeUniversite);
	/**
	 * @param codeEtape
	 * @param codeVersionEtape
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateConventionSetCodeVersionEtape(String codeEtape, String codeVersionEtape) throws DataUpdateException, WebServiceDataBaseException;
	/* ****************************************************************************
	 * Etudiant
	 *****************************************************************************/
	/**
	 * @return List<EtudiantDTO>
	 */
	public List<EtudiantDTO> getEtudiants();

	/**
	 * @param id
	 * @return EtudiantDTO
	 */
	public EtudiantDTO getEtudiantFromId(int id);

	/**
	 * @param UID
	 * @return EtudiantDTO
	 */
	public EtudiantDTO getEtudiantFromUid(String uidEtudiant, String codeUniversite);
	
	/**
	 * @param etudiant
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 * @throws EtudiantAlreadyExistingForNumEtuCodeUnivException 
	 */
	public int addEtudiant(EtudiantDTO etudiant) throws DataAddException, WebServiceDataBaseException;

	/**
	 * @param etudiant
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateEtudiant(EtudiantDTO etudiant) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idEtudiant
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteException, WebServiceDataBaseException;

	/* ****************************************************************************
	 * Enseignant
	 *****************************************************************************/

	/**
	 * @param codeUniversite 
	 * @return List<EnseignantDTO>
	 */
	public List<EnseignantDTO> getEnseignantsFromCodUniv(String codeUniversite);

	/**
	 * @param id
	 * @return EnseignantDTO
	 */
	public EnseignantDTO getEnseignantFromId(int id);

	/**
	 * @param uidEnseignant
	 * @param codeUniversite
	 * @return EtudiantDTO
	 */
	public EnseignantDTO getEnseignantFromUid(String uidEnseignant,String codeUniversite);

	/**
	 * @param uidEnseignant
	 * @param codeUniversite 
	 * @return int
	 */
	public int getNombreConventionByEnseignantFromCodUniv(String uidEnseignant, String codeUniversite);

	public int getNombreConventionByEnseignantByAnneeFromCodUniv(String uidEnseignant, String codeUniversite, String annee );

	/**
	 * @return List
	 */
	public List<EnseignantDTO> getEnseignants();
	/**
	 * @param uidEnseignant
	 * @return int
	 */
	public int getNombreConventionByEnseignant(String uidEnseignant);

	/**
	 * @param enseignant
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addEnseignant(EnseignantDTO enseignant) throws DataAddException, WebServiceDataBaseException;


	/**
	 * @param enseignant
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateEnseignant(EnseignantDTO enseignant) throws DataUpdateException, WebServiceDataBaseException;


	/**
	 * @param idEnseignant
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteEnseignant(int idEnseignant) throws DataDeleteException, WebServiceDataBaseException;



	/* *************************************************************************************************************************
	 **********                              STATISTIQUES                                                            ***********
	 ************************************************************************************************************************* */
	/**
	 * Liste des criteres sur la realisation des statistiqeus
	 * @param typeCategorie 
	 * @param niveau 
	 * @return
	 */
	public List<CritereDTO> getCriteresParCategorieEtParNiveau(Integer typeCategorie,Integer niveau);

	/**
	 * @param idCenter
	 * @param etatOffre
	 * @return List<String>
	 * @throws RemoteException
	 */


	/**
	 * @return List<String>
	 */
	public List<String> getAnneesUnivOffres();


	/**
	 * @param idCentreGestion
	 * @param etab
	 * @return 
	 * @throws RemoteException
	 */
	// partie a copier	 

	/* ****************************************************************************
	 * STATISTIQUES SUR LES CONVENTIONS
	 *****************************************************************************/

	public List<String> getAnneesConventions(Integer idCentreGestion, String etab)throws RemoteException;

	/**
	 * recupere le nombre de convention pour le centre specifie 
	 * @param idCentreGestion : identifiant du centre de gestion
	 * 
	 *  @param  etab , centre de gestion ou toute l'universite
	 * @return 
	 * @throws RemoteException 
	 */
	public List<StatisticItemDTO> getTotalConventions(Integer idCentreGestion, String etab)throws RemoteException;

	/**
	 * recupere le nombre de convention par type de convention pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab : par centre de gestion ou tous
	 * @return 
	 * @throws RemoteException 
	 */

	public List<StatisticItemDTO> getTotalConventionsParType(Integer idCentreGestion, String annee, String etab)throws RemoteException;

	/**
	 * recupere le nombre de convention par theme de convention pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab : par centre de gestion ou tous
	 * @return 
	 * @throws RemoteException 
	 */

	public List<StatisticItemDTO> getTotalConventionsParTheme(Integer idCentreGestion, String annee, String etab)throws RemoteException;

	/**
	 * recupere le nombre de convention par gratification pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */
	public List<StatisticItemDTO> getTotalConventionsParIndemnite(Integer idCentreGestion, String annee,String etab)  throws RemoteException;

	/**
	 * recupere le nombre de convention par temps de travail pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParTpsDeTravail(Integer idCentreGestion, String annee, String etab)  throws RemoteException;


	/**
	 * recupere le nombre de convention par nb de jours de travail par semaine pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion  : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParJourSemaine(Integer idCentreGestion, String annee, String etab)  throws RemoteException;


	/**
	 * recupere le nombre de convention par origine du stage pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParOrigineStage(Integer idCentreGestion, String annee, String etab)  throws RemoteException;


	/**
	 * recupere le nombre de convention par enseignant pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParEnseignantTuteur(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	/**
	 * recupere le nombre de convention par structure pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParStructure(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	/**
	 * recupere le nombre de convention par activite de la structure pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParStructureActivite(Integer idCentreGestion, String annee, String etab)  throws RemoteException;


	/**
	 * recupere le nombre de convention par statut juridique de la structure pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 *  
	 */

	public List<StatisticItemDTO> getTotalConventionsParStructureType(Integer idCentreGestion, String annee, String etab)  throws RemoteException;


	/**
	 * recupere le nombre de convention par taille de la structure pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 */

	public List<StatisticItemDTO> getTotalConventionsParTailleStructure(Integer idCentreGestion, String annee, String etab)  throws RemoteException;



	/**
	 * recupere le nombre de convention par departement du lieu de stage pour le centre specifie et l'annee universitaire
	 * @param idCentreGestion : identifiant du centre de gestion
	 * @param annee : annee universitaire
	 * @param etab 
	 * @return 
	 * @throws RemoteException 
	 */

	public List<StatisticItemDTO> getTotalConventionsParDepLieuStage(Integer idCentreGestion, String annee, String etab)  throws RemoteException;



	/**
	 * @param idCentreGestion
	 * @param annee
	 * @param etab
	 * @return 
	 * @throws RemoteException
	 */
	public List<StatisticItemDTO> getTotalConventionsParPaysDuService(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	/* UFR	 */
	public List<StatisticItemDTO> getNumberOfConventionsByStudy(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWayToFind(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWorkDuration(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndActivity(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	/*DEPARTEMENT*/

	public List<StatisticItemDTO> getNumberOfConventionsByDepartment(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndActivity(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWorkDuration(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWayToFind(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	/*ETAPE*/

	public List<StatisticItemDTO> getNumberOfConventionsByStep(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndType(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndActivity(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWorkDuration(Integer idCentreGestion, String annee, String etab)  throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbDaysPerWeek(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWayToFind(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTeacherGuide(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructure(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureType(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureSize(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceDep(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceCountry(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTheme(Integer idCentreGestion, String annee, String etab) throws RemoteException;

	/*OFFRES*/
	public List<String> getAnneesOffres(Integer idCenter, String etatOffre) throws  RemoteException;
	public List<StatisticItemDTO> getNumberOfOffers(Integer idCenter, String etab) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByActivity(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByStructure(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByStructureType(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByStructureSize(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByStructureDep(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByStructureCountry(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByLevel(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;

	public List<StatisticItemDTO> getNumberOfOffersByFunction(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByFormation(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByType(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByValidation(Integer idCenter, String year, String etab) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByPublication(Integer idCenter, String year, String etab) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByCandidateFound(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;
	public List<StatisticItemDTO> getNumberOfOffersByLocalStudent(Integer idCenter, String year, String etab, boolean validation, boolean publication) throws RemoteException;

	/*Ajout duree*/
	public List<StatisticItemDTO> getNumberOfConventionsByNbWeeks(Integer idCentreGestion, String annee, String etab)throws RemoteException;
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbWeeks(Integer idCentreGestion, String annee, String etab)throws RemoteException;
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbWeeks(Integer idCentreGestion, String annee, String etab)throws RemoteException;
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbWeeks(Integer idCentreGestion, String annee, String etab)throws RemoteException;
}
