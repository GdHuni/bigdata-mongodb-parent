package com.leyoujia.bigdata.entity.log;

import java.io.Serializable;

/**
 * @功能描述: 异常登录的消息对象
 * @项目版本: 1.3.1
 * @项目名称: 分布式网络爬虫
 * @相对路径: com.jjshome.bigdata.entity.log.Message.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2018年6月13日 下午5:28:29
 */ 
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 异常登录的类型 */
	private String messageType;
	/** 时 */
	private String hour;
	/** 分 */
	private String minute;
	/** 分行名称 */
	private String finalDeptName;
	/** 应用名称 */
	private String appName;
	/** 城市名称 */
	private String cityName;
	/** 手机号 */
	private String phoneNumber;
	/** 设备使用人 */
	private String deviceWorkerName;
	/** 登录人 */
	private String loginUser;
	/** 设备名称 */
	private String pcName;
	/** 职位类别 1-林董 2-高管 3-职能 4-非经纪人 5-经纪人 */
	private String dutyType;
	/** 上级ID PATH */
	private String idPath;
	/** 唯一标示 */
	private String uuid;
	/** 登录时间 */
	private String loginDate;

	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	public String getFinalDeptName() {
		return finalDeptName;
	}
	public void setFinalDeptName(String finalDeptName) {
		this.finalDeptName = finalDeptName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDeviceWorkerName() {
		return deviceWorkerName;
	}
	public void setDeviceWorkerName(String deviceWorkerName) {
		this.deviceWorkerName = deviceWorkerName;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPcName() {
		return pcName;
	}
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}
	public String getDutyType() {
		return dutyType;
	}
	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}
	public String getIdPath() {
		return idPath;
	}
	public void setIdPath(String idPath) {
		this.idPath = idPath;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
}
