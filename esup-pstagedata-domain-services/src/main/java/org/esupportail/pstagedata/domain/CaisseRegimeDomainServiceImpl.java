/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.CaisseRegimeDaoService;
import org.esupportail.pstagedata.domain.dto.CaisseRegimeDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;



/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class CaisseRegimeDomainServiceImpl implements CaisseRegimeDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * caisseRegimeDaoService
	 */
	private CaisseRegimeDaoService caisseRegimeDaoService;
	
	/**
	 * @return the caisseRegimeDaoService
	 */
	public CaisseRegimeDaoService getCaisseRegimeDaoService() {
		return caisseRegimeDaoService;
	}
	/**
	 * @param caisseRegimeDaoService the caisseRegimeDaoService to set
	 */
	public void setCaisseRegimeDaoService(
			CaisseRegimeDaoService caisseRegimeDaoService) {
		this.caisseRegimeDaoService = caisseRegimeDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CaisseRegimeDomainService#getCaisseRegimes()
	 */
	public List<CaisseRegimeDTO> getCaisseRegimes() {
		return UtilsDTO.getCaisseRegimeListDTO(this.caisseRegimeDaoService.getCaisseRegimes());
	}
	
	

}
