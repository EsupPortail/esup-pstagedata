/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Etape;
import org.esupportail.pstagedata.exceptions.DataAddException;


/**
 * AssuranceDaoService DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface EtapeDaoService extends Serializable {
	
	
	
	/**
	 * @param codeUniversite 
	 * @return List<Enseignant>
	 */
	public List<Etape> getEtapes(String codeUniversite);
	

	/**
	 * @param code
	 * @param codeUniversite 
	 * @return Etape
	 */
	public Etape getEtapeFromId(String code,String codeUniversite);
	
	/**
	 * @param idsCentreGestion
	 * @param codeUniversite
	 * @return Etape
	 */
	public List<Etape> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite);
	
	/**
	 * @param etape
	 * @return int
	 * @throws DataAddException
	 * @throws DataBaseDaoException
	 */
	public int addEtape(Etape etape) throws DataAddException, DataBaseDaoException;
	

}
