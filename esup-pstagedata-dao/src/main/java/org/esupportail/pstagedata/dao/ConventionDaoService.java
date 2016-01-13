/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Convention;
import org.esupportail.pstagedata.domain.beans.CritereRechercheConvention;

/**
 * ConventionDaoService DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface ConventionDaoService extends Serializable {
	
	/**
	 * @param codeUniversite 
	 * @return List<Convention>
	 */
	public List<Convention> getConventions(String codeUniversite);
	
	/**
	 * @param id
	 * @return Convention
	 */
	public Convention getConventionFromId(int id);

	/**
	 * @param codeUniversite 
	 * @return List<String>
	 */
	public List<String> getAnneesConvention(String codeUniversite);
	/**
	 * @param critereRechercheConvention
	 * @return Convention
	 */
	public List<Convention> getConventionsFromCriteres(CritereRechercheConvention critereRechercheConvention);
	
	/**
	 * @param idEnseignant 
	 * @param critereRechercheConvention
	 * @return Convention
	 */
	public List<Convention> getConventionsFromCriteresByEnseignantTuteur(int idEnseignant, CritereRechercheConvention critereRechercheConvention);
	
	/**
	 * @param critereRechercheConvention
	 * @return Convention
	 */
	public List<Convention> getConventionsFromCriteresExport(CritereRechercheConvention critereRechercheConvention);
	
	/**
	 * @param id
	 * @return Convention pour export
	 */
//	public Convention getConventionFromExport(int id);
	public List<Convention> getConventionsFromExport(List<Integer> idsConventionsExport);
	
	/**
	 * @param identEtudiant
	 * @param codeUniversite 
	 * @return List<Convention>
	 */
	public List<Convention> getConventionsEtudiant(String identEtudiant, String codeUniversite);
	
	/**
	 * @param idCentreGestion
	 * @param codeUniversite 
	 * @return int
	 */
	public int getNombreConventionByCentreGestion(int idCentreGestion, String codeUniversite);
	
	
	/**
	 * @param idEnseignant
	 * @param annee
	 * @return List<Convention>
	 */
	public List<Convention> getConventionsByEnseignant(int idEnseignant, String annee);
	/**
	 * @param convention
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 */
	public int addConvention(Convention convention) throws DataAddDaoException, DataBaseDaoException;
	
	/**
	 * @param convention
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateConvention(Convention convention) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @param code 
	 * @param idCentreGestion 
	 * @param codeUniversite 
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateCentreConventionByUfr(String code, int idCentreGestion, String codeUniversite) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @param code 
	 * @param idCentreGestion 
	 * @param codeUniversite 
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateCentreConventionByEtape(String code, int idCentreGestion, String codeUniversite) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idConvention
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteConvention(int idConvention) throws DataDeleteDaoException, DataBaseDaoException;

	/**
	 * @param codeEtape 
	 * @param codeUniversite 
	 * @return String
	 */
	public String getCodeUFRFromCodeEtape(String codeEtape, String codeUniversite);

	/**
	 * @param codeEtape
	 * @param codeVersionEtape
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateConventionSetCodeVersionEtape(String codeEtape, String codeVersionEtape) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @param annee
	 * @param identEtudiant
	 * @param identEtudiant
	 * @return int
	 */
	public int getNbConventionsByAnneeAndEtu(String annee, String identEtudiant, String codeUniversite);

	/**
	 * @param codeUfr
	 * @param idCentreGestion
	 * @param codeUniversite
	 * @return List<String>
	 */
	public List<String> getCodesEtapesConventionsFromCodeUfrAndIdCentre(String codeUfr, int idCentreGestion, String codeUniversite);

	/**
	 * @param convention
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateConventionValidation(Convention convention) throws DataUpdateDaoException, DataBaseDaoException;
	
}
