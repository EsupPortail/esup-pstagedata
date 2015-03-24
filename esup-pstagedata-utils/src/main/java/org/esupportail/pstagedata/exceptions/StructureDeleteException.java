package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StructureDeleteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Nombre de comptes de connexion existant pour la structure
	 */
	private final int nbComptesContact;
	/**
	 * Nombre d'offres pour la structure
	 */
	private final int nbOffres;
	/**
	 * Nombre de conventions pour la structure
	 */
	private final int nbConventions;
	/**
	 * Vrai si un accord existe pour la structure
	 */
	private boolean accordExistant;
	
	/**
	 * @param msg
	 * @param nbComptes 
	 * @param nbOffres 
	 * @param nbConventions 
	 * @param accordExistant 
	 */
	public StructureDeleteException(String msg,int nbComptes,int nbOffres,int nbConventions, boolean accordExistant){
		super(msg);
		this.nbComptesContact=nbComptes;
		this.nbOffres=nbOffres;
		this.nbConventions=nbConventions;
		this.accordExistant=accordExistant;
	}
	
	/**
	 * @param msg
	 * @param cause
	 * @param nbComptes 
	 * @param nbOffres 
	 * @param nbConventions 
	 * @param accordExistant 
	 */
	public StructureDeleteException(String msg, Throwable cause,int nbComptes,int nbOffres,int nbConventions, boolean accordExistant){
		super(msg,cause);
		this.nbComptesContact=nbComptes;
		this.nbOffres=nbOffres;
		this.nbConventions=nbConventions;
		this.accordExistant=accordExistant;
	}

	/**
	 * @return the nbComptesContact
	 */
	public int getNbComptesContact() {
		return nbComptesContact;
	}

	/**
	 * @return the nbOffres
	 */
	public int getNbOffres() {
		return nbOffres;
	}

	/**
	 * @return the nbConventions
	 */
	public int getNbConventions() {
		return nbConventions;
	}

	/**
	 * @return the accordExistant
	 */
	public boolean isAccordExistant() {
		return accordExistant;
	}
	
}
