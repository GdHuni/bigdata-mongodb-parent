package com.leyoujia.bigdata.entity.spider.task;

import java.io.Serializable;

/**
 * @功能描述: 分布式爬虫消息同步对象
 * @项目版本: 1.3.1
 * @项目名称: 分布式网络爬虫
 * @相对路径: com.jjshome.bigdata.entity.spider.task.SpiderSync.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年7月26日 下午3:22:42
 */ 
public class SpiderSync implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 爬虫任务的密钥 */
	private String token;
	/** 时间间隔 秒 */
	private Long diff;
	/** 员工名称 */
	private String workerName;
	/** 爬虫积分 */
	private Double score;
	/** 爬虫的当前总进度 */
	private Double progress;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getDiff() {
		return diff;
	}
	public void setDiff(Long diff) {
		this.diff = diff;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Double getProgress() {
		return progress;
	}
	public void setProgress(Double progress) {
		this.progress = progress;
	}
}
