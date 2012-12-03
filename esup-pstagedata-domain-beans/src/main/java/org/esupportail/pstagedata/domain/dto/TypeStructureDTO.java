package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.TypeStructure;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructureDTO extends NomenclatureIdDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Vrai si le numéro SIRET est obligatoire
	 */
	private boolean siretObligatoire;
	/**
	 * Constructeur
	 */
	public TypeStructureDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param t 
	 */
	public TypeStructureDTO(TypeStructure t){
		super(t);
		this.siretObligatoire=t.isSiretObligatoire();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the siretObligatoire
	 */
	public boolean isSiretObligatoire() {
		return siretObligatoire;
	}

	/**
	 * @param siretObligatoire the siretObligatoire to set
	 */
	public void setSiretObligatoire(boolean siretObligatoire) {
		this.siretObligatoire = siretObligatoire;
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
	
}
