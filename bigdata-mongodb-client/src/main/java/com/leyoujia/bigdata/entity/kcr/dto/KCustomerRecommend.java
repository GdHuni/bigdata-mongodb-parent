package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @功能描述: 用户画像
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.kcr.dto.KCustomerRecommend.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月19日 下午8:33:08
 */ 
public class KCustomerRecommend implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String dataUserId;
	private String busUserId;
	private String userId;
	private String phone;
	private Integer sex;
	private String userName;
	private String img;
	private Long roleId;
	private Integer csFromNet;
	private Integer isYz;
	private Integer isOldKy;
	private Integer isDk;
	private Integer isCj;
	private Double evaluate;
	private String fAddress;
	private String wAddress;
	private String seeTime;
	private Integer age;
	private Date updateTime;
	private String updateId;
	private String customerDesc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * 数据中心用户ID
	 * @return
	 */
	public String getDataUserId() {
		return dataUserId;
	}
	public void setDataUserId(String dataUserId) {
		this.dataUserId = dataUserId;
	}
	
	/**
	 * 房产网用户ID    
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * 业务用户中心用户ID
	 * @return
	 */
	public String getBusUserId() {
		return busUserId;
	}
	public void setBusUserId(String busUserId) {
		this.busUserId = busUserId;
	}
	
	/**
	 * 手机
	 * @return
	 */
	public String getPhone() {
		return getString(phone);
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 性别
	 * @return
	 */
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	/**
	 * 用户姓名      
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 用户头像路径  
	 * @return
	 */
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	/**
	 * 角色ID        
	 * @return
	 */
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	/**
	 * 客户来源      
	 * @return
	 */
	public Integer getCsFromNet() {
		return csFromNet;
	}
	public void setCsFromNet(Integer csFromNet) {
		this.csFromNet = csFromNet;
	}
	
	/**
	 * 是否业主      
	 * @return
	 */
	public Integer getIsYz() {
		return isYz;
	}
	
	/**
	 * 是否业主 (转换)  
	 * @return
	 */
	public String getIsYzStr() {
		if(isYz!=null&&isYz==1){
			return "是";
		}
		return "否";
	}
	
	public void setIsYz(Integer isYz) {
		this.isYz = isYz;
	}
	
	/**
	 * 是否老客户    
	 * @return
	 */
	public Integer getIsOldKy() {
		return isOldKy;
	}
	
	/**
	 * 是否老客户   (转换)
	 * @return
	 */
	public String getIsOldKyStr() {
		if(isOldKy!=null&&isOldKy==1){
			return "是";
		}
		return "否";
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
	
	/**
	 * 是否带看过    (转换)
	 * @return
	 */
	public String getIsDkStr() {
		if(isDk!=null&&isDk==1){
			return "是";
		}
		return "否";
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
	
	/**
	 * 是否成交过    (转换)
	 * @return
	 */
	public String getIsCjStr() {
		if(isCj!=null&&isCj==1){
			return "是";
		}
		return "否";
	}
	public void setIsCj(Integer isCj) {
		this.isCj = isCj;
	}
	
	/**
	 * 带看评分      
	 * @return
	 */
	public Double getEvaluate() {
		return getDouble(evaluate);
	}
	public void setEvaluate(Double evaluate) {
		this.evaluate = evaluate;
	}
	
	/**
	 * 现居地址      
	 * @return
	 */
	public String getfAddress() {
		return getString(fAddress);
	}
	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}
	
	/**
	 * 工作地址      
	 * @return
	 */
	public String getwAddress() {
		return getString(wAddress);
	}
	public void setwAddress(String wAddress) {
		this.wAddress = wAddress;
	}
	
	/**
	 * 看房时间    
	 * @return
	 */
	public String getSeeTime() {
		return getString(seeTime);
	}
	public void setSeeTime(String seeTime) {
		this.seeTime = seeTime;
	}
	
	/**
	 * 年龄    
	 * @return
	 */
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateId() {
		return getString(updateId);
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	
	/**
	 * 备注
	 * @return
	 */
	public String getCustomerDesc() {
	
		return getString(customerDesc);
	}
	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}
	

	public String getString(String args) {
		if (args == null || "".equals(args) || "null".equals(args)) {
			return "";
		}
		return args;
	}
	
	public Integer getInteger(Integer args) {
		if (args == null) {
			return 0;
		}
		return args;
	}
	
	public Double getDouble(Double args) {
		if (args == null) {
			return 0.0;
		}
		return args;
	}
}
