package org.esupportail.pstagedata.domain;

import java.util.ArrayList;
import java.util.List;

import org.esupportail.pstagedata.dao.CritereDaoService;
import org.esupportail.pstagedata.domain.beans.Critere;
import org.esupportail.pstagedata.domain.dto.CritereDTO;

public class CritereDomainServiceImpl implements CritereDomainService {


	private CritereDaoService critereDaoService;

	private transient CritereDTOManager critereDTOManager;

	@Override
	public List<CritereDTO> getCriteresParCategorieEtParNiveau(
			Integer typeCategorie, Integer niveau) {
		List<Critere> criteresParNandCat = critereDaoService.getCriteresParCategorieEtParNiveau(typeCategorie, niveau);
		List<CritereDTO> criteresDTO = new ArrayList<CritereDTO>(criteresParNandCat.size());
		CritereDTO critereDTO;
		for( Critere critere : criteresParNandCat){
			critereDTO = critereDTOManager.createCritereDTO();
			critereDTO.setCritere(critere);
			criteresDTO.add(critereDTO);
		}
		return criteresDTO;
	}

	/**
	 * @param critereDaoService the critereDaoService to set
	 */
	public void setCritereDaoService(CritereDaoService critereDaoService) {
		this.critereDaoService = critereDaoService;
	}

	/**
	 * @param critereDTOManager the critereDTOManager to set
	 */
	public void setCritereDTOManager(CritereDTOManager critereDTOManager) {
		this.critereDTOManager = critereDTOManager;
	}


}
