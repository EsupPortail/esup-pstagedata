/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.StatutJuridique;
import org.esupportail.pstagedata.exceptions.*;

/**
 * StatutJuridique DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface StatutJuridiqueDaoService extends Serializable {
	
	/**
	 * @return List<StatutJuridique>
	 */
	public List<StatutJuridique> getStatutsJuridiques();
	/**
	 * @param id
	 * @return StatutJuridique
	 */
	public StatutJuridique getStatutJuridiqueFromTypeStructure(int id);
	/**
	 * @param id
	 * @return StatutJuridique
	 */
	public StatutJuridique getStatutsJuridiquesFromId(int id);
	
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addStatutJuridique(StatutJuridique sj) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStatutJuridique(StatutJuridique sj) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteStatutJuridique(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateStatutJuridique(int id) throws DataReactivateException,WebServiceDataBaseException;
}
