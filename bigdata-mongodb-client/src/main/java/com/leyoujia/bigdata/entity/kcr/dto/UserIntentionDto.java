package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

/**
 * mysql 来自mangodb 十分钟的数据
 * @author tyc
 *
 */
public class UserIntentionDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String phone;
	private String cookies;
	private String ip;
	private String area;
	private String price;
	private String mianji;
	private String huxing;
	private String chaoxiang;
	private String zhuangxiu;
	private String louling;
	private String tese;
	private String type;
	private String keywords;
	private String createDate;
	private String updateDate;
	
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMianji() {
		return mianji;
	}
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	public String getHuxing() {
		return huxing;
	}
	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}
	public String getChaoxiang() {
		return chaoxiang;
	}
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	public String getZhuangxiu() {
		return zhuangxiu;
	}
	public void setZhuangxiu(String zhuangxiu) {
		this.zhuangxiu = zhuangxiu;
	}
	public String getLouling() {
		return louling;
	}
	public void setLouling(String louling) {
		this.louling = louling;
	}
	public String getTese() {
		return tese;
	}
	public void setTese(String tese) {
		this.tese = tese;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
