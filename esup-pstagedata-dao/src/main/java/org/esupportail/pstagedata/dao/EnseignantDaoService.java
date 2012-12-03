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
import org.esupportail.pstagedata.domain.beans.Enseignant;
import org.esupportail.pstagedata.exceptions.EnseignantAlreadyExistingForNumEtuCodeUnivException;


/**
 * AssuranceDaoService DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface EnseignantDaoService extends Serializable {
	
	
	
	/**
	 * @param codeUniversite 
	 * @return List<Enseignant>
	 */
	public List<Enseignant> getEnseignants(String codeUniversite);
	
	/**
	 * @param id
	 * @return Enseignant
	 */
	public Enseignant getEnseignantFromId(int id);
	
	/**
	 * @param uidEnseignant
	 * @param codeUniversite
	 * @return Enseignant
	 */
	public Enseignant getEnseignantFromUid(String uidEnseignant,String codeUniversite);
	
	/**
	 * @param uidEnseignant
	 * @param codeUniversite 
	 * @return int
	 */
	public int getNombreConventionByEnseignant(String uidEnseignant,String codeUniversite);

	
	/**
	 * @param enseignant
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 * @throws EnseignantAlreadyExistingForNumEtuCodeUnivException 
	 */
	public int addEnseignant(Enseignant enseignant) throws DataAddDaoException, DataBaseDaoException, EnseignantAlreadyExistingForNumEtuCodeUnivException ;
	
	/**
	 * @param enseignant
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateEnseignant(Enseignant enseignant) throws DataUpdateDaoException, DataBaseDaoException;
	
	
	/**
	 * @param idEnseignant
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteEnseignant(int idEnseignant) throws DataDeleteDaoException, DataBaseDaoException;

}
