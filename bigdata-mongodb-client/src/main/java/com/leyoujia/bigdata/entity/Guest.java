package com.leyoujia.bigdata.entity;

import java.io.Serializable;

public class Guest implements Serializable{
	private static final long serialVersionUID = 1L;

	/** IP */
	private String ip;
	/** 地址 */
	private String addr;
	/** 日期时间 */
	private String dateTime;
	/** 用户代理 */
	private String userAgent;
	/** 路径 */
	private String url;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
