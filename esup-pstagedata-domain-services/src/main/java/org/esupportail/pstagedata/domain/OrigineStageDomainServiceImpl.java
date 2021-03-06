/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.OrigineStageDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.dto.OrigineStageDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class OrigineStageDomainServiceImpl implements OrigineStageDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	
	/**
	 * langueConventionDaoService
	 */
	private OrigineStageDaoService origineStageDaoService;
	
	/**
	 * @return the origineStageDaoService
	 */
	public OrigineStageDaoService getOrigineStageDaoService() {
		return origineStageDaoService;
	}

	/**
	 * @param origineStageDaoService the origineStageDaoService to set
	 */
	public void setOrigineStageDaoService(
			OrigineStageDaoService origineStageDaoService) {
		this.origineStageDaoService = origineStageDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OrigineStageDomainService#getOrigineStages()
	 */
	public List<OrigineStageDTO> getOrigineStages() {
		return UtilsDTO.getOrigineStageListDTO(this.origineStageDaoService.getOrigineStages());
	}

	public int addOrigineStage(OrigineStageDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.origineStageDaoService.addOrigineStage(UtilsDTO.getOrigineStageFromDTO(ef));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateOrigineStage(OrigineStageDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = origineStageDaoService.updateOrigineStage(UtilsDTO.getOrigineStageFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteOrigineStage(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = origineStageDaoService.deleteOrigineStage(id);
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
	public boolean reactivateOrigineStage(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = origineStageDaoService.reactivateOrigineStage(id);
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
