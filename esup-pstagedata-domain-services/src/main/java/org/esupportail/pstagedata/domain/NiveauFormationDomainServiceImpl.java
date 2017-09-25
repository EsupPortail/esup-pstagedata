/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.NiveauFormationDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.NiveauFormationDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * NiveauFormation Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NiveauFormationDomainServiceImpl implements NiveauFormationDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * NiveauFormationDaoService
	 */
	private NiveauFormationDaoService niveauFormationDaoService;
	/**
	 * @return the niveauFormationDaoService
	 */
	public NiveauFormationDaoService getNiveauFormationDaoService() {
		return niveauFormationDaoService;
	}
	/**
	 * @param niveauFormationDaoService the niveauFormationDaoService to set
	 */
	public void setNiveauFormationDaoService(
			NiveauFormationDaoService niveauFormationDaoService) {
		this.niveauFormationDaoService = niveauFormationDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.NiveauFormationDomainService#getNiveauxFormation()
	 */
	public List<NiveauFormationDTO> getNiveauxFormation() {
		return UtilsDTO.getNiveauFormationListDTO(this.niveauFormationDaoService.getNiveauxFormation()); 
	}

	public int addNiveauFormation(NiveauFormationDTO ef) throws DataAddException,
	WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.niveauFormationDaoService.addNiveauFormation(UtilsDTO.getNiveauFormationFromDTO(ef));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateNiveauFormation(NiveauFormationDTO ef) throws DataUpdateException,
	WebServiceDataBaseException {
		boolean b;
		try{
			b = niveauFormationDaoService.updateNiveauFormation(UtilsDTO.getNiveauFormationFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteNiveauFormation(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b;
		try{
			b = niveauFormationDaoService.deleteNiveauFormation(id);
		}catch (DataDeleteDaoException e) {
			logger.debug(e);
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean reactivateNiveauFormation(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try {
			b = niveauFormationDaoService.reactivateNiveauFormation(id);
		} catch (DataReactivateException e) {
			logger.debug(e);
			throw new DataReactivateException(e.getMessage());
		} catch(DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
