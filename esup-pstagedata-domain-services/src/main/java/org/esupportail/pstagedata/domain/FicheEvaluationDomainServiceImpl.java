/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FicheEvaluationDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.FicheEvaluation;
import org.esupportail.pstagedata.domain.beans.ReponseEvaluation;
import org.esupportail.pstagedata.domain.beans.ReponseSupplementaire;
import org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO;
import org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO;
import org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FicheEvaluation Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class FicheEvaluationDomainServiceImpl implements FicheEvaluationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ficheEvaluationDaoService
	 */
	private FicheEvaluationDaoService ficheEvaluationDaoService;
	
	/**
	 * @return the ficheEvaluationDaoService
	 */
	public FicheEvaluationDaoService getficheEvaluationDaoService() {
		return ficheEvaluationDaoService;
	}
	/**
	 * @param ficheEvaluationDaoService : the ficheEvaluationDaoService to set
	 */
	public void setficheEvaluationDaoService(FicheEvaluationDaoService ficheEvaluationDaoService) {
		this.ficheEvaluationDaoService = ficheEvaluationDaoService;
	}

	/* ***************************************************************
	 * FICHE EVALUATION
	 ****************************************************************/
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getFicheEvaluationFromIdCentre()
	 */
	public FicheEvaluationDTO getFicheEvaluationFromIdCentre(int idCentreGestion) {
		FicheEvaluation f = this.ficheEvaluationDaoService.getFicheEvaluationFromIdCentre(idCentreGestion);
		FicheEvaluationDTO fDTO = null;
		if (f!=null){
			fDTO = new FicheEvaluationDTO(f);
		}
		return fDTO;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addFicheEvaluation(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public int addFicheEvaluation(FicheEvaluationDTO a) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		try {
			tmp = this.ficheEvaluationDaoService.addFicheEvaluation(UtilsDTO.getFicheEvaluationFromDTO(a));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEtudiant(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEtudiant(FicheEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateFicheEvaluationEtudiant(UtilsDTO.getFicheEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEntreprise(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEntreprise(FicheEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateFicheEvaluationEntreprise(UtilsDTO.getFicheEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateFicheEvaluationEnseignant(org.esupportail.pstagedata.domain.dto.FicheEvaluationDTO)
	 */
	public boolean updateFicheEvaluationEnseignant(FicheEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateFicheEvaluationEnseignant(UtilsDTO.getFicheEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteFicheEvaluation(int)
	 */
	public boolean deleteFicheEvaluation(int idFicheEvaluation) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.deleteFicheEvaluation(idFicheEvaluation);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/* ***************************************************************
	 * REPONSE EVALUATION
	 ****************************************************************/
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getReponseEvaluationFromIdCentre()
	 */
	public ReponseEvaluationDTO getReponseEvaluation(int idFicheEvaluation, int idConvention) {
		ReponseEvaluation r = this.ficheEvaluationDaoService.getReponseEvaluation(idFicheEvaluation, idConvention);
		ReponseEvaluationDTO rDTO = null;
		if (r!=null){
			rDTO = new ReponseEvaluationDTO(r);
		}
		return rDTO;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getReponseEvaluationFromCode(java.lang.String)
	 */
	public ReponseEvaluationDTO getReponseEvaluationFromCode(String codeAcces) {
		ReponseEvaluation r = this.ficheEvaluationDaoService.getReponseEvaluationFromCode(codeAcces);
		ReponseEvaluationDTO rDTO = null;
		if (r!=null){
			rDTO = new ReponseEvaluationDTO(r);
		}
		return rDTO;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getReponsesEvaluation(int)
	 */
	public List<ReponseEvaluationDTO> getReponsesEvaluation(int idFicheEvaluation) {
//		List<ReponseEvaluation> lr = this.ficheEvaluationDaoService.getReponsesEvaluation(idFicheEvaluation);
//		List<ReponseEvaluationDTO> lrDTO = new ArrayList<ReponseEvaluationDTO>();
//		if (r!=null){
//			rDTO = new ReponseEvaluationDTO(r);
//		}
//		return rDTO;
		return UtilsDTO.getReponseEvaluationListDTO(this.ficheEvaluationDaoService.getReponsesEvaluation(idFicheEvaluation));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addReponseEvaluation(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public int addReponseEvaluation(ReponseEvaluationDTO a) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		try {
			tmp = this.ficheEvaluationDaoService.addReponseEvaluation(UtilsDTO.getReponseEvaluationFromDTO(a));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEtudiant(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEtudiant(ReponseEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateReponseEvaluationEtudiant(UtilsDTO.getReponseEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEntreprise(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEntreprise(ReponseEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateReponseEvaluationEntreprise(UtilsDTO.getReponseEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseEvaluationEnseignant(org.esupportail.pstagedata.domain.dto.ReponseEvaluationDTO)
	 */
	public boolean updateReponseEvaluationEnseignant(ReponseEvaluationDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateReponseEvaluationEnseignant(UtilsDTO.getReponseEvaluationFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteReponseEvaluation(int)
	 */
	public boolean deleteReponseEvaluation(int idFicheEvaluation, int idConvention) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.deleteReponseEvaluation(idFicheEvaluation, idConvention);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#setCodeAcces(java.lang.String)
	 */
	public boolean setCodeAcces(int idFicheEvaluation, int idConvention, String codeAcces) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.setCodeAcces(idFicheEvaluation, idConvention, codeAcces);
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#setEnvoiMailEntreprise()
	 */
	public boolean setEnvoiMailEntreprise(int idFicheEvaluation, int idConvention) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.setEnvoiMailEntreprise(idFicheEvaluation,idConvention);
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/* ***************************************************************
	 * QUESTION SUPPLEMENTAIRE
	 ****************************************************************/
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getQuestionsSupplementaires(int)
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementaires(int idFicheEvaluation) {
		return UtilsDTO.getQuestionSupplementaireListDTO(this.ficheEvaluationDaoService.getQuestionsSupplementaires(idFicheEvaluation));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getQuestionsSupplementairesFromIdPlacement(int, int)
	 */
	public List<QuestionSupplementaireDTO> getQuestionsSupplementairesFromIdPlacement(int idFicheEvaluation, int idPlacement) {
		return UtilsDTO.getQuestionSupplementaireListDTO(this.ficheEvaluationDaoService.getQuestionsSupplementairesFromIdPlacement(idFicheEvaluation,idPlacement));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addQuestionSupplementaire(org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO)
	 */
	public int addQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		try {
			tmp = this.ficheEvaluationDaoService.addQuestionSupplementaire(UtilsDTO.getQuestionSupplementaireFromDTO(qs));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateQuestionSupplementaire(org.esupportail.pstagedata.domain.dto.QuestionSupplementaireDTO)
	 */
	public boolean updateQuestionSupplementaire(QuestionSupplementaireDTO qs) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateQuestionSupplementaire(UtilsDTO.getQuestionSupplementaireFromDTO(qs));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteQuestionSupplementaire(int)
	 */
	public boolean deleteQuestionSupplementaire(int idQuestionSupplementaire) throws DataDeleteException,WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.deleteQuestionSupplementaire(idQuestionSupplementaire);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/* ***************************************************************
	 * REPONSE SUPPLEMENTAIRE
	 ****************************************************************/
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#getReponseSupplementaire(int, int)
	 */
	public ReponseSupplementaireDTO getReponseSupplementaire(
			int idQuestionSupplementaire, int idConvention) {
		ReponseSupplementaire r = this.ficheEvaluationDaoService.getReponseSupplementaire(idQuestionSupplementaire, idConvention);
		ReponseSupplementaireDTO rDTO = new ReponseSupplementaireDTO();
		if (r!=null){
			rDTO = new ReponseSupplementaireDTO(r);
		}
		return rDTO;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#addReponseSupplementaire(org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO)
	 */
	public int addReponseSupplementaire(ReponseSupplementaireDTO rs) {
		int tmp = 0;
		try {
			tmp = this.ficheEvaluationDaoService.addReponseSupplementaire(UtilsDTO.getReponseSupplementaireFromDTO(rs));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#updateReponseSupplementaire(org.esupportail.pstagedata.domain.dto.ReponseSupplementaireDTO)
	 */
	public boolean updateReponseSupplementaire(ReponseSupplementaireDTO rs) {
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.updateReponseSupplementaire(UtilsDTO.getReponseSupplementaireFromDTO(rs));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.FicheEvaluationDomainService#deleteReponseSupplementaire(int, int)
	 */
	public boolean deleteReponseSupplementaire(int idQuestionSupplementaire,
			int idConvention) {
		boolean b = false;
		try{
			b = this.ficheEvaluationDaoService.deleteReponseSupplementaire(idQuestionSupplementaire,idConvention);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
