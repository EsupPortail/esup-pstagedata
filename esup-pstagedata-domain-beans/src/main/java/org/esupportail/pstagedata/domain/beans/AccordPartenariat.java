package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordPartenariat extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id de l'accord de partenariat
	 */
	private Integer idAccordPartenariat;
	/**
	 * Id de la structure passant l'accord
	 */
	private Integer idStructure;
	/**
	 * Id du contact pr�sent dans l'accord
	 */
	private Integer idContact;
	/**
	 * login de la personne ayant valid�
	 */
	private String loginValidation;
	/**
	 * login de la personne ayant supprim�s tous les comptes
	 */
	private String loginSuppressionComptes;
	/**
	 * raison de la suppression de tous les comptes
	 */
	private String raisonSuppressionComptes;
	/**
	 * Date de la validation
	 */
	private Date dateValidation;
	/**
	 * Date de la suppression de tous les comptes
	 */
	private Date dateSuppressionComptes;
	/**
	 * true si valid�
	 */
	private boolean estValide;
	/**
	 * true si comptes supprimes
	 */
	private boolean comptesSupprimes;
	/* **
	 * Objets
	 */
	/**
	 * Structure
	 */
	private Structure structure;
	/**
	 * Contact
	 */
	private Contact contact;
	
	/**
	 * Constructeur
	 */
	public AccordPartenariat(){
		super();
	}
		
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	

	/**
	 * @return the idStructure
	 */
	public Integer getIdStructure() {
		return idStructure;
	}

	/**
	 * @return the idAccordPartenariat
	 */
	public Integer getIdAccordPartenariat() {
		return idAccordPartenariat;
	}

	/**
	 * @param idAccordPartenariat the idAccordPartenariat to set
	 */
	public void setIdAccordPartenariat(Integer idAccordPartenariat) {
		this.idAccordPartenariat = idAccordPartenariat;
	}

	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(Integer idStructure) {
		this.idStructure = idStructure;
	}

	/**
	 * @return the idContact
	 */
	public Integer getIdContact() {
		return idContact;
	}

	/**
	 * @param idContact the idContact to set
	 */
	public void setIdContact(Integer idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return the loginValidation
	 */
	public String getLoginValidation() {
		return loginValidation;
	}

	/**
	 * @param loginValidation the loginValidation to set
	 */
	public void setLoginValidation(String loginValidation) {
		this.loginValidation = loginValidation;
	}

	/**
	 * @return the loginSuppressionComptes
	 */
	public String getLoginSuppressionComptes() {
		return loginSuppressionComptes;
	}

	/**
	 * @param loginSuppressionComptes the loginSuppressionComptes to set
	 */
	public void setLoginSuppressionComptes(String loginSuppressionComptes) {
		this.loginSuppressionComptes = loginSuppressionComptes;
	}

	/**
	 * @return the raisonSuppressionComptes
	 */
	public String getRaisonSuppressionComptes() {
		return raisonSuppressionComptes;
	}

	/**
	 * @param raisonSuppressionComptes the raisonSuppressionComptes to set
	 */
	public void setRaisonSuppressionComptes(String raisonSuppressionComptes) {
		this.raisonSuppressionComptes = raisonSuppressionComptes;
	}

	/**
	 * @return the dateValidation
	 */
	public Date getDateValidation() {
		return dateValidation;
	}

	/**
	 * @param dateValidation the dateValidation to set
	 */
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	/**
	 * @return the dateSuppressionComptes
	 */
	public Date getDateSuppressionComptes() {
		return dateSuppressionComptes;
	}

	/**
	 * @param dateSuppressionComptes the dateSuppressionComptes to set
	 */
	public void setDateSuppressionComptes(Date dateSuppressionComptes) {
		this.dateSuppressionComptes = dateSuppressionComptes;
	}

	/**
	 * @return the estValide
	 */
	public boolean isEstValide() {
		return estValide;
	}

	/**
	 * @param estValide the estValide to set
	 */
	public void setEstValide(boolean estValide) {
		this.estValide = estValide;
	}

	/**
	 * @return the comptesSupprimes
	 */
	public boolean isComptesSupprimes() {
		return comptesSupprimes;
	}

	/**
	 * @param comptesSupprimes the comptesSupprimes to set
	 */
	public void setComptesSupprimes(boolean comptesSupprimes) {
		this.comptesSupprimes = comptesSupprimes;
	}

	/**
	 * @return the structure
	 */
	public Structure getStructure() {
		return structure;
	}

	/**
	 * @param structure the structure to set
	 */
	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
}
