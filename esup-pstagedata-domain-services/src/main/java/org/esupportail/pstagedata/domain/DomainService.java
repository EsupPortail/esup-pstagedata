package org.esupportail.pstagedata.domain;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.User;


public interface DomainService extends Serializable {

	/**
	 * @param uid
	 * @return a user.
	 */
	User getUser(String uid);

}