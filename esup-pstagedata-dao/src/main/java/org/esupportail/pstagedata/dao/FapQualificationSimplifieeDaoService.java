/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapQualificationSimplifiee;

/**
 * FapQualificationSimplifiee DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapQualificationSimplifieeDaoService extends Serializable {
	
	/**
	 * @return List<FapQualificationSimplifiee>
	 */
	public List<FapQualificationSimplifiee> getFapQualificationsSimplifiees();
	/**
	 * @param id 
	 * @return FapQualificationSimplifiee
	 */
	public FapQualificationSimplifiee getFapQualificationSimplifieeFromId(int id);
	/**
	 * @param num 
	 * @return FapQualificationSimplifiee
	 */
	public FapQualificationSimplifiee getFapQualificationSimplifieeFromNumFapQualification(int num);
}
