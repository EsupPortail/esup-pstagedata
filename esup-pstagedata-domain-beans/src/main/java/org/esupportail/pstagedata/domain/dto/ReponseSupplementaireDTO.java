package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.ReponseSupplementaire;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class ReponseSupplementaireDTO extends ObjetMetiersDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * idQuestionSupplementaire
	 */
	private Integer idQuestionSupplementaire;
	/**
	 * idConvention
	 */
	private Integer idConvention;
	/**
	 * reponseTxt
	 */
	private String reponseTxt;
	/**
	 * reponseInt
	 */
	private Integer reponseInt;
	/**
	 * reponseBool
	 */
	private boolean reponseBool;


	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * Constructeur
	 */
	public ReponseSupplementaireDTO(){
		super();
	}

	/**
	 * Constructeur
	 */
	public ReponseSupplementaireDTO(ReponseSupplementaire rs){
		super(rs);
		if(rs!=null){
			this.idQuestionSupplementaire = rs.getIdQuestionSupplementaire();
			this.idConvention = rs.getIdConvention();
			this.reponseTxt = rs.getReponseTxt();
			this.reponseInt = rs.getReponseInt();
			this.reponseBool = rs.isReponseBool();
		}
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
		ReponseSupplementaireDTO other = (ReponseSupplementaireDTO) obj;
		if (idQuestionSupplementaire == null) {
			if (other.idQuestionSupplementaire != null)
				return false;
		} else if (!idQuestionSupplementaire.equals(other.idQuestionSupplementaire))
			return false;
		return true;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"idQuestionSupplementaire : "+idQuestionSupplementaire+", "+
		"idConvention : "+idConvention+", "+
		"reponseTxt : "+reponseTxt+", "+
		"reponseInt : "+reponseInt+", "+
		"reponseBool : "+reponseBool+", "+super.toString();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	/**
	 * @return the idQuestionSupplementaire
	 */
	public Integer getIdQuestionSupplementaire() {
		return idQuestionSupplementaire;
	}

	/**
	 * @param idQuestionSupplementaire the idQuestionSupplementaire to set
	 */
	public void setIdQuestionSupplementaire(Integer idQuestionSupplementaire) {
		this.idQuestionSupplementaire = idQuestionSupplementaire;
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
	 * @return the reponseTxt
	 */
	public String getReponseTxt() {
		return reponseTxt;
	}

	/**
	 * @param reponseTxt the reponseTxt to set
	 */
	public void setReponseTxt(String reponseTxt) {
		this.reponseTxt = reponseTxt;
	}

	/**
	 * @return the reponseInt
	 */
	public Integer getReponseInt() {
		return reponseInt;
	}

	/**
	 * @param reponseInt the reponseInt to set
	 */
	public void setReponseInt(Integer reponseInt) {
		this.reponseInt = reponseInt;
	}

	/**
	 * @return the reponseBool
	 */
	public boolean isReponseBool() {
		return reponseBool;
	}

	/**
	 * @param reponseBool the reponseBool to set
	 */
	public void setReponseBool(boolean reponseBool) {
		this.reponseBool = reponseBool;
	}

}
