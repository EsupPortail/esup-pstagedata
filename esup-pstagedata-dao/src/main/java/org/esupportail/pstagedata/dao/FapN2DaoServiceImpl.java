/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN2;

/**
 * FapN2 DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN2DaoServiceImpl extends AbstractIBatisDaoService implements FapN2DaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.FapN2DaoService#getFapN2()
	 */
	@SuppressWarnings("unchecked")
	public List<FapN2> getFapN2() {
		return getSqlMapClientTemplate().queryForList("getFapN2");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN2DaoService#getFapN2FromCodeFapN1(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<FapN2> getFapN2FromCodeFapN1(String code) {
		return getSqlMapClientTemplate().queryForList("getFapN2FromCodeFapN1", code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN2DaoService#getFapN2FromCodeFapN2(java.lang.String)
	 */
	public FapN2 getFapN2FromCodeFapN2(String code) {
		return (FapN2) getSqlMapClientTemplate().queryForObject("getFapN2FromCodeFapN2", code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN2DaoService#getFapN2FromCodeFapN3(java.lang.String)
	 */
	public FapN2 getFapN2FromCodeFapN3(String code) {
		return (FapN2) getSqlMapClientTemplate().queryForObject("getFapN2FromCodeFapN3", code);
	}

}
