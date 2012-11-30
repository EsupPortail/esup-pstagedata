package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Fichier
 */
public class Fichier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * idFichier
	 */
	private int idFichier;
	/**
	 * nomFichier
	 */
	private String nomFichier;	
	/**
	 * nomReel
	 */
	private String nomReel;

	/**
	 * Constructeur
	 */
	public Fichier(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the idFichier
	 */
	public int getIdFichier() {
		return idFichier;
	}

	/**
	 * @param idFichier the idFichier to set
	 */
	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	/**
	 * @return the nomFichier
	 */
	public String getNomFichier() {
		return nomFichier;
	}

	/**
	 * @param nomFichier the nomFichier to set
	 */
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @return the nomReel
	 */
	public String getNomReel() {
		return nomReel;
	}

	/**
	 * @param nomReel the nomReel to set
	 */
	public void setNomReel(String nomReel) {
		this.nomReel = nomReel;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "idFichier : "+idFichier+", nomFichier : "+nomFichier;
	}
	
}
