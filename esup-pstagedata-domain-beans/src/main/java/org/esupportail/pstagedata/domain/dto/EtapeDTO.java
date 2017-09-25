package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Etape;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtapeDTO extends NomenclatureCodeDTO implements Serializable{
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
	public EtapeDTO(){
		super();
	}
	
	/**
	 *  Constructeur
	 * @param e
	 */
	public EtapeDTO(Etape e){
		super(e);
		if(e!=null){
			this.codeUniversite=e.getCodeUniversite();
			this.codeVersionEtape=e.getCodeVersionEtape();
		}
	}

	/* ***************************************************************
	 * Methodes
	 ****************************************************************/

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
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
