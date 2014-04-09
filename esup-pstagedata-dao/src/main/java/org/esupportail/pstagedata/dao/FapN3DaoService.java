/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN3;

/**
 * FapN3 DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN3DaoService extends Serializable {
	
	/**
	 * @return List<FapN3>
	 */
	public List<FapN3> getFapN3();
	/**
	 * @param code
	 * @return FapN3
	 */
	public FapN3 getFapN3FromCodeFapN3(String code);
	/**
	 * @param code
	 * @return FapN3
	 */
	public FapN3 getFapN3FromCodeFapN2(String code);
	/**
	 * @param num
	 * @return List<FapN3>
	 */
	public List<FapN3> getFapN3FromQualification(int num);
	/**
	 * @param num
	 * @return List<FapN3>
	 */
	public List<FapN3> getFapN3FromQualificationSimplifiee(int num);
}
