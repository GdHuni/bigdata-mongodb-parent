package com.leyoujia.common.analytics.modle.bigdata.evobj.child;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：曝光位置
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ACS0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class LocationObj implements Serializable{
	private static final long serialVersionUID = 1L;

	/**内容位置ID*/
	private String positionId;
	/**内容区域ID*/
	private String areaId;
	
	public String typePositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String areaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
}