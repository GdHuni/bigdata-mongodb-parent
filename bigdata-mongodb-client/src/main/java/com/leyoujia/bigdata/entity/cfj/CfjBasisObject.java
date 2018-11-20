package com.leyoujia.bigdata.entity.cfj;

import java.io.Serializable;

/**
 * @功能描述: 查房价 基本对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.CfjBasisObejct.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月20日 下午2:14:12
 */ 
public class CfjBasisObject implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 应用ID */
	private String appId;
	/** 应用名称 */
	private String appName;
	/** 应用类型 1-城市 2-城区 3-片区 4-楼盘 */
	private Integer appType;
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public Integer getAppType() {
		if (appType == null){
			return 0;
		}
		return appType;
	}
	public void setAppType(Integer appType) {
		this.appType = appType;
	}
}
