package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature id : entier et string
 */
public class NomenclatureId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id
	 */
	private Integer id;
	/**
	 * Libell�
	 */
	private String libelle;	
	/**
	 * Code de contr�le
	 */
	private String codeCtrl;
	/**
	 * T�moin en service
	 */
	private String temEnServ;

	/**
	 * Constructeur
	 */
	public NomenclatureId(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

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
	 * @return the codeCtrl
	 */
	public String getCodeCtrl() {
		return codeCtrl;
	}

	/**
	 * @param codeCtrl the codeCtrl to set
	 */
	public void setCodeCtrl(String codeCtrl) {
		this.codeCtrl = codeCtrl;
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
		return "ID : "+id+", libelle : "+libelle;
	}
}
