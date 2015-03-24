/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.EtapeDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Etape;
import org.esupportail.pstagedata.domain.dto.EtapeDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class EtapeDomainServiceImpl implements EtapeDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * etapeDaoService
	 */
	private EtapeDaoService etapeDaoService;


	/**
	 * @return the etapeDaoService
	 */
	public EtapeDaoService getEtapeDaoService() {
		return etapeDaoService;
	}


	/**
	 * @param etapeDaoService the etapeDaoService to set
	 */
	public void setEtapeDaoService(EtapeDaoService etapeDaoService) {
		this.etapeDaoService = etapeDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtapeDomainService#getEtapes(java.lang.String)
	 */
	public List<EtapeDTO> getEtapes(String codeUniversite) {
		return UtilsDTO.getEtapeListDTO(this.etapeDaoService.getEtapes(codeUniversite));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtapeDomainService#getEtapesFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite){
		return UtilsDTO.getEtapeListDTO(this.etapeDaoService.getEtapesFromIdsCentreGestion(idsCentreGestion, codeUniversite));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtapeDomainService#addEtape(org.esupportail.pstagedata.domain.dto.EtapeDTO)
	 */
	public int addEtape(EtapeDTO etape) throws DataAddException, WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.etapeDaoService.addEtape(UtilsDTO.getEtapeFromDTO(etape));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtapeDomainService#getEtapeFromId(java.lang.String, java.lang.String)
	 */
	public EtapeDTO getEtapeFromId(String code, String codeUniversite) {
		Etape e = this.etapeDaoService.getEtapeFromId(code, codeUniversite);
		EtapeDTO eDTO = null;		
		if (e!=null) {
			eDTO = new EtapeDTO(e);
		}
		return eDTO;
	}

}
