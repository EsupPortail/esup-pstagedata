package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 * ticketStructure
 */
public class TicketStructure implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ticket
	 */
	private String ticket;
	/**
	 * ID de la structure
	 */
	private int idStructure;	

	/**
	 * Constructeur
	 */
	public TicketStructure(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the idStructure
	 */
	public int getIdStructure() {
		return idStructure;
	}

	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(int idStructure) {
		this.idStructure = idStructure;
	}

	
}
