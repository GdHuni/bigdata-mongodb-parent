package com.leyoujia.bigdata.entity.hq;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * 成交统计表 User: 谢银艳 Date: 15-03-04
 */
public class EsfCjHqCount extends BaseQueryBean {

	private static final long serialVersionUID = 5487519684734735469L;
	/** id*/
	private Integer id;
	/** 成交行情ID*/
	private Integer hqId;
	/** 楼盘ID*/
	private Integer lpId; 
	/** 楼盘名称*/
	private String lpName; 
	/** 成交月份*/
	private String cjMonth; 
	/** 成交年*/
	private String cjYear; 
	/** 成交房源类型（一室、二室等）*/
	private Integer roomType; 
	/** 成交套数*/
	private Integer cjCount; 
	/** 成交单价*/
	private Double cjAvgPrice; 
	/** 最小成交单价*/
	private Double minAvgPrice; 
	/** 最大成交单价*/
	private Double maxAvgPrice; 
	/** 涨幅*/
	private Double topPropertion;
	/** 城市编码*/
	private String cityId;  
	/** 区域编码*/
	private String areaId;  
	/** 片区编码*/
	private String placeId;  
	/** 市场成交量*/
	private Integer resourcesCt;  

	private String maxMonth;
	private String minMonth;

	public Integer getId() {
		return id;
	}

	public String getMaxMonth() {
		return maxMonth;
	}

	public void setMaxMonth(String maxMonth) {
		this.maxMonth = maxMonth;
	}

	public String getMinMonth() {
		return minMonth;
	}

	public void setMinMonth(String minMonth) {
		this.minMonth = minMonth;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHqId() {
		return hqId;
	}

	public void setHqId(Integer hqId) {
		this.hqId = hqId;
	}

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

	public String getCjMonth() {
		return cjMonth;
	}

	public void setCjMonth(String cjMonth) {
		this.cjMonth = cjMonth;
	}

	public String getCjYear() {
		return cjYear;
	}

	public void setCjYear(String cjYear) {
		this.cjYear = cjYear;
	}

	public Integer getRoomType() {
		return roomType;
	}

	public String getRoomTypeStr() {
		String roomStr = "其他";
		if (roomType != null) {
			switch (roomType) {
			case 1:
				roomStr = "一居室";
				break;
			case 2:
				roomStr = "二居室";
				break;
			case 3:
				roomStr = "三居室";
				break;
			case 4:
				roomStr = "四居室";
				break;
			case 5:
				roomStr = "五居室";
				break;
			}
		}
		return roomStr;
	}

	public String getColorStr() {
		String colorStr = "";
		if (roomType == null) {
			return "";
		}
		switch (roomType) {
		case 1:
			colorStr = "#3abdaf";
			break;
		case 2:
			colorStr = "#78e7e6";
			break;
		case 3:
			colorStr = "#7089ce";
			break;
		case 4:
			colorStr = "#f6b61c";
			break;
		case 5:
			colorStr = "#fb7a53";
			break;
		}
		return colorStr;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public Integer getCjCount() {
		return cjCount;
	}

	public void setCjCount(Integer cjCount) {
		this.cjCount = cjCount;
	}

	public Double getCjAvgPrice() {
		return cjAvgPrice;
	}

	public void setCjAvgPrice(Double cjAvgPrice) {
		this.cjAvgPrice = cjAvgPrice;
	}

	public Double getMinAvgPrice() {
		return minAvgPrice;
	}

	public void setMinAvgPrice(Double minAvgPrice) {
		this.minAvgPrice = minAvgPrice;
	}

	public Double getMaxAvgPrice() {
		return maxAvgPrice;
	}

	public void setMaxAvgPrice(Double maxAvgPrice) {
		this.maxAvgPrice = maxAvgPrice;
	}

	public Double getTopPropertion() {
		return topPropertion;
	}

	public void setTopPropertion(Double topPropertion) {
		this.topPropertion = topPropertion;
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

	public Integer getResourcesCt() {
		return resourcesCt;
	}

	public void setResourcesCt(Integer resourcesCt) {
		this.resourcesCt = resourcesCt;
	}

}
