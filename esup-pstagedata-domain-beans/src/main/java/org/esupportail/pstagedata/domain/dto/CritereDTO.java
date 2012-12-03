package org.esupportail.pstagedata.domain.dto;

import org.esupportail.pstagedata.domain.beans.Critere;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CritereDTO {

	/**
	 * 
	 */
	private Integer idCritere;
	/**
	 * 
	 */
	private String clef;
	/**
	 * 
	 */
	private Integer niveau;
	/**
	 * 
	 */
	private String valeur;
	/**
	 * 
	 */
	private Integer typeCategorie;
	/**
	 * 
	 */
	private Critere critere;


	/**
	 * @param crit
	 */
	public CritereDTO(Critere crit){
		if(crit!=null){
			this.idCritere = crit.getIdCritere();
			if(crit.getClef() != null) this.clef = crit.getClef();
			if(crit.getNiveau() != null) this.niveau = crit.getNiveau();
			if(crit.getTypeCategorie()!= null) this.typeCategorie= crit.getTypeCategorie();
			if(crit.getValeur() != null) this.valeur = crit.getValeur();
			this.critere = crit;
		}	
	}


	/**
	 * 
	 */
	public CritereDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CritereDTO [critere=");
		builder.append(critere);
		builder.append("]");
		return builder.toString();
	}


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
	 * @param crit the critere to set
	 */
	public void setCritere(Critere crit) {

		this.idCritere = crit.getIdCritere();
		if(crit.getClef() != null) this.clef = crit.getClef();
		if(crit.getNiveau() != null) this.niveau = crit.getNiveau();
		if(crit.getTypeCategorie()!= null) this.typeCategorie= crit.getTypeCategorie();
		if(crit.getValeur() != null) this.valeur = crit.getValeur();
		this.critere = crit;
	}

}
