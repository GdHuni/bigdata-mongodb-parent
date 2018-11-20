package com.leyoujia.bigdata.entity.errorfh;

import java.io.Serializable;

/**
 * @功能描述: 查房价异常楼盘数据VO对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.errorfh.ErrorLpVO.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年10月14日 下午6:38:40
 */ 
public class ErrorLpVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 主键 */
	private Integer id;
	/** 楼盘ID */
	private Integer lpId;
	/** 楼盘名称 */
	private String lpName;
	/** 城市编码 */
	private String cityCode;
	/** 城市名称 */
	private String cityName;
	/** 城区编码 */
	private String areaCode;
	/** 城区名称 */
	private String areaName;
	/** 片区编码 */
	private String placeCode;
	/** 片区名称 */
	private String placeName;
	/** 成交均价 */
	private Double cjUnit;
	/** 楼盘成交均价 */
	private Double lpCjUnit;
	/** 均价差值 */
	private Double lpUnitDiff;
	/** 成交日期 */
	private String cjDate;
	/** 成交类型 */
	private String cjType;
	/** 异常类型 */
	private String errorType;
	/** 是否被标记异常 */
	private String isError;
	/** 是否已剔除 */
	private String isDel;
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
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public Double getCjUnit() {
		return cjUnit;
	}
	public void setCjUnit(Double cjUnit) {
		this.cjUnit = cjUnit;
	}
	public Double getLpCjUnit() {
		return lpCjUnit;
	}
	public void setLpCjUnit(Double lpCjUnit) {
		this.lpCjUnit = lpCjUnit;
	}
	public Double getLpUnitDiff() {
		return lpUnitDiff;
	}
	public void setLpUnitDiff(Double lpUnitDiff) {
		this.lpUnitDiff = lpUnitDiff;
	}
	public String getCjDate() {
		return cjDate;
	}
	public void setCjDate(String cjDate) {
		this.cjDate = cjDate;
	}
	public String getCjType() {
		return cjType;
	}
	public void setCjType(String cjType) {
		this.cjType = cjType;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getIsError() {
		return isError;
	}
	public void setIsError(String isError) {
		this.isError = isError;
	}
	public String getIsDel() {
		return isDel;
	}
	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}