package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
/**
 * 
 * Critere de recherche pour les statistiques
 *
 */
@SuppressWarnings("serial")
public class Critere  implements Serializable{

private Integer idCritere;
/**
 * clef de la recherche, UFR, THEME, ...
 */
private String clef;
/**
 * Niveau 1 ou 2
 */
private Integer niveau;
/**
 * Type convention, offfre ...
 */
//private String type;

private String valeur;

private Integer typeCategorie;
/**
 * @return the idCritere
 */
public Integer getIdCritere() {
	return idCritere;
}
/**
 * @param idCritere the idCritere to set
 */
public void setIdCritere(Integer idCritere) {
	this.idCritere = idCritere;
}
/**
 * @return the clef
 */
public String getClef() {
	return clef;
}
/**
 * @param clef the clef to set
 */
public void setClef(String clef) {
	this.clef = clef;
}

/**
 * @return the valeur
 */
public String getValeur() {
	return valeur;
}
/**
 * @param valeur the valeur to set
 */
public void setValeur(String valeur) {
	this.valeur = valeur;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Critere [clef=");
	builder.append(clef);
	builder.append(", idCritere=");
	builder.append(idCritere);
	builder.append(", valeur=");
	builder.append(valeur);
	builder.append(", niveau=");
	builder.append(niveau);
	builder.append(", typeCategorie=");
	builder.append(typeCategorie);
	builder.append("]");
	return builder.toString();
}
/**
 * @return the niveau
 */
public Integer getNiveau() {
	return niveau;
}
/**
 * @param niveau the niveau to set
 */
public void setNiveau(Integer niveau) {
	this.niveau = niveau;
}
/**
 * @return the typeCategorie
 */
public Integer getTypeCategorie() {
	return typeCategorie;
}
/**
 * @param typeCategorie the typeCategorie to set
 */
public void setTypeCategorie(Integer typeCategorie) {
	this.typeCategorie = typeCategorie;
}



}
