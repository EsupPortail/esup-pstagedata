/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ModeValidationStageDaoService;
import org.esupportail.pstagedata.domain.dto.ModeValidationStageDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class ModeValidationStageDomainServiceImpl implements ModeValidationStageDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * modeValidationStageDaoService
	 */
	private ModeValidationStageDaoService modeValidationStageDaoService;




	/**
	 * @return the modeValidationStageDaoService
	 */
	public ModeValidationStageDaoService getModeValidationStageDaoService() {
		return modeValidationStageDaoService;
	}


	/**
	 * @param modeValidationStageDaoService the modeValidationStageDaoService to set
	 */
	public void setModeValidationStageDaoService(
			ModeValidationStageDaoService modeValidationStageDaoService) {
		this.modeValidationStageDaoService = modeValidationStageDaoService;
	}



	/**
	 * @see org.esupportail.pstagedata.domain.ModeValidationStageDomainService#getModeValidationStages()
	 */
	public List<ModeValidationStageDTO> getModeValidationStages() {
		return UtilsDTO.getModeValidationStageListDTO(this.modeValidationStageDaoService.getModeValidationStages());
	}

}
