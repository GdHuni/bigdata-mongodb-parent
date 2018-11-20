package com.leyoujia.common.analytics.modle.bigdata;

import com.leyoujia.common.analytics.modle.bigdata.em.EventID;

import java.io.Serializable;

/**
 * @功能描述: 事件信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.EventInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年4月5日 上午11:05:41
 */ 
public class EventInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 自定义事件id */
	private EventID id;
    /** 自定义事件对象 */
    private Object obj;
    /** 事件发生时间 		:2017-04-01 4:05:36*/
    private String et;
	public String getId() {
		return id.toString();
	}
	public void setId(EventID id) {
		this.id = id;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getEt() {
		return et;
	}
	public void setEt(String et) {
		this.et = et;
	}
}
