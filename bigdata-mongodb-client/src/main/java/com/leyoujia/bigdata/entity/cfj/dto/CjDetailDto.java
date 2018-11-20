package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/**
 * @功能描述: 成交明细Dto
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.dto.CjDetailDto.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月20日 下午6:53:17
 */ 
public class CjDetailDto implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 成交经纪人 */
	private String workerId;
	/** 经纪人状态 */
	private String workerStatus;
	/** 成交经纪人 */
	private String workerName;
	/** 成交价格（万） */
	private Double price;
	/** 成交面积 */
	private Double area;
	/** 成交时间 */
	private String date;
	
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWorkerStatus() {
		return workerStatus;
	}
	public void setWorkerStatus(String workerStatus) {
		this.workerStatus = workerStatus;
	}
}
