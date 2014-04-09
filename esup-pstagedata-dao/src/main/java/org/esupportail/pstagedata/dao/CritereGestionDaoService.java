/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.CritereGestion;


/**
 * CritereGestion DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface CritereGestionDaoService extends Serializable {
	
	/**
	 * @return List<CritereGestion>
	 */
	public List<CritereGestion> getCritereGestion();
	
	/**
	 * @param idCentreGestion
	 * @return List<CritereGestion>
	 */
	public List<CritereGestion> getCritereGestionFromIdCentre(int idCentreGestion);

	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreCritereGestion(int idCentreGestion);
	
	/**
	 * @param critere
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 */
	public int addCritere(CritereGestion critere)throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param codeCritere
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteDaoException, DataBaseDaoException;

}
