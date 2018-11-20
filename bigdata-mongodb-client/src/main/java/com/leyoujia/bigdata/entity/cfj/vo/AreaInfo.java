package com.leyoujia.bigdata.entity.cfj.vo;

import java.io.Serializable;

/**
 * @功能描述: 城区信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.vo.AreaInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月21日 下午5:29:07
 */ 
public class AreaInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 城市ID */
	private String cityId;
	/** 城区ID */
	private String areaId;
	/** 片区ID */
	private String placeId;
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
}
