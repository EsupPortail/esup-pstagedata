package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

public class StatisticItem implements Serializable {
	 private Integer idStatisticItem;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public StatisticItem() {
		super();
	}
	
	/**
	 * name="idPriorStatisticItem"
	 */
	private String idPriorCriteria = "";
	
	/**
	 * name="libPriorStatisticItem"
	 */
	private String libPriorCriteria = "";
	
	/**
	 * name="idStatisticItem"
	 */
	private String id = "";
	
	/**
	 * name="libStatisticItem"
	 */
	private String lib = "";
	
	/**
	 * name="statisticItemNumber"
	 */
	private int number = 0;
	
	/**
	 * name="statisticItemPercentage"
	 */
	private double percentage=0;
	
	
	public String getId() {
		return id;
	}

	public void setId(String idStatisticItem) {
		this.id = idStatisticItem;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String libStatisticItem) {
		this.lib = libStatisticItem;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int statisticItemNumber) {
		this.number = statisticItemNumber;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage( double statisticItemPercentage) {
		this.percentage = statisticItemPercentage;
	}

	public String getIdPriorCriteria() {
		return idPriorCriteria;
	}

	public void setIdPriorCriteria(String idPriorStatisticItem) {
		this.idPriorCriteria = idPriorStatisticItem;
	}

	public String getLibPriorCriteria() {
		return libPriorCriteria;
	}

	public void setLibPriorCriteria(String libPriorStatisticItem) {
		this.libPriorCriteria = libPriorStatisticItem;
	}

	

	public Integer getIdStatisticItem() {
		return idStatisticItem;
	}

	public void setIdStatisticItem(Integer idStatisticItem) {
		this.idStatisticItem = idStatisticItem;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatisticItem [id=");
		builder.append(id);
		builder.append(", idPriorCriteria=");
		builder.append(idPriorCriteria);
		builder.append(", idStatisticItem=");
		builder.append(idStatisticItem);
		builder.append(", lib=");
		builder.append(lib);
		builder.append(", libPriorCriteria=");
		builder.append(libPriorCriteria);
		builder.append(", number=");
		builder.append(number);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
	
	
}
