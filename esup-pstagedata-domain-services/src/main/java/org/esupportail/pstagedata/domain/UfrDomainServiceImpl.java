/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.UfrDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Ufr;
import org.esupportail.pstagedata.domain.dto.UfrDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class UfrDomainServiceImpl implements UfrDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	
	/**
	 * natureTravailDaoService
	 */
	private UfrDaoService ufrDaoService;

	

	/**
	 * @return the ufrDaoService
	 */
	public UfrDaoService getUfrDaoService() {
		return ufrDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.UfrDomainService#getUfrsFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite){
		return UtilsDTO.getUfrListDTO(this.ufrDaoService.getUfrsFromIdsCentreGestion(idsCentreGestion, codeUniversite));
	}


	/**
	 * @param ufrDaoService the ufrDaoService to set
	 */
	public void setUfrDaoService(UfrDaoService ufrDaoService) {
		this.ufrDaoService = ufrDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.UfrDomainService#getUfrs(java.lang.String)
	 */
	public List<UfrDTO> getUfrs(String codeUniversite) {
		return UtilsDTO.getUfrListDTO(this.ufrDaoService.getUfrs(codeUniversite));
	}



	/**
	 * @see org.esupportail.pstagedata.domain.UfrDomainService#addUfr(org.esupportail.pstagedata.domain.dto.UfrDTO)
	 */
	public int addUfr(UfrDTO ufr) throws DataAddException, WebServiceDataBaseException {
		int tmp;
		try{
			tmp = this.ufrDaoService.addUfr(UtilsDTO.getUfrFromDTO(ufr));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.UfrDomainService#getUfrFromId(java.lang.String, java.lang.String)
	 */
	public UfrDTO getUfrFromId(String code, String codeUniversite) {
		Ufr u = this.ufrDaoService.getUfrFromId(code, codeUniversite);
		UfrDTO uDTO = null;
		
		if (u!=null) {
			uDTO = new UfrDTO(u);
		}
		return uDTO;
	}

}
