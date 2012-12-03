package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CritereRechercheConvention implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * List ID Centre gestion
	 */
	private List<Integer> idsCentreGestion;
	/**
	 * Id Convention
	 */
	private String idConvention;
	/**
	 * numeroEtudiant
	 */
	private String numeroEtudiant;
	/**
	 * nomEtudiant
	 */
	private String nomEtudiant;
	/**
	 * prenomEtudiant
	 */
	private String prenomEtudiant;
	/**
	 * sujetStage
	 */
	private String sujetStage;
	/**
	 * typeConvention
	 */
	private TypeConvention typeConvention;
	/**
	 * theme
	 */
	private Theme theme;
	/**
	 * nbJoursHebdo
	 */
	private String nbJoursHebdo;
	/**
	 * indemnisation
	 */
	private Indemnisation indemnisation;
	/**
	 * tempsTravail
	 */
	private TempsTravail tempsTravail;
	/**
	 * langueConvention
	 */
	private LangueConvention langueConvention;
	/**
	 * estValidee
	 */
	private Boolean estValidee;
	/**
	 * Stage en cours, termin�, ...
	 */
	private String dateStage;
	/**
	 * anneeUniversitaire
	 */
	private String anneeUniversitaire;
	/**
	 * Id offre
	 */
	private String idOffre;
	/**
	 * nomEnseignant
	 */
	private String nomEnseignant;
	/**
	 * prenomEnseignant
	 */
	private String prenomEnseignant;
	/**
	 * ufrs
	 */
	private List<Integer> idsUfrs;
	/**
	 * etapes
	 */
	private List<Integer> idsEtapes;
	/**
	 * raisonSociale
	 */
	private String raisonSociale;
	/**
	 * numeroSiret
	 */
	private String numeroSiret;
	/**
	 * commune
	 */
	private String commune;
	/**
	 * codePostal
	 */
	private String codePostal;
	/**
	 * pays
	 */
	private Pays pays;
	/**
	 * typeStructure
	 */
	private TypeStructure typeStructure;
	/**
	 * statutJuridique
	 */
	private StatutJuridique statutJuridique;
	/**
	 * effectif
	 */
	private Effectif effectif;
	/**
	 * NafN1
	 */
	private NafN1 nafN1;
	/**
	 * Requete limit�e � 200 r�sultats
	 */
	private boolean isLimit;

	/**
	 * nbre limite export.
	 */
	private String nbExportMaxi;
	
	/**
	 * nbre recherche Maxi.
	 */
	private String nbRechercheMaxi;
	/**
	 * Constructeur
	 */
	public CritereRechercheConvention(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the idsCentreGestion
	 */
	public List<Integer> getIdsCentreGestion() {
		if(idsCentreGestion==null || idsCentreGestion.isEmpty())idsCentreGestion=null;
		return idsCentreGestion;
	}

	/**
	 * @param idsCentreGestion the idsCentreGestion to set
	 */
	public void setIdsCentreGestion(List<Integer> idsCentreGestion) {
		this.idsCentreGestion = idsCentreGestion;
	}

	/**
	 * @return the nafN1
	 */
	public NafN1 getNafN1() {
		if(nafN1!=null && !StringUtils.hasText(nafN1.getCode()))nafN1=null;
		return nafN1;
	}

	/**
	 * @param nafN1 the nafN1 to set
	 */
	public void setNafN1(NafN1 nafN1) {
		this.nafN1 = nafN1;
	}

	/**
	 * @return the idOffre
	 */
	public String getIdOffre() {
		if(!StringUtils.hasText(idOffre))idOffre=null;
		return idOffre;
	}

	/**
	 * @param idOffre the idOffre to set
	 */
	public void setIdOffre(String idOffre) {
		this.idOffre = idOffre;
	}

	/**
	 * @return the idConvention
	 */
	public String getIdConvention() {
		if(!StringUtils.hasText(idConvention))idConvention=null;
		return idConvention;
	}

	/**
	 * @param idConvention the idConvention to set
	 */
	public void setIdConvention(String idConvention) {
		this.idConvention = idConvention;
	}

	/**
	 * @return the numeroEtudiant
	 */
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	/**
	 * @param numeroEtudiant the numeroEtudiant to set
	 */
	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	/**
	 * @return the nomEtudiant
	 */
	public String getNomEtudiant() {
		return nomEtudiant;
	}

	/**
	 * @param nomEtudiant the nomEtudiant to set
	 */
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	/**
	 * @return the prenomEtudiant
	 */
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	/**
	 * @param prenomEtudiant the prenomEtudiant to set
	 */
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
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
	 * @return the typeConvention
	 */
	public TypeConvention getTypeConvention() {
		if(typeConvention!=null && typeConvention.getId()==null ||
				(typeConvention!=null && typeConvention.getId()!=null && typeConvention.getId().intValue()<=0))typeConvention=null;
		return typeConvention;
	}

	/**
	 * @param typeConvention the typeConvention to set
	 */
	public void setTypeConvention(TypeConvention typeConvention) {
		this.typeConvention = typeConvention;
	}

	/**
	 * @return the theme
	 */
	public Theme getTheme() {
		if(theme!=null && theme.getId()==null ||
				(theme!=null && theme.getId()!=null && theme.getId().intValue()<=0))theme=null;
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	/**
	 * @return the nbJoursHebdo
	 */
	public String getNbJoursHebdo() {
		return nbJoursHebdo;
	}

	/**
	 * @param nbJoursHebdo the nbJoursHebdo to set
	 */
	public void setNbJoursHebdo(String nbJoursHebdo) {
		this.nbJoursHebdo = nbJoursHebdo;
	}

	/**
	 * @return the indemnisation
	 */
	public Indemnisation getIndemnisation() {
		if(indemnisation!=null && indemnisation.getId()==null ||
				(indemnisation!=null && indemnisation.getId()!=null && indemnisation.getId().intValue()<=0))indemnisation=null;
		return indemnisation;
	}

	/**
	 * @param indemnisation the indemnisation to set
	 */
	public void setIndemnisation(Indemnisation indemnisation) {
		this.indemnisation = indemnisation;
	}

	/**
	 * @return the tempsTravail
	 */
	public TempsTravail getTempsTravail() {
		if(tempsTravail!=null && tempsTravail.getId()==null ||
				(tempsTravail!=null && tempsTravail.getId()!=null && tempsTravail.getId().intValue()<=0))tempsTravail=null;
		return tempsTravail;
	}

	/**
	 * @param tempsTravail the tempsTravail to set
	 */
	public void setTempsTravail(TempsTravail tempsTravail) {
		this.tempsTravail = tempsTravail;
	}

	/**
	 * @return the langueConvention
	 */
	public LangueConvention getLangueConvention() {
		if(langueConvention!=null && !StringUtils.hasText(langueConvention.getCode()))langueConvention=null;
		return langueConvention;
	}

	/**
	 * @param langueConvention the langueConvention to set
	 */
	public void setLangueConvention(LangueConvention langueConvention) {
		this.langueConvention = langueConvention;
	}

	/**
	 * @return the estValidee
	 */
	public Boolean getEstValidee() {
		return estValidee;
	}

	/**
	 * @param estValidee the estValidee to set
	 */
	public void setEstValidee(Boolean estValidee) {
		this.estValidee = estValidee;
	}

	/**
	 * @return the dateStage
	 */
	public String getDateStage() {
		return dateStage;
	}

	/**
	 * @param dateStage the dateStage to set
	 */
	public void setDateStage(String dateStage) {
		this.dateStage = dateStage;
	}

	/**
	 * @return the anneeUniversitaire
	 */
	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	/**
	 * @param anneeUniversitaire the anneeUniversitaire to set
	 */
	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	/**
	 * @return the nomEnseignant
	 */
	public String getNomEnseignant() {
		return nomEnseignant;
	}

	/**
	 * @param nomEnseignant the nomEnseignant to set
	 */
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}

	/**
	 * @return the prenomEnseignant
	 */
	public String getPrenomEnseignant() {
		return prenomEnseignant;
	}

	/**
	 * @param prenomEnseignant the prenomEnseignant to set
	 */
	public void setPrenomEnseignant(String prenomEnseignant) {
		this.prenomEnseignant = prenomEnseignant;
	}

	/**
	 * @return the raisonSociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}

	/**
	 * @return the idsUfrs
	 */
	public List<Integer> getIdsUfrs() {
		if(idsUfrs==null || idsUfrs.isEmpty()) idsUfrs=null;
		return idsUfrs;
	}

	/**
	 * @param idsUfrs the idsUfrs to set
	 */
	public void setIdsUfrs(List<Integer> idsUfrs) {
		this.idsUfrs = idsUfrs;
	}

	/**
	 * @return the idsEtapes
	 */
	public List<Integer> getIdsEtapes() {
		if(idsEtapes==null || idsEtapes.isEmpty()) idsEtapes=null;
		return idsEtapes;
	}

	/**
	 * @param idsEtapes the idsEtapes to set
	 */
	public void setIdsEtapes(List<Integer> idsEtapes) {
		this.idsEtapes = idsEtapes;
	}

	/**
	 * @param raisonSociale the raisonSociale to set
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	/**
	 * @return the numeroSiret
	 */
	public String getNumeroSiret() {
		return numeroSiret;
	}

	/**
	 * @param numeroSiret the numeroSiret to set
	 */
	public void setNumeroSiret(String numeroSiret) {
		this.numeroSiret = numeroSiret;
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
	 * @return the pays
	 */
	public Pays getPays() {
		if(pays!=null && pays.getId()==null ||
				(pays!=null && pays.getId()!=null && pays.getId().intValue()<=0))pays=null;
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * @return the typeStructure
	 */
	public TypeStructure getTypeStructure() {
		if(typeStructure!=null && typeStructure.getId()==null ||
				(typeStructure!=null && typeStructure.getId()!=null && typeStructure.getId().intValue()<=0))typeStructure=null;
		return typeStructure;
	}

	/**
	 * @param typeStructure the typeStructure to set
	 */
	public void setTypeStructure(TypeStructure typeStructure) {
		this.typeStructure = typeStructure;
	}

	/**
	 * @return the statutJuridique
	 */
	public StatutJuridique getStatutJuridique() {
		if(statutJuridique!=null && statutJuridique.getId()==null ||
				(statutJuridique!=null && statutJuridique.getId()!=null && statutJuridique.getId().intValue()<=0))statutJuridique=null;
		return statutJuridique;
	}

	/**
	 * @param statutJuridique the statutJuridique to set
	 */
	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	/**
	 * @return the effectif
	 */
	public Effectif getEffectif() {
		if(effectif!=null && effectif.getId()==null ||
				(effectif!=null && effectif.getId()!=null && effectif.getId().intValue()<=0))effectif=null;
		return effectif;
	}

	/**
	 * @param effectif the effectif to set
	 */
	public void setEffectif(Effectif effectif) {
		this.effectif = effectif;
	}

	/**
	 * @return the isLimit
	 */
	public boolean isLimit() {
		return isLimit;
	}

	/**
	 * @param isLimit the isLimit to set
	 */
	public void setLimit(boolean isLimit) {
		this.isLimit = isLimit;
	}

	/**
	 * @return the nbExportMaxi
	 */
	public String getNbExportMaxi() {
		return nbExportMaxi;
	}

	/**
	 * @param nbExportMaxi the nbExportMaxi to set
	 */
	public void setNbExportMaxi(String nbExportMaxi) {
		this.nbExportMaxi = nbExportMaxi;
	}

	/**
	 * @return the nbRechercheMaxi
	 */
	public String getNbRechercheMaxi() {
		return nbRechercheMaxi;
	}

	/**
	 * @param nbRechercheMaxi the nbRechercheMaxi to set
	 */
	public void setNbRechercheMaxi(String nbRechercheMaxi) {
		this.nbRechercheMaxi = nbRechercheMaxi;
	}

}
