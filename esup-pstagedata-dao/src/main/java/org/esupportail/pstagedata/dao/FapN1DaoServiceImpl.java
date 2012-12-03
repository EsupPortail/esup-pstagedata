/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN1;

/**
 * FapN1 DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN1DaoServiceImpl extends AbstractIBatisDaoService implements FapN1DaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.FapN1DaoService#getFapN1()
	 */
	@SuppressWarnings("unchecked")
	public List<FapN1> getFapN1(){
		return getSqlMapClientTemplate().queryForList("getFapN1");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FapN1DaoService#getFapN1FromCodeFapN1(java.lang.String)
	 */
	public FapN1 getFapN1FromCodeFapN1(String id){
		return (FapN1) getSqlMapClientTemplate().queryForList("getFapN1FromCodeFapN1", id);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.FapN1DaoService#getFapN1FromCodeFapN2(java.lang.String)
	 */
	public FapN1 getFapN1FromCodeFapN2(String id){
		return (FapN1) getSqlMapClientTemplate().queryForList("getFapN1FromCodeFapN2", id);
	}

}
