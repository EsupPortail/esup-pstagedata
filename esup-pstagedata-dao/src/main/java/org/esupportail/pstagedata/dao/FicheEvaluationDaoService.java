/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.FicheEvaluation;
import org.esupportail.pstagedata.domain.beans.QuestionSupplementaire;
import org.esupportail.pstagedata.domain.beans.ReponseEvaluation;
import org.esupportail.pstagedata.domain.beans.ReponseSupplementaire;


/**
 * FicheEvaluation DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface FicheEvaluationDaoService extends Serializable {

	/* ****************************************************************************
	 * FICHE
	 *****************************************************************************/
	/**
	 * @return FicheEvaluation
	 */
	public FicheEvaluation getFicheEvaluationFromIdCentre(int idCentre);

	/**
	 * @param f
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addFicheEvaluation(FicheEvaluation f) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateFicheEvaluationEtudiant(FicheEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateFicheEvaluationEntreprise(FicheEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateFicheEvaluationEnseignant(FicheEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idFicheEvaluation
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteFicheEvaluation(int idFicheEvaluation) throws DataDeleteDaoException, DataBaseDaoException;


	/* ****************************************************************************
	 * REPONSE EVALUATION
	 *****************************************************************************/
	/**
	 * @return ReponseEvaluation
	 */
	public ReponseEvaluation getReponseEvaluation(int idFicheEvaluation, int idConvention);
	/**
	 * @param idFicheEvaluation
	 * @return List<ReponseEvaluation>
	 */
	public List<ReponseEvaluation> getReponsesEvaluation(int idFicheEvaluation);
	/**
	 * @param f
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addReponseEvaluation(ReponseEvaluation f) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateReponseEvaluationEtudiant(ReponseEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateReponseEvaluationEntreprise(ReponseEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param f
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateReponseEvaluationEnseignant(ReponseEvaluation f) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idFicheEvaluation
	 * @param idConvention
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteReponseEvaluation(int idFicheEvaluation, int idConvention) throws DataDeleteDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEtudiant(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEnseignant(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setImpressionEntreprise(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEtudiant(int idConvention) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEnseignant(int idConvention) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setEnvoiMailEntreprise(int idConvention) throws DataUpdateDaoException, DataBaseDaoException;

	/* ****************************************************************************
	 * QUESTION SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @param idFicheEvaluation
	 * @return List<QuestionSupplementaire>
	 */
	public List<QuestionSupplementaire> getQuestionsSupplementaires(int idFicheEvaluation);
	/**
	 * @param idFicheEvaluation
	 * @param idPlacement
	 * @return List<QuestionSupplementaire>
	 */
	public List<QuestionSupplementaire> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement);

	/**
	 * @param questionSupplementaireFromDTO
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 */
	public int addQuestionSupplementaire(QuestionSupplementaire questionSupplementaireFromDTO) throws DataAddDaoException, DataBaseDaoException;

	/**
	 * @param questionSupplementaireFromDTO
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaire questionSupplementaireFromDTO) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @param idQuestionSupplementaire
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteDaoException, DataBaseDaoException;

	/* ****************************************************************************
	 * REPONSE SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @param idQuestionSupplementaire
	 * @param idConvention
	 * @return ReponseSupplementaire
	 */
	public ReponseSupplementaire getReponseSupplementaire(int idQuestionSupplementaire, int idConvention);
	/**
	 * @param reponseSupplementaireFromDTO
	 * @return int
	 */
	public int addReponseSupplementaire(ReponseSupplementaire reponseSupplementaireFromDTO);
	/**
	 * @param reponseSupplementaireFromDTO
	 * @return boolean
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaire reponseSupplementaireFromDTO);
	/**
	 * @param idQuestionSupplementaire
	 * @param idConvention
	 * @return boolean
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire,int idConvention);

}
