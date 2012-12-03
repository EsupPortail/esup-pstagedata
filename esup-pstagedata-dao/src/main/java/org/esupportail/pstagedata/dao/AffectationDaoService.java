/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.Affectation;


/**
 * Affectation DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface AffectationDaoService extends Serializable {
	
	/**
	 * @param codeUniversite 
	 * @return List<Affectation>
	 */
	public List<Affectation> getAffectation(String codeUniversite);
	/**
	 * @param codeAffectation
	 * @param codeUniversite 
	 * @return Affectation
	 */
	public Affectation getAffectationFromCodeAffectation(String codeAffectation, String codeUniversite);
	
	/**
	 * @return int
	 */
	public int getNombreAffectation();
	
	/**
	 * @param a
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addAffectation(Affectation a) throws DataAddDaoException, DataBaseDaoException;
}
