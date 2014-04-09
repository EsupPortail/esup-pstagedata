/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Confidentialite;


/**
 * Confidentialite DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class ConfidentialiteDaoServiceImpl extends AbstractIBatisDaoService implements ConfidentialiteDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.ConfidentialiteDaoService#getConfidentialite()
	 */
	@SuppressWarnings("unchecked")
	public List<Confidentialite> getConfidentialite(){
		return getSqlMapClientTemplate().queryForList("getConfidentialite");
	}
}
