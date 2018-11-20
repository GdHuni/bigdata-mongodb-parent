package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 根据地图点返回相应距离内的楼盘房价Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月16日 下午4:54:51 
 */
public class MapPriceDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 楼盘ID */
	private int lpId;
	/** 楼盘名称 */
	private String lpName;
	/** 成交量 */
	private int cjCT;
	/** 成交均价 */
	private double cjPrice;
	/** 经度 */
	private double lng;
	/** 纬度 */
	private double lat;
	/** 距离 */
	private double distance;
	/** 挂牌套数 */
	private int gpCT;
	
	
	public int getLpId() {
		return lpId;
	}
	public void setLpId(int lpId) {
		this.lpId = lpId;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public int getCjCT() {
		return cjCT;
	}
	public void setCjCT(int cjCT) {
		this.cjCT = cjCT;
	}
	public double getCjPrice() {
		return cjPrice;
	}
	public void setCjPrice(double cjPrice) {
		this.cjPrice = cjPrice;
	}
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
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getGpCT() {
		return gpCT;
	}
	public void setGpCT(int gpCT) {
		this.gpCT = gpCT;
	}		

}
