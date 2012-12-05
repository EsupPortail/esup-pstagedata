/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.CiviliteDaoService;
import org.esupportail.pstagedata.domain.dto.CiviliteDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * Civilite Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CiviliteDomainServiceImpl implements CiviliteDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * CiviliteDaoService
	 */
	private CiviliteDaoService civiliteDaoService;
	
	/**
	 * @return the civiliteDaoService
	 */
	public CiviliteDaoService getCiviliteDaoService() {
		return civiliteDaoService;
	}

	/**
	 * @param civiliteDaoService the civiliteDaoService to set
	 */
	public void setCiviliteDaoService(CiviliteDaoService civiliteDaoService) {
		this.civiliteDaoService = civiliteDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CiviliteDomainService#getCivilites()
	 */
	public List<CiviliteDTO> getCivilites(){
		return UtilsDTO.getCiviliteListDTO(this.civiliteDaoService.getCivilites());
	}

}
