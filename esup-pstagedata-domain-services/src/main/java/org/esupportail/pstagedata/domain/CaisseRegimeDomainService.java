/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.CaisseRegimeDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface CaisseRegimeDomainService extends Serializable {
	
	/**
	 * @return List<CaisseRegimeDTO>
	 */
	public List<CaisseRegimeDTO> getCaisseRegimes();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCaisseRegime(CaisseRegimeDTO cr) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateCaisseRegime(CaisseRegimeDTO cr, String codeCaisse) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteCaisseRegime(String codeCaisse) throws DataDeleteException,WebServiceDataBaseException;

}
