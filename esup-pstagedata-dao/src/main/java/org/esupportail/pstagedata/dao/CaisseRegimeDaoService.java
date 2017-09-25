/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.CaisseRegime;
import org.esupportail.pstagedata.exceptions.*;


/**
 * AssuranceDaoService DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface CaisseRegimeDaoService extends Serializable {
	
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCaisseRegime(CaisseRegime cr) throws WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateCaisseRegime(CaisseRegime cr, String codeCaisse) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteCaisseRegime(String codeCaisse) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @param codeCaisse
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateCaisseRegime(String codeCaisse) throws DataReactivateException;

	/**
	 * @return List<CaisseRegime>
	 */
	public List<CaisseRegime> getCaisseRegimes();

}
