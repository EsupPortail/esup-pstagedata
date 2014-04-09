package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Pays;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PaysDTO extends NomenclatureIdDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * Code actualit� du pays ou du territoire.
		1	actuel
		2	p�rim� (dont le code a disparu du C.O.G.)
		3	territoire n'ayant pas son propre code officiel g�ographique
		4	territoire ayant son propre code officiel g�ographique
	 */
	private int actual;
	/**
	 * Code du pays ou territoire
	 */
	private int cog;
	/**
	 * Code officiel g�ographique du pays de rattachement du territoire.
	 */
	private int crpay;
	/**
	 * ISO 2 : FR,BE,GB,DK,...
	 */
	private String iso2;
	/**
	 * Vrai si le siret est obligatoire pour le pays, faux sinon
	 */
	private boolean siretObligatoire;
	
	/**
	 * Constructeur
	 */
	public PaysDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param p 
	 */
	public PaysDTO(Pays p){
		super(p);
		if(p!=null){
			actual=p.getActual();
			cog=p.getCog();
			if (p.getCrpay() != null)
				crpay=p.getCrpay();
			if (p.getIso2() != null)
				iso2=p.getIso2();
			siretObligatoire=p.isSiretObligatoire();
		}
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

	/**
	 * @return the actual
	 */
	public int getActual() {
		return actual;
	}

	/**
	 * @param actual the actual to set
	 */
	public void setActual(int actual) {
		this.actual = actual;
	}

	/**
	 * @return the cog
	 */
	public int getCog() {
		return cog;
	}

	/**
	 * @param cog the cog to set
	 */
	public void setCog(int cog) {
		this.cog = cog;
	}

	/**
	 * @return the crpay
	 */
	public int getCrpay() {
		return crpay;
	}

	/**
	 * @param crpay the crpay to set
	 */
	public void setCrpay(int crpay) {
		this.crpay = crpay;
	}

	/**
	 * @return the iso2
	 */
	public String getIso2() {
		return iso2;
	}

	/**
	 * @param iso2 the iso2 to set
	 */
	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	/**
	 * @return the siretObligatoire
	 */
	public boolean isSiretObligatoire() {
		return siretObligatoire;
	}

	/**
	 * @param siretObligatoire the siretObligatoire to set
	 */
	public void setSiretObligatoire(boolean siretObligatoire) {
		this.siretObligatoire = siretObligatoire;
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString()+", actual : "+this.actual+", cog : "+this.cog+", iso2 : "+this.iso2+", siretObligatoire : "+this.siretObligatoire;
	}

}
