package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.List;


public class Niveau implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = -2952966386519673582L;
private Integer idNiveau;
private Integer valeur;
private List<Critere> criteres;
/**
 * @return the idNiveau
 */
public Integer getIdNiveau() {
	return idNiveau;
}
/**
 * @param idNiveau the idNiveau to set
 */
public void setIdNiveau(Integer idNiveau) {
	this.idNiveau = idNiveau;
}
/**
 * @return the valeur
 */
public Integer getValeur() {
	return valeur;
}
/**
 * @param valeur the valeur to set
 */
public void setValeur(Integer valeur) {
	this.valeur = valeur;
}
/**
 * @return the criteres
 */
public List<Critere> getCriteres() {
	return criteres;
}
/**
 * @param criteres the criteres to set
 */
public void setCriteres(List<Critere> criteres) {
	this.criteres = criteres;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Niveau [criteres=");
	if(criteres != null){
	for(Critere  critere  : criteres ){
	builder.append(critere);
	}
	}
	else {
		builder.append(criteres);
	}
	builder.append(", idNiveau=");
	builder.append(idNiveau);
	builder.append(", valeur=");
	builder.append(valeur);
	builder.append("]");
	return builder.toString();
}


}
