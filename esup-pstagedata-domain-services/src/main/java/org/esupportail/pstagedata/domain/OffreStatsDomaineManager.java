package org.esupportail.pstagedata.domain;

import java.io.Serializable;

/**
 * Gestionnaire  des domaines services  des statistiques des offres en fonction des etats des offres
 * Creation d'un nouveau service en fonction de l'etat de l'offre
 *
 */
public interface OffreStatsDomaineManager extends Serializable {
	/**
	 * Cree une OffreStatsDomaineService selon etat (valide, publie ../)
	 * @param etat
	 * @return le nouveau service cr&#233;e
	 */
public OffreStatsDomaineService create(String etat);

}
