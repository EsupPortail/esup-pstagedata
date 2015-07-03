package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class Avenant extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * idAvenant
	 */
	private Integer idAvenant;
	/**
	 * idConvention
	 */
	private Integer idConvention;
	/**
	 * idEnseignant
	 */
	private Integer idEnseignant;
	/**
	 * titreAvenant
	 */
	private String titreAvenant;
	/**
	 * motifAvenant
	 */
	private String motifAvenant;
	/**
	 * rupture
	 */
	private boolean rupture;
	/**
	 * modificationPeriode
	 */
	private boolean modificationPeriode;
	/**
	 * dateDebutStage
	 */
	private Date dateDebutStage;
	/**
	 * 
	 */
	private Date dateFinStage;
	/**
	 * dateFinStage
	 */
	private boolean interruptionStage;
	/**
	 * dateDebutInterruption
	 */
	private Date dateDebutInterruption;
	/**
	 * dateFinInterruption
	 */
	private Date dateFinInterruption;
	/**
	 * modificationLieu
	 */
	private boolean modificationLieu;
	/**
	 * idService
	 */
	private Integer idService;
	/**
	 * modificationSujet
	 */
	private boolean modificationSujet;
	/**
	 * sujetStage
	 */
	private String sujetStage;
	/**
	 * modificationEnseignant
	 */
	private boolean modificationEnseignant;
	/**
	 * modificationSalarie
	 */
	private boolean modificationSalarie;
	/**
	 * idContact
	 */
	private Integer idContact;
	/**
	 * validationAvenant
	 */
	private boolean validationAvenant;
	/**
	 * modificationMontantGratification
	 */
	private boolean modificationMontantGratification;
	/**
	 * idUniteGratification
	 */
	private Integer idUniteGratification;
	/**
	 * montantGratification
	 */
	private String montantGratification;
	/**
	 * idUniteDureeGratification
	 */
	private Integer idUniteDureeGratification;
	/**
	 * dateRupture
	 */
	private Date dateRupture;
	
	/**
	 * commentaireRupture
	 */
	private String commentaireRupture;


	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * service
	 */
	private Service service;
	/**
	 * contact
	 */
	private Contact contact;
	/**
	 * enseigant
	 */
	private Enseignant enseignant;
	/**
	 * uniteGratification
	 */
	private UniteGratification uniteGratification;

	/**
	 * Convention
	 */
	private Convention convention;

	/**
	 * Constructeur
	 */
	public Avenant(){
		super();
	}


	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idAvenant == null) ? 0 : idAvenant.hashCode());
		return result;
	}



	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avenant other = (Avenant) obj;
		if (idAvenant == null) {
			if (other.idAvenant != null)
				return false;
		} else if (!idAvenant.equals(other.idAvenant))
			return false;
		return true;
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	


	/**
	 * @return the idAvenant
	 */
	public Integer getIdAvenant() {
		return idAvenant;
	}


	/**
	 * @param idAvenant the idAvenant to set
	 */
	public void setIdAvenant(Integer idAvenant) {
		this.idAvenant = idAvenant;
	}


	/**
	 * @return the idConvention
	 */
	public Integer getIdConvention() {
		return idConvention;
	}


	/**
	 * @param idConvention the idConvention to set
	 */
	public void setIdConvention(Integer idConvention) {
		this.idConvention = idConvention;
	}


	/**
	 * @return the motifAvenant
	 */
	public String getMotifAvenant() {
		return motifAvenant;
	}


	/**
	 * @param motifAvenant the motifAvenant to set
	 */
	public void setMotifAvenant(String motifAvenant) {
		this.motifAvenant = motifAvenant;
	}


	/**
	 * @return the rupture
	 */
	public boolean isRupture() {
		return rupture;
	}


	/**
	 * @param rupture the rupture to set
	 */
	public void setRupture(boolean rupture) {
		this.rupture = rupture;
	}


	/**
	 * @return the modificationPeriode
	 */
	public boolean isModificationPeriode() {
		return modificationPeriode;
	}


	/**
	 * @param modificationPeriode the modificationPeriode to set
	 */
	public void setModificationPeriode(boolean modificationPeriode) {
		this.modificationPeriode = modificationPeriode;
	}


	/**
	 * @return the dateDebutStage
	 */
	public Date getDateDebutStage() {
		return dateDebutStage;
	}


	/**
	 * @param dateDebutStage the dateDebutStage to set
	 */
	public void setDateDebutStage(Date dateDebutStage) {
		this.dateDebutStage = dateDebutStage;
	}


	/**
	 * @return the dateFinStage
	 */
	public Date getDateFinStage() {
		return dateFinStage;
	}


	/**
	 * @param dateFinStage the dateFinStage to set
	 */
	public void setDateFinStage(Date dateFinStage) {
		this.dateFinStage = dateFinStage;
	}


	/**
	 * @return the interruptionStage
	 */
	public boolean isInterruptionStage() {
		return interruptionStage;
	}


	/**
	 * @param interruptionStage the interruptionStage to set
	 */
	public void setInterruptionStage(boolean interruptionStage) {
		this.interruptionStage = interruptionStage;
	}


	/**
	 * @return the dateDebutInterruption
	 */
	public Date getDateDebutInterruption() {
		return dateDebutInterruption;
	}


	/**
	 * @param dateDebutInterruption the dateDebutInterruption to set
	 */
	public void setDateDebutInterruption(Date dateDebutInterruption) {
		this.dateDebutInterruption = dateDebutInterruption;
	}


	/**
	 * @return the dateFinInterruption
	 */
	public Date getDateFinInterruption() {
		return dateFinInterruption;
	}


	/**
	 * @param dateFinInterruption the dateFinInterruption to set
	 */
	public void setDateFinInterruption(Date dateFinInterruption) {
		this.dateFinInterruption = dateFinInterruption;
	}


	/**
	 * @return the modificationLieu
	 */
	public boolean isModificationLieu() {
		return modificationLieu;
	}


	/**
	 * @param modificationLieu the modificationLieu to set
	 */
	public void setModificationLieu(boolean modificationLieu) {
		this.modificationLieu = modificationLieu;
	}


	/**
	 * @return the idService
	 */
	public Integer getIdService() {
		return idService;
	}


	/**
	 * @param idService the idService to set
	 */
	public void setIdService(Integer idService) {
		this.idService = idService;
	}


	/**
	 * @return the modificationSujet
	 */
	public boolean isModificationSujet() {
		return modificationSujet;
	}


	/**
	 * @param modificationSujet the modificationSujet to set
	 */
	public void setModificationSujet(boolean modificationSujet) {
		this.modificationSujet = modificationSujet;
	}


	/**
	 * @return the sujetStage
	 */
	public String getSujetStage() {
		return sujetStage;
	}


	/**
	 * @param sujetStage the sujetStage to set
	 */
	public void setSujetStage(String sujetStage) {
		this.sujetStage = sujetStage;
	}


	/**
	 * @return the modificationEnseignant
	 */
	public boolean isModificationEnseignant() {
		return modificationEnseignant;
	}


	/**
	 * @param modificationEnseignant the modificationEnseignant to set
	 */
	public void setModificationEnseignant(boolean modificationEnseignant) {
		this.modificationEnseignant = modificationEnseignant;
	}


	/**
	 * @return the modificationSalarie
	 */
	public boolean isModificationSalarie() {
		return modificationSalarie;
	}


	/**
	 * @param modificationSalarie the modificationSalarie to set
	 */
	public void setModificationSalarie(boolean modificationSalarie) {
		this.modificationSalarie = modificationSalarie;
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
	 * @return the validationAvenant
	 */
	public boolean isValidationAvenant() {
		return validationAvenant;
	}


	/**
	 * @param validationAvenant the validationAvenant to set
	 */
	public void setValidationAvenant(boolean validationAvenant) {
		this.validationAvenant = validationAvenant;
	}


	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}


	/**
	 * @return the service
	 */
	public Service getService() {
		return service;
	}


	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}


	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}


	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}


	/**
	 * @return the enseignant
	 */
	public Enseignant getEnseignant() {
		return enseignant;
	}


	/**
	 * @param modificationMontantGratification the modificationMontantGratification to set
	 */
	public void setModificationMontantGratification(
			boolean modificationMontantGratification) {
		this.modificationMontantGratification = modificationMontantGratification;
	}


	/**
	 * @return the modificationMontantGratification
	 */
	public boolean isModificationMontantGratification() {
		return modificationMontantGratification;
	}

	/**
	 * @param idEnseignant the idEnseignant to set
	 */
	public void setIdEnseignant(Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
	}


	/**
	 * @return the idEnseignant
	 */
	public Integer getIdEnseignant() {
		return idEnseignant;
	}


	/**
	 * @param idUniteGratification the idUniteGratification to set
	 */
	public void setIdUniteGratification(Integer idUniteGratification) {
		this.idUniteGratification = idUniteGratification;
	}


	/**
	 * @return the idUniteGratification
	 */
	public Integer getIdUniteGratification() {
		return idUniteGratification;
	}


	/**
	 * @param montantGratification the montantGratification to set
	 */
	public void setMontantGratification(String montantGratification) {
		this.montantGratification = montantGratification;
	}


	/**
	 * @return the montantGratification
	 */
	public String getMontantGratification() {
		return montantGratification;
	}


	/**
	 * @param uniteGratification the uniteGratification to set
	 */
	public void setUniteGratification(UniteGratification uniteGratification) {
		this.uniteGratification = uniteGratification;
	}


	/**
	 * @return the uniteGratification
	 */
	public UniteGratification getUniteGratification() {
		return uniteGratification;
	}


	/**
	 * @return the convention
	 */
	public Convention getConvention() {
		return convention;
	}


	/**
	 * @param convention the convention to set
	 */
	public void setConvention(Convention convention) {
		this.convention = convention;
	}


	/**
	 * @return the titreAvenant
	 */
	public String getTitreAvenant() {
		return titreAvenant;
	}


	/**
	 * @param titreAvenant the titreAvenant to set
	 */
	public void setTitreAvenant(String titreAvenant) {
		this.titreAvenant = titreAvenant;
	}


	public Integer getIdUniteDureeGratification() {
		return idUniteDureeGratification;
	}


	public void setIdUniteDureeGratification(Integer idUniteDureeGratification) {
		this.idUniteDureeGratification = idUniteDureeGratification;
	}

	/**
	 * 
	 * @return the dateRupture
	 */
	public Date getDateRupture() {
		return dateRupture;
	}

	/**
	 * 
	 * @param dateRupture the dateRupture to set
	 */
	public void setDateRupture(Date dateRupture) {
		this.dateRupture = dateRupture;
	}


	public String getCommentaireRupture() {
		return commentaireRupture;
	}


	public void setCommentaireRupture(String commentaireRupture) {
		this.commentaireRupture = commentaireRupture;
	}


}
