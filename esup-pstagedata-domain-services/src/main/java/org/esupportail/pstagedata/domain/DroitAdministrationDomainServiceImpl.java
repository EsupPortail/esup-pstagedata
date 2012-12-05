/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.DroitAdministrationDaoService;
import org.esupportail.pstagedata.domain.dto.DroitAdministrationDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * DroitAdministration Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class DroitAdministrationDomainServiceImpl implements DroitAdministrationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * DroitAdministrationDaoService
	 */
	private DroitAdministrationDaoService DroitAdministrationDaoService;
	
	/**
	 * @return the DroitAdministrationDaoService
	 */
	public DroitAdministrationDaoService getDroitAdministrationDaoService() {
		return DroitAdministrationDaoService;
	}

	/**
	 * @param DroitAdministrationDaoService the DroitAdministrationDaoService to set
	 */
	public void setDroitAdministrationDaoService(DroitAdministrationDaoService DroitAdministrationDaoService) {
		this.DroitAdministrationDaoService = DroitAdministrationDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.DroitAdministrationDomainService#getDroitAdministration()
	 */
	public List<DroitAdministrationDTO> getDroitAdministration(){
		return UtilsDTO.getDroitAdministrationListDTO(this.DroitAdministrationDaoService.getDroitAdministration());
	}

}
