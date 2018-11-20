package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 长沙推荐户型类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Cs_tjhx.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年4月25日 下午4:07:56
 */
public class Cs_hx extends CommonMongo {

	private static final long serialVersionUID = 1L;
	private String 户型名称;
	private String 户型;
	private String 建筑面积;
	private String 所在栋阁;
	private String 户型图;
	public String get户型名称() {
		return 户型名称;
	}
	public void set户型名称(String 户型名称) {
		this.户型名称 = 户型名称;
	}
	public String get户型() {
		return 户型;
	}
	public void set户型(String 户型) {
		this.户型 = 户型;
	}
	public String get建筑面积() {
		return 建筑面积;
	}
	public void set建筑面积(String 建筑面积) {
		this.建筑面积 = 建筑面积;
	}
	public String get所在栋阁() {
		return 所在栋阁;
	}
	public void set所在栋阁(String 所在栋阁) {
		this.所在栋阁 = 所在栋阁;
	}
	public String get户型图() {
		return 户型图;
	}
	public void set户型图(String 户型图) {
		this.户型图 = 户型图;
	}
	
}
