package com.leyoujia.bigdata.entity.spider.centanet;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:中原二手房图片 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.centanet.Centanet_img.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年5月23日 下午4:00:06
 */
public class Centanet_img extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 图片名称;
	private String 图片链接;
	private String 城市编码;
	private String 中原编码;
	private String 房源链接;
	
	public String get中原编码() {
		return 中原编码;
	}
	public void set中原编码(String 中原编码) {
		this.中原编码 = 中原编码;
	}
	public String get房源链接() {
		return 房源链接;
	}
	public void set房源链接(String 房源链接) {
		this.房源链接 = 房源链接;
	}
	public String get图片名称() {
		return 图片名称;
	}
	public void set图片名称(String 图片名称) {
		this.图片名称 = 图片名称;
	}
	public String get图片链接() {
		return 图片链接;
	}
	public void set图片链接(String 图片链接) {
		this.图片链接 = 图片链接;
	}
	public String get城市编码() {
		return 城市编码;
	}
	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
	}
	

}
