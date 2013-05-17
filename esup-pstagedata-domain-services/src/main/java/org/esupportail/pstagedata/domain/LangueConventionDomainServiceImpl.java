/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.LangueConventionDaoService;
import org.esupportail.pstagedata.domain.dto.LangueConventionDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class LangueConventionDomainServiceImpl implements LangueConventionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * langueConventionDaoService
	 */
	private LangueConventionDaoService langueConventionDaoService;


	/**
	 * @return the langueConventionDaoService
	 */
	public LangueConventionDaoService getLangueConventionDaoService() {
		return langueConventionDaoService;
	}


	/**
	 * @param langueConventionDaoService the langueConventionDaoService to set
	 */
	public void setLangueConventionDaoService(
			LangueConventionDaoService langueConventionDaoService) {
		this.langueConventionDaoService = langueConventionDaoService;
	}

	
	/**
	 * @see org.esupportail.pstagedata.domain.LangueConventionDomainService#getLangueConventions()
	 */
	public List<LangueConventionDTO> getLangueConventions() {

		return UtilsDTO.getLangueConventionListDTO(this.langueConventionDaoService.getLangueConventions());
	}

}
