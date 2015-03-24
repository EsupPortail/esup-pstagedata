/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.OffreDiffusionDTO;
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
public interface OffreDiffusionDomainService extends Serializable {
	
	/**
	 * @return List<OffreDiffusionDTO>
	 * @param idOffre
	 */
	public List<OffreDiffusionDTO> getOffreDiffusionFromIdOffre(int idOffre);
	
	/**
	 * @param lod
	 * @return int
	 * @throws DataAddException 
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOffreDiffusion(List<OffreDiffusionDTO> lod) throws DataAddException, DataDeleteException, WebServiceDataBaseException;
	
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteException, WebServiceDataBaseException;
}
