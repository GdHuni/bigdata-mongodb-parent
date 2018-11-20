package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 厦门市房产网爬虫实体类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Xm_fangchan.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年4月24日 上午11:54:18
 */
public class Xm_fangchan extends CommonMongo {

	private static final long serialVersionUID = 1L;
	private String 项目名称;
	private String 项目地址;
	private String 项目地区;
	private String 竣工日期;
	private String 栋阁名称;
	private String 类型;
	public String get类型() {
		return 类型;
	}
	public void set类型(String 类型) {
		this.类型 = 类型;
	}
	private String 楼层;
	private String 房号;
	private String 性质;
	private String 用途;
	private String 面积;
	private String 开发商名称;
	public String get开发商名称() {
		return 开发商名称;
	}
	public void set开发商名称(String 开发商名称) {
		this.开发商名称 = 开发商名称;
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
	public String get项目地区() {
		return 项目地区;
	}
	public void set项目地区(String 项目地区) {
		this.项目地区 = 项目地区;
	}
	public String get竣工日期() {
		return 竣工日期;
	}
	public void set竣工日期(String 竣工日期) {
		this.竣工日期 = 竣工日期;
	}
	public String get栋阁名称() {
		return 栋阁名称;
	}
	public void set栋阁名称(String 栋阁名称) {
		this.栋阁名称 = 栋阁名称;
	}
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
	public String get房号() {
		return 房号;
	}
	public void set房号(String 房号) {
		this.房号 = 房号;
	}
	public String get性质() {
		return 性质;
	}
	public void set性质(String 性质) {
		this.性质 = 性质;
	}
	public String get用途() {
		return 用途;
	}
	public void set用途(String 用途) {
		this.用途 = 用途;
	}
	public String get面积() {
		return 面积;
	}
	public void set面积(String 面积) {
		this.面积 = 面积;
	}
	
	

}
