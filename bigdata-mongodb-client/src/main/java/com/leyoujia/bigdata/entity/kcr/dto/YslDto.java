package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

public class YslDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	/** 楼盘名称 */
	private String lpName;
	private String sysId;
	private String mapX;
	private String mapY;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getMapX() {
		return mapX;
	}
	public void setMapX(String mapX) {
		this.mapX = mapX;
	}
	public String getMapY() {
		return mapY;
	}
	public void setMapY(String mapY) {
		this.mapY = mapY;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
}
