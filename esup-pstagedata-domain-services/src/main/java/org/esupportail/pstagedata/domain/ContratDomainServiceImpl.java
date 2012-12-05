/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ContratDaoService;
import org.esupportail.pstagedata.domain.dto.ContratOffreDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * Contrat Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContratDomainServiceImpl implements ContratDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ContratDaoService
	 */
	private ContratDaoService contratDaoService;
		
	/**
	 * @return the contratDaoService
	 */
	public ContratDaoService getContratDaoService() {
		return contratDaoService;
	}

	/**
	 * @param contratDaoService the contratDaoService to set
	 */
	public void setContratDaoService(ContratDaoService contratDaoService) {
		this.contratDaoService = contratDaoService;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContratDomainService#getContrats()
	 */
	public List<ContratOffreDTO> getContrats() {
		return UtilsDTO.getContratOffreListDTO(this.contratDaoService.getContrats());
	}
	

}
