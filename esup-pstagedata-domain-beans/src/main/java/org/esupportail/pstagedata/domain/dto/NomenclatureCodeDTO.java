package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NomenclatureCode;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature Code : string et string
 */
public class NomenclatureCodeDTO implements Serializable{
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
	 * Temoin en service
	 */
	private String temEnServ;

	/**
	 * Constructeur
	 */
	public NomenclatureCodeDTO(){
		super();
	}
	/**
	 * @param n
	 */
	public NomenclatureCodeDTO(NomenclatureCode n){
		super();
		if(n!=null){
			this.code=n.getCode();
			this.libelle=n.getLibelle();
			this.temEnServ=n.getTemEnServ();
		}
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
	 * Methodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "code : "+code+", libelle : "+libelle;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NomenclatureCodeDTO other = (NomenclatureCodeDTO) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	
}
