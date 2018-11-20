package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;


/**
 * @功能描述: 深圳一手楼 - 新上市
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj._SZ_YSL_XSS.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月10日 上午11:31:07
 */ 
public class _SZ_YSL_XSS extends CommonMongo {
	private static final long serialVersionUID = 1L;
	/** 城市 */
	private String city;
	/** 地区 */
	private String place;
	/** 商品住房套数 */
	private String spzf_count;
	/** 商品住房面积 */
	private String spzf_area;
	/** 商品房套数 */
	private String spf_count;
	/** 商品房面积 */
	private String spf_area;
	/** 成交日期 */
	private String date;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSpzf_count() {
		return spzf_count;
	}
	public void setSpzf_count(String spzf_count) {
		this.spzf_count = spzf_count;
	}
	public String getSpzf_area() {
		return spzf_area;
	}
	public void setSpzf_area(String spzf_area) {
		this.spzf_area = spzf_area;
	}
	public String getSpf_count() {
		return spf_count;
	}
	public void setSpf_count(String spf_count) {
		this.spf_count = spf_count;
	}
	public String getSpf_area() {
		return spf_area;
	}
	public void setSpf_area(String spf_area) {
		this.spf_area = spf_area;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
