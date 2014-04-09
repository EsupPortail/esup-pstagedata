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
import org.esupportail.pstagedata.domain.beans.CentreGestion;

/**
 * Centre Gestion DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface CentreGestionDaoService extends Serializable {
	/**
	 * @param codeUniversite 
	 * @return List<Integer>
	 */
	public List<Integer> getIdsCentreGestionSansConfidentialiteFromCodeUniversite(String codeUniversite);
	/**
	 * @param codeUniversite
	 * @return List<CentreGestion>
	 */
	public List<CentreGestion> getCentreGestionList(String codeUniversite);

	/**
	 * @param idCentreGestion
	 * @return CentreGestion
	 */
	public CentreGestion getCentreGestion(int idCentreGestion);
	
	/**
	 * @param nomCentre
	 * @param codeUniversite 
	 * @return CentreGestion
	 */
	public CentreGestion getCentreGestionFromNomCentre(String nomCentre, String codeUniversite);
	
	/**
	 * @param codeUniversite
	 * @return int
	 */
	public int getNombreCentreGestion(String codeUniversite);
	
	/**
	 * R�cup�re les centres de gestion correspondant à l'uid ldap d'un personnel
	 * ayant les droits en ecriture ou en admin pour ces centres
	 * 
	 * @param uidPersonnel
	 * @param codeUniversite 
	 * @return List<CentreGestion>
	 */
	public List<CentreGestion> getCentreDroitEcriture(String uidPersonnel, String codeUniversite);
	
	/**
	 * R�cup�re les centres de gestion correspondant à l'uid ldap d'un personnel
	 * ayant des droits pour ces centres
	 * 
	 * @param uidPersonnel
	 * @param codeUniversite 
	 * @return List<CentreGestion>
	 */
	public List<CentreGestion> getCentreFromUid(String uidPersonnel, String codeUniversite);
	
	/**
	 * @return CentreGestion
	 */
	public CentreGestion getCentreEntreprise();
	
	/**
	 * @param codeUniversite 
	 * @return CentreGestion
	 */
	public CentreGestion getCentreEtablissement(String codeUniversite);
	/**
	 * @param codeUniversite 
	 * @return CentreGestion
	 */
	public List<CentreGestion> getCentresEtablissement(String codeUniversite);
	
	/**
	 * @param codeCritere
	 * @param codeUniversite
	 * @return CentreGestion
	 */
	public CentreGestion getCentreFromCritere(String codeCritere, String codeUniversite);
	
	/**
	 * @param cg
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addCentreGestion(CentreGestion cg) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param cg
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateCentreGestion(CentreGestion cg) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idCentreGestion
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteCentreGestion(int idCentreGestion) throws DataDeleteDaoException, DataBaseDaoException;
	
	/**
	 * @param idCentreGestion 
	 * @param idFichier 
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateIdFichier(int idCentreGestion, int idFichier) throws DataUpdateDaoException, DataBaseDaoException;
	
	/**
	 * @param idCentreGestion 
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean setIdFichierNull(int idCentreGestion) throws DataUpdateDaoException, DataBaseDaoException;
	
	/**
	 * @param idCentreGestion
	 * @return List<String>
	 */
	public List<String> centreGestionReference(int idCentreGestion);
}
