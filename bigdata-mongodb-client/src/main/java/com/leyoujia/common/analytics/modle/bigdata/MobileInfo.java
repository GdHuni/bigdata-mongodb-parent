package com.leyoujia.common.analytics.modle.bigdata;

import java.io.Serializable;


/**
 * @功能描述: 手机设备信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.MobileInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年3月10日 下午3:07:48
 */ 
public class MobileInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 手机品牌 					:samsung*/
    private String brand;
    /** 手机型号 					:SM-G9350*/
    private String model;
    /** 操作系统 					:android*/
    private String ost;
    /** 系统版本 					:5.4.2*/
    private String osv;
    /** 手机号码 					:13888888888*/
    private String phone;
    /** 应用登录ID 				:888*/
    private String uid;
    /** 浏览器签名					:Mozilla/5.0 (Linux; Android 6.0.1; SM-G9350 Build/MMB29M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/46.0.2490.76 Mobile Safari/537.36*/
    private String bua;
    /** 来源渠道 					:应用宝*/
    private String channel;
    /** 终端的物理地址				:6c-0b-84-6c-93-db*/
    private String mac;
    /** 手机串号					:355065 05 331100 1/01*/
    private String imei;
    /** IOS广告标识符				:Identifier for Advertising*/
    private String idfa;
    /** 国际移动用户识别码			:International Mobile Subscriber Identification Number*/
    private String imsi;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOst() {
		return ost;
	}
	public void setOst(String ost) {
		this.ost = ost;
	}
	public String getOsv() {
		return osv;
	}
	public void setOsv(String osv) {
		this.osv = osv;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBua() {
		return bua;
	}
	public void setBua(String bua) {
		this.bua = bua;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	
	
	
}
