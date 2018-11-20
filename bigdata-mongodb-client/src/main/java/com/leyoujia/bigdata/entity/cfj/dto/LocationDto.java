package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 传入的用户位置信息Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月16日 下午5:09:16 
 */
public class LocationDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 经度 */
	private double lng;
	/** 纬度 */
	private double lat;
	/** 半径 */
	private double radius;
	/** 开始月份 */
	private String sMonth;
	/** 结束月份 */
	private String eMonth;
	
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getsMonth() {
		return sMonth;
	}
	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}
	public String geteMonth() {
		return eMonth;
	}
	public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}
}
