package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 户型统计信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.LpPieData.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月2日 下午4:55:08
 */ 
public class LpPieData implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 最低价格 */
	private Double minPrice;
	/** 最高价格 */
	private Double maxPrice;
	/** 总成交套数 */
	private Integer count;
	/** 户型 */
	private Integer[] xAxis;
	/** 套数 */
	private Integer[] yCount;
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer[] getxAxis() {
		return xAxis;
	}
	public void setxAxis(Integer[] xAxis) {
		this.xAxis = xAxis;
	}
	public Integer[] getyCount() {
		return yCount;
	}
	public void setyCount(Integer[] yCount) {
		this.yCount = yCount;
	}
}
