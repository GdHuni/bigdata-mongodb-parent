package com.leyoujia.bigdata.entity.hq;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * 楼盘带看量 <br/>
 * @author QHN
 * @Date: 2016-05-11
 * 
 */
public class EsfCjHqHouseMonth extends BaseQueryBean {
	private static final long serialVersionUID = 5010233050142614484L;
	/** 楼盘ID*/
	private Integer lpId; 
	/** 城市编码*/
	private String cityCode; 
	/** 区域编码*/
	private String areaCode; 
	/**  片区编码*/
	private String placeCode; 
	/** */
	private Integer cjCt;
	/** */
	private Double cjSumPrice;
	/** 坐标X*/
	private Double comLng;
	/** 坐标Y*/
	private Double comLat; 
	/** 成交月份*/
	private Integer cjMonth; 
	/**  面积维度编号*/
	private Integer buildAreaNum;
	/** 户型维度编号*/
	private Integer roomNum; 
	/** 楼盘名称*/
	private String lpName; 
	/** 成交月份*/
	private String countMonth;  
	/** 成交均价 */
	private Double cjAvgPrice;  
	/** 上月涨幅比例*/
	private Double topPropertion;
	/** 面积开始*/
	private Double buildAreaStart;  
	/** 面积结束*/
	private Double buildAreaEnd;  
	
	public Integer getLpId() {
		return lpId;
	}
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public Integer getCjCt() {
		return cjCt;
	}
	public void setCjCt(Integer cjCt) {
		this.cjCt = cjCt;
	}
	public Double getCjSumPrice() {
		return cjSumPrice;
	}
	public void setCjSumPrice(Double cjSumPrice) {
		this.cjSumPrice = cjSumPrice;
	}
	public Double getComLng() {
		return comLng;
	}
	public void setComLng(Double comLng) {
		this.comLng = comLng;
	}
	public Double getComLat() {
		return comLat;
	}
	public void setComLat(Double comLat) {
		this.comLat = comLat;
	}
	public Integer getCjMonth() {
		return cjMonth;
	}
	public void setCjMonth(Integer cjMonth) {
		this.cjMonth = cjMonth;
	}
	public Integer getBuildAreaNum() {
		return buildAreaNum;
	}
	public void setBuildAreaNum(Integer buildAreaNum) {
		this.buildAreaNum = buildAreaNum;
	}
	public Integer getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public String getCountMonth() {
		return countMonth;
	}
	public void setCountMonth(String countMonth) {
		this.countMonth = countMonth;
	}
	public Double getCjAvgPrice() {
		return cjAvgPrice;
	}
	public void setCjAvgPrice(Double cjAvgPrice) {
		this.cjAvgPrice = cjAvgPrice;
	}
	public Double getTopPropertion() {
		return topPropertion;
	}
	public void setTopPropertion(Double topPropertion) {
		this.topPropertion = topPropertion;
	}
	public Double getBuildAreaStart() {
		return buildAreaStart;
	}
	public void setBuildAreaStart(Double buildAreaStart) {
		this.buildAreaStart = buildAreaStart;
	}
	public Double getBuildAreaEnd() {
		return buildAreaEnd;
	}
	public void setBuildAreaEnd(Double buildAreaEnd) {
		this.buildAreaEnd = buildAreaEnd;
	}
}
