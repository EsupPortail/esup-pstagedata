/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.AvenantDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.AvenantDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Avenant Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class AvenantDomainServiceImpl implements AvenantDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * AvenantDaoService
	 */
	private AvenantDaoService AvenantDaoService;
	
	/**
	 * @return the AvenantDaoService
	 */
	public AvenantDaoService getAvenantDaoService() {
		return AvenantDaoService;
	}
	/**
	 * @param AvenantDaoService : the AvenantDaoService to set
	 */
	public void setAvenantDaoService(AvenantDaoService AvenantDaoService) {
		this.AvenantDaoService = AvenantDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AvenantDomainService#getAvenant()
	 */
	public List<AvenantDTO> getAvenant(int idConvention) {
		return UtilsDTO.getAvenantListDTO(this.AvenantDaoService.getAvenant(idConvention));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AvenantDomainService#getNombreAvenant()
	 */
	public int getNombreAvenant(int idConvention) {
		return this.AvenantDaoService.getNombreAvenant(idConvention);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AvenantDomainService#addAvenant(org.esupportail.pstagedata.domain.dto.AvenantDTO)
	 */
	public int addAvenant(AvenantDTO a) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		try {
			tmp = this.AvenantDaoService.addAvenant(UtilsDTO.getAvenantFromDTO(a));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AvenantDomainService#updateAvenant(org.esupportail.pstagedata.domain.dto.AvenantDTO)
	 */
	public boolean updateAvenant(AvenantDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.AvenantDaoService.updateAvenant(UtilsDTO.getAvenantFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AvenantDomainService#deleteAvenant(int)
	 */
	public boolean deleteAvenant(int idAvenant) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.AvenantDaoService.deleteAvenant(idAvenant);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
