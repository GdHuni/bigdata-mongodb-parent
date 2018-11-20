package com.leyoujia.bigdata.entity.cfj;

import java.io.Serializable;

/** 
 * @功能描述： 楼盘月成交量
 * @项目版本： 1.0
 * @项目名称： 大数据-查房价 
 * @创建作者： 沈阳
 * @创建日期： 2016年5月9日 下午2:48:18 
 */
public class HouseMonth implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 城市编码 */
	private String cityCode;
	/** 区域编码 */
	private String areaCode;
	/** 片区编码 */
	private String placeCode;
	/** 楼盘ID */
	private String lpId;
	/** 楼盘名称 */
	private String lpNmae;
	/** 成交量 */
	private int cjCT;
	/** 成交均价 */
	private double cjSumPrice;
	/** 坐标X */
	private double comLNG;
	/** 坐标Y */
	private double comLAT;
	/** 成交月份 */
	private int cjMonth;
	/** 面积维度编号 */
	private int buildAreaNum;
	/** 户型维度编号 */
	private int roomNum;
	
	
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
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getLpNmae() {
		return lpNmae;
	}
	public void setLpNmae(String lpNmae) {
		this.lpNmae = lpNmae;
	}
	public int getCjCT() {
		return cjCT;
	}
	public void setCjCT(int cjCT) {
		this.cjCT = cjCT;
	}
	public double getCjSumPrice() {
		return cjSumPrice;
	}
	public void setCjSumPrice(double cjSumPrice) {
		this.cjSumPrice = cjSumPrice;
	}
	public double getComLNG() {
		return comLNG;
	}
	public void setComLNG(double comLNG) {
		this.comLNG = comLNG;
	}
	public double getComLAT() {
		return comLAT;
	}
	public void setComLAT(double comLAT) {
		this.comLAT = comLAT;
	}
	public int getCjMonth() {
		return cjMonth;
	}
	public void setCjMonth(int cjMonth) {
		this.cjMonth = cjMonth;
	}
	public int getBuildAreaNum() {
		return buildAreaNum;
	}
	public void setBuildAreaNum(int buildAreaNum) {
		this.buildAreaNum = buildAreaNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

}
