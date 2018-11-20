package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:深圳预售项目详情 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj._SZ_Presell.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年7月4日 下午3:01:09
 */
public class _SZ_Presell  extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String presell_code;
	private String project_name;
	private String developers;
	private String city;
	private String district;
	private String approval_date;
	private String land_code;
	private String address;
	private String age_limit;
	private String build_use;//房屋用途
	private String land_use;//土地用途
	private String land_area;//宗地面积-------
	private String builder_area;
	private String presell_area;
	private String presell_number;
	private String management_company;//物业公司
	private String management_cost;//物业管理费----
	private String project_id;
	
	private String building_name;//栋阁名称
	private String building_id;
	private String building_number;//座号--------
	private String presell_price;//预售价格
	private String floor;
	private String room_id;
	private String room_number;
	private String room_type;
	private String room_use;
	private String room_area;
	private String room_state;//-------
	private String indoor_area;//户内面积
	private String share_area;//分摊面积
	private String builded_indoor_area;//竣工户内面积
	private String builded_share_area;//竣工分摊面积
	private String builded_room_area;//竣工房屋面积


	
	
	public String getBuilded_indoor_area() {
		return builded_indoor_area;
	}
	public void setBuilded_indoor_area(String builded_indoor_area) {
		this.builded_indoor_area = builded_indoor_area;
	}
	public String getBuilded_share_area() {
		return builded_share_area;
	}
	public void setBuilded_share_area(String builded_share_area) {
		this.builded_share_area = builded_share_area;
	}
	public String getBuilded_room_area() {
		return builded_room_area;
	}
	public void setBuilded_room_area(String builded_room_area) {
		this.builded_room_area = builded_room_area;
	}
	public String getBuilding_number() {
		return building_number;
	}
	public void setBuilding_number(String building_number) {
		this.building_number = building_number;
	}
	public String getLand_area() {
		return land_area;
	}
	public void setLand_area(String land_area) {
		this.land_area = land_area;
	}
	public String getRoom_state() {
		return room_state;
	}
	public void setRoom_state(String room_state) {
		this.room_state = room_state;
	}
	public String getPresell_code() {
		return presell_code;
	}
	public void setPresell_code(String presell_code) {
		this.presell_code = presell_code;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getDevelopers() {
		return developers;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
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

	public String getApproval_date() {
		return approval_date;
	}
	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}
	public String getLand_code() {
		return land_code;
	}
	public void setLand_code(String land_code) {
		this.land_code = land_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge_limit() {
		return age_limit;
	}
	public void setAge_limit(String age_limit) {
		this.age_limit = age_limit;
	}
	public String getBuild_use() {
		return build_use;
	}
	public void setBuild_use(String build_use) {
		this.build_use = build_use;
	}
	public String getLand_use() {
		return land_use;
	}
	public void setLand_use(String land_use) {
		this.land_use = land_use;
	}
	public String getBuilder_area() {
		return builder_area;
	}
	public void setBuilder_area(String builder_area) {
		this.builder_area = builder_area;
	}
	public String getPresell_area() {
		return presell_area;
	}
	public void setPresell_area(String presell_area) {
		this.presell_area = presell_area;
	}
	public String getPresell_number() {
		return presell_number;
	}
	public void setPresell_number(String presell_number) {
		this.presell_number = presell_number;
	}
	public String getManagement_company() {
		return management_company;
	}
	public void setManagement_company(String management_company) {
		this.management_company = management_company;
	}
	
	public String getManagement_cost() {
		return management_cost;
	}
	public void setManagement_cost(String management_cost) {
		this.management_cost = management_cost;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getBuilding_name() {
		return building_name;
	}
	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}
	public String getBuilding_id() {
		return building_id;
	}
	public void setBuilding_id(String building_id) {
		this.building_id = building_id;
	}
	public String getPresell_price() {
		return presell_price;
	}
	public void setPresell_price(String presell_price) {
		this.presell_price = presell_price;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRoom_id() {
		return room_id;
	}
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	public String getRoom_number() {
		return room_number;
	}
	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getRoom_use() {
		return room_use;
	}
	public void setRoom_use(String room_use) {
		this.room_use = room_use;
	}
	public String getRoom_area() {
		return room_area;
	}
	public void setRoom_area(String room_area) {
		this.room_area = room_area;
	}
	public String getIndoor_area() {
		return indoor_area;
	}
	public void setIndoor_area(String indoor_area) {
		this.indoor_area = indoor_area;
	}
	public String getShare_area() {
		return share_area;
	}
	public void setShare_area(String share_area) {
		this.share_area = share_area;
	}
	
	
	

}
