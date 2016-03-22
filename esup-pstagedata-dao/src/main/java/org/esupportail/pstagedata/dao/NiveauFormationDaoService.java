/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.NiveauFormation;
import org.esupportail.pstagedata.exceptions.*;


/**
 * NiveauFormation DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NiveauFormationDaoService extends Serializable {
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addNiveauFormation(NiveauFormation nf) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateNiveauFormation(NiveauFormation nf) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteNiveauFormation(int id) throws DataDeleteException,WebServiceDataBaseException;
	
	/**
	 * @return List<NiveauFormation>
	 */
	public List<NiveauFormation> getNiveauxFormation();
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateNiveauFormation(int id) throws DataReactivateException,WebServiceDataBaseException;
}
