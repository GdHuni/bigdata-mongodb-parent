package com.leyoujia.common.analytics.modle.bigdata;

import java.io.Serializable;

/**
 * @功能描述: 浏览界面的信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.PageInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年4月5日 上午10:38:24
 */ 
public class PageInfo implements Serializable {
	private static final long serialVersionUID = 1L;
    /** 访问页面标识  类 */
    private String id;
    /** 访问开始时间  		:2017-04-01 4:05:36 */
    private String st;
    /** 离开页面事件  		:2017-04-01 14:05:36 */
    private String et;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getEt() {
		return et;
	}
	public void setEt(String et) {
		this.et = et;
	}
}
