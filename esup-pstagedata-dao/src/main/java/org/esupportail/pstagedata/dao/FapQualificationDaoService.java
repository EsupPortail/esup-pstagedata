/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapQualification;

/**
 * FapQualification DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapQualificationDaoService extends Serializable {
	
	/**
	 * @return List<FapQualification>
	 */
	public List<FapQualification> getFapQualifications();
	/**
	 * @param id 
	 * @return FapQualification
	 */
	public FapQualification getFapQualificationFromId(int id);
	/**
	 * @param id 
	 * @return List<FapQualification>
	 */
	public List<FapQualification> getFapQualificationFromIdQualificationSimplifiee(int id);
}
