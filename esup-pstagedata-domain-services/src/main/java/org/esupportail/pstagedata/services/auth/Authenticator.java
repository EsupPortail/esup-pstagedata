/**
 * ESUP-Portail Blank Application - Copyright (c) 2010 ESUP-Portail consortium.
 */
package org.esupportail.pstagedata.services.auth;

import org.esupportail.pstagedata.domain.beans.User;

import java.io.Serializable;

/**
 * @author Yves Deschamps (Universite de Lille 1) - 2010
 * 
 */
public interface Authenticator extends Serializable{

	/**
	 * @return the authenticated user.
	 * @throws Exception 
	 */
	User getUser();

}