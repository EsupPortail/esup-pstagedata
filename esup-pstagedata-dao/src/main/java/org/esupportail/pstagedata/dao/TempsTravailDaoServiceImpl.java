/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.TempsTravail;

/**
 * TempsTravail DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TempsTravailDaoServiceImpl extends AbstractIBatisDaoService implements TempsTravailDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.TempsTravailDaoService#getTempsTravail()
	 */
	@SuppressWarnings("unchecked")
	public List<TempsTravail> getTempsTravail() {
		return getSqlMapClientTemplate().queryForList("getTempsTravail");
	}

	
}
