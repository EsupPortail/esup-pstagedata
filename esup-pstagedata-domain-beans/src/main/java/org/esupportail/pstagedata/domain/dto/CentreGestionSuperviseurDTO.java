package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.CentreGestionSuperviseur;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreGestionSuperviseurDTO extends AdresseDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id du centre superviseur
	 */
	private int idCentreGestionSuperviseur;
	/**
	 * Nom du centre superviseur
	 */
	private String nomCentreGestionSuperviseur;

	/**
	 * Constructeur
	 */
	public CentreGestionSuperviseurDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param cgs 
	 */
	public CentreGestionSuperviseurDTO(CentreGestionSuperviseur cgs){
		super();
		if(cgs!=null){
			this.idCentreGestionSuperviseur=cgs.getIdCentreGestionSuperviseur();
			this.nomCentreGestionSuperviseur=cgs.getNomCentreGestionSuperviseur();
		}
	}
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof CentreGestionSuperviseurDTO){
			r = this.idCentreGestionSuperviseur ==((CentreGestionSuperviseurDTO)o).getIdCentreGestionSuperviseur();
		}
		return r;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.AdresseDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"idCentreGestionSuperviseur : "+idCentreGestionSuperviseur+", "+
		"nomCentreGestionSuperviseur : "+nomCentreGestionSuperviseur+", "+super.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	/**
	 * @param nomCentreGestionSuperviseur the nomCentreGestionSuperviseur to set
	 */
	public void setNomCentreGestionSuperviseur(
			String nomCentreGestionSuperviseur) {
		this.nomCentreGestionSuperviseur = nomCentreGestionSuperviseur;
	}
	/**
	 * @return the nomCentreGestionSuperviseur
	 */
	public String getNomCentreGestionSuperviseur() {
		return nomCentreGestionSuperviseur;
	}
	/**
	 * @param idCentreGestionSuperviseur the idCentreGestionSuperviseur to set
	 */
	public void setIdCentreGestionSuperviseur(int idCentreGestionSuperviseur) {
		this.idCentreGestionSuperviseur = idCentreGestionSuperviseur;
	}
	/**
	 * @return the idCentreGestionSuperviseur
	 */
	public int getIdCentreGestionSuperviseur() {
		return idCentreGestionSuperviseur;
	}
}