/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.StatutJuridiqueDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.beans.StatutJuridique;
import org.esupportail.pstagedata.domain.dto.StatutJuridiqueDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * StatutJuridique Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StatutJuridiqueDomainServiceImpl implements StatutJuridiqueDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * StatutJuridiqueDaoService
	 */
	private StatutJuridiqueDaoService statutJuridiqueDaoService;
	/**
	 * @return the statutJuridiqueDaoService
	 */
	public StatutJuridiqueDaoService getStatutJuridiqueDaoService() {
		return statutJuridiqueDaoService;
	}
	/**
	 * @param statutJuridiqueDaoService the statutJuridiqueDaoService to set
	 */
	public void setStatutJuridiqueDaoService(
			StatutJuridiqueDaoService statutJuridiqueDaoService) {
		this.statutJuridiqueDaoService = statutJuridiqueDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutJuridiqueFromTypeStructure(int)
	 */
	public StatutJuridiqueDTO getStatutJuridiqueFromTypeStructure(int id) {
		StatutJuridique s = this.statutJuridiqueDaoService.getStatutJuridiqueFromTypeStructure(id);
		return s==null?null:new StatutJuridiqueDTO(s);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutsJuridiques()
	 */
	public List<StatutJuridiqueDTO> getStatutsJuridiques() {
		return UtilsDTO.getStatutJuridiqueListDTO(this.statutJuridiqueDaoService.getStatutsJuridiques());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutsJuridiquesFromId(int)
	 */
	public StatutJuridiqueDTO getStatutsJuridiquesFromId(int id) {
		StatutJuridique s = this.statutJuridiqueDaoService.getStatutsJuridiquesFromId(id);
		return s==null?null:new StatutJuridiqueDTO(s);
	}
	

	public int addStatutJuridique(StatutJuridiqueDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.statutJuridiqueDaoService.addStatutJuridique(UtilsDTO.getStatutJuridiqueFromDTO(ef));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateStatutJuridique(StatutJuridiqueDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = statutJuridiqueDaoService.updateStatutJuridique(UtilsDTO.getStatutJuridiqueFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteStatutJuridique(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = statutJuridiqueDaoService.deleteStatutJuridique(id);
		}catch (DataDeleteDaoException e) {
			logger.debug(e);
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@Override
	public boolean reactivateStatutJuridique(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = statutJuridiqueDaoService.reactivateStatutJuridique(id);
		}catch (DataReactivateDaoException e) {
			logger.debug(e);
			throw new DataReactivateException(e.getMessage());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

}
