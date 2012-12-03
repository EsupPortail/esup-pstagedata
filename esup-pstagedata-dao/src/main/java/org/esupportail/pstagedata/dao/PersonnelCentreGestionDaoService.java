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
import org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * PersonnelCentreGestion DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface PersonnelCentreGestionDaoService extends Serializable {
	
	/**
	 * @param idCentreGestion
	 * @return List<PersonnelCentreGestion>
	 */
	public List<PersonnelCentreGestion> getPersonnelCentreGestionList(int idCentreGestion);

	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombrePersonnelCentreGestion(int idCentreGestion);
	
	/**
	 * @param idPersonnelCentreGestion
	 * @return PersonnelCentreGestion
	 */
	public PersonnelCentreGestion getPersonnelCentreGestion(int idPersonnelCentreGestion);

	/**
	 * @param idCentreGestion
	 * @return List<PersonnelCentreGestion>
	 */
	public List<PersonnelCentreGestion> getInterlocuteur(int idCentreGestion);

	/**
	 * @param idPersonnelCentreGestion, idCentreGestion
	 * @return List<PersonnelCentreGestion>
	 */
	public PersonnelCentreGestion getPersonnelCentreGestionFromIdAndCentre(int idPersonnelCentreGestion, int idCentreGestion);

	/**
	 * @param uidPersonnel, codeUniversite
	 * @return List<PersonnelCentreGestion>
	 */
	public List<PersonnelCentreGestion> getPersonnelCentreGestionFromUid(String uidPersonnel,String codeUniversite);

	/**
	 * @param nom, codeUniversite
	 * @return PersonnelCentreGestion
	 */
	public PersonnelCentreGestion getPersonnelCentreGestionFromNom(String nom, String codeUniversite);
	  
	/**
	 * @param pg
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException
	 */
	public int addPersonnelCentreGestion(PersonnelCentreGestion pg) throws DataAddDaoException, DataBaseDaoException;

	/**
	 * @param cp
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean updatePersonnelCentreGestion(PersonnelCentreGestion pg) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @param idCentreGestion
	 * @param idPersonnelCentreGestion
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deletePersonnelCentreGestion(int idCentreGestion, int idPersonnelCentreGestion) throws DataDeleteDaoException, DataBaseDaoException;

}
