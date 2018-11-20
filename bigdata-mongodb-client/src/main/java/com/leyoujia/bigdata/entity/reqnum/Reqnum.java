package com.leyoujia.bigdata.entity.reqnum;

import java.io.Serializable;

public class Reqnum implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String date; 
	private Long count;
	
	public Reqnum(String date, Long count) {
		 
		this.count = count;
		this.date = date;
	}

	 
	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	} 
	
}
