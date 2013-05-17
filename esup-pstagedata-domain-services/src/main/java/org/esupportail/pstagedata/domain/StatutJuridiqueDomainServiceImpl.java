/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.StatutJuridiqueDaoService;
import org.esupportail.pstagedata.domain.beans.StatutJuridique;
import org.esupportail.pstagedata.domain.dto.StatutJuridiqueDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * StatutJuridique Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StatutJuridiqueDomainServiceImpl implements StatutJuridiqueDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * StatutJuridiqueDaoService
	 */
	private StatutJuridiqueDaoService statutJuridiqueDaoService;
	/**
	 * @return the statutJuridiqueDaoService
	 */
	public StatutJuridiqueDaoService getStatutJuridiqueDaoService() {
		return statutJuridiqueDaoService;
	}
	/**
	 * @param statutJuridiqueDaoService the statutJuridiqueDaoService to set
	 */
	public void setStatutJuridiqueDaoService(
			StatutJuridiqueDaoService statutJuridiqueDaoService) {
		this.statutJuridiqueDaoService = statutJuridiqueDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutJuridiqueFromTypeStructure(int)
	 */
	public StatutJuridiqueDTO getStatutJuridiqueFromTypeStructure(int id) {
		StatutJuridique s = this.statutJuridiqueDaoService.getStatutJuridiqueFromTypeStructure(id);
		return s==null?null:new StatutJuridiqueDTO(s);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutsJuridiques()
	 */
	public List<StatutJuridiqueDTO> getStatutsJuridiques() {
		return UtilsDTO.getStatutJuridiqueListDTO(this.statutJuridiqueDaoService.getStatutsJuridiques());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StatutJuridiqueDomainService#getStatutsJuridiquesFromId(int)
	 */
	public StatutJuridiqueDTO getStatutsJuridiquesFromId(int id) {
		StatutJuridique s = this.statutJuridiqueDaoService.getStatutsJuridiquesFromId(id);
		return s==null?null:new StatutJuridiqueDTO(s);
	}
	
	

}
