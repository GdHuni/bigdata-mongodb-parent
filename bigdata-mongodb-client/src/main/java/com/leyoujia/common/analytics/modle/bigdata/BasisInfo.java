package com.leyoujia.common.analytics.modle.bigdata;

import java.io.Serializable;

/**
 * @功能描述: 变动的信息 - 每次日志埋点必不可少的对象（周期性更新）
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.BasisInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年3月10日 下午2:48:23
 */ 
public class BasisInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 网络IP 									:125.125.236.12 */
	private String ip;
	/** 网络供应商 1-移动 2-联通 3-电信 0-其他 			:1 */
	private String np;
	/** 联网模式(大写)
	 *"NO NETWORK" "WIFI" "2G" "3G" "4G" "OTHER":4G */
	private String nt;
	/** 经度 										:113.369424 */
	private String lng;
	/** 纬度      									:22.493108 */
	private String lat;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNp() {
		return np;
	}
	public void setNp(String np) {
		this.np = np;
	}
	public String getNt() {
		return nt;
	}
	public void setNt(String nt) {
		this.nt = nt;
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
