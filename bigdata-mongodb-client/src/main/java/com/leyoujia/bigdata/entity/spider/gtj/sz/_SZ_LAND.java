package com.leyoujia.bigdata.entity.spider.gtj.sz;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:深圳土地 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.sz._SZ_LAND.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年7月5日 下午3:29:15
 */
public class _SZ_LAND   extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String city;
	private String deal_date;
	private String start_price;
	private String source;
	private String competitive_person;
	private String transaction_price;
	private String land_code;
	private String use;
	private String land_area;
	private String building_area;
	private String address; 
	private String district;
	private String detail_url;
	
	
	public String getDetail_url() {
		return detail_url;
	}
	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDeal_date() {
		return deal_date;
	}
	public void setDeal_date(String deal_date) {
		this.deal_date = deal_date;
	}
	public String getStart_price() {
		return start_price;
	}
	public void setStart_price(String start_price) {
		this.start_price = start_price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCompetitive_person() {
		return competitive_person;
	}
	public void setCompetitive_person(String competitive_person) {
		this.competitive_person = competitive_person;
	}
	public String getTransaction_price() {
		return transaction_price;
	}
	public void setTransaction_price(String transaction_price) {
		this.transaction_price = transaction_price;
	}
	public String getLand_code() {
		return land_code;
	}
	public void setLand_code(String land_code) {
		this.land_code = land_code;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getLand_area() {
		return land_area;
	}
	public void setLand_area(String land_area) {
		this.land_area = land_area;
	}
	public String getBuilding_area() {
		return building_area;
	}
	public void setBuilding_area(String building_area) {
		this.building_area = building_area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	

}
