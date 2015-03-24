/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.dto.FichierDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * Fichier DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FichierDomainService extends Serializable {
		
	/**
	 * @param idFichier
	 * @return OffreFichier
	 */
	public FichierDTO getFichierFromIdFichier(int idFichier);
	
	/**
	 * @param o
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addFichier(FichierDTO o) throws DataAddException, WebServiceDataBaseException;
	
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateFichier(FichierDTO o) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idFichier
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteFichier(int idFichier) throws DataDeleteException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean cleanFichiers() throws DataDeleteException, WebServiceDataBaseException;
}
