/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.UniteGratification;

/**
 * UniteDuree DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class UniteGratificationDaoServiceImpl extends AbstractIBatisDaoService implements UniteGratificationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see org.esupportail.pstagedata.dao.UniteGratificationDaoService#getUniteGratifications()
	 */
	@SuppressWarnings("unchecked")
	public List<UniteGratification> getUniteGratifications() {
		return getSqlMapClientTemplate().queryForList("getUniteGratifications");
	}


}
