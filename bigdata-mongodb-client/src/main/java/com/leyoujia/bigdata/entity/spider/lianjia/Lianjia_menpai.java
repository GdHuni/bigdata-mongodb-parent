package com.leyoujia.bigdata.entity.spider.lianjia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 链家门牌
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.lianjia.Lianjia_menpai.java
 * @创建作者: 张丽洪
 * @创建日期: 2016年12月27日 18:18:39
 */ 
public class Lianjia_menpai extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 小区编码;
	private String 小区名称;
	private String 栋阁编码;
	private String 栋阁名称;
	private String 单元编码;
	private String 单元名称;
	private String 门牌编码;
	private String 门牌名称;
	private String 城市编码;

	public String get小区名称() {
		return 小区名称;
	}

	public void set小区名称(String 小区名称) {
		this.小区名称 = 小区名称;
	}

	public String get栋阁名称() {
		return 栋阁名称;
	}

	public void set栋阁名称(String 栋阁名称) {
		this.栋阁名称 = 栋阁名称;
	}

	public String get单元名称() {
		return 单元名称;
	}

	public void set单元名称(String 单元名称) {
		this.单元名称 = 单元名称;
	}

	public String get城市编码() {
		return 城市编码;
	}

	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
	}

	public String get门牌编码() {
		return 门牌编码;
	}

	public void set门牌编码(String 门牌编码) {
		this.门牌编码 = 门牌编码;
	}

	public String get门牌名称() {
		return 门牌名称;
	}

	public void set门牌名称(String 门牌名称) {
		this.门牌名称 = 门牌名称;
	}

	public String get单元编码() {
		return 单元编码;
	}

	public void set单元编码(String 单元编码) {
		this.单元编码 = 单元编码;
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
}