/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN2;



/**
 * FapN2 DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN2DaoService extends Serializable {
	
	/**
	 * @return List<FapN2>
	 */
	public List<FapN2> getFapN2();
	/**
	 * @param code 
	 * @return FapN2
	 */
	public FapN2 getFapN2FromCodeFapN2(String code);
	/**
	 * @param code 
	 * @return FapN2
	 */
	public FapN2 getFapN2FromCodeFapN3(String code);
	/**
	 * @param code 
	 * @return List<FapN2>
	 */
	public List<FapN2> getFapN2FromCodeFapN1(String code);

}
