package com.leyoujia.bigdata.entity.spider.lianjia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:链家新房 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.lianjia.Lianjia_xingfang.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年6月12日 上午11:39:18
 */
public class Lianjia_xinfang extends CommonMongo {
	private static final long serialVersionUID = 1L;
	/*城市*/
	private String city;
	/*项目名称*/
	private String project_name;
	/*均价*/
	private String average_price;
	/*物业类型*/
	private String type;
	/*项目地址*/
	private String project_address;
	/*开发商*/
	private String merchant;
	/*物业公司*/
	private String developers;
	/*交房时间*/
	private String completion_date;
	/*容积率*/
	private String rongjilv;
	/*产权年限*/
	private String age_limit;
	/*绿化率*/
	private String greening_rate;
	/*规划户数*/
	private String number;
	/*物业费用*/
	private String property_fee;
	/*车位情况*/
	private String carport;
	/*建筑类型*/
	private String building_types;
	/*占地面积*/
	private String floor_area;
	/*建筑面积*/
	private String building_area;
	/*最新开盘*/
	private String sale_time;
	/*户型介绍*/
	private String house_type;
	/*区域*/
	private String area;
	/*标签*/
	private String label;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProperty_fee() {
		return property_fee;
	}
	public void setProperty_fee(String property_fee) {
		this.property_fee = property_fee;
	}
	public String getGreening_rate() {
		return greening_rate;
	}
	public void setGreening_rate(String greening_rate) {
		this.greening_rate = greening_rate;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getAverage_price() {
		return average_price;
	}
	public void setAverage_price(String average_price) {
		this.average_price = average_price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProject_address() {
		return project_address;
	}
	public void setProject_address(String project_address) {
		this.project_address = project_address;
	}
	public String getDevelopers() {
		return developers;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	public String getCompletion_date() {
		return completion_date;
	}
	public void setCompletion_date(String completion_date) {
		this.completion_date = completion_date;
	}
	public String getRongjilv() {
		return rongjilv;
	}
	public void setRongjilv(String rongjilv) {
		this.rongjilv = rongjilv;
	}
	public String getAge_limit() {
		return age_limit;
	}
	public void setAge_limit(String age_limit) {
		this.age_limit = age_limit;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCarport() {
		return carport;
	}
	public void setCarport(String carport) {
		this.carport = carport;
	}
	public String getBuilding_types() {
		return building_types;
	}
	public void setBuilding_types(String building_types) {
		this.building_types = building_types;
	}
	public String getFloor_area() {
		return floor_area;
	}
	public void setFloor_area(String floor_area) {
		this.floor_area = floor_area;
	}
	public String getBuilding_area() {
		return building_area;
	}
	public void setBuilding_area(String building_area) {
		this.building_area = building_area;
	}
	public String getSale_time() {
		return sale_time;
	}
	public void setSale_time(String sale_time) {
		this.sale_time = sale_time;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
}
