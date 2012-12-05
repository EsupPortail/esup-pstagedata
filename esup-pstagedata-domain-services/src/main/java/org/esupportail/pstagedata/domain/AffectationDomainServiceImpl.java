/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.AffectationDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Affectation;
import org.esupportail.pstagedata.domain.dto.AffectationDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * Affectation Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class AffectationDomainServiceImpl implements AffectationDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * AffectationDaoService
	 */
	private AffectationDaoService affectationDaoService;
	
	/**
	 * @return the AffectationDaoService
	 */
	public AffectationDaoService getAffectationDaoService() {
		return affectationDaoService;
	}

	/**
	 * @param affectationDaoService
	 */
	public void setAffectationDaoService(AffectationDaoService affectationDaoService) {
		this.affectationDaoService = affectationDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AffectationDomainService#getAffectation(java.lang.String)
	 */
	public List<AffectationDTO> getAffectation(String codeUniversite) {
		return UtilsDTO.getAffectationListDTO(this.affectationDaoService.getAffectation(codeUniversite));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AffectationDomainService#getAffectationFromCodeAffectation(java.lang.String, java.lang.String)
	 */
	public AffectationDTO getAffectationFromCodeAffectation(String codeAffectation, String codeUniversite) {
		Affectation a = this.affectationDaoService.getAffectationFromCodeAffectation(codeAffectation, codeUniversite);
		return a==null?null:new AffectationDTO(a);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AffectationDomainService#getNombreAffectation()
	 */
	public int getNombreAffectation() {
		return this.affectationDaoService.getNombreAffectation();
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.AffectationDomainService#addAffectation(org.esupportail.pstagedata.domain.dto.AffectationDTO)
	 */
	public int addAffectation(AffectationDTO a) throws DataAddException,WebServiceDataBaseException {
		int tmp = 0;
		try {
			tmp = this.affectationDaoService.addAffectation(UtilsDTO.getAffectationFromDTO(a));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
}
