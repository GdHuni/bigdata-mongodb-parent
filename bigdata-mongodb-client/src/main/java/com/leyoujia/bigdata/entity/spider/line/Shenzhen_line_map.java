package com.leyoujia.bigdata.entity.spider.line;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;


/**
 * @功能描述: 深圳公交线路地图
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.line.Shenzhen_line_map.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年8月31日 下午4:36:20
 */ 
public class Shenzhen_line_map extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 线路ID;
	private String 线路名称;
	private String 线路类别;
	private String 站台序号;
	private String 站台ID;
	private String 站台名称;
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
	public String get线路类别() {
		return 线路类别;
	}
	public void set线路类别(String 线路类别) {
		this.线路类别 = 线路类别;
	}
	public String get站台序号() {
		return 站台序号;
	}
	public void set站台序号(String 站台序号) {
		this.站台序号 = 站台序号;
	}
	public String get站台ID() {
		return 站台ID;
	}
	public void set站台ID(String 站台id) {
		站台ID = 站台id;
	}
	public String get站台名称() {
		return 站台名称;
	}
	public void set站台名称(String 站台名称) {
		this.站台名称 = 站台名称;
	}
}
