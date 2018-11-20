package com.leyoujia.bigdata.entity.kcr;

import java.io.Serializable;

/**
 *  浏览经纪人的用户信息
 * @author lenovo
 *
 */
public class AgentVisitorRecord implements Serializable{
	private String userName;
	private String userId;
	private String phone;
	private String openTime;
	private Integer isOrder;
	
	/**
	 * 用户名称
	 * @return
	 */
	public String getUserName() {
		if (!(userName != null && !"".equals(userName))) {
			userName = "匿名";
		}
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 用户在房产网的ID
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
		if (phone == null) {
			phone = "";
		}
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 浏览时间
	 * @return
	 */
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
	/**
	 * 是否有预约 
	 * @return
	 */
	public Integer getIsOrder() {
		if (isOrder != null && isOrder > 0) {
			isOrder=1;
		} 
		if (isOrder == null) {
			isOrder = 0;
		}
		return isOrder;
	}
	public void setIsOrder(Integer isOrder) {
		this.isOrder = isOrder;
	}
	 
}
