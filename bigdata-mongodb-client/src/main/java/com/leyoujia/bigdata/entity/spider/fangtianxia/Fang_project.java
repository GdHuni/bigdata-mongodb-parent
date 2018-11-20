package com.leyoujia.bigdata.entity.spider.fangtianxia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:房天下小区信息 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.fangtianxia.Fang_project.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年7月6日 上午10:48:26
 */
public class Fang_project  extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String city;
	private String city_name;
	private String district;
	private String area;
	private String address;
	private String postcode;
	private String property_right;//产权
	private String project_type;
	private String project_name;
	private String project_feature;//楼盘特色
	private String project_another_name;
	private String project_id;
	private String builded_date;
	private String developers;//开发商
	private String building_structure;//建筑结构
	private String building_category;//建筑类别
	private String building_areas;
	private String land_areas;
	private String current_house_count;
	private String total_house_count;
	private String greenRatio;
	private String plotRatio;
	private String management_company;//物业公司
	private String management_cost;//物业管理费
	private String overhead_information;
	private String management_place;
	private String management_phone;
	private String provide_water;
	private String provide_electricity;
	private String provide_warm;
	private String provide_gas;
	private String communication;
	private String lift;
	private String safety_management;
	private String sanitation_service;
	private String carportNumber;
	private String project_gate;//小区出入口
	private String traffic_metro;
	private String traffic_bus;
	private String kindergarten;//幼儿园
	private String middle_school;//中学
	private String middle_primary_school;//小学
	private String university;//大学
	private String market;//商场
	private String hospital;//医院
	private String post_office;//邮局
	private String bank;//银行
	private String other_facilities;//其他
	private String project_facilities;//小区内部配套
	private String longitude;//经纬度
	private String latitude;
	private String insell;
	private String inrent;
	private String average_price;
	private String priceUpDown;
	
	
	
	

	
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getManagement_company() {
		return management_company;
	}
	public void setManagement_company(String management_company) {
		this.management_company = management_company;
	}
	public String getMiddle_primary_school() {
		return middle_primary_school;
	}
	public void setMiddle_primary_school(String middle_primary_school) {
		this.middle_primary_school = middle_primary_school;
	}
	public String getAverage_price() {
		return average_price;
	}
	public void setAverage_price(String average_price) {
		this.average_price = average_price;
	}
	public String getPriceUpDown() {
		return priceUpDown;
	}
	public void setPriceUpDown(String priceUpDown) {
		this.priceUpDown = priceUpDown;
	}
	public String getInsell() {
		return insell;
	}
	public void setInsell(String insell) {
		this.insell = insell;
	}
	public String getInrent() {
		return inrent;
	}
	public void setInrent(String inrent) {
		this.inrent = inrent;
	}
	public String getProject_feature() {
		return project_feature;
	}
	public void setProject_feature(String project_feature) {
		this.project_feature = project_feature;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getProperty_right() {
		return property_right;
	}
	public void setProperty_right(String property_right) {
		this.property_right = property_right;
	}
	public String getProject_type() {
		return project_type;
	}
	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_another_name() {
		return project_another_name;
	}
	public void setProject_another_name(String project_another_name) {
		this.project_another_name = project_another_name;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getBuilded_date() {
		return builded_date;
	}
	public void setBuilded_date(String builded_date) {
		this.builded_date = builded_date;
	}
	public String getDevelopers() {
		return developers;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	public String getBuilding_structure() {
		return building_structure;
	}
	public void setBuilding_structure(String building_structure) {
		this.building_structure = building_structure;
	}
	public String getBuilding_category() {
		return building_category;
	}
	public void setBuilding_category(String building_category) {
		this.building_category = building_category;
	}
	public String getBuilding_areas() {
		return building_areas;
	}
	public void setBuilding_areas(String building_areas) {
		this.building_areas = building_areas;
	}
	public String getLand_areas() {
		return land_areas;
	}
	public void setLand_areas(String land_areas) {
		this.land_areas = land_areas;
	}
	public String getCurrent_house_count() {
		return current_house_count;
	}
	public void setCurrent_house_count(String current_house_count) {
		this.current_house_count = current_house_count;
	}
	public String getTotal_house_count() {
		return total_house_count;
	}
	public void setTotal_house_count(String total_house_count) {
		this.total_house_count = total_house_count;
	}
	public String getGreenRatio() {
		return greenRatio;
	}
	public void setGreenRatio(String greenRatio) {
		this.greenRatio = greenRatio;
	}
	public String getPlotRatio() {
		return plotRatio;
	}
	public void setPlotRatio(String plotRatio) {
		this.plotRatio = plotRatio;
	}
	public String getManagement_cost() {
		return management_cost;
	}
	public void setManagement_cost(String management_cost) {
		this.management_cost = management_cost;
	}
	public String getOverhead_information() {
		return overhead_information;
	}
	public void setOverhead_information(String overhead_information) {
		this.overhead_information = overhead_information;
	}
	public String getManagement_place() {
		return management_place;
	}
	public void setManagement_place(String management_place) {
		this.management_place = management_place;
	}
	public String getManagement_phone() {
		return management_phone;
	}
	public void setManagement_phone(String management_phone) {
		this.management_phone = management_phone;
	}
	public String getProvide_water() {
		return provide_water;
	}
	public void setProvide_water(String provide_water) {
		this.provide_water = provide_water;
	}
	public String getProvide_electricity() {
		return provide_electricity;
	}
	public void setProvide_electricity(String provide_electricity) {
		this.provide_electricity = provide_electricity;
	}
	public String getProvide_warm() {
		return provide_warm;
	}
	public void setProvide_warm(String provide_warm) {
		this.provide_warm = provide_warm;
	}
	public String getProvide_gas() {
		return provide_gas;
	}
	public void setProvide_gas(String provide_gas) {
		this.provide_gas = provide_gas;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
	public String getLift() {
		return lift;
	}
	public void setLift(String lift) {
		this.lift = lift;
	}
	public String getSafety_management() {
		return safety_management;
	}
	public void setSafety_management(String safety_management) {
		this.safety_management = safety_management;
	}
	public String getSanitation_service() {
		return sanitation_service;
	}
	public void setSanitation_service(String sanitation_service) {
		this.sanitation_service = sanitation_service;
	}
	public String getCarportNumber() {
		return carportNumber;
	}
	public void setCarportNumber(String carportNumber) {
		this.carportNumber = carportNumber;
	}
	public String getProject_gate() {
		return project_gate;
	}
	public void setProject_gate(String project_gate) {
		this.project_gate = project_gate;
	}
	public String getTraffic_metro() {
		return traffic_metro;
	}
	public void setTraffic_metro(String traffic_metro) {
		this.traffic_metro = traffic_metro;
	}
	public String getTraffic_bus() {
		return traffic_bus;
	}
	public void setTraffic_bus(String traffic_bus) {
		this.traffic_bus = traffic_bus;
	}
	public String getKindergarten() {
		return kindergarten;
	}
	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}
	
	
	public String getMiddle_school() {
		return middle_school;
	}
	public void setMiddle_school(String middle_school) {
		this.middle_school = middle_school;
	}
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getPost_office() {
		return post_office;
	}
	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getOther_facilities() {
		return other_facilities;
	}
	public void setOther_facilities(String other_facilities) {
		this.other_facilities = other_facilities;
	}
	public String getProject_facilities() {
		return project_facilities;
	}
	public void setProject_facilities(String project_facilities) {
		this.project_facilities = project_facilities;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
	
	
}
