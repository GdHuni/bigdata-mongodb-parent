package com.leyoujia.bigdata.entity.esf;

import java.io.Serializable;

/**
 * @功能描述: 房源编码爬取成功的房屋信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据接口中心
 * @相对路径: com.jjshome.bigdata.entity.esf.AppHouseNumber.java
 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
 * @创建日期: 2017年11月2日 下午1:38:13
 */
public class AppHouseNumber implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 主键ID */
	private Integer id;
	/** 房号ID */
	private Integer fhId;
	/** 房屋所在城市编号 */
	private String cityCode;
	/** 房产证号 */
	private String certificateNo;
	/** 产权人姓名 */
	private String cqrName;
	/** 产权人身份证号 */
	private String cqrCardId;
	/** 房源编码 */
	private String houseNumber;
	/** 产权状态：有效，抵押，查封 */
	private String cqStatus;
	/** 处理机构，当状态为抵押时为抵押权人；当状态为查封时为查封机关 */
	private String cljq;
	/** 处理时间，当状态为抵押时为抵押日期；当状态为查封时为查封日期 */
	private String clsj;
	/** 房产类别，住宅等 */
	private String fcLb;
	/** 登记价格 */
	private String djjg;
	/** 竣工时间 */
	private String jgsj;
	/** 区域 */
	private String district;
	/** 位置 */
	private String place;
	/** 面积 */
	private String area;
	/** 插入时间 */
	private String createTime;
	/** 最后一次更新时间 */
	private String updateTime;
	/** 查询是否成功的标识，0不成功，1成功 */
	private Integer flag;
	/** 查询开始时间 */
	private String startDate;
	/** 查询结束时间 */
	private String endDate;
	
	/***********非映射字段******/
	/**查询的编号*/
	private Integer orderNum=1;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFhId() {
		return fhId;
	}
	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public String getCqrName() {
		return cqrName;
	}
	public void setCqrName(String cqrName) {
		this.cqrName = cqrName;
	}
	public String getCqrCardId() {
		return cqrCardId;
	}
	public void setCqrCardId(String cqrCardId) {
		this.cqrCardId = cqrCardId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getCqStatus() {
		return cqStatus;
	}
	public void setCqStatus(String cqStatus) {
		this.cqStatus = cqStatus;
	}
	public String getCljq() {
		return cljq;
	}
	public void setCljq(String cljq) {
		this.cljq = cljq;
	}
	public String getClsj() {
		return clsj;
	}
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	public String getFcLb() {
		return fcLb;
	}
	public void setFcLb(String fcLb) {
		this.fcLb = fcLb;
	}
	public String getDjjg() {
		return djjg;
	}
	public void setDjjg(String djjg) {
		this.djjg = djjg;
	}
	public String getJgsj() {
		return jgsj;
	}
	public void setJgsj(String jgsj) {
		this.jgsj = jgsj;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public String toString() {
		return "AppHouseNumber [id=" + id + ", fhId=" + fhId + ", cityCode=" + cityCode + ", certificateNo="
				+ certificateNo + ", cqrName=" + cqrName + ", cqrCardId=" + cqrCardId + ", houseNumber=" + houseNumber
				+ ", cqStatus=" + cqStatus + ", cljq=" + cljq + ", clsj=" + clsj + ", fcLb=" + fcLb + ", djjg=" + djjg
				+ ", jgsj=" + jgsj + ", district=" + district + ", place=" + place + ", area=" + area + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", flag=" + flag + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", orderNum=" + orderNum + "]";
	}
}
