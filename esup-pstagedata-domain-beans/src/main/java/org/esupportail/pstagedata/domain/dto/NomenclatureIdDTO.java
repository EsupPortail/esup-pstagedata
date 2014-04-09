package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NomenclatureId;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature id : entier et string
 */
public class NomenclatureIdDTO implements Serializable{
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
	private int id;
	/**
	 * Libell�
	 */
	private String libelle;
	/**
	 * T�moin en service
	 */
	private String temEnServ;
	/**
	 * Code de contr�le
	 */
	private String codeCtrl;

	/**
	 * Constructeur
	 */
	public NomenclatureIdDTO(){
		super();
	}
	/**
	 * @param n
	 */
	public NomenclatureIdDTO(NomenclatureId n){
		super();
		if(n!=null){
			this.id=n.getId();
			this.libelle=n.getLibelle();
			this.temEnServ=n.getTemEnServ();
			this.codeCtrl=n.getCodeCtrl();
		}
	}


	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "id : "+id+", libelle : "+libelle;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
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
		NomenclatureIdDTO other = (NomenclatureIdDTO) obj;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}


}
