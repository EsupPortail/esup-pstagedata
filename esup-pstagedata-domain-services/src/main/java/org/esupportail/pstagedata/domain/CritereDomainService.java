package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.domain.dto.CritereDTO;

public interface CritereDomainService {

	/**
	 * Recherche des critères selon le type de categorie et le niveau
	 * @param typeCategorie
	 * @param niveau
	 * @return Liste des criteres ayant ce  niveau et de la  categorie typeCategorie
	 */
		List<CritereDTO> getCriteresParCategorieEtParNiveau(Integer typeCategorie,Integer niveau);
}
