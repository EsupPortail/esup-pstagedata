package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Adresse;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdresseDTO extends ObjetMetiersDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* ***************************************************************
	 * Proprietes
	 ****************************************************************/

	/**
	 * Batiment/Residence/Z.I./Immeuble
	 */
	private String batimentResidence;
	/**
	 * Voie
	 */
	private String voie;
	/**
	 * Commune
	 */
	private String commune;

	/**
	 * Code postal
	 */
	private String codePostal;
	/**
	 * ID du pays
	 */
	private int idPays;
	/**
	 * Code commune
	 */
	private String codeCommune;
	/**
	 * Libelle Cedex
	 */
	private String libCedex;
	/* **
	 * Objets
	 */
	/**
	 * Pays
	 */
	private PaysDTO pays;

	/**
	 * Constructeur
	 */
	public AdresseDTO(){
		super();
	}

	/**
	 * @param a
	 */
	public AdresseDTO(Adresse a){
		super(a);
		if(a!=null){
			this.batimentResidence=a.getBatimentResidence();
			if(a.getCodeCommune()!=null) this.codeCommune=a.getCodeCommune();
			this.codePostal=a.getCodePostal();
			this.commune=a.getCommune();
			if(a.getIdPays()!=null) this.idPays=a.getIdPays();
			this.voie=a.getVoie();
			this.libCedex=a.getLibCedex();
		}
	}

	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return "batimentResidence : "+batimentResidence+", "+"commune : "+commune+", "+
		", "+"voie : "+voie+", "+
		"codePostal : "+codePostal+", "+"idPays : "+idPays+", "+
		"codeCommune : "+codeCommune+", "+"libCedex : "+libCedex+", "+super.toString();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the batimentResidence
	 */
	public String getBatimentResidence() {
		return batimentResidence;
	}

	/**
	 * @param batimentResidence the batimentResidence to set
	 */
	public void setBatimentResidence(String batimentResidence) {
		this.batimentResidence = batimentResidence;
	}

	/**
	 * @return the voie
	 */
	public String getVoie() {
		return voie;
	}

	/**
	 * @param voie the voie to set
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}

	/**
	 * @return the commune
	 */
	public String getCommune() {
		return commune;
	}

	/**
	 * @param commune the commune to set
	 */
	public void setCommune(String commune) {
		this.commune = commune;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the idPays
	 */
	public int getIdPays() {
		return idPays;
	}

	/**
	 * @param idPays the idPays to set
	 */
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	/**
	 * @return the libCedex
	 */
	public String getLibCedex() {
		return libCedex;
	}

	/**
	 * @param libCedex the libCedex to set
	 */
	public void setLibCedex(String libCedex) {
		this.libCedex = libCedex;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	/**
	 * @return the pays
	 */
	public PaysDTO getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(PaysDTO pays) {
		this.pays = pays;
	}

}
