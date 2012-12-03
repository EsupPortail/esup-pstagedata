/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.NafN5;

/**
 * NafN5 DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN5DaoServiceImpl extends AbstractIBatisDaoService implements NafN5DaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.NafN5DaoService#getNafN5()
	 */
	@SuppressWarnings("unchecked")
	public List<NafN5> getNafN5() {
		return getSqlMapClientTemplate().queryForList("getNafN5");
	}

	
	/**
	 * @see org.esupportail.pstagedata.dao.NafN5DaoService#getNafN5FromCodeNafN1(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<NafN5> getNafN5FromCodeNafN1(String code) {
		return getSqlMapClientTemplate().queryForList("getNafN5FromCodeNafN1", code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.NafN5DaoService#getNafN5FromCodeNafN5(java.lang.String)
	 */
	public NafN5 getNafN5FromCodeNafN5(String code) {
		return (NafN5) getSqlMapClientTemplate().queryForObject("getNafN5FromCodeNafN5", code);
	}

}
