/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ModeVersGratificationDaoService;
import org.esupportail.pstagedata.domain.dto.ModeVersGratificationDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class ModeVersGratificationDomainServiceImpl implements ModeVersGratificationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * modeVersGratificationDaoService
	 */
	private ModeVersGratificationDaoService modeVersGratificationDaoService;


	

	/**
	 * @return the modeVersGratificationDaoService
	 */
	public ModeVersGratificationDaoService getModeVersGratificationDaoService() {
		return modeVersGratificationDaoService;
	}



	/**
	 * @param modeVersGratificationDaoService the modeVersGratificationDaoService to set
	 */
	public void setModeVersGratificationDaoService(
			ModeVersGratificationDaoService modeVersGratificationDaoService) {
		this.modeVersGratificationDaoService = modeVersGratificationDaoService;
	}



	/**
	 * @see org.esupportail.pstagedata.domain.ModeVersGratificationDomainService#getModeVersGratifications()
	 */
	public List<ModeVersGratificationDTO> getModeVersGratifications() {
		return UtilsDTO.getModeVersGratificationListDTO(this.modeVersGratificationDaoService.getModeVersGratifications());
	}

}
