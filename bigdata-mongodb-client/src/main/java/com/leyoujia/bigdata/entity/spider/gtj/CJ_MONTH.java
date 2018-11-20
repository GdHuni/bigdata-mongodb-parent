package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

import java.io.Serializable;

/**
 * @功能描述: 成交-按月
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.CJ_MONTH.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月16日 下午2:24:24
 */ 
public class CJ_MONTH extends CommonMongo implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 成交城市 */
	private String cj_city;
	/** 成交地区 */
	private String cj_place;
	/** 成交类型 1-一手楼 2-二手房 */
	private String cj_type;
	/** 成交面积 */
	private String cj_area;
	/** 成交套数 */
	private String cj_count;
	/** 成交总价 */
	private String cj_price;
	/** 成交均价 */
	private String cj_unit_price;
	/** 成交日期 */
	private String cj_month;
	/** 统计日期 */
	private String count_date;
	public String getCj_city() {
		return cj_city;
	}
	public void setCj_city(String cj_city) {
		this.cj_city = cj_city;
	}
	public String getCj_place() {
		return cj_place;
	}
	public void setCj_place(String cj_place) {
		this.cj_place = cj_place;
	}
	public String getCj_area() {
		return cj_area;
	}
	public void setCj_area(String cj_area) {
		this.cj_area = cj_area;
	}
	public String getCj_count() {
		return cj_count;
	}
	public void setCj_count(String cj_count) {
		this.cj_count = cj_count;
	}
	public String getCj_price() {
		return cj_price;
	}
	public void setCj_price(String cj_price) {
		this.cj_price = cj_price;
	}
	public String getCj_unit_price() {
		return cj_unit_price;
	}
	public void setCj_unit_price(String cj_unit_price) {
		this.cj_unit_price = cj_unit_price;
	}
	public String getCj_month() {
		return cj_month;
	}
	public void setCj_month(String cj_month) {
		this.cj_month = cj_month;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
	public String getCj_type() {
		return cj_type;
	}
	public void setCj_type(String cj_type) {
		this.cj_type = cj_type;
	}
}
