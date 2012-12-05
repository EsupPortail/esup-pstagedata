/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.UniteGratificationDaoService;
import org.esupportail.pstagedata.domain.dto.UniteGratificationDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class UniteGratificationDomainServiceImpl implements UniteGratificationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * uniteGratificationDaoService
	 */
	private UniteGratificationDaoService uniteGratificationDaoService;

	

	/**
	 * @return the uniteGratificationDaoService
	 */
	public UniteGratificationDaoService getUniteGratificationDaoService() {
		return uniteGratificationDaoService;
	}


	/**
	 * @param uniteGratificationDaoService the uniteGratificationDaoService to set
	 */
	public void setUniteGratificationDaoService(
			UniteGratificationDaoService uniteGratificationDaoService) {
		this.uniteGratificationDaoService = uniteGratificationDaoService;
	}



	/**
	 * @see org.esupportail.pstagedata.domain.UniteGratificationDomainService#getUniteGratifications()
	 */
	public List<UniteGratificationDTO> getUniteGratifications() {
		return UtilsDTO.getUniteGratificationListDTO(this.uniteGratificationDaoService.getUniteGratifications());
	}

}
