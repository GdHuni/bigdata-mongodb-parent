package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 挂牌均价及挂牌套数Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月17日 下午9:10:15 
 */
public class GPPriceDto implements Serializable{
	
	private static final long serialVersionUID = 1L;	

	/** 成交均价 */
	private double gpPrice;
	/** 挂牌套数 */
	private int gpNum;
	
	
	public double getGpPrice() {
		return gpPrice;
	}
	public void setGpPrice(double gpPrice) {
		this.gpPrice = gpPrice;
	}
	public int getGpNum() {
		return gpNum;
	}
	public void setGpNum(int gpNum) {
		this.gpNum = gpNum;
	}
	
}
