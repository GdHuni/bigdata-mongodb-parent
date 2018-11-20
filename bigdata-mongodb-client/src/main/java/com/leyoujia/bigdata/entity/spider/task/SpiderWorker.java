package com.leyoujia.bigdata.entity.spider.task;

import java.io.Serializable;

/**
 * @功能描述: 分布式爬虫人员表
 * @项目版本: 1.3.1
 * @项目名称: 分布式网络爬虫
 * @相对路径: com.jjshome.bigdata.entity.spider.task.SpiderSync.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年7月26日 下午3:22:42
 */ 
public class SpiderWorker implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 员工ID */
	private String workerId;
	/** 员工名称 */
	private String workerName;
	/** 爬虫积分 */
	private Double score;
	/** 状态-0-离线 1-在线 */
	private Integer spiderStatus;
	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
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
	public Integer getSpiderStatus() {
		return spiderStatus;
	}
	public void setSpiderStatus(Integer spiderStatus) {
		this.spiderStatus = spiderStatus;
	}
}
