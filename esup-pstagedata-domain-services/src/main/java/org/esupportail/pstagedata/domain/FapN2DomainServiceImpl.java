/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FapN2DaoService;
import org.esupportail.pstagedata.domain.beans.FapN2;
import org.esupportail.pstagedata.domain.dto.FapN2DTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FapN2 Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN2DomainServiceImpl implements FapN2DomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * FapN2DaoService
	 */
	private FapN2DaoService fapN2DaoService;
	/**
	 * @return the fapN2DaoService
	 */
	public FapN2DaoService getFapN2DaoService() {
		return fapN2DaoService;
	}
	/**
	 * @param fapN2DaoService the fapN2DaoService to set
	 */
	public void setFapN2DaoService(FapN2DaoService fapN2DaoService) {
		this.fapN2DaoService = fapN2DaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN2DomainService#getFapN2()
	 */
	public List<FapN2DTO> getFapN2() {
		return UtilsDTO.getFapN2ListDTO(this.fapN2DaoService.getFapN2());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN2DomainService#getFapN2FromCodeFapN1(java.lang.String)
	 */
	public List<FapN2DTO> getFapN2FromCodeFapN1(String code) {
		return UtilsDTO.getFapN2ListDTO(this.fapN2DaoService.getFapN2FromCodeFapN1(code));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN2DomainService#getFapN2FromCodeFapN2(java.lang.String)
	 */
	public FapN2DTO getFapN2FromCodeFapN2(String code) {
		FapN2 f = this.fapN2DaoService.getFapN2FromCodeFapN2(code);
		return f==null?null:new FapN2DTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN2DomainService#getFapN2FromCodeFapN3(java.lang.String)
	 */
	public FapN2DTO getFapN2FromCodeFapN3(String code) {
		FapN2 f = this.fapN2DaoService.getFapN2FromCodeFapN3(code);
		return f==null?null:new FapN2DTO(f);
	}
	

}
