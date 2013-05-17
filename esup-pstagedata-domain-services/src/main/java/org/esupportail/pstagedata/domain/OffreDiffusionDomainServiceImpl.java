/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.ArrayList;
import java.util.List;

import org.esupportail.pstagedata.dao.OffreDiffusionDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.OffreDiffusion;
import org.esupportail.pstagedata.domain.dto.OffreDiffusionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * OffreDiffusion Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDiffusionDomainServiceImpl implements OffreDiffusionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * OffreDiffusionDaoService
	 */
	private OffreDiffusionDaoService offreDiffusionDaoService;

	/**
	 * @return the offreDiffusionDaoService
	 */
	public OffreDiffusionDaoService getOffreDiffusionDaoService() {
		return offreDiffusionDaoService;
	}

	/**
	 * @param offreDiffusionDaoService the offreDiffusionDaoService to set
	 */
	public void setOffreDiffusionDaoService(
			OffreDiffusionDaoService offreDiffusionDaoService) {
		this.offreDiffusionDaoService = offreDiffusionDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDiffusionDomainService#getOffreDiffusionFromIdOffre(int)
	 */
	public List<OffreDiffusionDTO> getOffreDiffusionFromIdOffre(int idOffre){
		return UtilsDTO.getOffreDiffusionListDTO(this.offreDiffusionDaoService.getOffreDiffusionFromIdOffre(idOffre));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDiffusionDomainService#addOffreDiffusion(java.util.List)
	 */
	public int addOffreDiffusion(List<OffreDiffusionDTO> lod) throws DataAddException, DataDeleteException, WebServiceDataBaseException{
		int tmp=0;
		try{
			List<OffreDiffusion> lo = null;
			if(lod!=null && !lod.isEmpty()){
				lo=new ArrayList<OffreDiffusion>();
				for(OffreDiffusionDTO odd : lod){
					lo.add(UtilsDTO.getOffreDiffusionFromDTO(odd));
				}
			}
			tmp = this.offreDiffusionDaoService.addOffreDiffusion(lo);
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;	
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.OffreDiffusionDomainService#deleteOffreDiffusionFromId(int)
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.offreDiffusionDaoService.deleteOffreDiffusionFromId(idOffre);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}
