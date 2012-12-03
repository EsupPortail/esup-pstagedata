package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.OffreDiffusion;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class OffreDiffusionDTO extends ObjetMetiersDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID Centre Gestion
	 */
	private Integer idCentreGestion;
	/**
	 * ID offre
	 */
	private Integer idOffre;
	/**
	 * Nom du centre
	 */
	private String nomCentre;
	/**
	 * vrai si mise en Avant
	 */
	private boolean estMiseEnAvant;

	/**
	 * Constructeur
	 */
	public OffreDiffusionDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param od 
	 */
	public OffreDiffusionDTO(OffreDiffusion od){
		super(od);
		if(od!=null){
			idCentreGestion=od.getIdCentreGestion();
			idOffre=od.getIdOffre();	
			nomCentre=od.getNomCentre();
			estMiseEnAvant=od.isEstMiseEnAvant();
		}
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"idCentreGestion : "+idCentreGestion+", "+
		"idOffre : "+idOffre+", "+
		"estMiseEnAvant : "+estMiseEnAvant+", "+super.toString();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	

	/**
	 * @param idCentreGestion
	 */
	public void setIdCentreGestion(Integer idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}

	/**
	 * @return Integer
	 */
	public Integer getIdCentreGestion() {
		return idCentreGestion;
	}

	/**
	 * @return Integer
	 */
	public Integer getIdOffre() {
		return idOffre;
	}

	/**
	 * @param idOffre
	 */
	public void setIdOffre(Integer idOffre) {
		this.idOffre = idOffre;
	}
	
	/**
	 * @return the nomCentre
	 */
	public String getNomCentre() {
		return nomCentre;
	}

	/**
	 * @param nomCentre the nomCentre to set
	 */
	public void setNomCentre(String nomCentre) {
		this.nomCentre = nomCentre;
	}

	/**
	 * @param estMiseEnAvant
	 */
	public void setEstMiseEnAvant(boolean estMiseEnAvant) {
		this.estMiseEnAvant = estMiseEnAvant;
	}

	/**
	 * @return boolean
	 */
	public boolean isEstMiseEnAvant() {
		return estMiseEnAvant;
	}
}