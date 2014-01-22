package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class Etape extends NomenclatureCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Code universite
	 */
	private String codeUniversite;
	
	/**
	 * Code universite
	 */
	private String codeVersionEtape;

	/**
	 * Constructeur
	 */
	public Etape(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the codeUniversite
	 */
	public String getCodeUniversite() {
		return codeUniversite;
	}

	/**
	 * @param codeUniversite the codeUniversite to set
	 */
	public void setCodeUniversite(String codeUniversite) {
		this.codeUniversite = codeUniversite;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}

	/**
	 * @return the codeVersionEtape
	 */
	public String getCodeVersionEtape() {
		return codeVersionEtape;
	}

	/**
	 * @param codeVersionEtape the codeVersionEtape to set
	 */
	public void setCodeVersionEtape(String codeVersionEtape) {
		this.codeVersionEtape = codeVersionEtape;
	}
	
}
