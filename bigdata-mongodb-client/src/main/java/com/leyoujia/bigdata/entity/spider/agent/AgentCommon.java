package com.leyoujia.bigdata.entity.spider.agent;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;


/**
 * @功能描述: 各个网站经纪人公用对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.agent.AgentCommon.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年4月6日 上午10:40:43
 */ 
public class AgentCommon extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 城市;
	private String 城区;
	private String 名称;
	private String 联系方式;
	private String 服务商圈;
	private String 头像地址;
	public String get名称() {
		return 名称;
	}
	public void set名称(String 名称) {
		this.名称 = 名称;
	}
	public String get联系方式() {
		return 联系方式;
	}
	public void set联系方式(String 联系方式) {
		this.联系方式 = 联系方式;
	}
	public String get服务商圈() {
		return 服务商圈;
	}
	public void set服务商圈(String 服务商圈) {
		this.服务商圈 = 服务商圈;
	}
	public String get头像地址() {
		return 头像地址;
	}
	public void set头像地址(String 头像地址) {
		this.头像地址 = 头像地址;
	}
	public String get城市() {
		return 城市;
	}
	public void set城市(String 城市) {
		this.城市 = 城市;
	}
	public String get城区() {
		return 城区;
	}
	public void set城区(String 城区) {
		this.城区 = 城区;
	}
}