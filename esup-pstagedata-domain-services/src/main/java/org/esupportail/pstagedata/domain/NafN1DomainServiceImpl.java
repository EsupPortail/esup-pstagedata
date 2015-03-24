/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.NafN1DaoService;
import org.esupportail.pstagedata.domain.beans.NafN1;
import org.esupportail.pstagedata.domain.dto.NafN1DTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * NafN1 Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN1DomainServiceImpl implements NafN1DomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * NafN1DaoService
	 */
	private NafN1DaoService nafN1DaoService;
	
	/**
	 * @return the nafN1DaoService
	 */
	public NafN1DaoService getNafN1DaoService() {
		return nafN1DaoService;
	}

	/**
	 * @param nafN1DaoService the nafN1DaoService to set
	 */
	public void setNafN1DaoService(NafN1DaoService nafN1DaoService) {
		this.nafN1DaoService = nafN1DaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.NafN1DomainService#getNafN1()
	 */
	public List<NafN1DTO> getNafN1() {
		return UtilsDTO.getNafN1ListDTO(this.nafN1DaoService.getNafN1());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NafN1DomainService#getNafN1FromCodeNafN1(java.lang.String)
	 */
	public NafN1DTO getNafN1FromCodeNafN1(String code) {
		NafN1 n = this.nafN1DaoService.getNafN1FromCodeNafN1(code);
		return n==null?null:new NafN1DTO(n);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NafN1DomainService#getNafN1FromCodeNafN5(java.lang.String)
	 */
	public NafN1DTO getNafN1FromCodeNafN5(String code) {
		NafN1 n = this.nafN1DaoService.getNafN1FromCodeNafN5(code);
		return n==null?null:new NafN1DTO(n);
	}
	
	

}
