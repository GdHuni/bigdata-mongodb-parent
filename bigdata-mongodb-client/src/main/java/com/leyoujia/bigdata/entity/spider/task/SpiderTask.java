package com.leyoujia.bigdata.entity.spider.task;

import java.io.Serializable;

/**
 * @功能描述: 分布式爬虫任务对象
 * @项目版本: 1.3.1
 * @项目名称: 分布式网络爬虫
 * @相对路径: com.jjshome.bigdata.entity.spider.task.SpiderTask.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年7月26日 下午3:16:48
 */ 
public class SpiderTask implements Serializable{
	private static final long serialVersionUID = 1L;
	/** MD5的任务ID */
	private String taskId;
	/** 爬取的网站 */
	private String url;
	/** 数据格式 html、json */
	private String dataType;
	/** 解析的模版 */
	private String temp;
	/** 发布状态 */
	private Integer pushStatus;
	/** 发布时间 */
	private String pushTime;
	/** 完成时间 */
	private String endTime;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public Integer getPushStatus() {
		return pushStatus;
	}
	public void setPushStatus(Integer pushStatus) {
		this.pushStatus = pushStatus;
	}
	public String getPushTime() {
		return pushTime;
	}
	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}