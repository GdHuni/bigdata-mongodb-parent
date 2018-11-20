package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

import java.util.List;

/**
 * 
 * @功能描述: 湖南长沙房产网爬虫实体类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Cs_fangchan.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年4月25日 下午1:29:16
 */
public class Cs_fangchan extends CommonMongo {

	private static final long serialVersionUID = 1L;
	private String 楼盘名称;
	private String 所属区域;
	private String 规划套数;
	private String 竣工时间;
	private String 开盘时间;
	private String 总建筑面积;
	private String 总占地面积;
	private String 容积率;
	private String 绿化率;
	private String 物业费;
	private String 物业公司;
	private String 开发商;
	private String 项目地址;
	private String 周边配套;
	private String 项目简介;
	private String 对应栋号;
	private String 户室号;
	private String 楼层;
	private String 房屋用途;
	private String 房屋类型;
	private String 装修状态;
	private String 建筑面积;
	private String 套内面积;
	private String 分摊面积;
	private List<Cs_hx> 推荐户型;
	
	public List<Cs_hx> get推荐户型() {
		return 推荐户型;
	}
	public void set推荐户型(List<Cs_hx> 推荐户型) {
		this.推荐户型 = 推荐户型;
	}
	public String get楼盘名称() {
		return 楼盘名称;
	}
	public void set楼盘名称(String 楼盘名称) {
		this.楼盘名称 = 楼盘名称;
	}
	public String get所属区域() {
		return 所属区域;
	}
	public void set所属区域(String 所属区域) {
		this.所属区域 = 所属区域;
	}
	public String get规划套数() {
		return 规划套数;
	}
	public void set规划套数(String 规划套数) {
		this.规划套数 = 规划套数;
	}
	public String get竣工时间() {
		return 竣工时间;
	}
	public void set竣工时间(String 竣工时间) {
		this.竣工时间 = 竣工时间;
	}
	public String get开盘时间() {
		return 开盘时间;
	}
	public void set开盘时间(String 开盘时间) {
		this.开盘时间 = 开盘时间;
	}
	public String get总建筑面积() {
		return 总建筑面积;
	}
	public void set总建筑面积(String 总建筑面积) {
		this.总建筑面积 = 总建筑面积;
	}
	public String get总占地面积() {
		return 总占地面积;
	}
	public void set总占地面积(String 总占地面积) {
		this.总占地面积 = 总占地面积;
	}
	public String get容积率() {
		return 容积率;
	}
	public void set容积率(String 容积率) {
		this.容积率 = 容积率;
	}
	public String get绿化率() {
		return 绿化率;
	}
	public void set绿化率(String 绿化率) {
		this.绿化率 = 绿化率;
	}
	public String get物业费() {
		return 物业费;
	}
	public void set物业费(String 物业费) {
		this.物业费 = 物业费;
	}
	public String get物业公司() {
		return 物业公司;
	}
	public void set物业公司(String 物业公司) {
		this.物业公司 = 物业公司;
	}
	public String get开发商() {
		return 开发商;
	}
	public void set开发商(String 开发商) {
		this.开发商 = 开发商;
	}
	public String get项目地址() {
		return 项目地址;
	}
	public void set项目地址(String 项目地址) {
		this.项目地址 = 项目地址;
	}
	public String get周边配套() {
		return 周边配套;
	}
	public void set周边配套(String 周边配套) {
		this.周边配套 = 周边配套;
	}
	public String get项目简介() {
		return 项目简介;
	}
	public void set项目简介(String 项目简介) {
		this.项目简介 = 项目简介;
	}
	public String get对应栋号() {
		return 对应栋号;
	}
	public void set对应栋号(String 对应栋号) {
		this.对应栋号 = 对应栋号;
	}
	public String get户室号() {
		return 户室号;
	}
	public void set户室号(String 户室号) {
		this.户室号 = 户室号;
	}
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
	public String get房屋用途() {
		return 房屋用途;
	}
	public void set房屋用途(String 房屋用途) {
		this.房屋用途 = 房屋用途;
	}
	public String get房屋类型() {
		return 房屋类型;
	}
	public void set房屋类型(String 房屋类型) {
		this.房屋类型 = 房屋类型;
	}
	public String get装修状态() {
		return 装修状态;
	}
	public void set装修状态(String 装修状态) {
		this.装修状态 = 装修状态;
	}
	public String get建筑面积() {
		return 建筑面积;
	}
	public void set建筑面积(String 建筑面积) {
		this.建筑面积 = 建筑面积;
	}
	public String get套内面积() {
		return 套内面积;
	}
	public void set套内面积(String 套内面积) {
		this.套内面积 = 套内面积;
	}
	public String get分摊面积() {
		return 分摊面积;
	}
	public void set分摊面积(String 分摊面积) {
		this.分摊面积 = 分摊面积;
	}
	
	

}
