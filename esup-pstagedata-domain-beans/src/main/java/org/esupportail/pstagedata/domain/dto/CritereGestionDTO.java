package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.CritereGestion;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CritereGestionDTO extends NomenclatureCodeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID Centre de gestion
	 */
	private int idCentreGestion;
	
	/**
	 * Constructeurs
	 */
	public CritereGestionDTO() {
		super();
	}
	
	/**
	 * @param c
	 */
	public CritereGestionDTO(CritereGestion c){
		super(c);
		if(c!=null){
			if(c.getIdCentreGestion() != null )
				idCentreGestion=c.getIdCentreGestion();
		}
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return 
		"idCentreGestion : "+idCentreGestion+", "+super.toString();
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof CritereGestionDTO){
			r = this.getCode().equals(((CritereGestionDTO)o).getCode());
		}
		return r;
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	/**
	 * @return the idCentreGestion
	 */
	public int getIdCentreGestion() {
		return idCentreGestion;
	}
	/**
	 * @param idCentreGestion the idCentreGestion to set
	 */
	public void setIdCentreGestion(int idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}
}
