package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.util.StringUtils;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CritereRechercheOffre implements Serializable{
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
	 * TypeOffre
	 */
	private TypeOffre typeOffre;
	/**
	 * ContratOffre
	 */
	private ContratOffre contratOffre;
	/**
	 * Intitul�
	 */
	private String intitule;
	/**
	 * Lieu code postal
	 */
	private List<String> lieuCodesPostal;
	/**
	 * Lieu Commune
	 */
	private String lieuCommune;
	/**
	 * Lieu Pays
	 */
	private Pays lieuPays;
	/**
	 * FapQualificationSimplifiee
	 */
	private FapQualificationSimplifiee fapQualificationSimplifiee;
	/**
	 * FapN1
	 */
	private FapN1 fapN1;
	/**
	 * FapN2
	 */
	private FapN2 fapN2;
	/**
	 * FapN3
	 */
	private FapN3 fapN3;
	/**
	 * NafN1
	 */
	private NafN1 nafN1;
	/**
	 * NiveauFormation
	 */
	private NiveauFormation niveauFormation;
	/**
	 * estAccessERQTH
	 * false par d�faut
	 * A false ces offres sont quand m�me r�cup�r�es
	 * A true seules ces offres sont r�cup�r�es (+ estPrioERQTH si false)
	 */
	private boolean estAccessERQTH;
	/**
	 * estPrioERQTH
	 * false par d�faut
	 * A false ces offres sont quand m�me r�cup�r�es
	 * A true seules ces offres sont r�cup�r�es
	 */
	private boolean estPrioERQTH;
	/**
	 * Mots cl�s
	 */
	private String motsCles;
	/**
	 * Id offre
	 */
	private String idOffre;

	//Recherche admin

	/**
	 * TypeStructure
	 */
	private TypeStructure typeStructure;
	/**
	 * Inclure offre entreprise
	 */
	private boolean inclureOffresEntreprise;
	/**
	 * Si offre diffusee
	 */
	private boolean estDiffusee;
	/**
	 * Si diffusion termin�e
	 */
	private boolean diffusionTerminee;
	/**
	 * Si offre supprim�e
	 */
	private boolean estSupprimee;
	
	/**
	 * anneeUniversitaire
	 */
	private String anneeUniversitaire;
	
	/**
	 * Si recherche sur la France
	 */
	private boolean estFrance;

	/**
	 * Constructeur
	 */
	public CritereRechercheOffre(){
		super();
		estAccessERQTH=false;
		estPrioERQTH=false;
		inclureOffresEntreprise=true;
		estDiffusee=true;
		diffusionTerminee=false;
		estSupprimee=false;
		estFrance=false;
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the typeOffre
	 */
	public TypeOffre getTypeOffre() {
		if((typeOffre!=null && typeOffre.getId()==null) ||
				(typeOffre!=null && typeOffre.getId()!=null && typeOffre.getId().intValue()<=0))typeOffre=null;
		return typeOffre;
	}

	/**
	 * @param typeOffre the typeOffre to set
	 */
	public void setTypeOffre(TypeOffre typeOffre) {
		this.typeOffre = typeOffre;
	}

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
	 * @return the contratOffre
	 */
	public ContratOffre getContratOffre() {
		if((contratOffre!=null && contratOffre.getId()==null) ||
				(contratOffre!=null && contratOffre.getId()!=null && contratOffre.getId().intValue()<=0))contratOffre=null;
		return contratOffre;
	}

	/**
	 * @param contratOffre the contratOffre to set
	 */
	public void setContratOffre(ContratOffre contratOffre) {
		this.contratOffre = contratOffre;
	}

	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		if(!StringUtils.hasText(this.intitule))intitule=null;
		return intitule;
	}

	/**
	 * @param intitule the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/**
	 * @return the lieuCodesPostal
	 */
	public List<String> getLieuCodesPostal() {
		if(lieuCodesPostal!=null && !lieuCodesPostal.isEmpty()){
			Iterator<String> its = lieuCodesPostal.iterator();
			while(its.hasNext()){
				String s = its.next();
				if(!StringUtils.hasText(s))its.remove();				
			}
		}
		if(lieuCodesPostal==null || lieuCodesPostal.isEmpty())lieuCodesPostal=null;
		return lieuCodesPostal;
	}

	/**
	 * @param lieuCodesPostal the lieuCodesPostal to set
	 */
	public void setLieuCodesPostal(List<String> lieuCodesPostal) {
		this.lieuCodesPostal = lieuCodesPostal;
	}

	/**
	 * @return the lieuCommune
	 */
	public String getLieuCommune() {
		if(!StringUtils.hasText(this.lieuCommune))lieuCommune=null;
		return lieuCommune;
	}

	/**
	 * @param lieuCommune the lieuCommune to set
	 */
	public void setLieuCommune(String lieuCommune) {
		this.lieuCommune = lieuCommune;
	}

	/**
	 * @return the lieuPays
	 */
	public Pays getLieuPays() {
		if((lieuPays!=null && lieuPays.getId()==null) ||
				(lieuPays!=null && lieuPays.getId()!=null && lieuPays.getId().intValue()<=0))lieuPays=null;
		return lieuPays;
	}

	/**
	 * @param lieuPays the lieuPays to set
	 */
	public void setLieuPays(Pays lieuPays) {
		this.lieuPays = lieuPays;
	}

	/**
	 * @return the fapQualificationSimplifiee
	 */
	public FapQualificationSimplifiee getFapQualificationSimplifiee() {
		if((fapQualificationSimplifiee!=null && fapQualificationSimplifiee.getId()==null) ||
				(fapQualificationSimplifiee!=null && fapQualificationSimplifiee.getId()!=null && fapQualificationSimplifiee.getId().intValue()<=0))fapQualificationSimplifiee=null;
		return fapQualificationSimplifiee;
	}

	/**
	 * @param fapQualificationSimplifiee the fapQualificationSimplifiee to set
	 */
	public void setFapQualificationSimplifiee(
			FapQualificationSimplifiee fapQualificationSimplifiee) {
		this.fapQualificationSimplifiee = fapQualificationSimplifiee;
	}

	/**
	 * @return the fapN1
	 */
	public FapN1 getFapN1() {
		if(fapN1!=null && !StringUtils.hasText(fapN1.getCode()))fapN1=null;
		return fapN1;
	}

	/**
	 * @param fapN1 the fapN1 to set
	 */
	public void setFapN1(FapN1 fapN1) {
		this.fapN1 = fapN1;
	}

	/**
	 * @return the fapN2
	 */
	public FapN2 getFapN2() {
		if(fapN2!=null && !StringUtils.hasText(fapN2.getCode()))fapN2=null;
		return fapN2;
	}

	/**
	 * @param fapN2 the fapN2 to set
	 */
	public void setFapN2(FapN2 fapN2) {
		this.fapN2 = fapN2;
	}

	/**
	 * @return the fapN3
	 */
	public FapN3 getFapN3() {
		if(fapN3!=null && !StringUtils.hasText(fapN3.getCode()))fapN3=null;
		return fapN3;
	}

	/**
	 * @param fapN3 the fapN3 to set
	 */
	public void setFapN3(FapN3 fapN3) {
		this.fapN3 = fapN3;
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
	 * @return the niveauFormation
	 */
	public NiveauFormation getNiveauFormation() {
		if((niveauFormation!=null && niveauFormation.getId()==null) ||
				(niveauFormation!=null && niveauFormation.getId()!=null && niveauFormation.getId().intValue()<=0))niveauFormation=null;
		return niveauFormation;
	}

	/**
	 * @param niveauFormation the niveauFormation to set
	 */
	public void setNiveauFormation(NiveauFormation niveauFormation) {
		this.niveauFormation = niveauFormation;
	}

	/**
	 * @return the estAccessERQTH
	 */
	public boolean isEstAccessERQTH() {
		return estAccessERQTH;
	}

	/**
	 * @param estAccessERQTH the estAccessERQTH to set
	 */
	public void setEstAccessERQTH(boolean estAccessERQTH) {
		this.estAccessERQTH = estAccessERQTH;
	}

	/**
	 * @return the estPrioERQTH
	 */
	public boolean isEstPrioERQTH() {
		return estPrioERQTH;
	}

	/**
	 * @param estPrioERQTH the estPrioERQTH to set
	 */
	public void setEstPrioERQTH(boolean estPrioERQTH) {
		this.estPrioERQTH = estPrioERQTH;
	}

	/**
	 * @return the motsCles
	 */
	public String getMotsCles() {
		if(!StringUtils.hasText(motsCles))motsCles=null;
		return motsCles;
	}

	/**
	 * @param motsCles the motsCles to set
	 */
	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}

	/**
	 * S�paration des mots cl�s
	 * @return List<String>
	 */
	public List<String> splitMotsCles(){
		List<String> lm=new ArrayList<String>();
		if(StringUtils.hasText(motsCles)){
			StringTokenizer st = new StringTokenizer(motsCles," ");
			while(st.hasMoreElements()){
				String s = st.nextToken();
				if(StringUtils.hasText(s))lm.add(s);
			}
		}
		if(lm.isEmpty())lm=null;
		return lm;
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
	 * @return the typeStructure
	 */
	public TypeStructure getTypeStructure() {
		if((typeStructure!=null && typeStructure.getId()==null) ||
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
	 * @return the inclureOffresEntreprise
	 */
	public boolean isInclureOffresEntreprise() {
		return inclureOffresEntreprise;
	}

	/**
	 * @param inclureOffresEntreprise the inclureOffresEntreprise to set
	 */
	public void setInclureOffresEntreprise(boolean inclureOffresEntreprise) {
		this.inclureOffresEntreprise = inclureOffresEntreprise;
	}

	/**
	 * @return the estDiffusee
	 */
	public boolean isEstDiffusee() {
		return estDiffusee;
	}

	/**
	 * @param estDiffusee the estDiffusee to set
	 */
	public void setEstDiffusee(boolean estDiffusee) {
		this.estDiffusee = estDiffusee;
	}

	/**
	 * @return the diffusionTerminee
	 */
	public boolean isDiffusionTerminee() {
		return diffusionTerminee;
	}

	/**
	 * @param diffusionTerminee the diffusionTerminee to set
	 */
	public void setDiffusionTerminee(boolean diffusionTerminee) {
		this.diffusionTerminee = diffusionTerminee;
	}

	/**
	 * @return the estSupprimee
	 */
	public boolean isEstSupprimee() {
		return estSupprimee;
	}

	/**
	 * @param estSupprimee the estSupprimee to set
	 */
	public void setEstSupprimee(boolean estSupprimee) {
		this.estSupprimee = estSupprimee;
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
	 * @return the estFrance
	 */
	public boolean isEstFrance() {
		return estFrance;
	}

	/**
	 * @param estFrance the estFrance to set
	 */
	public void setEstFrance(boolean estFrance) {
		this.estFrance = estFrance;
	}

	
}
