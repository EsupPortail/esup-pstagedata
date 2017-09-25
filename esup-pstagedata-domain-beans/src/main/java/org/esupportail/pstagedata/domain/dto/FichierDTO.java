package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.domain.beans.Fichier;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * FichierDTO
 */
public class FichierDTO implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/* ***************************************************************
	 * Propriétés
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
	public FichierDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param o 
	 */
	public FichierDTO(Fichier o){
		super();
		this.idFichier=o.getIdFichier();
		this.nomFichier=o.getNomFichier();
		this.nomReel=o.getNomReel();
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

	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone(){
		try {
			return super.clone();
		}catch(CloneNotSupportedException e){
			logger.error(e);
			return null;
		}
	} 
}
