/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Effectif;

/**
 * Effectif DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class EffectifDaoServiceImpl extends AbstractIBatisDaoService implements EffectifDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<Effectif>
	 */
	@SuppressWarnings("unchecked")
	public List<Effectif> getEffectifs(){
		return getSqlMapClientTemplate().queryForList("getEffectifs");
	}

}
