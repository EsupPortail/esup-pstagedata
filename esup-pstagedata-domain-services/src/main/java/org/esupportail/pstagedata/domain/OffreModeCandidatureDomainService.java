/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * Offre Diffusion Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface OffreModeCandidatureDomainService extends Serializable {
	
	/**
	 * @param idOffre
	 * @param idsModeCandidature 
	 * @return int
	 * @throws DataAddException 
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOffreModeCandidature(int idOffre, List<Integer> idsModeCandidature) throws DataAddException;
	
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteOffreModeCandidatureFromId(int idOffre) throws DataDeleteException, WebServiceDataBaseException;

}
