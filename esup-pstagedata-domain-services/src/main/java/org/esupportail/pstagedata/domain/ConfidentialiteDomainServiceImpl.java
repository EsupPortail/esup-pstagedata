/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ConfidentialiteDaoService;
import org.esupportail.pstagedata.domain.dto.ConfidentialiteDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * Confidentialite Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class ConfidentialiteDomainServiceImpl implements ConfidentialiteDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ConfidentialiteDaoService
	 */
	private ConfidentialiteDaoService ConfidentialiteDaoService;
	
	/**
	 * @return the ConfidentialiteDaoService
	 */
	public ConfidentialiteDaoService getConfidentialiteDaoService() {
		return ConfidentialiteDaoService;
	}

	/**
	 * @param ConfidentialiteDaoService the ConfidentialiteDaoService to set
	 */
	public void setConfidentialiteDaoService(ConfidentialiteDaoService ConfidentialiteDaoService) {
		this.ConfidentialiteDaoService = ConfidentialiteDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConfidentialiteDomainService#getConfidentialite()
	 */
	public List<ConfidentialiteDTO> getConfidentialite(){
		return UtilsDTO.getConfidentialiteListDTO(this.ConfidentialiteDaoService.getConfidentialite());
	}

}
