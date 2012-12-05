/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.NatureTravailDaoService;
import org.esupportail.pstagedata.domain.dto.NatureTravailDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class NatureTravailDomainServiceImpl implements NatureTravailDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * natureTravailDaoService
	 */
	private NatureTravailDaoService natureTravailDaoService;


	/**
	 * @return the natureTravailDaoService
	 */
	public NatureTravailDaoService getNatureTravailDaoService() {
		return natureTravailDaoService;
	}


	/**
	 * @param natureTravailDaoService the natureTravailDaoService to set
	 */
	public void setNatureTravailDaoService(
			NatureTravailDaoService natureTravailDaoService) {
		this.natureTravailDaoService = natureTravailDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.NatureTravailDomainService#getNatureTravails()
	 */
	public List<NatureTravailDTO> getNatureTravails() {
		return UtilsDTO.getNatureTravailListDTO(this.natureTravailDaoService.getNatureTravails());
	}

}
