package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述：湖南株洲房产网 爬虫实体类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Zz_fangchan.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年4月27日 上午9:09:46
 */
public class Zz_fangchan extends CommonMongo {

	private static final long serialVersionUID = 1L;
	private String 楼栋座落;
	private String 层数;
	private String 房号;
	private String 建筑面积;
	private String 套内面积;
	private String 分摊面积;
	private String 房屋朝向;
	private String 楼栋户型图;
	private String 房屋户型;
	private String 房屋状态;
	
	public String get房屋状态() {
		return 房屋状态;
	}
	public void set房屋状态(String 房屋状态) {
		this.房屋状态 = 房屋状态;
	}
	public String get楼栋座落() {
		return 楼栋座落;
	}
	public void set楼栋座落(String 楼栋座落) {
		this.楼栋座落 = 楼栋座落;
	}
	public String get层数() {
		return 层数;
	}
	public void set层数(String 层数) {
		this.层数 = 层数;
	}
	public String get房号() {
		return 房号;
	}
	public void set房号(String 房号) {
		this.房号 = 房号;
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
	public String get房屋朝向() {
		return 房屋朝向;
	}
	public void set房屋朝向(String 房屋朝向) {
		this.房屋朝向 = 房屋朝向;
	}
	public String get楼栋户型图() {
		return 楼栋户型图;
	}
	public void set楼栋户型图(String 楼栋户型图) {
		this.楼栋户型图 = 楼栋户型图;
	}
	public String get房屋户型() {
		return 房屋户型;
	}
	public void set房屋户型(String 房屋户型) {
		this.房屋户型 = 房屋户型;
	}
	

}
