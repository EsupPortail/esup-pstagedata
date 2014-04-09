package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Service;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ServiceDTO extends AdresseDTO implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID
	 */
	private int idService;
	/**
	 * Id Structure
	 */
	private int idStructure;
	/**
	 * Nom
	 */
	private String nom;
	/**
	 * Derniere date indiquant que les informations sont � jour
	 */
	private Date infosAJour;
	/**
	 * Login de la personne ayant confirm� que les infos sont � jour
	 */
	private String loginInfosAJour;	
	/* **
	 * 
	 * Objets
	 * 
	 */
	
	/**
	 * Constructeur
	 */
	public ServiceDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param s 
	 */
	public ServiceDTO(Service s){
		super(s);
		if(s!=null){
			idService=s.getIdService();
			if (s.getIdStructure() != null) {
				idStructure=s.getIdStructure();
			}
			nom=s.getNom();
			infosAJour=s.getInfosAJour();
			loginInfosAJour=s.getLoginInfosAJour();
		}
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof ServiceDTO){
			r = this.idService==((ServiceDTO)o).getIdService();
		}
		return r;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.AdresseDTO#toString()
	 */
	@Override
	public String toString(){
		return "idService : "+idService+", "+"idStructure : "+idStructure+", "+
		", "+"nom : "+nom+", "+
		"infosAJour : "+infosAJour+", "+"loginInfosAJour : "+loginInfosAJour+", "+super.toString();
	}
	
	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone(){
		try {
			return super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	} 
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the idService
	 */
	public int getIdService() {
		return idService;
	}
	/**
	 * @param idService the idService to set
	 */
	public void setIdService(int idService) {
		this.idService = idService;
	}
	/**
	 * @return the idStructure
	 */
	public int getIdStructure() {
		return idStructure;
	}
	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(int idStructure) {
		this.idStructure = idStructure;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the infosAJour
	 */
	public Date getInfosAJour() {
		return infosAJour;
	}

	/**
	 * @param infosAJour the infosAJour to set
	 */
	public void setInfosAJour(Date infosAJour) {
		this.infosAJour = infosAJour;
	}

	/**
	 * @return the loginInfosAJour
	 */
	public String getLoginInfosAJour() {
		return loginInfosAJour;
	}

	/**
	 * @param loginInfosAJour the loginInfosAJour to set
	 */
	public void setLoginInfosAJour(String loginInfosAJour) {
		this.loginInfosAJour = loginInfosAJour;
	}	
	
	
}
