package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 各片区均价及涨幅情况Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月19日 下午9:36:32 
 */
public class PlacePriceDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 楼盘ID */
	private int placeId;
	/** 楼盘名称 */
	private String placeName;
	/** 成交均价 */
	private double avgPrice;
	/** 均价涨幅 */
	private double rise;
	
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public double getRise() {
		return rise;
	}
	public void setRise(double rise) {
		this.rise = rise;
	}

	
}
