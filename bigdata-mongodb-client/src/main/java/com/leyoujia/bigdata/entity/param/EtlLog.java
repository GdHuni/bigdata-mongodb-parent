package com.leyoujia.bigdata.entity.param;

import java.io.Serializable;

/**
 * @功能描述: 运行日志
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.param.EtlLog.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年3月21日 下午6:08:58
 */ 
public class EtlLog implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 名称 */
	private String name;
	/** 开始时间 */
	private String sDate;
	/** 运行时间 MIN */
	private String time;
	/** 运行状态 */
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
