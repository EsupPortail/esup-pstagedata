/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.NiveauCentre;


/**
 * NiveauCentre DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class NiveauCentreDaoServiceImpl extends AbstractIBatisDaoService implements NiveauCentreDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<NiveauCentre>
	 */
	@SuppressWarnings("unchecked")
	public List<NiveauCentre> getNiveauCentre(){
		return getSqlMapClientTemplate().queryForList("getNiveauCentre");
	}

}
