package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 每月成交价Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月12日 下午3:12:47 
 */
public class CJPriceDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 成交月份 */
	private String month;
	/** 成交均价 */
	private Integer avgPrice;
	/** 上一级成交均价 */
	private Integer parentAvgPrice;
	/** 涨幅 */
	private Double rise;
	/** 成交量 */
	private Integer cjCt;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(Integer avgPrice) {
		this.avgPrice = avgPrice;
	}
	public Integer getParentAvgPrice() {
		return parentAvgPrice;
	}
	public void setParentAvgPrice(Integer parentAvgPrice) {
		this.parentAvgPrice = parentAvgPrice;
	}
	public Double getRise() {
		return rise;
	}
	public void setRise(Double rise) {
		this.rise = rise;
	}
	public Integer getCjCt() {
		return cjCt;
	}
	public void setCjCt(Integer cjCt) {
		this.cjCt = cjCt;
	}
	
}
