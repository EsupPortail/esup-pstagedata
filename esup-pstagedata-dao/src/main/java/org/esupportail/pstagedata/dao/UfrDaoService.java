/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Ufr;
import org.esupportail.pstagedata.exceptions.DataAddException;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * NatureTravailDaoService DAO service interface.
 */
public interface UfrDaoService extends Serializable {
	
	

	/**
	 * @param codeUniversite 
	 * @return List<Ufr>
	 */
	public List<Ufr> getUfrs(String codeUniversite);
	
	
	/**
	 * @param code
	 * @param codeUniversite 
	 * @return Ufr
	 */
	public Ufr getUfrFromId(String code, String codeUniversite);
	
	/**
	 * @param idsCentreGestion
	 * @param codeUniversite 
	 * @return List<Ufr>
	 */
	public List<Ufr> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite);	

	/**
	 * @param ufr
	 * @return int
	 * @throws DataAddException
	 * @throws DataBaseDaoException 
	 */
	public int addUfr(Ufr ufr) throws DataAddException, DataBaseDaoException;

}
