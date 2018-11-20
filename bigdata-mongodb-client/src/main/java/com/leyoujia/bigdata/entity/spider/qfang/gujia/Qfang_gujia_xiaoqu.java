package com.leyoujia.bigdata.entity.spider.qfang.gujia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:估价项目小区信息 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qfang.Qfang_gujia_xiaoqu.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年6月23日 下午2:33:22
 */
public class Qfang_gujia_xiaoqu  extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String address;
	private String completionDate;
	private String currentPrice;
	private String greenRatio;
	private String gardenId;
	private String indexPictureUrl;
	private String name;
	private String plotRatio;
	private String priceUpDown;
	
	private String number;
	private String city;
	private String geographyArea;//片区               
	private String area;//城区
	private String lng;//经纬度
	private String lat;
	private String gardenInternalID;
	private String coverArea;
	private String carportNumber;
	
	
	
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getGeographyArea() {
		return geographyArea;
	}
	public void setGeographyArea(String geographyArea) {
		this.geographyArea = geographyArea;
	}
	public String getCoverArea() {
		return coverArea;
	}
	public void setCoverArea(String coverArea) {
		this.coverArea = coverArea;
	}
	public String getCarportNumber() {
		return carportNumber;
	}
	public void setCarportNumber(String carportNumber) {
		this.carportNumber = carportNumber;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGardenInternalID() {
		return gardenInternalID;
	}
	public void setGardenInternalID(String gardenInternalID) {
		this.gardenInternalID = gardenInternalID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getGreenRatio() {
		return greenRatio;
	}
	public void setGreenRatio(String greenRatio) {
		this.greenRatio = greenRatio;
	}
	
	
	public String getGardenId() {
		return gardenId;
	}
	public void setGardenId(String gardenId) {
		this.gardenId = gardenId;
	}
	public String getIndexPictureUrl() {
		return indexPictureUrl;
	}
	public void setIndexPictureUrl(String indexPictureUrl) {
		this.indexPictureUrl = indexPictureUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlotRatio() {
		return plotRatio;
	}
	public void setPlotRatio(String plotRatio) {
		this.plotRatio = plotRatio;
	}
	public String getPriceUpDown() {
		return priceUpDown;
	}
	public void setPriceUpDown(String priceUpDown) {
		this.priceUpDown = priceUpDown;
	}
	
	
}
