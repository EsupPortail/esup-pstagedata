/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeOffreDaoService;
import org.esupportail.pstagedata.domain.dto.TypeOffreDTO;
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
	
	

}
