package com.leyoujia.bigdata.entity.spider.fangtianxia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

public class Fang_pro_comment   extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String city;
	private String district;
	private String area;
	private String address;
	private String project_url;
	private String project_id;
	private String project_name;
	private String text;
	private String label;//是否精品
	private String date;
	
	private String name;
	private String role;//业主
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProject_url() {
		return project_url;
	}
	public void setProject_url(String project_url) {
		this.project_url = project_url;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
