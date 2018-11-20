package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

public class KCustomerRecommendOperMess implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String phone;
	private String fhUserId;
	private String fhUserName;
	private Integer busType;
	private String busId;
	private Integer seeCt;
	private Integer isOrder;
	private Integer operType;
	private String operTime;
	private String createTime;
	private String updateTime;
	
	/**
	 * id
	 * @return
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * 用户中心业务id(暂为空)
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 手机号码
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 房产网用户ID 
	 * @return
	 */
	public String getFhUserId() {
		return fhUserId;
	}
	public void setFhUserId(String fhUserId) {
		this.fhUserId = fhUserId;
	}
	
	/**
	 * 房产网用户名(暂为空)
	 * @return
	 */
	public String getFhUserName() {
		return fhUserName;
	}
	public void setFhUserName(String fhUserName) {
		this.fhUserName = fhUserName;
	}
	
	/**
	 * 业务类型(暂不用)
	 * @return
	 */
	public Integer getBusType() {
		return busType;
	}
	public void setBusType(Integer busType) {
		this.busType = busType;
	}
	
	/**
	 * 经纪人id
	 * @return
	 */
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	
	/**
	 * 浏览次数
	 * @return
	 */
	public Integer getSeeCt() {
		return seeCt;
	}
	public void setSeeCt(Integer seeCt) {
		this.seeCt = seeCt;
	}
	
	/**
	 * 是否预约
	 * @return
	 */
	public Integer getIsOrder() {
		return isOrder;
	}
	public void setIsOrder(Integer isOrder) {
		this.isOrder = isOrder;
	}
	
	/**
	 * 操盘类型
	 * @return
	 */
	public Integer getOperType() {
		return operType;
	}
	public void setOperType(Integer operType) {
		this.operType = operType;
	}
	
	/**
	 * 操作时间
	 * @return
	 */
	public String getOperTime() {
		return operTime;
	}
	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}
	
	/**
	 * 创建时间
	 * @return
	 */
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * 更新时间
	 * @return
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	 
}
