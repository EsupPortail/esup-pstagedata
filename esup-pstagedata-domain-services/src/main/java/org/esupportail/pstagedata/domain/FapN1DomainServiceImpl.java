/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.FapN1DaoService;
import org.esupportail.pstagedata.domain.beans.FapN1;
import org.esupportail.pstagedata.domain.dto.FapN1DTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FapN1 Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN1DomainServiceImpl implements FapN1DomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * FapN1DaoService
	 */
	private FapN1DaoService fapN1DaoService;
	
	/**
	 * @return the fapN1DaoService
	 */
	public FapN1DaoService getFapN1DaoService() {
		return fapN1DaoService;
	}

	/**
	 * @param fapN1DaoService the fapN1DaoService to set
	 */
	public void setFapN1DaoService(FapN1DaoService fapN1DaoService) {
		this.fapN1DaoService = fapN1DaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FapN1DomainService#getFapN1()
	 */
	public List<FapN1DTO> getFapN1() {
		return UtilsDTO.getFapN1ListDTO(this.fapN1DaoService.getFapN1());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN1DomainService#getFapN1FromCodeFapN1(java.lang.String)
	 */
	public FapN1DTO getFapN1FromCodeFapN1(String code) {
		FapN1 f = this.fapN1DaoService.getFapN1FromCodeFapN1(code);
		return f==null?null:new FapN1DTO(f);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FapN1DomainService#getFapN1FromCodeFapN2(java.lang.String)
	 */
	public FapN1DTO getFapN1FromCodeFapN2(String code) {
		FapN1 f = this.fapN1DaoService.getFapN1FromCodeFapN2(code);
		return f==null?null:new FapN1DTO(f);
	}
	

}
