package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 深圳二手房成交 - 用途
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj._SZ_ESF_CJ_YT.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月10日 上午11:48:45
 */ 
public class _SZ_ESF_CJ_YT extends CommonMongo {
	private static final long serialVersionUID = 1L;

	/** 成交城市 */
	private String cj_city;
	/** 成交地区 */
	private String cj_place;
	/** 用途 */
	private String yt_type;
	/** 成交套数 */
	private String cj_count;
	/** 成交面积 */
	private String cj_area;
	/** 成交日期 */
	private String cj_date;
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
	public String getYt_type() {
		return yt_type;
	}
	public void setYt_type(String yt_type) {
		this.yt_type = yt_type;
	}
	public String getCj_count() {
		return cj_count;
	}
	public void setCj_count(String cj_count) {
		this.cj_count = cj_count;
	}
	public String getCj_area() {
		return cj_area;
	}
	public void setCj_area(String cj_area) {
		this.cj_area = cj_area;
	}
	public String getCj_date() {
		return cj_date;
	}
	public void setCj_date(String cj_date) {
		this.cj_date = cj_date;
	}
}
