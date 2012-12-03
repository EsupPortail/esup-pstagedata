package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.StatisticItem;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StatisticItemDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Integer idStatisticItem;
	/**
	 * 
	 */
	private String idPriorCriteria = "";
	/**
	 * 
	 */
	private String libPriorCriteria = "";
	/**
	 * 
	 */
	private String id = "";
	/**
	 * 
	 */
	private String lib = "";
	/**
	 * 
	 */
	private int number = 0;
	/**
	 * 
	 */
	private double percentage=0;
	/**
	 * 
	 */
	private StatisticItem statisticItem;
	/**
	 * 
	 */
	public StatisticItemDTO() {
		super();
	}
	/**
	 * @return the idStatisticItem
	 */
	public Integer getIdStatisticItem() {
		return idStatisticItem;
	}
	/**
	 * @param idStatisticItem the idStatisticItem to set
	 */
	public void setIdStatisticItem(Integer idStatisticItem) {
		this.idStatisticItem = idStatisticItem;
	}
	/**
	 * @return the idPriorCriteria
	 */
	public String getIdPriorCriteria() {
		return idPriorCriteria;
	}
	/**
	 * @param idPriorCriteria the idPriorCriteria to set
	 */
	public void setIdPriorCriteria(String idPriorCriteria) {
		this.idPriorCriteria = idPriorCriteria;
	}
	/**
	 * @return the libPriorCriteria
	 */
	public String getLibPriorCriteria() {
		return libPriorCriteria;
	}
	/**
	 * @param libPriorCriteria the libPriorCriteria to set
	 */
	public void setLibPriorCriteria(String libPriorCriteria) {
		this.libPriorCriteria = libPriorCriteria;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the lib
	 */
	public String getLib() {
		return lib;
	}
	/**
	 * @param lib the lib to set
	 */
	public void setLib(String lib) {
		this.lib = lib;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	/**
	 * @param statisticItem the statisticItem to set
	 */
	public void setStatisticItem(StatisticItem statisticItem) {
		this.statisticItem = statisticItem;
		if(this.statisticItem != null){
			this.id=this.statisticItem.getId();
			this.idPriorCriteria=this.statisticItem.getIdPriorCriteria();
			this.lib=this.statisticItem.getLib();
			this.libPriorCriteria =this.statisticItem.getLibPriorCriteria();
			this.number = this.statisticItem.getNumber();
			this.percentage = this.statisticItem.getPercentage();
			this.idStatisticItem = this.statisticItem.getIdStatisticItem();

		}
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatisticItemDTO [id=");
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
