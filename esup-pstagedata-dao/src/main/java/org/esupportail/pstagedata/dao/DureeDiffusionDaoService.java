/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.DureeDiffusion;


/**
 * DureeDiffusion DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface DureeDiffusionDaoService extends Serializable {
	
	/**
	 * @return List<DureeDiffusion>
	 */
	public List<DureeDiffusion> getDureeDiffusion();

}
