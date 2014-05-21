/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO;
import org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * FicheEvaluation Domain service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface FicheEvaluationDomainService extends Serializable {

	/* ***************************************************************
	 * FICHE EVALUATION
	 ****************************************************************/
	/**
	 * @return FicheEvaluationDTO
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

	/* ***************************************************************
	 * REPONSE EVALUATION
	 ****************************************************************/
	/**
	 * @return ReponseEvaluationDTO
	 */
	public ReponseEvaluationDTO getReponseEvaluation(int idFicheEvaluation, int idConvention);
	/**
	 * @param idFicheEvaluation
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
	
	/* ***************************************************************
	 * QUESTION SUPPLEMENTAIRE
	 ****************************************************************/
	/**
	 * @param idFicheEvaluation
	 * @return List<QuestionSupplementaireDTO>
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementaires(int idFicheEvaluation);
	/**
	 * @param idFicheEvaluation
	 * @param idPlacement
	 * @return List<QuestionSupplementaireDTO>
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement);
	/**
	 * @param qs
	 * @return int
	 */
	public int addQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param qs
	 * @return boolean
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idQuestionSupplementaire
	 * @return boolean
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteException, WebServiceDataBaseException;

	/* ***************************************************************
	 * REPONSE SUPPLEMENTAIRE
	 ****************************************************************/
	/**
	 * @param idQuestionSupplementaire
	 * @param idConvention
	 * @return ReponseSupplementaireDTO
	 */
	public ReponseSupplementaireDTO getReponseSupplementaire(int idQuestionSupplementaire, int idConvention);

	/**
	 * @param rs
	 * @return int
	 */
	public int addReponseSupplementaire(ReponseSupplementaireDTO rs);

	/**
	 * @param rs
	 * @return boolean
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaireDTO rs);

	/**
	 * @param idQuestionSupplementaire
	 * @param idConvention
	 * @return boolean
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire,int idConvention);
	
}
