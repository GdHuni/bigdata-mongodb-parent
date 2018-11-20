package com.leyoujia.bigdata.entity.spider.line;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;


/**
 * @功能描述: 深圳公交站台
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.line.Shenzhen_site.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年8月31日 下午4:36:52
 */ 
public class Shenzhen_site extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 站台ID;
	private String 站台名称;
	private String lng;
	private String lat;
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
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
}
