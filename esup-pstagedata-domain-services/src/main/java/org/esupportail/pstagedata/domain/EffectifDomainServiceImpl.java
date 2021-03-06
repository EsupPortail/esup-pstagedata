/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.EffectifDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.dto.EffectifDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Effectif Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class EffectifDomainServiceImpl implements EffectifDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * EffectifDaoService
	 */
	private EffectifDaoService effectifDaoService;
	/**
	 * @return the effectifDaoService
	 */
	public EffectifDaoService getEffectifDaoService() {
		return effectifDaoService;
	}
	/**
	 * @param effectifDaoService the effectifDaoService to set
	 */
	public void setEffectifDaoService(EffectifDaoService effectifDaoService) {
		this.effectifDaoService = effectifDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.EffectifDomainService#getEffectifs()
	 */
	public List<EffectifDTO> getEffectifs() {
		return UtilsDTO.getEffectifListDTO(this.effectifDaoService.getEffectifs());
	}

	public int addEffectif(EffectifDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.effectifDaoService.addEffectif(UtilsDTO.getEffectifFromDTO(ef));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateEffectif(EffectifDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = effectifDaoService.updateEffectif(UtilsDTO.getEffectifFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteEffectif(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = effectifDaoService.deleteEffectif(id);
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
	public boolean reactivateEffectif(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = effectifDaoService.reactivateEffectif(id);
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
