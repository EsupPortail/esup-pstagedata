/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.DureeDiffusion;


/**
 * DureeDiffusion DAO service interface.
 */
public class DureeDiffusionDaoServiceImpl extends AbstractIBatisDaoService implements DureeDiffusionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<DureeDiffusion>
	 */
	@SuppressWarnings("unchecked")
	public List<DureeDiffusion> getDureeDiffusion(){
		return getSqlMapClientTemplate().queryForList("getDureeDiffusion");
	}

}
