package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 成交量Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月11日 下午8:15:27 
 */
public class CJCTDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 成交月份 */
	private String cjMonth;
	/** 成交量 */
	private int cjCT;
	/** 成交价 */
	private double cjPrice;
	
	
	public double getCjPrice() {
		return cjPrice;
	}
	public void setCjPrice(double cjPrice) {
		this.cjPrice = cjPrice;
	}
	public String getCjMonth() {
		return cjMonth;
	}
	public void setCjMonth(String cjMonth) {
		this.cjMonth = cjMonth;
	}
	public int getCjCT() {
		return cjCT;
	}
	public void setCjCT(int cjCT) {
		this.cjCT = cjCT;
	}

		
}
