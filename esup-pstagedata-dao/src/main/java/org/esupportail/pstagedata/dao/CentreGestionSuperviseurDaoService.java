/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestionSuperviseur;


/**
 * Centre Gestion Superviseur DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface CentreGestionSuperviseurDaoService extends Serializable {

	/**
	 * @param idCentreGestionSuperviseur
	 * @return List<CentreGestionSuperviseur>
	 */
	public List<CentreGestionSuperviseur> getCentreGestionSuperviseur();

	/**
	 * @param cg
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseur cg) throws DataAddDaoException, DataBaseDaoException;
}
