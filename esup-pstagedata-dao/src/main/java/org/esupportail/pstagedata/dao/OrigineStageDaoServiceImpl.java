/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.OrigineStage;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * OrigineStageDaoServiceImpl.
 */
public class OrigineStageDaoServiceImpl extends AbstractIBatisDaoService implements OrigineStageDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	
	/**
	 * @see org.esupportail.pstagedata.dao.OrigineStageDaoService#getOrigineStages()
	 */
	@SuppressWarnings("unchecked")
	public List<OrigineStage> getOrigineStages() {
		return getSqlMapClientTemplate().queryForList("getOrigineStages");
	}

	

}
