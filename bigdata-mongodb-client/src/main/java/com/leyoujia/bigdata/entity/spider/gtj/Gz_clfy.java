package com.leyoujia.bigdata.entity.spider.gtj;

import java.io.Serializable;

/**
 * @功能描述: 广州存量房源
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Gz_clfy.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年2月27日 上午11:25:49
 */ 
public class Gz_clfy implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 房屋编号 */
	private String fybh;
	/** 区域 */
	private String place;
	/** 地址 */
	private String addr;
	/** 价格 */
	private String price;
	/** 户型 */
	private String hx;
	/** 面积 */
	private String area;
	/** 状态 */
	private String status;
	/** 中介公司 */
	private String company;
	/** 发布日期 */
	private String date;
	/** 爬取时间 */
	private String spider_date;
	public String getFybh() {
		return fybh;
	}
	public void setFybh(String fybh) {
		this.fybh = fybh;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getHx() {
		return hx;
	}
	public void setHx(String hx) {
		this.hx = hx;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpider_date() {
		return spider_date;
	}
	public void setSpider_date(String spider_date) {
		this.spider_date = spider_date;
	}
}
