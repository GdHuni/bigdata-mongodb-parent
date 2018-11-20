package com.leyoujia.bigdata.entity.hq;

import java.io.Serializable;

/**
 * @功能描述: 楼盘信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.hq.EsfCjHqLpInfo.java
 * @创建作者: 朱攀
 * @问题反馈: zhup@jjshome.com
 * @创建日期: 2016年8月27日 下午2:32:55
 */
public class EsfCjHqLpInfo implements Serializable {
	private static final long serialVersionUID = 5487519684734735469L;
	/** 楼盘ID*/
	private Integer lpId; 
	/** 楼盘名称*/
	private String lpName; 
	/** 城市ID*/
	private String cityId; 
	/** 区域ID*/
	private String areaId; 
	/** 片区ID*/
	private String placeId; 
	/** 城市名称*/
	private String cityName;  
	/** 区域名称*/
	private String areaName; 
	/** 片区名称*/
	private String placeName; 

	public Integer getLpId() {
		return lpId;
	}

	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}

	public String getLpName() {
		return lpName;
	}

	public void setLpName(String lpName) {
		this.lpName = lpName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

}
