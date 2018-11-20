package com.leyoujia.bigdata.entity.spider;

import java.io.Serializable;

/**
 * @功能描述: 深圳 国土局一手楼成交报表
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.SzplXm.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月8日 下午3:31:14
 */ 
public class SzplXm implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 所在区 */
	private String zone;
	/** 项目名称 */
	private String name;
	/** 成交面积(㎡) */
	private String area;
	/** 成交套数 */
	private String count;
	/** 成交均价(元) */
	private String avePrice;
	/** 撤销备案 */
	private String delCount;
	/** 统计日期 */
	private String date;
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getAvePrice() {
		return avePrice;
	}
	public void setAvePrice(String avePrice) {
		this.avePrice = avePrice;
	}
	public String getDelCount() {
		return delCount;
	}
	public void setDelCount(String delCount) {
		this.delCount = delCount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
