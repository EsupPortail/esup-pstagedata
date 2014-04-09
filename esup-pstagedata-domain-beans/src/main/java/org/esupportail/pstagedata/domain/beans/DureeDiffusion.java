package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class DureeDiffusion extends NomenclatureId implements Serializable{
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
	public DureeDiffusion(){
		super();
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
	
}
