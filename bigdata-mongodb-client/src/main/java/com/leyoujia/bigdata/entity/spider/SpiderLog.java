package com.leyoujia.bigdata.entity.spider;

import java.io.Serializable;
import java.util.Date;

/**
 * @功能描述: 爬虫日志记录实体类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.SpiderLog.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月10日 下午8:24:34
 */ 
public class SpiderLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String spiderTemp;
	private String isProxy;
	private String execHost;
	private Integer execTime;
	private Date startTime;
	private Date endTime;
	private Integer status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpiderTemp() {
		return spiderTemp;
	}
	public void setSpiderTemp(String spiderTemp) {
		this.spiderTemp = spiderTemp;
	}
	public String getIsProxy() {
		return isProxy;
	}
	public void setIsProxy(String isProxy) {
		this.isProxy = isProxy;
	}
	public String getExecHost() {
		return execHost;
	}
	public void setExecHost(String execHost) {
		this.execHost = execHost;
	}
	public Integer getExecTime() {
		return execTime;
	}
	public void setExecTime(Integer execTime) {
		this.execTime = execTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
