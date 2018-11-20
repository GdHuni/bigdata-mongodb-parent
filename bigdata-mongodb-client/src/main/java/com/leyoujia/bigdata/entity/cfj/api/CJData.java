package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 成交统计数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.CJData.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午3:44:16
 */ 
public class CJData implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 成交套数 */
	private Integer count;
	/** 成交均价 */
	private Double price;
	/** 成交单价 */
	private Double unitPrice;
	/** 环比 */
	private Double centMonth;
	/** 同比 */
	private Double centYear;
	/**  
	 * @功能描述: 成交套数
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午3:46:33
	 * @return
	 */ 
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	/**  
	 * @功能描述: 环比
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午3:46:42
	 * @return
	 */ 
	public Double getCentMonth() {
		return centMonth;
	}
	public void setCentMonth(Double centMonth) {
		this.centMonth = centMonth;
	}
	/**  
	 * @功能描述: 同比
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午3:46:49
	 * @return
	 */ 
	public Double getCentYear() {
		return centYear;
	}
	public void setCentYear(Double centYear) {
		this.centYear = centYear;
	}
	/**  
	 * @功能描述: 成交均价
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午3:47:14
	 * @return
	 */ 
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
