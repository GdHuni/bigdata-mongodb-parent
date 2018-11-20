package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:重庆房产网实体类 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Cq_fangchan.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年5月18日 下午2:00:04
 */
public class Cq_fangchan extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 楼盘名称;
	private String 所属区县;
	private String 项目地址;
	private String 开发商;
	private String 楼栋编号;
	private String 物理层;
	private String 名义层;
	private String 单元;
	private String 房号;
	private String 住宅可售套数;
	private String 房屋用途;
	
	public String get房屋用途() {
		return 房屋用途;
	}
	public void set房屋用途(String 房屋用途) {
		this.房屋用途 = 房屋用途;
	}
	public String get住宅可售套数() {
		return 住宅可售套数;
	}
	public void set住宅可售套数(String 住宅可售套数) {
		this.住宅可售套数 = 住宅可售套数;
	}
	public String get楼盘名称() {
		return 楼盘名称;
	}
	public void set楼盘名称(String 楼盘名称) {
		this.楼盘名称 = 楼盘名称;
	}
	public String get所属区县() {
		return 所属区县;
	}
	public void set所属区县(String 所属区县) {
		this.所属区县 = 所属区县;
	}
	public String get项目地址() {
		return 项目地址;
	}
	public void set项目地址(String 项目地址) {
		this.项目地址 = 项目地址;
	}
	public String get开发商() {
		return 开发商;
	}
	public void set开发商(String 开发商) {
		this.开发商 = 开发商;
	}
	public String get楼栋编号() {
		return 楼栋编号;
	}
	public void set楼栋编号(String 楼栋编号) {
		this.楼栋编号 = 楼栋编号;
	}
	public String get物理层() {
		return 物理层;
	}
	public void set物理层(String 物理层) {
		this.物理层 = 物理层;
	}
	public String get名义层() {
		return 名义层;
	}
	public void set名义层(String 名义层) {
		this.名义层 = 名义层;
	}
	public String get单元() {
		return 单元;
	}
	public void set单元(String 单元) {
		this.单元 = 单元;
	}
	public String get房号() {
		return 房号;
	}
	public void set房号(String 房号) {
		this.房号 = 房号;
	}
	

	
}
