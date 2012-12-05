/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.DureeDiffusionDaoService;
import org.esupportail.pstagedata.domain.dto.DureeDiffusionDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * DureeDiffusion Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class DureeDiffusionDomainServiceImpl implements DureeDiffusionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * DureeDiffusionDaoService
	 */
	private DureeDiffusionDaoService DureeDiffusionDaoService;
	
	/**
	 * @return the DureeDiffusionDaoService
	 */
	public DureeDiffusionDaoService getDureeDiffusionDaoService() {
		return DureeDiffusionDaoService;
	}

	/**
	 * @param DureeDiffusionDaoService the DureeDiffusionDaoService to set
	 */
	public void setDureeDiffusionDaoService(DureeDiffusionDaoService DureeDiffusionDaoService) {
		this.DureeDiffusionDaoService = DureeDiffusionDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.DureeDiffusionDomainService#getDureeDiffusion()
	 */
	public List<DureeDiffusionDTO> getDureeDiffusion(){
		return UtilsDTO.getDureeDiffusionListDTO(this.DureeDiffusionDaoService.getDureeDiffusion());
	}

}
