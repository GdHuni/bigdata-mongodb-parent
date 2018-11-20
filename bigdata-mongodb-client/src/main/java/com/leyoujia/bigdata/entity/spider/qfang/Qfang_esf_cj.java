package com.leyoujia.bigdata.entity.spider.qfang;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: Q房网成交记录
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qhouse.Qhouse_esf_cj.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月23日 下午5:35:29
 */ 
public class Qfang_esf_cj extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 城市;
	private String 成交时间;
	private String 成交价格;
	private String 成交单价;
	private String 户型;
	private String 面积;
	private String 楼层;
	private String 楼盘名称;
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
	public String get成交价格() {
		return 成交价格;
	}
	public void set成交价格(String 成交价格) {
		this.成交价格 = 成交价格;
	}
	public String get面积() {
		return 面积;
	}
	public void set面积(String 面积) {
		this.面积 = 面积;
	}
	public String get户型() {
		return 户型;
	}
	public void set户型(String 户型) {
		this.户型 = 户型;
	}
	public String get成交单价() {
		return 成交单价;
	}
	public void set成交单价(String 成交单价) {
		this.成交单价 = 成交单价;
	}
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
}