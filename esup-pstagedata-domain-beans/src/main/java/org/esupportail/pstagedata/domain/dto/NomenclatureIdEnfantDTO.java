package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NomenclatureIdEnfant;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature ID  Enfant = Nomenclature + idParent entier
 */
public class NomenclatureIdEnfantDTO extends NomenclatureIdDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructeur
	 */
	public NomenclatureIdEnfantDTO(){
		super();
	}
	/**
	 * @param n
	 */
	public NomenclatureIdEnfantDTO(NomenclatureIdEnfant n){
		super(n);
		if(n!=null){
			this.idParent=n.getIdParent();
		}
	}
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID du parent
	 */
	private int idParent;
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the idParent
	 */
	public int getIdParent() {
		return idParent;
	}

	/**
	 * @param idParent the idParent to set
	 */
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString()+", idParent : "+idParent;
	}
}
