package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

public class BrowseAppRecordDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String phone;
	private String cookies;
	private String ip;
	private Integer appType;
	private String appId;
	private Integer count;
	private String updateDate;
	private String createDate;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCookies() {
		return cookies;
	}
	public void setCookies(String cookies) {
		this.cookies = cookies;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getAppType() {
		return appType;
	}
	public void setAppType(Integer appType) {
		this.appType = appType;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	 
	public String getMapKey() {
		return this.ip+this.appType+this.appId;
	}
}
