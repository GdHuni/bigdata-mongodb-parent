package com.leyoujia.common.analytics.modle.bigdata.evobj.child;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：曝光内容
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ACS0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class ContentObj implements Serializable{
	private static final long serialVersionUID = 1L;

	/**内容类型值*/
	private String typeValue;
	/**内容类型ID*/
	private String typeId;
	
	public String typeValue() {
		return typeValue;
	}
	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}
	public String typeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
}