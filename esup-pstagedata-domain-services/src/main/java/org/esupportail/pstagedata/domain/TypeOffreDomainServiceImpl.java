/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeOffreDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.TypeOffreDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
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
		int tmp=0;
		try{
			tmp = this.typeOffreDaoService.addTypeOffre(UtilsDTO.getTypeOffreFromDTO(ef));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateTypeOffre(TypeOffreDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeOffreDaoService.updateTypeOffre(UtilsDTO.getTypeOffreFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteTypeOffre(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeOffreDaoService.deleteTypeOffre(id);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

}
