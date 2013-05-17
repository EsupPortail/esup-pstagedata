/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.OrigineStageDaoService;
import org.esupportail.pstagedata.domain.dto.OrigineStageDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class OrigineStageDomainServiceImpl implements OrigineStageDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * langueConventionDaoService
	 */
	private OrigineStageDaoService origineStageDaoService;
	
	/**
	 * @return the origineStageDaoService
	 */
	public OrigineStageDaoService getOrigineStageDaoService() {
		return origineStageDaoService;
	}

	/**
	 * @param origineStageDaoService the origineStageDaoService to set
	 */
	public void setOrigineStageDaoService(
			OrigineStageDaoService origineStageDaoService) {
		this.origineStageDaoService = origineStageDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OrigineStageDomainService#getOrigineStages()
	 */
	public List<OrigineStageDTO> getOrigineStages() {
		return UtilsDTO.getOrigineStageListDTO(this.origineStageDaoService.getOrigineStages());
	}

}
