/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.FicheEvaluation;
import org.esupportail.pstagedata.domain.beans.QuestionSupplementaire;
import org.esupportail.pstagedata.domain.beans.ReponseEvaluation;
import org.esupportail.pstagedata.domain.beans.ReponseSupplementaire;
import org.springframework.dao.DataAccessException;


/**
 * FicheEvaluation DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class FicheEvaluationDaoServiceImpl extends AbstractIBatisDaoService implements FicheEvaluationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/* ****************************************************************************
	 * FICHE EVALUATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getFicheEvaluation()
	 */
	public FicheEvaluation getFicheEvaluationFromIdCentre(int idCentreGestion){
		return (FicheEvaluation) getSqlMapClientTemplate().queryForObject("getFicheEvaluationFromIdCentre", idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#addFicheEvaluation(org.esupportail.pstagedata.domain.beans.FicheEvaluation)
	 */
	public int addFicheEvaluation(FicheEvaluation fe)throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addFicheEvaluation", fe);
		} catch (DataAccessException e){
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateFicheEvaluationEtudiant(org.esupportail.pstagedata.domain.beans.FicheEvaluation)
	 */
	public boolean updateFicheEvaluationEtudiant(FicheEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateFicheEvaluationEtudiant",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateFicheEvaluationEntreprise(org.esupportail.pstagedata.domain.beans.FicheEvaluation)
	 */
	public boolean updateFicheEvaluationEntreprise(FicheEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateFicheEvaluationEntreprise",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateFicheEvaluationEnseignant(org.esupportail.pstagedata.domain.beans.FicheEvaluation)
	 */
	public boolean updateFicheEvaluationEnseignant(FicheEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateFicheEvaluationEnseignant",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#deleteFicheEvaluation(int)
	 */
	public boolean deleteFicheEvaluation(int idFicheEvaluation) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteFicheEvaluation", idFicheEvaluation)>0?true:false;
		} catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	

	/* ****************************************************************************
	 * REPONSE EVALUATION
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getReponseEvaluation()
	 */
	public ReponseEvaluation getReponseEvaluation(int idFicheEvaluation, int idConvention){
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idConvention", idConvention);
		return (ReponseEvaluation) getSqlMapClientTemplate().queryForObject("getReponseEvaluation", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getReponsesEvaluation(int)
	 */
	@SuppressWarnings("unchecked")
	public List<ReponseEvaluation> getReponsesEvaluation(int idFicheEvaluation) {
		return getSqlMapClientTemplate().queryForList("getReponsesEvaluation", idFicheEvaluation);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#addFicheEvaluation(org.esupportail.pstagedata.domain.beans.FicheEvaluation)
	 */
	public int addReponseEvaluation(ReponseEvaluation fe)throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addReponseEvaluation", fe);
		} catch (DataAccessException e){
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateReponseEvaluationEtudiant(org.esupportail.pstagedata.domain.beans.ReponseEvaluation)
	 */
	public boolean updateReponseEvaluationEtudiant(ReponseEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateReponseEvaluationEtudiant",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateReponseEvaluationEntreprise(org.esupportail.pstagedata.domain.beans.ReponseEvaluation)
	 */
	public boolean updateReponseEvaluationEntreprise(ReponseEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateReponseEvaluationEntreprise",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateReponseEvaluationEnseignant(org.esupportail.pstagedata.domain.beans.ReponseEvaluation)
	 */
	public boolean updateReponseEvaluationEnseignant(ReponseEvaluation fe)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateReponseEvaluationEnseignant",fe)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#deleteReponseEvaluation(int,int)
	 */
	public boolean deleteReponseEvaluation(int idFicheEvaluation, int idConvention) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idConvention", idConvention);
		try{
			b = getSqlMapClientTemplate().delete("deleteReponseEvaluation", parameterMap)>0?true:false;
		} catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean setImpressionEtudiant(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idConvention", idConvention);
		try{
			b = getSqlMapClientTemplate().update("setImpressionEtudiant",parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean setImpressionEnseignant(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idConvention", idConvention);
		try{
			b = getSqlMapClientTemplate().update("setImpressionEnseignant",parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean setImpressionEntreprise(int idFicheEvaluation, int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idConvention", idConvention);
		try{
			b = getSqlMapClientTemplate().update("setImpressionEntreprise",parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	public boolean setEnvoiMailEtudiant(int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("setEnvoiMailEtudiant",idConvention)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean setEnvoiMailEnseignant(int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("setEnvoiMailEnseignant",idConvention)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	public boolean setEnvoiMailEntreprise(int idConvention) throws DataUpdateDaoException,
			DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("setEnvoiMailEntreprise",idConvention)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/* ****************************************************************************
	 * QUESTION SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getQuestionsSupplementaires(int)
	 */
	@SuppressWarnings("unchecked")
	public List<QuestionSupplementaire> getQuestionsSupplementaires(int idFicheEvaluation) {
		return getSqlMapClientTemplate().queryForList("getQuestionsSupplementaires", idFicheEvaluation);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getQuestionsSupplementairesFromIdPlacement(int, int)
	 */
	@SuppressWarnings("unchecked")
	public List<QuestionSupplementaire> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idFicheEvaluation", idFicheEvaluation);
		parameterMap.put("idPlacement", idPlacement);
		return getSqlMapClientTemplate().queryForList("getQuestionsSupplementairesFromIdPlacement", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#addQuestionSupplementaire(org.esupportail.pstagedata.domain.beans.QuestionSupplementaire)
	 */
	public int addQuestionSupplementaire(QuestionSupplementaire qs)
			throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addQuestionSupplementaire", qs);
		} catch (DataAccessException e){
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateQuestionSupplementaire(org.esupportail.pstagedata.domain.beans.QuestionSupplementaire)
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaire qs)
			throws DataUpdateDaoException, DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateQuestionSupplementaire",qs)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#deleteQuestionSupplementaire(int)
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteDaoException, DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteQuestionSupplementaire", idQuestionSupplementaire)>0?true:false;
		} catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/* ****************************************************************************
	 * REPONSE SUPPLEMENTAIRE
	 *****************************************************************************/
	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#getReponseSupplementaire(int, int)
	 */
	public ReponseSupplementaire getReponseSupplementaire(int idQuestionSupplementaire, int idConvention) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idQuestionSupplementaire", idQuestionSupplementaire);
		parameterMap.put("idConvention", idConvention);
		return (ReponseSupplementaire) getSqlMapClientTemplate().queryForObject("getReponseSupplementaire", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#addReponseSupplementaire(org.esupportail.pstagedata.domain.beans.ReponseSupplementaire)
	 */
	public int addReponseSupplementaire(ReponseSupplementaire rs) {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addReponseSupplementaire", rs);
		} catch (DataAccessException e){
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#updateReponseSupplementaire(org.esupportail.pstagedata.domain.beans.ReponseSupplementaire)
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaire rs) {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateReponseSupplementaire",rs)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FicheEvaluationDaoService#deleteReponseSupplementaire(int, int)
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire,int idConvention) {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idQuestionSupplementaire", idQuestionSupplementaire);
		parameterMap.put("idConvention", idConvention);
		try{
			b = getSqlMapClientTemplate().delete("deleteReponseSupplementaire", parameterMap)>0?true:false;
		} catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

}