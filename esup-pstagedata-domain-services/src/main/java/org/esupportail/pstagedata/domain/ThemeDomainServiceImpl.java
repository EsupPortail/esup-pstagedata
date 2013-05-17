/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ThemeDaoService;
import org.esupportail.pstagedata.domain.dto.ThemeDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class ThemeDomainServiceImpl implements ThemeDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * natureTravailDaoService
	 */
	private ThemeDaoService themeDaoService;




	/**
	 * @return the themeDaoService
	 */
	public ThemeDaoService getThemeDaoService() {
		return themeDaoService;
	}


	/**
	 * @param themeDaoService the themeDaoService to set
	 */
	public void setThemeDaoService(ThemeDaoService themeDaoService) {
		this.themeDaoService = themeDaoService;
	}

	
	/**
	 * @see org.esupportail.pstagedata.domain.ThemeDomainService#getThemes()
	 */
	public List<ThemeDTO> getThemes() {
		return UtilsDTO.getThemeListDTO(this.themeDaoService.getThemes());
	}

}
