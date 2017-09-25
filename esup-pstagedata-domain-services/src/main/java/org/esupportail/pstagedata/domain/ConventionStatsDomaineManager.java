package org.esupportail.pstagedata.domain;

import java.io.Serializable;

/**
 * Gestionnaire  des domaines services des statistiques des conventions en fonction de leur etat
 * Creation d'un nouveau service en fonction de l'etat de la convention
 *
 */
public interface ConventionStatsDomaineManager extends Serializable {
	/**
	 * Cree une ConventionStatsDomaineService selon etat (pour un centre de gestion ou pour tout l'etablissement)
	 * @param etat
	 * @return le nouveau service cr&#233;e
	 */
public ConventionStatsDomaineService creer(String etat);
}
