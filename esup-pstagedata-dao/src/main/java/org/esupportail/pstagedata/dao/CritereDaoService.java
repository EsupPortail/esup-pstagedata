package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Critere;
import org.esupportail.pstagedata.domain.beans.Niveau;

public interface CritereDaoService {
	
	List<Critere> getCriteres();
	List<Critere> getCriteresByNiveau(Integer niveau);
	
	List<Niveau>getNiveauParValeur(Integer niv);
	
	List<Critere>getCriteresParCategorie(Integer categorie);
	/**
	 * liste des criteres de choix possibles   pour le premier niveau pour les statistique sur les conventions
	 */ 
List<Critere> getFirstLevelStatCriteriaForConvention();

/**
 * Recherche des critères selon le type de categorie et le niveau
 * @param typeCategorie
 * @param niveau
 * @return Liste des criteres ayant ce  niveau et de la  categorie typeCategorie
 */
	List<Critere> getCriteresParCategorieEtParNiveau(Integer typeCategorie,Integer niveau);




}
