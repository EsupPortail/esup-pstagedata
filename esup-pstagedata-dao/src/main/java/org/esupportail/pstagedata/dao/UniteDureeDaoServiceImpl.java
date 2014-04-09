/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.UniteDuree;

/**
 * UniteDuree DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class UniteDureeDaoServiceImpl extends AbstractIBatisDaoService implements UniteDureeDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see org.esupportail.pstagedata.dao.UniteDureeDaoService#getUnitesDurees()
	 */
	@SuppressWarnings("unchecked")
	public List<UniteDuree> getUnitesDurees() {
		return getSqlMapClientTemplate().queryForList("getUnitesDurees");
	}


}
