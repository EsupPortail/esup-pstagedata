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
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.AccordPartenariat;

/**
 * AccordPartenariat DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface AccordPartenariatDaoService extends Serializable {
	
	/**
	 * @return List<AccordPartenariat>
	 */
	public List<AccordPartenariat> getAccordsNonValides();
	/**
	 * @param id 
	 * @return AccordPartenariat
	 */
	public AccordPartenariat getAccordFromId(int id);
	/**
	 * @param idStructure 
	 * @return AccordPartenariat
	 */
	public AccordPartenariat getAccordFromIdStructure(int idStructure);
	/**
	 * @param idContact 
	 * @return AccordPartenariat
	 */
	public AccordPartenariat getAccordFromIdContact(int idContact);
	/**
	 * @return int
	 */
	public int countAccordAValider();
	/**
	 * @param accord
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addAccord(AccordPartenariat accord) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param accord
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateAccord(AccordPartenariat accord) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idAccord
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteDaoException, DataBaseDaoException;

}
