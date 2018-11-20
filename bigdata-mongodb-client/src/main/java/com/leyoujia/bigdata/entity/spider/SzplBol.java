package com.leyoujia.bigdata.entity.spider;

import java.io.Serializable;

/**
 * @功能描述: 深圳 国土局 预售项目列表
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.SzplXm.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月8日 下午3:31:14
 */ 
public class SzplBol implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 国土局ID */
	private String id;
	/** 所在区 */
	private String zone;
	/** 项目名称 */
	private String name;
	/** 预售证号 */
	private String number;
	/** 开发企业 */
	private String company;
	/** 批准时间 */
	private String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
}
