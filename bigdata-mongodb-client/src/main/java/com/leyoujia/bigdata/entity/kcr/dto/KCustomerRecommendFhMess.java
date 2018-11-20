package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

public class KCustomerRecommendFhMess implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private Long fhId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getFhId() {
		return fhId;
	}
	public void setFhId(Long fhId) {
		this.fhId = fhId;
	}

}
