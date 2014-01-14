/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ContratOffreDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;



/**
 * Contrat Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ContratDomainService extends Serializable {
	
	/**
	 * @return List<ContratOffreDTO>
	 */
	public List<ContratOffreDTO> getContrats();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addContratOffre(ContratOffreDTO co) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContratOffre(ContratOffreDTO co) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteContratOffre(int id) throws DataDeleteException,WebServiceDataBaseException;

}
