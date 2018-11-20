package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 成交信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.CJInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午2:23:31
 */ 
public class CJInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 房号ID */
	private Integer fhId;
	/** 图片 */
	private String imgUrl;
	/** 楼盘名称 */
	private String lpName;
	/** 面积 */
	private Double area;
	/** 室 */
	private Integer room;
	/** 总楼层 */
	private Integer totleFloor;
	/** 所在楼层 */
	private Integer floor;
	/** 建造年份 */
	private String bulidYear;
	/** 成交日期 */
	private String cjDate;
	/** 挂牌日期 */
	private String regDate;
	/** 成交价 */
	private Double cjPrice;
	/** 成交单价 */
	private Double cjUnitPrice;
	/** 成交来源 */
	private Integer cjType;
	/** 挂牌时长 */
	private Integer gpDays;
	private String zdWorkerId;
	private String zdWorkerName;
	/** 手机号码 */
	private String zdWorkerPhone;
	/** 人员状态 */
	private Integer zdWorkerStatus;
	
	
	/**  
	 * @功能描述: 获取成交均价
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 上午11:06:56
	 * @return
	 */ 
	public Double getCjPrice() {
		return cjPrice;
	}
	public void setCjPrice(Double cjPrice) {
		this.cjPrice = cjPrice;
	}

	/**  
	 * @功能描述: 房号ID
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:38:30
	 * @return
	 */ 
	public Integer getFhId() {
		return fhId;
	}
	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
	/**  
	 * @功能描述: 图片路径<br/>
	 * Ex:/pic/hsl/2015-11/25/9eb149ec-7885-47d6-a893-d91df40b69c1_sy.jpg
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:51:15
	 * @return
	 */ 
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**  
	 * @功能描述: 楼盘名称
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:02
	 * @return
	 */ 
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	/**  
	 * @功能描述: 面积
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:09
	 * @return
	 */ 
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	/**  
	 * @功能描述: 室
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:16
	 * @return
	 */ 
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	/**  
	 * @功能描述: 总楼层
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:23
	 * @return
	 */ 
	public Integer getTotleFloor() {
		return totleFloor;
	}
	public void setTotleFloor(Integer totleFloor) {
		this.totleFloor = totleFloor;
	}
	/**  
	 * @功能描述: 所在楼层
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:29
	 * @return
	 */ 
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	/**  
	 * @功能描述: 建筑年份
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:35
	 * @return
	 */ 
	public String getBulidYear() {
		return bulidYear;
	}
	public void setBulidYear(String bulidYear) {
		this.bulidYear = bulidYear;
	}
	/**  
	 * @功能描述: 成交日期
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:46
	 * @return
	 */ 
	public String getCjDate() {
		return cjDate;
	}
	public void setCjDate(String cjDate) {
		this.cjDate = cjDate;
	}
	/**  
	 * @功能描述: 成交单价
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:52:55
	 * @return
	 */ 
	public Double getCjUnitPrice() {
		return cjUnitPrice;
	}
	public void setCjUnitPrice(Double cjUnitPrice) {
		this.cjUnitPrice = cjUnitPrice;
	}
	/**  
	 * @功能描述: 数据来源<br/>
	 * 1-乐有家内部系统<br/>
	 * 2-国土局
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午1:53:01
	 * @return
	 */ 
	public Integer getCjType() {
		return cjType;
	}
	public void setCjType(Integer cjType) {
		this.cjType = cjType;
	}
	/**  
	 * @功能描述: 挂牌天数
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月27日 下午6:28:25
	 * @return
	 */ 
	public Integer getGpDays() {
		return gpDays;
	}
	public void setGpDays(Integer gpDays) {
		this.gpDays = gpDays;
	}
	
	public String getZdWorkerId() {
		return zdWorkerId;
	}
	public void setZdWorkerId(String zdWorkerId) {
		this.zdWorkerId = zdWorkerId;
	}
	/**  
	 * @功能描述: 主单人
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月27日 下午6:28:36
	 * @return
	 */ 
	public String getZdWorkerName() {
		return zdWorkerName;
	}
	public void setZdWorkerName(String zdWorkerName) {
		this.zdWorkerName = zdWorkerName;
	}
	/**  
	 * @功能描述: 主单人电话
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月27日 下午6:28:43
	 * @return
	 */ 
	public String getZdWorkerPhone() {
		return zdWorkerPhone;
	}
	public void setZdWorkerPhone(String zdWorkerPhone) {
		this.zdWorkerPhone = zdWorkerPhone;
	}
	/**  
	 * @功能描述: 主单人状态
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月27日 下午6:28:49
	 * @return
	 */ 
	public Integer getZdWorkerStatus() {
		return zdWorkerStatus;
	}
	public void setZdWorkerStatus(Integer zdWorkerStatus) {
		this.zdWorkerStatus = zdWorkerStatus;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
