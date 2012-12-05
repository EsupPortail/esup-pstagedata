/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ModeCandidatureDaoService;
import org.esupportail.pstagedata.domain.dto.ModeCandidatureDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * ModeCandidature Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ModeCandidatureDomainServiceImpl implements ModeCandidatureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ModeCandidatureDaoService
	 */
	private ModeCandidatureDaoService modeCandidatureDaoService;
	/**
	 * @return the modeCandidatureDaoService
	 */
	public ModeCandidatureDaoService getModeCandidatureDaoService() {
		return modeCandidatureDaoService;
	}
	/**
	 * @param modeCandidatureDaoService the modeCandidatureDaoService to set
	 */
	public void setModeCandidatureDaoService(
			ModeCandidatureDaoService modeCandidatureDaoService) {
		this.modeCandidatureDaoService = modeCandidatureDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ModeCandidatureDomainService#getModesCandidature()
	 */
	public List<ModeCandidatureDTO> getModesCandidature() {
		return UtilsDTO.getModeCandidatureListDTO(this.modeCandidatureDaoService.getModesCandidature());
	}
	
}
