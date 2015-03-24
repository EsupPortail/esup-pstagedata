/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeConventionDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.TypeConventionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class TypeConventionDomainServiceImpl implements TypeConventionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * natureTravailDaoService
	 */
	private TypeConventionDaoService typeConventionDaoService;


	
	/**
	 * @return the typeConventionDaoService
	 */
	public TypeConventionDaoService getTypeConventionDaoService() {
		return typeConventionDaoService;
	}


	/**
	 * @param typeConventionDaoService the typeConventionDaoService to set
	 */
	public void setTypeConventionDaoService(
			TypeConventionDaoService typeConventionDaoService) {
		this.typeConventionDaoService = typeConventionDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.TypeConventionDomainService#getTypeConventions()
	 */
	public List<TypeConventionDTO> getTypeConventions() {
		return UtilsDTO.getTypeConventionListDTO(this.typeConventionDaoService.getTypeConventions());
	}


	public int addTypeConvention(TypeConventionDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.typeConventionDaoService.addTypeConvention(UtilsDTO.getTypeConventionFromDTO(ef));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateTypeConvention(TypeConventionDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeConventionDaoService.updateTypeConvention(UtilsDTO.getTypeConventionFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteTypeConvention(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeConventionDaoService.deleteTypeConvention(id);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
