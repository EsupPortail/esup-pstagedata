/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Assurance;

/**
 * UniteDuree DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AssuranceDaoServiceImpl extends AbstractIBatisDaoService implements AssuranceDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.AssuranceDaoService#getAssurances()
	 */
	@SuppressWarnings("unchecked")
	public List<Assurance> getAssurances() {
		return getSqlMapClientTemplate().queryForList("getAssurances");
	}

	

}
