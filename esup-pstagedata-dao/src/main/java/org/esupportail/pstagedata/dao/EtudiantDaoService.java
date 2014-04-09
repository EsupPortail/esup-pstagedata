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
import org.esupportail.pstagedata.domain.beans.Etudiant;
import org.esupportail.pstagedata.exceptions.EtudiantAlreadyExistingForNumEtuCodeUnivException;

/**
 * Etudiant Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface EtudiantDaoService extends Serializable {
	
	/**
	 * @return List<Etudiant>
	 */
	public List<Etudiant> getEtudiants();
	
	/**
	 * @param id
	 * @return Etudiant
	 */
	public Etudiant getEtudiantFromId(int id);
	
	/**
	 * @param uidEtudiant
	 * @param codeUniversite
	 * @return Etudiant
	 */
	public Etudiant getEtudiantFromUid(String uidEtudiant,String codeUniversite);
	
	/**
	 * @param etudiant
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 * @throws EtudiantAlreadyExistingForNumEtuCodeUnivException 
	 */
	public int addEtudiant(Etudiant etudiant) throws DataAddDaoException, DataBaseDaoException, EtudiantAlreadyExistingForNumEtuCodeUnivException;
	
	
	/**
	 * @param etudiant
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateEtudiant(Etudiant etudiant) throws DataUpdateDaoException, DataBaseDaoException;
	
	
	/**
	 * @param idEtudiant
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteDaoException, DataBaseDaoException;

}
