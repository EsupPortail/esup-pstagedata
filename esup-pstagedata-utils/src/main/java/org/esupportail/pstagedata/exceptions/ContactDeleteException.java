package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContactDeleteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Vrai si le contact possède un compte
	 */
	private boolean contactAvecCompte;
	/**
	 * Vrai si le contact est référencé dans l'accord 
	 */
	private boolean contactRefAccord;
	/**
	 * Vrai si le contact est référencé dans une offre
	 */
	private boolean contactRefOffre;
	/**
	 * Vrai si le contact est référencé dans une convention
	 */
	private boolean contactRefConvention;
	
	/**
	 * @param msg
	 * @param contactAvecCompte 
	 * @param contactRefAccord 
	 * @param contactRefOffre 
	 * @param contactRefConvention 
	 */
	public ContactDeleteException(String msg,boolean contactAvecCompte,boolean contactRefAccord,boolean contactRefOffre, boolean contactRefConvention){
		super(msg);
		this.contactAvecCompte=contactAvecCompte;
		this.contactRefAccord=contactRefAccord;
		this.contactRefOffre=contactRefOffre;
		this.contactRefConvention=contactRefConvention;
	}
	
	/**
	 * @param msg
	 * @param cause
	 * @param contactAvecCompte 
	 * @param contactRefAccord 
	 * @param contactRefOffre 
	 * @param contactRefConvention 
	 */
	public ContactDeleteException(String msg, Throwable cause,boolean contactAvecCompte,boolean contactRefAccord,boolean contactRefOffre, boolean contactRefConvention){
		super(msg,cause);
		this.contactAvecCompte=contactAvecCompte;
		this.contactRefAccord=contactRefAccord;
		this.contactRefOffre=contactRefOffre;
		this.contactRefConvention=contactRefConvention;
	}

	/**
	 * @return the nbContactAvecCompte
	 */
	public boolean isContactAvecCompte() {
		return contactAvecCompte;
	}

	/**
	 * @return the contactRefAccord
	 */
	public boolean isContactRefAccord() {
		return contactRefAccord;
	}

	/**
	 * @return the contactRefOffre
	 */
	public boolean isContactRefOffre() {
		return contactRefOffre;
	}

	/**
	 * @return the contactRefConvention
	 */
	public boolean isContactRefConvention() {
		return contactRefConvention;
	}

	
}
