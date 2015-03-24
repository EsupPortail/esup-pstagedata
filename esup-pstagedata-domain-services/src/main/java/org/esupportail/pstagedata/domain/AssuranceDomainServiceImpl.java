/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.AssuranceDaoService;
import org.esupportail.pstagedata.domain.dto.AssuranceDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * AssuranceDomainServiceImpl.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class AssuranceDomainServiceImpl implements AssuranceDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * AssuranceDaoService.
	 */
	private AssuranceDaoService assuranceDaoService;
	
		
	/**
	 * @return the assuranceDaoService
	 */
	public AssuranceDaoService getAssuranceDaoService() {
		return assuranceDaoService;
	}
	/**
	 * @param assuranceDaoService the assuranceDaoService to set
	 */
	public void setAssuranceDaoService(AssuranceDaoService assuranceDaoService) {
		this.assuranceDaoService = assuranceDaoService;
	}
	
	
	/**
	 * @see org.esupportail.pstagedata.domain.AssuranceDomainService#getAssurances()
	 */
	public List<AssuranceDTO> getAssurances() {
		return UtilsDTO.getAssuranceListDTO(this.assuranceDaoService.getAssurances());
	}
	
	

}
