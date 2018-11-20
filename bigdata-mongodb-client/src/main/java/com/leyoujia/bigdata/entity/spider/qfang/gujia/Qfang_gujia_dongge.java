package com.leyoujia.bigdata.entity.spider.qfang.gujia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:估价项目栋阁信息 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qfang.gujia.Qfang_gujia_dongge.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年6月23日 下午3:32:02
 */
public class Qfang_gujia_dongge extends CommonMongo {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String gardenInternalID;
	private String address;
	private String city;
	private String gardenId;
	private String buildingName;
	private String buildingId;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBuildingName() {
		return buildingName;
	}
	
	public String getGardenId() {
		return gardenId;
	}
	public void setGardenId(String gardenId) {
		this.gardenId = gardenId;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	
	
}
