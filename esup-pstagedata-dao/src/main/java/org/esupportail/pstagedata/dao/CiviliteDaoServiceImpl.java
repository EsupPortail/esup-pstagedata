/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Civilite;


/**
 * Civilite DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CiviliteDaoServiceImpl extends AbstractIBatisDaoService implements CiviliteDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<Civilite>
	 */
	@SuppressWarnings("unchecked")
	public List<Civilite> getCivilites(){
		return getSqlMapClientTemplate().queryForList("getCivilites");
	}

}
