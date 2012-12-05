/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeConventionDaoService;
import org.esupportail.pstagedata.domain.dto.TypeConventionDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


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

}
