/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN1;



/**
 * FapN1 DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN1DaoService extends Serializable {
	
	/**
	 * @return List<FapN1>
	 */
	public List<FapN1> getFapN1();
	/**
	 * @param code 
	 * @return FapN1
	 */
	public FapN1 getFapN1FromCodeFapN1(String code);
	/**
	 * @param code 
	 * @return FapN1
	 */
	public FapN1 getFapN1FromCodeFapN2(String code);
}
