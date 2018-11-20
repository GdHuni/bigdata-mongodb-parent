package com.leyoujia.bigdata.entity.spider.lianjia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 链家栋阁
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.lianjia.Lianjia_dongge.java
 * @创建作者: 张丽洪
 * @创建日期: 2016年12月27日 18:18:39
 */ 
public class Lianjia_dongge extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 小区编码;
	private String 栋阁编码;
	private String 栋阁名称;
	private String 城市编码;

	public String get城市编码() {
		return 城市编码;
	}

	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
	}

	public String get小区编码() {
		return 小区编码;
	}

	public void set小区编码(String 小区编码) {
		this.小区编码 = 小区编码;
	}

	public String get栋阁编码() {
		return 栋阁编码;
	}

	public void set栋阁编码(String 栋阁编码) {
		this.栋阁编码 = 栋阁编码;
	}

	public String get栋阁名称() {
		return 栋阁名称;
	}

	public void set栋阁名称(String 栋阁名称) {
		this.栋阁名称 = 栋阁名称;
	}
}