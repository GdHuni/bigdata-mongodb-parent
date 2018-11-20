package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 楼盘均价Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月11日 下午1:39:09 
 */
public class LpPriceDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 楼盘ID */
	private String lpId;
	/** 楼盘名称 */
	private String lpName;
	/** 成交均价 */
	private Double avgPrice;
	/** 均价涨幅 */
	private Double rise;	
	/** 楼盘在售数量 */
	private Integer lpCount;
	/** 所在城市 */
	private String cityId;
	/** 月份 */
	private String month;
	public Double getRiseAbs() {
		if(rise!=null){
			return Math.abs(rise);
		}
		return 0.0;
	}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public Double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public Double getRise() {
		return rise;
	}
	public void setRise(Double rise) {
		this.rise = rise;
	}
	public Integer getLpCount() {
		return lpCount;
	}
	public void setLpCount(Integer lpCount) {
		this.lpCount = lpCount;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
}
