/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.TypeOffreDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.dto.TypeOffreDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * TypeOffre Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeOffreDomainServiceImpl implements TypeOffreDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * TypeOffreDaoService
	 */
	private TypeOffreDaoService typeOffreDaoService;
	/**
	 * @return the typeOffreDaoService
	 */
	public TypeOffreDaoService getTypeOffreDaoService() {
		return typeOffreDaoService;
	}
	/**
	 * @param typeOffreDaoService the typeOffreDaoService to set
	 */
	public void setTypeOffreDaoService(TypeOffreDaoService typeOffreDaoService) {
		this.typeOffreDaoService = typeOffreDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeOffreDomainService#getTypesOffre()
	 */
	public List<TypeOffreDTO> getTypesOffre() {
		return UtilsDTO.getTypeOffreListDTO(this.typeOffreDaoService.getTypesOffre());
	}
	

	public int addTypeOffre(TypeOffreDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.typeOffreDaoService.addTypeOffre(UtilsDTO.getTypeOffreFromDTO(ef));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateTypeOffre(TypeOffreDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = typeOffreDaoService.updateTypeOffre(UtilsDTO.getTypeOffreFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteTypeOffre(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b;
		try{
			b = typeOffreDaoService.deleteTypeOffre(id);
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
	public boolean reactivateTypeOffre(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b;
		try{
			b = typeOffreDaoService.reactivateTypeOffre(id);
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
