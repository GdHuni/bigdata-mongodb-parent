package com.leyoujia.bigdata.entity.spider.line;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 深圳公交线路
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.line.Shenzhen_line.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年8月31日 下午3:25:11
 */ 
public class Shenzhen_line extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 线路类别;
	private String 线路ID;
	private String 线路名称;
	private String 运行时间;
	private String 票价信息;
	private String 公交公司;
	private String 最后更新;
	public String get线路类别() {
		return 线路类别;
	}
	public void set线路类别(String 线路类别) {
		this.线路类别 = 线路类别;
	}
	public String get线路ID() {
		return 线路ID;
	}
	public void set线路ID(String 线路id) {
		线路ID = 线路id;
	}
	public String get线路名称() {
		return 线路名称;
	}
	public void set线路名称(String 线路名称) {
		this.线路名称 = 线路名称;
	}
	public String get运行时间() {
		return 运行时间;
	}
	public void set运行时间(String 运行时间) {
		this.运行时间 = 运行时间;
	}
	public String get票价信息() {
		return 票价信息;
	}
	public void set票价信息(String 票价信息) {
		this.票价信息 = 票价信息;
	}
	public String get公交公司() {
		return 公交公司;
	}
	public void set公交公司(String 公交公司) {
		this.公交公司 = 公交公司;
	}
	public String get最后更新() {
		return 最后更新;
	}
	public void set最后更新(String 最后更新) {
		this.最后更新 = 最后更新;
	}
}
