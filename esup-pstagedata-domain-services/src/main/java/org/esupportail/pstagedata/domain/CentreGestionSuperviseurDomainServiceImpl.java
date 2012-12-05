/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.CentreGestionSuperviseurDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * CentreGestionSuperviseur Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreGestionSuperviseurDomainServiceImpl implements CentreGestionSuperviseurDomainService {

	private static final long serialVersionUID = 1L;
	/**
	 * CentreDaoService
	 */
	private CentreGestionSuperviseurDaoService CentreGestionSuperviseurDaoService;
	/**
	 * @return the CentreGestionSuperviseurDaoService
	 */
	public CentreGestionSuperviseurDaoService getCentreGestionSuperviseurDaoService() {
		return CentreGestionSuperviseurDaoService;
	}
	/**
	 * @param CentreGestionSuperviseurDaoService : the CentreGestionSuperviseurDaoService to set
	 */
	public void setCentreGestionSuperviseurDaoService(CentreGestionSuperviseurDaoService CentreGestionSuperviseurDaoService) {
		this.CentreGestionSuperviseurDaoService = CentreGestionSuperviseurDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionSuperviseurDomainService#getCentreGestionSuperviseur()
	 */
	public List<CentreGestionSuperviseurDTO> getCentreGestionSuperviseur() {
		return UtilsDTO.getCentreGestionSuperviseurListDTO(this.CentreGestionSuperviseurDaoService.getCentreGestionSuperviseur());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#addCentreGestionSuperviseur(org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO)
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseurDTO c) throws DataAddException,WebServiceDataBaseException{
		int tmp = 0;
		try {
			tmp = this.CentreGestionSuperviseurDaoService.addCentreGestionSuperviseur(UtilsDTO.getCentreGestionSuperviseurFromDTO(c));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
}
