/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.OffreModeCandidatureDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * OffreModeCandidature Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreModeCandidatureDomainServiceImpl implements OffreModeCandidatureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * OffreModeCandidatureDaoService
	 */
	private OffreModeCandidatureDaoService offreModeCandidatureDaoService;

	/**
	 * @return the offreModeCandidatureDaoService
	 */
	public OffreModeCandidatureDaoService getOffreModeCandidatureDaoService() {
		return offreModeCandidatureDaoService;
	}

	/**
	 * @param offreModeCandidatureDaoService the offreModeCandidatureDaoService to set
	 */
	public void setOffreModeCandidatureDaoService(
			OffreModeCandidatureDaoService offreModeCandidatureDaoService) {
		this.offreModeCandidatureDaoService = offreModeCandidatureDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreModeCandidatureDomainService#addOffreModeCandidature(int, java.util.List)
	 */
	@Override
	public int addOffreModeCandidature(int idOffre,
			List<Integer> idsModeCandidature) throws DataAddException, DataDeleteException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.offreModeCandidatureDaoService.addOffreModeCandidature(idOffre,idsModeCandidature);
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;		
	}

	/**
	 * @see org.esupportail.pstagedata.domain.OffreModeCandidatureDomainService#deleteOffreModeCandidatureFromId(int)
	 */
	@Override
	public boolean deleteOffreModeCandidatureFromId(int idOffre)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.offreModeCandidatureDaoService.deleteOffreModeCandidatureFromId(idOffre);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	
	

}
