/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.StatutJuridique;

/**
 * StatutJuridique DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StatutJuridiqueDaoServiceImpl extends AbstractIBatisDaoService implements StatutJuridiqueDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutsJuridiques()
	 */
	@SuppressWarnings("unchecked")
	public List<StatutJuridique> getStatutsJuridiques() {
		return getSqlMapClientTemplate().queryForList("getStatutsJuridiques");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutJuridiqueFromTypeStructure(int)
	 */
	public StatutJuridique getStatutJuridiqueFromTypeStructure(int id) {
		return (StatutJuridique) getSqlMapClientTemplate().queryForObject("getStatutJuridiqueFromTypeStructure ", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutsJuridiquesFromId(int)
	 */
	public StatutJuridique getStatutsJuridiquesFromId(int id) {
		return (StatutJuridique) getSqlMapClientTemplate().queryForObject("getStatutsJuridiquesFromId ", id);
	}

	
}
