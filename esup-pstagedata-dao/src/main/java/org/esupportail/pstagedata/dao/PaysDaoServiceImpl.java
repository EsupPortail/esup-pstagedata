/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Pays;

/**
 * Pays DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PaysDaoServiceImpl extends AbstractIBatisDaoService implements PaysDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.PaysDaoService#getPays()
	 */
	@SuppressWarnings("unchecked")
	public List<Pays> getPays() {
		return getSqlMapClientTemplate().queryForList("getPays");
	}

	
	
}
