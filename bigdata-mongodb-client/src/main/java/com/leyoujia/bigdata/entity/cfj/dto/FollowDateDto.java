package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 按区域和日期的查询条件Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月11日 下午9:46:13 
 */
public class FollowDateDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 城市ID */
	private String cityId;
	/** 区域ID */
	private String areaId;
	/** 片区ID */
	private String placeId;
	/** 片区ID */
	private int lpId;
	/** 开始日期 */
	private String sDate;
	/** 结束日期 */
	private String eDate;
	/** 环比开始日期 */
	private String sAnnDate;
	/** 环比结束日期 */
	private String eAnnDate;
	
	
	public String getsAnnDate() {
		return sAnnDate;
	}
	public void setsAnnDate(String sAnnDate) {
		this.sAnnDate = sAnnDate;
	}
	public String geteAnnDate() {
		return eAnnDate;
	}
	public void seteAnnDate(String eAnnDate) {
		this.eAnnDate = eAnnDate;
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
	public int getLpId() {
		return lpId;
	}
	public void setLpId(int lpId) {
		this.lpId = lpId;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	

}
