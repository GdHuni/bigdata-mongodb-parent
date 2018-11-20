package com.leyoujia.bigdata.entity.hq;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * 楼盘带看量 <br/>
 * @author QHN
 * @Date: 2016-05-11
 * 
 */
public class EsfCjHqLpFollowCt extends BaseQueryBean {

	private static final long serialVersionUID = 2885114553548199641L;
	/** 楼盘ID*/
	private Integer lpId; 
	/** 楼盘名称*/
	private String lpName; 
	/** 城市编码*/
	private String cityId;  
	/** 区域编码*/
	private String areaId;  
	/** 片区编码*/
	private String placeId;  
	/** 带看日期*/
	private String followDate; 
	/** 带看量*/
	private String followCt; 
	
	/*
	  带看次数和环比值:
	  城市       则统计昨日带看次数与环比值
	  城区和片区 显示以昨天计算 7天带看次数 与( 8-15)天环比值
	  楼盘       显示以昨天计算30天带看次数 与(31-60)天环比值
	*/
	/*两区间最小值*/
	private String followDateStart;
	/*两区间最大值*/
	private String followDateEnd;
	/*第一个环比日期*/
	private String firstAnnularDate;
	/*第二个环比日期*/
	private String secondAnnularDate;
	private Integer dkCt;
	private Integer dkAnnularCt;
	
	public Integer getLpId() {
		return lpId;
	}
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getFollowDate() {
		return followDate;
	}
	public void setFollowDate(String followDate) {
		this.followDate = followDate;
	}
	public String getFollowCt() {
		return followCt;
	}
	public void setFollowCt(String followCt) {
		this.followCt = followCt;
	}
	public String getFollowDateStart() {
		return followDateStart;
	}
	public void setFollowDateStart(String followDateStart) {
		this.followDateStart = followDateStart;
	}
	public String getFollowDateEnd() {
		return followDateEnd;
	}
	public void setFollowDateEnd(String followDateEnd) {
		this.followDateEnd = followDateEnd;
	}
	public String getFirstAnnularDate() {
		return firstAnnularDate;
	}
	public void setFirstAnnularDate(String firstAnnularDate) {
		this.firstAnnularDate = firstAnnularDate;
	}
	public String getSecondAnnularDate() {
		return secondAnnularDate;
	}
	public void setSecondAnnularDate(String secondAnnularDate) {
		this.secondAnnularDate = secondAnnularDate;
	}
	public Integer getDkCt() {
		return dkCt;
	}
	public void setDkCt(Integer dkCt) {
		this.dkCt = dkCt;
	}
	public Integer getDkAnnularCt() {
		return dkAnnularCt;
	}
	public void setDkAnnularCt(Integer dkAnnularCt) {
		this.dkAnnularCt = dkAnnularCt;
	}
}
