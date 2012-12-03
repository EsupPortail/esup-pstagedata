/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.ContratOffre;

/**
 * Contrat DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContratDaoServiceImpl extends AbstractIBatisDaoService implements ContratDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<ContratOffre>
	 */
	@SuppressWarnings("unchecked")
	public List<ContratOffre> getContrats(){
		return getSqlMapClientTemplate().queryForList("getContratsOffre");
	}

}
