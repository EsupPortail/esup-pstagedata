/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.CaisseRegime;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;




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
	public int addCaisseRegime(CaisseRegime cr) throws DataAddException, WebServiceDataBaseException;
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
	 * @return List<CaisseRegime>
	 */
	public List<CaisseRegime> getCaisseRegimes();

}
