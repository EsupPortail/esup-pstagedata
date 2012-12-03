package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.TicketStructure;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 * ticketStructure
 */
public class TicketStructureDTO implements Serializable{
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
	public TicketStructureDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param t 
	 */
	public TicketStructureDTO(TicketStructure t){
		super();
		if(t!=null){
			this.ticket=t.getTicket();
			this.idStructure=t.getIdStructure();
		}
	}
	
		
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
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
