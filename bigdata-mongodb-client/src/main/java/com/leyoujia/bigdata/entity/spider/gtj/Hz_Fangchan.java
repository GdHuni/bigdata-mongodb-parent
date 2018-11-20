package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 惠州房产管理局房字信息实体类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Hz_Fangchang.java
 * @创建作者: 杨献
 * @问题反馈: yangx@jjshome.com
 * @创建日期: 2017年3月31日 上午8:59:49
 */
public class Hz_Fangchan extends CommonMongo {
	private static final long serialVersionUID=1L;
	
	private String 项目名称;
	private String 项目地址;
	private String 开发企业;
	private String 占地面积;
	private String 总建筑面积;
	private String 楼栋名称;
	private String 栋号;
	private String 所在楼层;
	private String 房号;
	private String 规划用途;
	private String 房屋朝向;
	private String 预测总面积;
	private String 预测套内面积;
	private String 行政区划;
	public String get行政区划() {
		return 行政区划;
	}
	public void set行政区划(String 行政区划) {
		this.行政区划 = 行政区划;
	}
	public String get项目名称() {
		return 项目名称;
	}
	public void set项目名称(String 项目名称) {
		this.项目名称 = 项目名称;
	}
	public String get项目地址() {
		return 项目地址;
	}
	public void set项目地址(String 项目地址) {
		this.项目地址 = 项目地址;
	}
	public String get开发企业() {
		return 开发企业;
	}
	public void set开发企业(String 开发企业) {
		this.开发企业 = 开发企业;
	}
	public String get占地面积() {
		return 占地面积;
	}
	public void set占地面积(String 占地面积) {
		this.占地面积 = 占地面积;
	}
	public String get总建筑面积() {
		return 总建筑面积;
	}
	public void set总建筑面积(String 总建筑面积) {
		this.总建筑面积 = 总建筑面积;
	}
	public String get楼栋名称() {
		return 楼栋名称;
	}
	public void set楼栋名称(String 楼栋名称) {
		this.楼栋名称 = 楼栋名称;
	}
	public String get栋号() {
		return 栋号;
	}
	public void set栋号(String 栋号) {
		this.栋号 = 栋号;
	}
	public String get所在楼层() {
		return 所在楼层;
	}
	public void set所在楼层(String 所在楼层) {
		this.所在楼层 = 所在楼层;
	}
	public String get房号() {
		return 房号;
	}
	public void set房号(String 房号) {
		this.房号 = 房号;
	}
	public String get规划用途() {
		return 规划用途;
	}
	public void set规划用途(String 规划用途) {
		this.规划用途 = 规划用途;
	}
	public String get房屋朝向() {
		return 房屋朝向;
	}
	public void set房屋朝向(String 房屋朝向) {
		this.房屋朝向 = 房屋朝向;
	}
	public String get预测总面积() {
		return 预测总面积;
	}
	public void set预测总面积(String 预测总面积) {
		this.预测总面积 = 预测总面积;
	}
	public String get预测套内面积() {
		return 预测套内面积;
	}
	public void set预测套内面积(String 预测套内面积) {
		this.预测套内面积 = 预测套内面积;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Hz_Fangchan [项目名称=" + 项目名称 + ", 项目地址=" + 项目地址 + ", 开发企业="
				+ 开发企业 + ", 占地面积=" + 占地面积 + ", 总建筑面积=" + 总建筑面积 + ", 楼栋名称="
				+ 楼栋名称 + ", 栋号=" + 栋号 + ", 所在楼层=" + 所在楼层 + ", 房号=" + 房号
				+ ", 规划用途=" + 规划用途 + ", 房屋朝向=" + 房屋朝向 + ", 预测总面积=" + 预测总面积
				+ ", 预测套内面积=" + 预测套内面积 + "]";
	}
	
	
}
