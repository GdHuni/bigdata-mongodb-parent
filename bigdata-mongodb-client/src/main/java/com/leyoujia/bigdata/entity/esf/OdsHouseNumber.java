package com.leyoujia.bigdata.entity.esf;

import java.io.Serializable;

/**
 * @功能描述: 
 * @项目版本: 1.0.0
 * @项目名称: 大数据接口中心
 * @相对路径: com.jjshome.bigdata.entity.esf.EsfHouseInfo.java
 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
 * @创建日期: 2017年10月25日 下午4:05:05
 */
public class OdsHouseNumber implements Serializable{
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
	/** 清洗完成创建时间 */
	private String createTime;
	/**优先标识 1代表优先，默认为0*/
	private Integer priorityFlag;
	/** 爬取完成时间 */
	private String updateTime;
	/** 查询是否成功的标识，0不成功，1成功 */
	private Integer flag;
	/**数据清洗增量唯一标识*/
	private String biFlag;
	/**房源是否有效(1:有效;0:无效)*/
	private Integer status;
	
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
	public Integer getPriorityFlag() {
		return priorityFlag;
	}
	public void setPriorityFlag(Integer priorityFlag) {
		this.priorityFlag = priorityFlag;
	}
	public String getBiFlag() {
		return biFlag;
	}
	public void setBiFlag(String biFlag) {
		this.biFlag = biFlag;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OdsHouseNumber [id=" + id + ", fhId=" + fhId + ", cityCode="
				+ cityCode + ", certificateNo=" + certificateNo + ", cqrName="
				+ cqrName + ", cqrCardId=" + cqrCardId + ", houseNumber="
				+ houseNumber + ", createTime=" + createTime
				+ ", priorityFlag=" + priorityFlag + ", updateTime="
				+ updateTime + ", flag=" + flag + ", biFlag=" + biFlag
				+ ", status=" + status + "]";
	}
}
