/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.ContratDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.dto.ContratOffreDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Contrat Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContratDomainServiceImpl implements ContratDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * ContratDaoService
	 */
	private ContratDaoService contratDaoService;
		
	/**
	 * @return the contratDaoService
	 */
	public ContratDaoService getContratDaoService() {
		return contratDaoService;
	}

	/**
	 * @param contratDaoService the contratDaoService to set
	 */
	public void setContratDaoService(ContratDaoService contratDaoService) {
		this.contratDaoService = contratDaoService;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContratDomainService#getContrats()
	 */
	public List<ContratOffreDTO> getContrats() {
		return UtilsDTO.getContratOffreListDTO(this.contratDaoService.getContrats());
	}

	@Override
	public int addContratOffre(ContratOffreDTO co) throws DataAddException,
			WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.contratDaoService.addContratOffre(UtilsDTO.getContratOffreFromDTO(co));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	@Override
	public boolean updateContratOffre(ContratOffreDTO co)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = contratDaoService.updateContratOffre(UtilsDTO.getContratOffreFromDTO(co));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@Override
	public boolean deleteContratOffre(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = contratDaoService.deleteContratOffre(id);
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
	public boolean reactivateContratOffre(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = contratDaoService.reactivateContratOffre(id);
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
