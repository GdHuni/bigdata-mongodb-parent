package com.leyoujia.bigdata.entity.spider.centanet;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 中原成交数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.centanet.Centanet_esf_cj.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年3月26日 上午10:48:15
 */ 
public class Centanet_esf_cj extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 小区编码;
	private String 房源编号;
	private String 城市;
	private String 城区;
	private String 片区;
	private String 朝向;
	private String 楼层;
	private String 总楼层;
	private String 成交时间;
	private String 楼盘名称;
	private String 成交价;
	private String 建筑面积;
	private String 房型;
	private String 单价;
	private String 成交经纪人;
	public String get小区编码() {
		return 小区编码;
	}
	public void set小区编码(String 小区编码) {
		this.小区编码 = 小区编码;
	}
	public String get城市() {
		return 城市;
	}
	public void set城市(String 城市) {
		this.城市 = 城市;
	}
	public String get成交时间() {
		return 成交时间;
	}
	public void set成交时间(String 成交时间) {
		this.成交时间 = 成交时间;
	}
	public String get楼盘名称() {
		return 楼盘名称;
	}
	public void set楼盘名称(String 楼盘名称) {
		this.楼盘名称 = 楼盘名称;
	}
	public String get成交价() {
		return 成交价;
	}
	public void set成交价(String 成交价) {
		this.成交价 = 成交价;
	}
	public String get建筑面积() {
		return 建筑面积;
	}
	public void set建筑面积(String 建筑面积) {
		this.建筑面积 = 建筑面积;
	}
	public String get房型() {
		return 房型;
	}
	public void set房型(String 房型) {
		this.房型 = 房型;
	}
	public String get单价() {
		return 单价;
	}
	public void set单价(String 单价) {
		this.单价 = 单价;
	}
	public String get成交经纪人() {
		return 成交经纪人;
	}
	public void set成交经纪人(String 成交经纪人) {
		this.成交经纪人 = 成交经纪人;
	}
	public String get城区() {
		return 城区;
	}
	public void set城区(String 城区) {
		this.城区 = 城区;
	}
	public String get片区() {
		return 片区;
	}
	public void set片区(String 片区) {
		this.片区 = 片区;
	}
	public String get朝向() {
		return 朝向;
	}
	public void set朝向(String 朝向) {
		this.朝向 = 朝向;
	}
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
	public String get总楼层() {
		return 总楼层;
	}
	public void set总楼层(String 总楼层) {
		this.总楼层 = 总楼层;
	}
	public String get房源编号() {
		return 房源编号;
	}
	public void set房源编号(String 房源编号) {
		this.房源编号 = 房源编号;
	}
}