/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.CritereGestionDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.CritereGestion;
import org.esupportail.pstagedata.domain.dto.CritereGestionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * CritereGestion Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CritereGestionDomainServiceImpl implements CritereGestionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * CritereGestionDaoService
	 */
	private CritereGestionDaoService CritereGestionDaoService;
	
	/**
	 * @return the CritereGestionDaoService
	 */
	public CritereGestionDaoService getCritereGestionDaoService() {
		return CritereGestionDaoService;
	}

	/**
	 * @param CritereGestionDaoService : the CritereGestionDaoService to set
	 */
	public void setCritereGestionDaoService(CritereGestionDaoService CritereGestionDaoService) {
		this.CritereGestionDaoService = CritereGestionDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#getCritereGestion()
	 */
	public List<CritereGestionDTO> getCritereGestion() {
		return UtilsDTO.getCritereGestionListDTO(this.CritereGestionDaoService.getCritereGestion());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#getCritereGestionFromIdCentre(int)
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentre(int idCentreGestion) {
		return UtilsDTO.getCritereGestionListDTO(this.CritereGestionDaoService.getCritereGestionFromIdCentre(idCentreGestion));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#getCritereGestionFromIdCentreAndAnnee(int,String)
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentreAndAnnee(int idCentreGestion,String anneeUniv){
		return UtilsDTO.getCritereGestionListDTO(this.CritereGestionDaoService.getCritereGestionFromIdCentreAndAnnee(idCentreGestion,anneeUniv));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#getCritereGestionSansVetFromCodeEtape(codeEtape)
	 */
	public CritereGestionDTO getCritereGestionSansVetFromCodeEtape(String codeEtape) {
		CritereGestion c = this.CritereGestionDaoService.getCritereGestionSansVetFromCodeEtape(codeEtape);
		return c==null?null:new CritereGestionDTO(c);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#getNombreCritereGestion(int)
	 */
	public int getNombreCritereGestion(int idCentreGestion){
		return this.CritereGestionDaoService.getNombreCritereGestion(idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CritereGestionDomainService#addCritere(org.esupportail.pstagedata.domain.dto.CritereGestionDTO)
	 */
	public int addCritere(CritereGestionDTO critere) throws DataAddException,WebServiceDataBaseException{
		int tmp = 0;
		try {
			tmp = this.CritereGestionDaoService.addCritere(UtilsDTO.getCritereGestionFromDTO(critere));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	/**
	 * @see org.esupportail.pstage.domain.CritereGestionDomainService#deleteCritere(String)
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.CritereGestionDaoService.deleteCritere(codeCritere);
		} catch (DataDeleteDaoException e){
			throw new DataDeleteException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
