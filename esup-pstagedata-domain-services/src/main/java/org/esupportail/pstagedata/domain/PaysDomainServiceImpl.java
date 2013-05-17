/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.PaysDaoService;
import org.esupportail.pstagedata.domain.dto.PaysDTO;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Pays Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PaysDomainServiceImpl implements PaysDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * PaysDaoService
	 */
	private PaysDaoService paysDaoService;
	
	/**
	 * @return the paysDaoService
	 */
	public PaysDaoService getPaysDaoService() {
		return paysDaoService;
	}
	/**
	 * @param paysDaoService the paysDaoService to set
	 */
	public void setPaysDaoService(PaysDaoService paysDaoService) {
		this.paysDaoService = paysDaoService;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.PaysDomainService#getPays()
	 */
	public List<PaysDTO> getPays() {
		return UtilsDTO.getPaysListDTO(this.paysDaoService.getPays());
	}
	
	

}
