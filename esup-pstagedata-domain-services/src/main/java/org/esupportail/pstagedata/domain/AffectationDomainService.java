/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.AffectationDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * Affectation Domain service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface AffectationDomainService extends Serializable {
	
	/**
	 * @param codeUniversite 
	 * @return List<AffectationDTO>
	 */
	public List<AffectationDTO> getAffectation(String codeUniversite);
	/**
	 * @param codeAffectation
	 * @param codeUniversite 
	 * @return AffectationDTO
	 */
	public AffectationDTO getAffectationFromCodeAffectation(String codeAffectation, String codeUniversite);

	/**
	 * @return int
	 */
	public int getNombreAffectation();
	
	/**
	 * @param a
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addAffectation(AffectationDTO a) throws DataAddException, WebServiceDataBaseException;
}
