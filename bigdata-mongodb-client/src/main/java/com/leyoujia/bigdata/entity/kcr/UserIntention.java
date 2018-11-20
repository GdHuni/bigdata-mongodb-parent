package com.leyoujia.bigdata.entity.kcr;

import java.io.Serializable;

/**
 * 客户意向基本信息
 * @author lenovo
 *
 */
public class UserIntention implements Serializable{ 
	private String userId; 
	private String phone;
	private Integer isOldKy;
	private Integer isDk;
	private Integer isCj;
	private Double evaluate;
	private String fAddress;
	private String wAddress;
	private String seeTime; 
	private String customerDesc;
	private Integer browseCt;
	private String searchKey;
	private String cityArea;
	private String hslName; 
	private String estate;
	private String shOrientation;
	private String managerUse;
	private String otherUse;
	private String price;
	private String shInArea;
	private String sellHouse; 
	
	/**
	 * 用户ID
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
	 * 是否老客户
	 * @return
	 */
	public Integer getIsOldKy() {
		return isOldKy;
	}
	public void setIsOldKy(Integer isOldKy) {
		this.isOldKy = isOldKy;
	}
	
	/**
	 * 是否带看过
	 * @return
	 */
	public Integer getIsDk() {
		return isDk;
	}
	public void setIsDk(Integer isDk) {
		this.isDk = isDk;
	}
	
	/**
	 * 是否成交过
	 * @return
	 */
	public Integer getIsCj() {
		return isCj;
	}
	public void setIsCj(Integer isCj) {
		this.isCj = isCj;
	}
	
	/**
	 * 带看评分
	 * @return
	 */
	public Double getEvaluate() {
		return evaluate;
	}
	 
	public void setEvaluate(Double evaluate) {
		this.evaluate = evaluate;
	}
	
	/**
	 * 现居地址
	 * @return
	 */
	public String getfAddress() {
		return fAddress;
	}
	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}
	
	/**
	 * 工作地址
	 * @return
	 */
	public String getwAddress() {
		return wAddress;
	}
	public void setwAddress(String wAddress) {
		this.wAddress = wAddress;
	}
	/**
	 * 看房时间
	 * @return
	 */
	public String getSeeTime() {
		return seeTime;
	}
	public void setSeeTime(String seeTime) {
		this.seeTime = seeTime;
	}
	
	/**
	 * 备注
	 * @return
	 */
	public String getCustomerDesc() {
		return customerDesc;
	}
	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}
	
	/**
	 * 浏览记录
	 * @return
	 */
	public Integer getBrowseCt() {
		return browseCt;
	}
	public void setBrowseCt(Integer browseCt) {
		this.browseCt = browseCt;
	}
	
	/**
	 * 用户搜索关键词
	 * @return
	 */
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	
	/**
	 * 地段
	 * @return
	 */
	public String getCityArea() {
		return cityArea;
	}
	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}
	
	/**
	 * 楼盘1-3
	 * @return
	 */
	public String getHslName() {
		return hslName;
	}
	public void setHslName(String hslName) {
		this.hslName = hslName;
	}
	
	/**
	 * 户型
	 * @return
	 */
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	
	/**
	 * 朝向
	 * @return
	 */
	public String getShOrientation() {
		return shOrientation;
	}
	public void setShOrientation(String shOrientation) {
		this.shOrientation = shOrientation;
	}
	
	/**
	 * 购房目的
	 * @return
	 */
	public String getManagerUse() {
		return managerUse;
	}
	public void setManagerUse(String managerUse) {
		this.managerUse = managerUse;
	}
	
	/**
	 * 其他意向
	 * @return
	 */
	public String getOtherUse() {
		return otherUse;
	}
	public void setOtherUse(String otherUse) {
		this.otherUse = otherUse;
	}
	
	/**
	 * 价格
	 * @return
	 */
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * 面积
	 * @return
	 */
	public String getShInArea() {
		return shInArea;
	}
	public void setShInArea(String shInArea) {
		this.shInArea = shInArea;
	}
	
	/**
	 * 楼层
	 * @return
	 */
	public String getSellHouse() {
		return sellHouse;
	}
	public void setSellHouse(String sellHouse) {
		this.sellHouse = sellHouse;
	}

	 
}
