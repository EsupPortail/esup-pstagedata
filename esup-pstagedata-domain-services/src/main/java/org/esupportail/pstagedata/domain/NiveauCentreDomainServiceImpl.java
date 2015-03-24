/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.NiveauCentreDaoService;
import org.esupportail.pstagedata.domain.dto.NiveauCentreDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * NiveauCentre Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class NiveauCentreDomainServiceImpl implements NiveauCentreDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * NiveauCentreDaoService
	 */
	private NiveauCentreDaoService NiveauCentreDaoService;
	
	/**
	 * @return the NiveauCentreDaoService
	 */
	public NiveauCentreDaoService getNiveauCentreDaoService() {
		return NiveauCentreDaoService;
	}

	/**
	 * @param NiveauCentreDaoService the NiveauCentreDaoService to set
	 */
	public void setNiveauCentreDaoService(NiveauCentreDaoService NiveauCentreDaoService) {
		this.NiveauCentreDaoService = NiveauCentreDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.NiveauCentreDomainService#getNiveauCentre()
	 */
	public List<NiveauCentreDTO> getNiveauCentre(){
		return UtilsDTO.getNiveauCentreListDTO(this.NiveauCentreDaoService.getNiveauCentre());
	}

}
