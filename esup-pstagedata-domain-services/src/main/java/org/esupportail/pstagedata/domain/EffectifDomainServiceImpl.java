/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.EffectifDaoService;
import org.esupportail.pstagedata.domain.dto.EffectifDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * Effectif Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class EffectifDomainServiceImpl implements EffectifDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * EffectifDaoService
	 */
	private EffectifDaoService effectifDaoService;
	/**
	 * @return the effectifDaoService
	 */
	public EffectifDaoService getEffectifDaoService() {
		return effectifDaoService;
	}
	/**
	 * @param effectifDaoService the effectifDaoService to set
	 */
	public void setEffectifDaoService(EffectifDaoService effectifDaoService) {
		this.effectifDaoService = effectifDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.EffectifDomainService#getEffectifs()
	 */
	public List<EffectifDTO> getEffectifs() {
		return UtilsDTO.getEffectifListDTO(this.effectifDaoService.getEffectifs());
	}

	

}
