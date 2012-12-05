/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.NiveauFormationDaoService;
import org.esupportail.pstagedata.domain.dto.NiveauFormationDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * NiveauFormation Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NiveauFormationDomainServiceImpl implements NiveauFormationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * NiveauFormationDaoService
	 */
	private NiveauFormationDaoService niveauFormationDaoService;
	/**
	 * @return the niveauFormationDaoService
	 */
	public NiveauFormationDaoService getNiveauFormationDaoService() {
		return niveauFormationDaoService;
	}
	/**
	 * @param niveauFormationDaoService the niveauFormationDaoService to set
	 */
	public void setNiveauFormationDaoService(
			NiveauFormationDaoService niveauFormationDaoService) {
		this.niveauFormationDaoService = niveauFormationDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NiveauFormationDomainService#getNiveauxFormation()
	 */
	public List<NiveauFormationDTO> getNiveauxFormation() {
		return UtilsDTO.getNiveauFormationListDTO(this.niveauFormationDaoService.getNiveauxFormation()); 
	}
	

}
