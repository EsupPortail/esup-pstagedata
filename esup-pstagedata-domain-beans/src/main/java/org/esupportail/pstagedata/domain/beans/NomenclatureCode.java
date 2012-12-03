package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature Code : string et string
 */
public class NomenclatureCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Code
	 */
	private String code;
	/**
	 * Libell�
	 */
	private String libelle;	
	/**
	 * T�moin en service
	 */
	private String temEnServ;

	/**
	 * Constructeur
	 */
	public NomenclatureCode(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @return the temEnServ
	 */
	public String getTemEnServ() {
		return temEnServ;
	}

	/**
	 * @param temEnServ the temEnServ to set
	 */
	public void setTemEnServ(String temEnServ) {
		this.temEnServ = temEnServ;
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Code : "+code+", libelle : "+libelle;
	}
	
}
