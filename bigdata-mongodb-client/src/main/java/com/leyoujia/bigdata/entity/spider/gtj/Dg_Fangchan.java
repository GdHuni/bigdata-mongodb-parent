package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 东莞房产网爬虫实体类 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Dg_Fangchan.java
 * @创建作者: 杨献
 * @问题反馈: yangx@jjshome.com
 * @创建日期: 2017年4月11日 下午2:06:57
 */
public class Dg_Fangchan extends CommonMongo {

	private static final long serialVersionUID=1L;
	private String 镇区;
	private String 项目名称;
	private String 项目地址;
	private String 房屋用途;
	private String 开发单位;
	private String 总建筑面积;
	private String 所在楼层;
	private String 房间号;
	private String 建筑面积;
	private String 规划用途;
	public String get镇区() {
		return 镇区;
	}
	public void set镇区(String 镇区) {
		this.镇区 = 镇区;
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
	public String get房屋用途() {
		return 房屋用途;
	}
	public void set房屋用途(String 房屋用途) {
		this.房屋用途 = 房屋用途;
	}
	public String get开发单位() {
		return 开发单位;
	}
	public void set开发单位(String 开发单位) {
		this.开发单位 = 开发单位;
	}
	public String get总建筑面积() {
		return 总建筑面积;
	}
	public void set总建筑面积(String 总建筑面积) {
		this.总建筑面积 = 总建筑面积;
	}
	public String get所在楼层() {
		return 所在楼层;
	}
	public void set所在楼层(String 所在楼层) {
		this.所在楼层 = 所在楼层;
	}
	public String get房间号() {
		return 房间号;
	}
	public void set房间号(String 房间号) {
		this.房间号 = 房间号;
	}
	public String get建筑面积() {
		return 建筑面积;
	}
	public void set建筑面积(String 建筑面积) {
		this.建筑面积 = 建筑面积;
	}
	public String get规划用途() {
		return 规划用途;
	}
	public void set规划用途(String 规划用途) {
		this.规划用途 = 规划用途;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Dg_Fangchan [镇区=" + 镇区 + ", 项目名称=" + 项目名称 + ", 项目地址=" + 项目地址
				+ ", 房屋用途=" + 房屋用途 + ", 开发单位=" + 开发单位 + ", 总建筑面积=" + 总建筑面积
				+ ", 所在楼层=" + 所在楼层 + ", 房间号=" + 房间号 + ", 建筑面积=" + 建筑面积
				+ ", 规划用途=" + 规划用途 + "]";
	}
	
}
