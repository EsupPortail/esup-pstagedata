/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.NafN5DaoService;
import org.esupportail.pstagedata.domain.beans.NafN5;
import org.esupportail.pstagedata.domain.dto.NafN5DTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * NafN5 Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN5DomainServiceImpl implements NafN5DomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * NafN5DaoService
	 */
	private NafN5DaoService nafN5DaoService;
	/**
	 * @return the nafN5DaoService
	 */
	public NafN5DaoService getNafN5DaoService() {
		return nafN5DaoService;
	}
	/**
	 * @param nafN5DaoService the nafN5DaoService to set
	 */
	public void setNafN5DaoService(NafN5DaoService nafN5DaoService) {
		this.nafN5DaoService = nafN5DaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NafN5DomainService#getNafN5()
	 */
	public List<NafN5DTO> getNafN5() {
		return UtilsDTO.getNafN5ListDTO(this.nafN5DaoService.getNafN5());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NafN5DomainService#getNafN5FromCodeNafN1(java.lang.String)
	 */
	public List<NafN5DTO> getNafN5FromCodeNafN1(String code) {
		return UtilsDTO.getNafN5ListDTO(this.nafN5DaoService.getNafN5FromCodeNafN1(code));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.NafN5DomainService#getNafN5FromCodeNafN5(java.lang.String)
	 */
	public NafN5DTO getNafN5FromCodeNafN5(String code) {
		NafN5 n = this.nafN5DaoService.getNafN5FromCodeNafN5(code);
		return n==null?null:new NafN5DTO(n);
	}
	

}
