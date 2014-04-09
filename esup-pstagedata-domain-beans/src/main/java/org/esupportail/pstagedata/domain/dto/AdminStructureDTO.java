package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.AdminStructure;
import org.springframework.util.StringUtils;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructureDTO extends PersonneDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Login/UID
	 */
	private String login;
	/**
	 * EPPN
	 */
	private String eppn;
	/**
	 * Mot de passe
	 */
	private String mdp;
	
	/**
	 * Constructeur
	 */
	public AdminStructureDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param as 
	 */
	public AdminStructureDTO(AdminStructure as){
		super(as,false);
		if(as!=null){
			login=as.getLogin();
			eppn=as.getEppn();
			mdp=as.getMdp();
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "login : "+login+", "+"eppn : "+eppn+", "+
		super.toString();
	}
	
	/**
	 * @return le login ou l'eppn de l'administrateur
	 */
	public String displayLogin(){
		String log = "";
		if(StringUtils.hasText(this.login)) log=this.login;
		if(StringUtils.hasText(this.eppn)) log=this.eppn;
		return log;
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the eppn
	 */
	public String getEppn() {
		return eppn;
	}

	/**
	 * @param eppn the eppn to set
	 */
	public void setEppn(String eppn) {
		this.eppn = eppn;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
