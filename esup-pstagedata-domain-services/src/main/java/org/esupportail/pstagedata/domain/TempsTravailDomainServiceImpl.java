/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TempsTravailDaoService;
import org.esupportail.pstagedata.domain.dto.TempsTravailDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * TempsTravail Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TempsTravailDomainServiceImpl implements TempsTravailDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * TempsTravailDaoService
	 */
	private TempsTravailDaoService tempsTravailDaoService;
	/**
	 * @return the tempsTravailDaoService
	 */
	public TempsTravailDaoService getTempsTravailDaoService() {
		return tempsTravailDaoService;
	}
	/**
	 * @param tempsTravailDaoService the tempsTravailDaoService to set
	 */
	public void setTempsTravailDaoService(
			TempsTravailDaoService tempsTravailDaoService) {
		this.tempsTravailDaoService = tempsTravailDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TempsTravailDomainService#getTempsTravail()
	 */
	public List<TempsTravailDTO> getTempsTravail() {
		return UtilsDTO.getTempsTravailListDTO(this.tempsTravailDaoService.getTempsTravail());
	}
	
	

}
