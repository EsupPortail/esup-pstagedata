/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.IndemnisationDaoService;
import org.esupportail.pstagedata.domain.dto.IndemnisationDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class IndemnisationDomainServiceImpl implements IndemnisationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * IndemnisationDaoService
	 */
	private IndemnisationDaoService indemnisationDaoService;

	
	/**
	 * @return the indemnisationDaoService
	 */
	public IndemnisationDaoService getIndemnisationDaoService() {
		return indemnisationDaoService;
	}


	/**
	 * @param indemnisationDaoService the indemnisationDaoService to set
	 */
	public void setIndemnisationDaoService(
			IndemnisationDaoService indemnisationDaoService) {
		this.indemnisationDaoService = indemnisationDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.IndemnisationDomainService#getIndemnisations()
	 */
	public List<IndemnisationDTO> getIndemnisations() {
		return UtilsDTO.getIndemnisationListDTO(this.getIndemnisationDaoService().getIndemnisations());
	}

}
