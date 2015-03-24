/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FapN3DaoService;
import org.esupportail.pstagedata.domain.beans.FapN3;
import org.esupportail.pstagedata.domain.dto.FapN3DTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FapN3 Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN3DomainServiceImpl implements FapN3DomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * FapN3DaoService
	 */
	private FapN3DaoService fapN3DaoService;
	
	/**
	 * @return the fapN3DaoService
	 */
	public FapN3DaoService getFapN3DaoService() {
		return fapN3DaoService;
	}

	/**
	 * @param fapN3DaoService the fapN3DaoService to set
	 */
	public void setFapN3DaoService(FapN3DaoService fapN3DaoService) {
		this.fapN3DaoService = fapN3DaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FapN3DomainService#getFapN3()
	 */
	public List<FapN3DTO> getFapN3() {
		return UtilsDTO.getFapN3ListDTO(this.fapN3DaoService.getFapN3());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN3DomainService#getFapN3FromCodeFapN2(java.lang.String)
	 */
	public FapN3DTO getFapN3FromCodeFapN2(String code) {
		FapN3 f = this.fapN3DaoService.getFapN3FromCodeFapN2(code);
		return f==null?null:new FapN3DTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN3DomainService#getFapN3FromCodeFapN3(java.lang.String)
	 */
	public FapN3DTO getFapN3FromCodeFapN3(String code) {
		FapN3 f = this.fapN3DaoService.getFapN3FromCodeFapN3(code);
		return f==null?null:new FapN3DTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN3DomainService#getFapN3FromQualification(int)
	 */
	public List<FapN3DTO> getFapN3FromQualification(int num) {
		return UtilsDTO.getFapN3ListDTO(this.fapN3DaoService.getFapN3FromQualification(num));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN3DomainService#getFapN3FromQualificationSimplifiee(int)
	 */
	public List<FapN3DTO> getFapN3FromQualificationSimplifiee(int num) {
		return UtilsDTO.getFapN3ListDTO(this.fapN3DaoService.getFapN3FromQualificationSimplifiee(num));
	}
	

}
