/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.UniteDureeDaoService;
import org.esupportail.pstagedata.domain.dto.UniteDureeDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * UniteDuree Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class UniteDureeDomainServiceImpl implements UniteDureeDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UniteDureeDaoService
	 */
	private UniteDureeDaoService uniteDureeDaoService;
	/**
	 * @return the uniteDureeDaoService
	 */
	public UniteDureeDaoService getUniteDureeDaoService() {
		return uniteDureeDaoService;
	}
	/**
	 * @param uniteDureeDaoService the uniteDureeDaoService to set
	 */
	public void setUniteDureeDaoService(UniteDureeDaoService uniteDureeDaoService) {
		this.uniteDureeDaoService = uniteDureeDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.UniteDureeDomainService#getUnitesDurees()
	 */
	public List<UniteDureeDTO> getUnitesDurees() {
		return UtilsDTO.getUniteDureeListDTO(this.uniteDureeDaoService.getUnitesDurees());
	}
	
	

}
