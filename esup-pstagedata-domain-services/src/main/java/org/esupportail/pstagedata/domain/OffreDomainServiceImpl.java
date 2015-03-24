/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.dao.OffreDaoService;
import org.esupportail.pstagedata.dao.OffreModeCandidatureDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Offre;
import org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO;
import org.esupportail.pstagedata.domain.dto.OffreDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Offre Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDomainServiceImpl implements OffreDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * OffreDaoService
	 */
	private OffreDaoService offreDaoService;
	/**
	 * OffreModeCandidatureDaoService
	 */
	private OffreModeCandidatureDaoService offreModeCandidatureDaoService;
	/**
	 * @return the offreDaoService
	 */
	public OffreDaoService getOffreDaoService() {
		return offreDaoService;
	}
	/**
	 * @param offreDaoService the offreDaoService to set
	 */
	public void setOffreDaoService(OffreDaoService offreDaoService) {
		this.offreDaoService = offreDaoService;
	}

	/**
	 * @return the offreModeCandidatureDaoService
	 */
	public OffreModeCandidatureDaoService getOffreModeCandidatureDaoService() {
		return offreModeCandidatureDaoService;
	}
	/**
	 * @param offreModeCandidatureDaoService the offreModeCandidatureDaoService to set
	 */
	public void setOffreModeCandidatureDaoService(
			OffreModeCandidatureDaoService offreModeCandidatureDaoService) {
		this.offreModeCandidatureDaoService = offreModeCandidatureDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#countOffreADiffuser(java.util.List)
	 */
	public int countOffreADiffuser(List<Integer> idsCentreGestion){
		return this.offreDaoService.countOffreADiffuser(idsCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#addOffre(org.esupportail.pstagedata.domain.dto.OffreDTO)
	 */
	public int addOffre(OffreDTO o) throws DataAddException, WebServiceDataBaseException{
		int tmp=0;
		try{
			tmp = this.offreDaoService.addOffre(UtilsDTO.getOffreFromDTO(o));
			this.offreModeCandidatureDaoService.addOffreModeCandidature(tmp, o.getIdsModeCandidature());
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#deleteOffreLogique(int)
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.deleteOffreLogique(idOffre);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#getAnneesUnivOffres()
	 */
	public List<String> getAnneesUnivOffres() {		
		return this.offreDaoService.getAnneesUnivOffres();
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#getNombreOffreByCentreGestion(int)
	 */
	public int getNombreOffreByCentreGestion(int idCentreGestion){
		return this.offreDaoService.getNombreOffreByCentreGestion(idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#getOffresFromIdStructureAndIdsCentreGestion(int, java.util.List, boolean)
	 */
	public List<OffreDTO> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant){
		List<OffreDTO> lr = null;
		if(idStructure>0){
			lr = UtilsDTO.getOffreListDTO(this.offreDaoService.getOffresFromIdStructureAndIdsCentreGestion(idStructure, idsCentreGestion,isEtudiant));
		}
		return lr;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#getOffreFromId(int)
	 */
	public OffreDTO getOffreFromId(int id){
		Offre o = this.offreDaoService.getOffreFromId(id);
		return o==null?null:new OffreDTO(o,false);
	}	

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#getOffresFromCriteres(org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO)
	 */
	public List<OffreDTO> getOffresFromCriteres(
			CritereRechercheOffreDTO critereRechercheOffre) {
		List<OffreDTO> lr = null;
		if(critereRechercheOffre!=null){
			lr = UtilsDTO.getOffreListDTOLight(this.offreDaoService.getOffresFromCriteres(UtilsDTO.getCritereRechercheOffreFromDTO(critereRechercheOffre)));
		}
		return lr;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateDiffusionOffre(int, java.lang.String, java.util.Date)
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateDiffusionOffre(idOffre, loginDiffusion, dateFinDiffusion);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateOffre(org.esupportail.pstagedata.domain.dto.OffreDTO)
	 */
	public boolean updateOffre(OffreDTO o) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateOffre(UtilsDTO.getOffreFromDTO(o));
			this.offreModeCandidatureDaoService.addOffreModeCandidature(o.getIdOffre(), o.getIdsModeCandidature());
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateRejetOffre(int, java.lang.String)
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateRejetOffre(idOffre, loginRejetValidation);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateStopDiffusionOffre(int, java.lang.String)
	 */
	public boolean updateStopDiffusionOffre(int idOffre,
			String loginStopDiffusion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateStopDiffusionOffre(idOffre, loginStopDiffusion);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateStopValidationOffre(int, java.lang.String)
	 */
	public boolean updateStopValidationOffre(int idOffre,
			String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateStopValidationOffre(idOffre, loginStopValidation);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateValidationOffre(int, java.lang.String)
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateValidationOffre(idOffre, loginValidation);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreDomainService#updateOffrePourvue(int, boolean)
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDaoService.updateOffrePourvue(idOffre, estPourvue);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}


}
