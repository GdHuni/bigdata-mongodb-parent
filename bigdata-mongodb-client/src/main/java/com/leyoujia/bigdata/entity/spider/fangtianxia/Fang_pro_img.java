package com.leyoujia.bigdata.entity.spider.fangtianxia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

public class Fang_pro_img extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String city;
	private String district;
	private String area;
	private String address;
	private String project_url;
	private String project_id;
	private String project_name;
	private String img_name;//实景图or户型图
	private String img_url;
	
	
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
	public String getImg_name() {
		return img_name;
	}
	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	
	

}
