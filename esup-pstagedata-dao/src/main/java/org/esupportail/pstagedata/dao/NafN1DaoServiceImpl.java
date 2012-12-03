/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.NafN1;

/**
 * FapN1 DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN1DaoServiceImpl extends AbstractIBatisDaoService implements NafN1DaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.NafN1DaoService#getNafN1()
	 */
	@SuppressWarnings("unchecked")
	public List<NafN1> getNafN1() {
		return getSqlMapClientTemplate().queryForList("getNafN1");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.NafN1DaoService#getNafN1FromCodeNafN1(java.lang.String)
	 */
	public NafN1 getNafN1FromCodeNafN1(String code) {
		return (NafN1) getSqlMapClientTemplate().queryForObject("getNafN1FromCodeNafN1", code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.NafN1DaoService#getNafN1FromCodeNafN5(java.lang.String)
	 */
	public NafN1 getNafN1FromCodeNafN5(String code) {
		return (NafN1) getSqlMapClientTemplate().queryForObject("getNafN1FromCodeNafN5", code);
	}

	

}
