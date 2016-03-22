/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeStructureDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.beans.TypeStructure;
import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;
import org.hibernate.exception.DataException;


/**
 * TypeStructure Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructureDomainServiceImpl implements TypeStructureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * TypeStructureDaoService
	 */
	private TypeStructureDaoService typeStructureDaoService;
	/**
	 * @return the typeStructureDaoService
	 */
	public TypeStructureDaoService getTypeStructureDaoService() {
		return typeStructureDaoService;
	}
	/**
	 * @param typeStructureDaoService the typeStructureDaoService to set
	 */
	public void setTypeStructureDaoService(
			TypeStructureDaoService typeStructureDaoService) {
		this.typeStructureDaoService = typeStructureDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypeStructureFromId(int)
	 */
	public TypeStructureDTO getTypeStructureFromId(int id) {
		TypeStructure t = this.typeStructureDaoService.getTypeStructureFromId(id);
		return t==null?null:new TypeStructureDTO(t);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypesStructure()
	 */
	public List<TypeStructureDTO> getTypesStructure() {
		return UtilsDTO.getTypeStructureListDTO(this.typeStructureDaoService.getTypesStructure());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypesStructureFromStatutJuridique(int)
	 */
	public List<TypeStructureDTO> getTypesStructureFromStatutJuridique(int id) {
		return UtilsDTO.getTypeStructureListDTO(this.typeStructureDaoService.getTypesStructureFromStatutJuridique(id));
	}
	

	public int addTypeStructure(TypeStructureDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.typeStructureDaoService.addTypeStructure(UtilsDTO.getTypeStructureFromDTO(ef));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateTypeStructure(TypeStructureDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeStructureDaoService.updateTypeStructure(UtilsDTO.getTypeStructureFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteTypeStructure(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeStructureDaoService.deleteTypeStructure(id);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@Override
	public boolean reactivateTypeStructure(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = typeStructureDaoService.reactivateTypeStructure(id);
		}catch (DataReactivateDaoException e) {
			throw new DataReactivateException(e.getMessage());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
