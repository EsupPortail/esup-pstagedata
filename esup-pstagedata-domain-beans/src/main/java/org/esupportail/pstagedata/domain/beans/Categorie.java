package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.List;

public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCategorie ;
	private Integer typeCategorie;
	
	private List<Critere> criteres;

	/**
	 * @return the idCategorie
	 */
	public Integer getIdCategorie() {
		return idCategorie;
	}

	/**
	 * @param idCategorie the idCategorie to set
	 */
	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
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
		builder.append("Categorie [criteres=");
		if(criteres!=null){
		for(Critere c : criteres){
			builder.append(c);
		}
		
		}else {
		builder.append(criteres);
		}
		builder.append(", idCategorie=");
		builder.append(idCategorie);
		builder.append(", typeCategorie=");
		builder.append(typeCategorie);
		builder.append("]");
		return builder.toString();
	}
	
}
