package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Avenant;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class AvenantDTO extends ObjetMetiersDTO implements Serializable{
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
	
	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * service
	 */
	private ServiceDTO service;
	/**
	 * contact
	 */
	private ContactDTO contact;
	/**
	 * enseigant
	 */
	private EnseignantDTO enseignant;
	/**
	 * uniteGratification
	 */
	private UniteGratificationDTO uniteGratification;
	
	/**
	 * convention
	 */
	private ConventionDTO convention;
	
	/**
	 * Constructeur
	 */
	public AvenantDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param a 
	 */
	public AvenantDTO(Avenant a){
		super(a);
		if(a!=null){
			this.idAvenant=a.getIdAvenant();
			this.idConvention= a.getIdConvention();
			this.titreAvenant=a.getTitreAvenant();
			this.motifAvenant = a.getMotifAvenant();
			this.rupture=a.isRupture();
			this.modificationPeriode=a.isModificationPeriode();
			this.dateDebutStage=a.getDateDebutStage();
			this.dateFinStage=a.getDateFinStage();
			this.interruptionStage=a.isInterruptionStage();
			this.dateDebutInterruption=a.getDateDebutInterruption();
			this.dateFinInterruption=a.getDateFinInterruption();
			this.modificationLieu=a.isModificationLieu();
			this.idService=a.getIdService();
			this.modificationSujet=a.isModificationSujet();
			this.sujetStage=a.getSujetStage();
			this.modificationEnseignant=a.isModificationEnseignant();
			this.idEnseignant=a.getIdEnseignant();
			this.modificationSalarie=a.isModificationSalarie();
			this.idContact=a.getIdContact();
			this.validationAvenant=a.isValidationAvenant();
			this.modificationMontantGratification=a.isModificationMontantGratification();
			this.setIdUniteGratification(a.getIdUniteGratification());
			this.setMontantGratification(a.getMontantGratification());
			if(a.getService()!=null) 
				setService(new ServiceDTO(a.getService()));
			if(a.getContact()!=null) 
				setContact(new ContactDTO(a.getContact()));
			if(a.getEnseignant()!=null) 
				setEnseignant(new EnseignantDTO(a.getEnseignant()));
			if(a.getUniteGratification() != null)
				setUniteGratification(new UniteGratificationDTO(a.getUniteGratification()));
			if (a.getConvention() != null) {
				setConvention(new ConventionDTO(a.getConvention(),false));
			}
			
		}
	}	
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"idAvenant : "+idAvenant+", "+
		"idConvention : "+idConvention+", "+
		"titreAvenant : "+titreAvenant+", "+
		"motifAvenant : "+motifAvenant+", "+
		"rupture : "+rupture+", "+
		"modificationPeriode : "+modificationPeriode+", "+
		"dateDebutStage : "+dateDebutStage+", "+
		"dateFinStage : "+dateFinStage+", "+
		"interruptionStage : "+interruptionStage+", "+
		"dateDebutInterruption : "+dateDebutInterruption+", "+
		"dateFinInterruption : "+dateFinInterruption+", "+
		"modificationLieu : "+modificationLieu+", "+
		"idService : "+idService+", "+
		"modificationSujet : "+modificationSujet+", "+
		"sujetStage : "+sujetStage+", "+
		"modificationEnseignant : "+modificationEnseignant+", "+
		"idEnseignant : "+idEnseignant+", "+
		"modificationSalarie : "+modificationSalarie+", "+
		"idContact : "+idContact+", "+
		"modificationMontantGratification : " + modificationMontantGratification +", "+
		"idUniteGratification : " + idUniteGratification + ", "+
		"montantGratification : " + montantGratification + ", "+
		"validationAvenant : "+validationAvenant+", "+
		", "+super.toString();

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
		AvenantDTO other = (AvenantDTO) obj;
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
	public void setService(ServiceDTO service) {
		this.service = service;
	}

	/**
	 * @return the service
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	/**
	 * @return the contact
	 */
	public ContactDTO getContact() {
		return contact;
	}

	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(EnseignantDTO enseignant) {
		this.enseignant = enseignant;
	}

	/**
	 * @return the enseignant
	 */
	public EnseignantDTO getEnseignant() {
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
	public void setUniteGratification(UniteGratificationDTO uniteGratification) {
		this.uniteGratification = uniteGratification;
	}

	/**
	 * @return the uniteGratification
	 */
	public UniteGratificationDTO getUniteGratification() {
		return uniteGratification;
	}

	/**
	 * @return the idEnseignant
	 */
	public Integer getIdEnseignant() {
		return idEnseignant;
	}

	/**
	 * @param idEnseignant the idEnseignant to set
	 */
	public void setIdEnseignant(Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	/**
	 * @return the convention
	 */
	public ConventionDTO getConvention() {
		return convention;
	}

	/**
	 * @param convention the convention to set
	 */
	public void setConvention(ConventionDTO convention) {
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
	
	
}
