package com.leyoujia.bigdata.entity;

import java.io.Serializable;

/**
 * @功能描述: 身份证自动采集状态返回对象
 * @项目版本: 1.3.1
 * @项目名称: 大数据-采集器
 * @相对路径: com.jjshome.bigdata.entity.IdRobotResult.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2018年3月9日 下午3:18:26
 */ 
public class IdRobotResult implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 最新更新时间 */
	private String lastUpdateTime;
	/** 总次数 */
	private Integer allCount;
	/** 正确的数量 */
	private Integer rightCount;
	/** 错误数量 */
	private Integer errorCount;
	/** 剩余待验证的数量 */
	private Integer checkCount;
	/** 预计剩余时间 */
	private String checkTime;
	/** 预计完成时间 */
	private String finishTime;
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Integer getAllCount() {
		return allCount;
	}
	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}
	public Integer getRightCount() {
		return rightCount;
	}
	public void setRightCount(Integer rightCount) {
		this.rightCount = rightCount;
	}
	public Integer getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}
	public Integer getCheckCount() {
		return checkCount;
	}
	public void setCheckCount(Integer checkCount) {
		this.checkCount = checkCount;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
}
