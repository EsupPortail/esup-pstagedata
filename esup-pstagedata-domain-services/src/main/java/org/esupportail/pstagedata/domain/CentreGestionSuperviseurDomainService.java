/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.CentreGestionSuperviseurDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * CentreGestionSuperviseur Domain service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface CentreGestionSuperviseurDomainService extends Serializable {
	
	/**
	 * @return List<CentreGestionDTO>
	 */
	public List<CentreGestionSuperviseurDTO> getCentreGestionSuperviseur();
	
	/**
	 * @param cg
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseurDTO cg) throws DataDeleteException,WebServiceDataBaseException;
}
