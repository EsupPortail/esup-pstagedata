/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FapQualificationSimplifieeDaoService;
import org.esupportail.pstagedata.domain.beans.FapQualificationSimplifiee;
import org.esupportail.pstagedata.domain.dto.FapQualificationSimplifieeDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * FapQualificationSimplifiee Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualificationSimplifieeDomainServiceImpl implements FapQualificationSimplifieeDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * FapQualificationSimplifieeDaoService
	 */
	private FapQualificationSimplifieeDaoService fapQualificationSimplifieeDaoService;
	/**
	 * @return the fapQualificationSimplifieeDaoService
	 */
	public FapQualificationSimplifieeDaoService getFapQualificationSimplifieeDaoService() {
		return fapQualificationSimplifieeDaoService;
	}
	/**
	 * @param fapQualificationSimplifieeDaoService the fapQualificationSimplifieeDaoService to set
	 */
	public void setFapQualificationSimplifieeDaoService(
			FapQualificationSimplifieeDaoService fapQualificationSimplifieeDaoService) {
		this.fapQualificationSimplifieeDaoService = fapQualificationSimplifieeDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationSimplifieeDomainService#getFapQualificationSimplifieeFromId(int)
	 */
	public FapQualificationSimplifieeDTO getFapQualificationSimplifieeFromId(
			int id) {
		FapQualificationSimplifiee f = this.fapQualificationSimplifieeDaoService.getFapQualificationSimplifieeFromId(id);
		return f==null?null:new FapQualificationSimplifieeDTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationSimplifieeDomainService#getFapQualificationSimplifieeFromNumFapQualification(int)
	 */
	public FapQualificationSimplifieeDTO getFapQualificationSimplifieeFromNumFapQualification(
			int num) {
		return new FapQualificationSimplifieeDTO(this.fapQualificationSimplifieeDaoService.getFapQualificationSimplifieeFromNumFapQualification(num));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapQualificationSimplifieeDomainService#getFapQualificationsSimplifiees()
	 */
	public List<FapQualificationSimplifieeDTO> getFapQualificationsSimplifiees() {
		return UtilsDTO.getFapQualificationSimplifieeListDTO(this.fapQualificationSimplifieeDaoService.getFapQualificationsSimplifiees());
	}
	

}
