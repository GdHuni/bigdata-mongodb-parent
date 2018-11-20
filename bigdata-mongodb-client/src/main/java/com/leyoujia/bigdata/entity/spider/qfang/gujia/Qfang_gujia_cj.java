package com.leyoujia.bigdata.entity.spider.qfang.gujia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:qfang小区成交 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qfang.gujia.Qfang_gujia_cj.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年6月29日 上午11:16:59
 */
public class Qfang_gujia_cj  extends CommonMongo {
	private static final long serialVersionUID = 1L;
	
	private String gardenName;
	private String gardenId;
	private String address;
	private String geographyArea;//片区               
	private String area;//城区
	private String city;
	private String floorNum;
	private String buildArea;
	private String house_type;
	private String pictureUrl;
	private String buildDate;
	private String direction;//朝向
	private String table;
	private String total_prices;
	private String average_price;
	private String deal_date;
	private String deal_company;
	private String roomId;
	public String getGardenName() {
		return gardenName;
	}
	public void setGardenName(String gardenName) {
		this.gardenName = gardenName;
	}
	public String getGardenId() {
		return gardenId;
	}
	public void setGardenId(String gardenId) {
		this.gardenId = gardenId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGeographyArea() {
		return geographyArea;
	}
	public void setGeographyArea(String geographyArea) {
		this.geographyArea = geographyArea;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}
	public String getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getTotal_prices() {
		return total_prices;
	}
	public void setTotal_prices(String total_prices) {
		this.total_prices = total_prices;
	}
	public String getAverage_price() {
		return average_price;
	}
	public void setAverage_price(String average_price) {
		this.average_price = average_price;
	}
	public String getDeal_date() {
		return deal_date;
	}
	public void setDeal_date(String deal_date) {
		this.deal_date = deal_date;
	}
	public String getDeal_company() {
		return deal_company;
	}
	public void setDeal_company(String deal_company) {
		this.deal_company = deal_company;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	
	
}
