package com.leyoujia.bigdata.entity.cfj;

import java.io.Serializable;

/** 
 * @功能描述： 楼盘带看量
 * @项目版本： 1.0
 * @项目名称： 大数据-查房价 
 * @创建作者： 沈阳
 * @创建日期： 2016年5月9日 下午2:46:07 
 */
public class LPFollow implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 楼盘ID */
	private int lpId;
	/** 楼盘名称 */
	private String lpName;
	/** 城市编码 */
	private String cityId;
	/** 区域编码 */
	private String areaId;
	/** 片区编码 */
	private String placeId;
	/** 带看日期 */
	private String followDate;
	/** 带看量 */
	private String followCT;
	
	
	public int getLpId() {
		return lpId;
	}
	public void setLpId(int lpId) {
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
	public String getFollowCT() {
		return followCT;
	}
	public void setFollowCT(String followCT) {
		this.followCT = followCT;
	}
	
}
