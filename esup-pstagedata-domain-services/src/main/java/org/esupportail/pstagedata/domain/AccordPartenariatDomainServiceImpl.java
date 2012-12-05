/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.AccordPartenariatDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.AccordPartenariat;
import org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;

/**
 * AccordPartenariat Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordPartenariatDomainServiceImpl implements AccordPartenariatDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * AccordPartenariatDaoService
	 */
	public AccordPartenariatDaoService accordPartenariatDaoService;
	
	/**
	 * @return the accordPartenariatDaoService
	 */
	public AccordPartenariatDaoService getAccordPartenariatDaoService() {
		return accordPartenariatDaoService;
	}
	/**
	 * @param accordPartenariatDaoService the accordPartenariatDaoService to set
	 */
	public void setAccordPartenariatDaoService(
			AccordPartenariatDaoService accordPartenariatDaoService) {
		this.accordPartenariatDaoService = accordPartenariatDaoService;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#getAccordsNonValides()
	 */
	public List<AccordPartenariatDTO> getAccordsNonValides(){
		return UtilsDTO.getAccordPartenaraitListDTO(this.accordPartenariatDaoService.getAccordsNonValides());
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#getAccordFromId(int)
	 */
	public AccordPartenariatDTO getAccordFromId(int id){
		AccordPartenariat a = this.accordPartenariatDaoService.getAccordFromId(id);
		return a==null?null:new AccordPartenariatDTO(a);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#getAccordFromIdStructure(int)
	 */
	public AccordPartenariatDTO getAccordFromIdStructure(int idStructure){
		AccordPartenariat a = this.accordPartenariatDaoService.getAccordFromIdStructure(idStructure);
		return a==null?null:new AccordPartenariatDTO(a);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#getAccordFromIdContact(int)
	 */
	public AccordPartenariatDTO getAccordFromIdContact(int idContact){
		AccordPartenariat a = this.accordPartenariatDaoService.getAccordFromIdContact(idContact);
		return a==null?null:new AccordPartenariatDTO(a);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#countAccordAValider()
	 */
	public int countAccordAValider(){
		return this.accordPartenariatDaoService.countAccordAValider();
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#addAccord(org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO)
	 */
	public int addAccord(AccordPartenariatDTO accord) throws DataAddException, WebServiceDataBaseException{
		int tmp=0;
		try{
			tmp = this.accordPartenariatDaoService.addAccord(UtilsDTO.getAccordPartenariatFromDTO(accord));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#updateAccord(org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO)
	 */
	public boolean updateAccord(AccordPartenariatDTO accord) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.accordPartenariatDaoService.updateAccord(UtilsDTO.getAccordPartenariatFromDTO(accord));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.AccordPartenariatDomainService#deleteAccord(int)
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.accordPartenariatDaoService.deleteAccord(idAccord);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

}
