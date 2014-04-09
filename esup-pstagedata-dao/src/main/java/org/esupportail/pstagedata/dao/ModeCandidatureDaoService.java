/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.ModeCandidature;


/**
 * ModeCandidature DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ModeCandidatureDaoService extends Serializable {
	
	/**
	 * @return List<ModeCandidature>
	 */
	public List<ModeCandidature> getModesCandidature();

}
