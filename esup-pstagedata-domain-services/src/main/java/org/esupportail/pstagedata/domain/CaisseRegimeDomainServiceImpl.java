/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.CaisseRegimeDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.CaisseRegimeDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;

import java.util.List;



/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class CaisseRegimeDomainServiceImpl implements CaisseRegimeDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());

	/**
	 * caisseRegimeDaoService
	 */
	private CaisseRegimeDaoService caisseRegimeDaoService;

	/**
	 * @return the caisseRegimeDaoService
	 */
	public CaisseRegimeDaoService getCaisseRegimeDaoService() {
		return caisseRegimeDaoService;
	}
	/**
	 * @param caisseRegimeDaoService the caisseRegimeDaoService to set
	 */
	public void setCaisseRegimeDaoService(
			CaisseRegimeDaoService caisseRegimeDaoService) {
		this.caisseRegimeDaoService = caisseRegimeDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CaisseRegimeDomainService#getCaisseRegimes()
	 */
	public List<CaisseRegimeDTO> getCaisseRegimes() {
		return UtilsDTO.getCaisseRegimeListDTO(this.caisseRegimeDaoService.getCaisseRegimes());
	}

	public int addCaisseRegime(CaisseRegimeDTO cr) throws DataAddException,WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.caisseRegimeDaoService.addCaisseRegime(UtilsDTO.getCaisseRegimeFromDTO(cr));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateCaisseRegime(CaisseRegimeDTO cr, String codeCaisse)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = caisseRegimeDaoService.updateCaisseRegime(UtilsDTO.getCaisseRegimeFromDTO(cr), codeCaisse);
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteCaisseRegime(String codeCaisse)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = caisseRegimeDaoService.deleteCaisseRegime(codeCaisse);
		}catch (DataDeleteDaoException e) {
			logger.debug(e);
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean reactivateCaisseRegime(String codeCaisse) throws DataReactivateException, WebServiceDataBaseException {
		boolean b = false;
		try {
			b = caisseRegimeDaoService.reactivateCaisseRegime(codeCaisse);
		} catch (DataReactivateException e) {
			logger.debug(e);
			throw new DataReactivateException(e.getMessage());
		} catch(DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(),e.getCause());
		}
		return b;
	}

}
