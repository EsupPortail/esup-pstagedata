package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.DureeDiffusion;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class DureeDiffusionDTO extends NomenclatureIdDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	private boolean adminSeulement;
	
	/**
	 * Constructeur
	 */
	public DureeDiffusionDTO(){
		super();
	}

	/**
	 * Constructeur
	 * @param d
	 */
	public DureeDiffusionDTO(DureeDiffusion d){
		super(d);
		if(d!=null){
			adminSeulement = d.isAdminSeulement();
		}
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @param adminSeulement the adminSeulement to set
	 */
	public void setAdminSeulement(boolean adminSeulement) {
		this.adminSeulement = adminSeulement;
	}

	/**
	 * @return the adminSeulement
	 */
	public boolean isAdminSeulement() {
		return adminSeulement;
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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
