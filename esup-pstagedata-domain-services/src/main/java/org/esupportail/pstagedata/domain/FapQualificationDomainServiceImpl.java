/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FapQualificationDaoService;
import org.esupportail.pstagedata.domain.beans.FapQualification;
import org.esupportail.pstagedata.domain.dto.FapQualificationDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FapQualification Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualificationDomainServiceImpl implements FapQualificationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * FapQualificationDaoService
	 */
	private FapQualificationDaoService FapQualificationDaoService;
	/**
	 * @return the fapQualificationDaoService
	 */
	public FapQualificationDaoService getFapQualificationDaoService() {
		return FapQualificationDaoService;
	}
	/**
	 * @param fapQualificationDaoService the fapQualificationDaoService to set
	 */
	public void setFapQualificationDaoService(
			FapQualificationDaoService fapQualificationDaoService) {
		FapQualificationDaoService = fapQualificationDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationDomainService#getFapQualificationFromId(int)
	 */
	public FapQualificationDTO getFapQualificationFromId(int id) {
		FapQualification f = this.FapQualificationDaoService.getFapQualificationFromId(id);
		return f==null?null:new FapQualificationDTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationDomainService#getFapQualificationFromIdQualificationSimplifiee(int)
	 */
	public List<FapQualificationDTO> getFapQualificationFromIdQualificationSimplifiee(
			int id) {
		return UtilsDTO.getFapQualificationListDTO(this.FapQualificationDaoService.getFapQualificationFromIdQualificationSimplifiee(id));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationDomainService#getFapQualifications()
	 */
	public List<FapQualificationDTO> getFapQualifications() {
		return UtilsDTO.getFapQualificationListDTO(this.FapQualificationDaoService.getFapQualifications());
	}
	

}
