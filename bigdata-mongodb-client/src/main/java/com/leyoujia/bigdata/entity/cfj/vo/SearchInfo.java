package com.leyoujia.bigdata.entity.cfj.vo;

import java.io.Serializable;

/**
 * @功能描述: 查房间-关键字检索返回对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.vo.SearchInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月19日 上午10:28:46
 */ 
public class SearchInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	/** ID */
	private String id;
	private String cityId;
	/** 名称 */
	private String name;
	/** 类型 1-城市 2-区域 3-片区 4-楼盘 */
	private Integer type;
	/** 经度 */
	private Double lng;
	/** 纬度 */
	private Double lat;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
}
