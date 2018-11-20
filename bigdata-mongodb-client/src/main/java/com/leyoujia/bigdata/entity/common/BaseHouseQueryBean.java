package com.leyoujia.bigdata.entity.common;

import org.apache.commons.lang.StringUtils;

/**
 * hcf User: jjs Date: 13-12-4 Time: 上午11:25 To change this template use File |
 * Settings | File Templates.
 */
public class BaseHouseQueryBean extends BaseQueryBean {

	private String urlNum;

	private String urlStr;
	/**
	 * 是否包含图片
	 */
	private boolean includeImages;

	/**
	 * 是否包含楼盘扩展信息
	 */
	private boolean includeDicInfo;

	/**
	 * 是否包含楼盘基本信息
	 */
	private boolean includeDic;

	/**
	 * 对象中是否包含城市信息
	 */
	private boolean includeCity;

	/**
	 * 对象中是否包含行政区
	 */
	private boolean includeDistrict;

	/**
	 * 对象中是否包含商圈
	 */
	private boolean includeArea;

	/**
	 * 是否包含经济人房评
	 */
	private boolean includeAssess;

	private boolean includeAgentShop;

	private boolean isBackSearch = false;// 是否后台查询

	private boolean incrViewCount;

	/**
	 * 列表数据是否查询数据库价格
	 */
	private boolean includeRealPrice;

	/**
	 * 朝向
	 */
	private Integer forword;

	/**
	 * 房龄
	 */
	private Integer houseAge;

	/**
	 * 装修
	 */
	private Integer fitment;

	/**
	 * 楼层
	 */
	private Integer floor;
	/**
	 * 城市
	 */
	private String city;

	/**
	 * 城市的汉字名称
	 */
	private String cityName;

	/**
	 * 片区
	 */
	private String area;

	/**
	 * 片区名称
	 */
	private String areaName;

	/**
	 * 商圈
	 */
	private String place;

	/**
	 * 商圈名称
	 */
	private String placeName;

	/**
	 * 总价开始
	 */
	private Double totalPriceStart;

	/**
	 * 总价结束
	 */
	private Double totalPriceEnd;

	/**
	 * 员工ID
	 */
	private String workerId;

	/**
	 * 房号ID
	 */
	private Integer fhId;

	/**
	 * 室
	 */
	private Integer room;

	/**
	 * 厅
	 */
	private Integer hall;

	/**
	 * 面积开始
	 */
	private Double areaStart;

	/**
	 * 面积结束
	 */
	private Double areaEnd;

	/**
	 * 地铁线路ID
	 */
	private Integer subWayId;

	/**
	 * 地铁站台ID
	 */
	private Integer subStationId;

	/**
	 * 类型
	 */
	private Integer type;

	/**
	 * 类型的名称
	 */
	private String typeName;

	/**
	 * 前台查询还是后台运营查询
	 * 
	 * @return
	 */
	private Integer status;

	/**
	 * 价格ID;
	 */
	private Integer priceId;

	/**
	 * 价格标签
	 */
	private String priceValue;

	/**
	 * 标签
	 * 
	 * @return
	 */
	private String tag;

	/**
	 * 标签Id
	 * 
	 * @return
	 */
	private String tagId;

	/**
	 * 发布时间开始
	 * 
	 * @return
	 */
	private String fbTimeStart;

	/**
	 * 发布时间结束
	 * 
	 * @return
	 */
	private String fbTimeEnd;

	/**
	 * 更新时间开始
	 */
	private String upTimeStart;

	/**
	 * 更新时间结束
	 */
	private String upTimeEnd;

	/**
	 * 审核人
	 * 
	 * @return
	 */
	private String shWorkerId;

	/************* 是否排序字段 1代表正序，2代表倒序,其他值视为不排序 *****************/
	/**
	 * 是否按均价排序
	 * 
	 * @return
	 */
	private String sortAvgPrice;
	/**
	 * 按面积排序
	 */
	private String sortArea;

	/**
	 * 是否按总价排序
	 * 
	 * @return
	 */
	private String sortTotalPrice;

	/**
	 * 是否按更新时间排序
	 * 
	 * @return
	 */
	private String sortModifyTime;

	/**
	 * 带看量
	 */
	private String sortLookCount;

	/**
	 * 房评量
	 */
	private String sortAccCount;

	private String sxWorkerId;
	private String ysfWorkerId;
	private String zrWorkerId;
	private String skWorkerId;

	/**
	 * 是否按浏览量排序
	 * 
	 * @return
	 */
	private String sortSearchCount;
	/**
	 * **************排序字段结束************
	 */

	/**
	 * 是否地铁查询, 1:是地铁查询
	 */
	private Integer ditieQuery;

	private String context;

	/** 查询关键词 纠错后的查询词 */
	private String suggestKey;

	/** 楼盘名称 */
	private String baseHouseName;

	/**
	 * 楼盘坐标经度开始
	 */
	private Double comLngStart;

	/**
	 * 楼盘坐标经度结束
	 */
	private Double comLngEnd;

	/**
	 * 楼盘坐标纬度开始
	 */
	private Double comLatStart;

	/**
	 * 楼盘坐标纬度结束
	 */
	private Double comLatEnd;

	private int pubDaysType; // 发布天数

	public int getPubDaysType() {

		return pubDaysType;
	}

	public void setPubDaysType(int pubDaysType) {
		this.pubDaysType = pubDaysType;
	}

	public boolean isIncludeImages() {
		return includeImages;
	}

	public void setIncludeImages(boolean includeImages) {
		this.includeImages = includeImages;
	}

	public boolean isIncludeDicInfo() {
		return includeDicInfo;
	}

	public void setIncludeDicInfo(boolean includeDicInfo) {
		this.includeDicInfo = includeDicInfo;
	}

	public boolean isIncludeDic() {
		return includeDic;
	}

	public void setIncludeDic(boolean includeDic) {
		this.includeDic = includeDic;
	}

	public boolean isIncludeCity() {
		return includeCity;
	}

	public void setIncludeCity(boolean includeCity) {
		this.includeCity = includeCity;
	}

	public boolean isIncludeDistrict() {
		return includeDistrict;
	}

	public void setIncludeDistrict(boolean includeDistrict) {
		this.includeDistrict = includeDistrict;
	}

	public boolean isIncludeArea() {
		return includeArea;
	}

	public void setIncludeArea(boolean includeArea) {
		this.includeArea = includeArea;
	}

	public boolean isIncludeAssess() {
		return includeAssess;
	}

	public void setIncludeAssess(boolean includeAssess) {
		this.includeAssess = includeAssess;
	}

	public boolean isBackSearch() {
		return isBackSearch;
	}

	public void setBackSearch(boolean backSearch) {
		isBackSearch = backSearch;
	}

	public Integer getForword() {
		return forword;
	}

	public void setForword(Integer forword) {
		this.forword = forword;
	}

	public String getForwordStr() {
		String value = "";
		if (null != forword) {
			switch (forword) {
			case 1:
				value = "朝东";
				break;
			case 2:
				value = "朝南";
				break;
			case 3:
				value = "朝西";
				break;
			case 4:
				value = "朝北";
				break;
			case 5:
				value = "东南";
				break;
			case 6:
				value = "东北";
				break;
			case 7:
				value = "西南";
				break;
			case 8:
				value = "西北";
				break;
			case 9:
				value = "南北通透";
				break;
			case 10:
				value = "东西向";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
	}

	public Integer getHouseAge() {
		return houseAge;
	}

	public void setHouseAge(Integer houseAge) {
		this.houseAge = houseAge;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getFitment() {
		return fitment;
	}

	public void setFitment(Integer fitment) {
		this.fitment = fitment;
	}

	public String getFitmentStr() {
		String value = "";
		if (null != fitment) {
			switch (fitment) {
			case 1:
				value = "毛坯";
				break;
			case 2:
				value = "普装";
				break;
			case 3:
				value = "简装";
				break;
			case 4:
				value = "精装";
				break;
			case 5:
				value = "豪装";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Double getTotalPriceStart() {
		return totalPriceStart;
	}

	public void setTotalPriceStart(Double totalPriceStart) {
		this.totalPriceStart = totalPriceStart;
	}

	public Double getTotalPriceEnd() {
		return totalPriceEnd;
	}

	public void setTotalPriceEnd(Double totalPriceEnd) {
		this.totalPriceEnd = totalPriceEnd;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public String getRoomStr() {
		String value = "";
		if (null != room) {
			switch (room) {
			case 1:
				value = "一房";
				break;
			case 2:
				value = "二房";
				break;
			case 3:
				value = "三房";
				break;
			case 4:
				value = "四房";
				break;
			case 5:
				value = "五房";
				break;
			default:
				value = "五房以上";
				break;
			}
		}
		return value;
	}

	public Integer getHall() {
		return hall;
	}

	public void setHall(Integer hall) {
		this.hall = hall;
	}

	public Double getAreaStart() {
		return areaStart;
	}

	public void setAreaStart(Double areaStart) {
		this.areaStart = areaStart;
	}

	public Double getAreaEnd() {
		return areaEnd;
	}

	public void setAreaEnd(Double areaEnd) {
		this.areaEnd = areaEnd;
	}

	public Integer getSubWayId() {
		return subWayId;
	}

	public void setSubWayId(Integer subWayId) {
		this.subWayId = subWayId;
	}

	public Integer getSubStationId() {
		return subStationId;
	}

	public void setSubStationId(Integer subStationId) {
		this.subStationId = subStationId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeStr() {
		String value = "";
		if (null != type) {
			switch (type) {
			case 1:
				value = "普通住宅";
				break;
			case 2:
				value = "复式住宅";
				break;
			case 3:
				value = "商住两用";
				break;
			case 4:
				value = "别墅";
				break;
			case 5:
				value = "商铺";
				break;
			case 6:
				value = "写字楼";
				break;
			case 7:
				value = "厂房";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTagStr() {
		String value = "";
		if (StringUtils.isNotEmpty(tagId)) {
			switch (tagId) {
			case "1":
				value = "唯一住宅";
				break;
			case "2":
				value = "五年免税";
				break;
			case "3":
				value = "红本在手";
				break;
			case "4":
				value = "学位房";
				break;
			case "5":
				value = "独家";
				break;
			case "6":
				value = "随时可看";
				break;
			case "7":
				value = "新上";
				break;
			case "8":
				value = "降价";
				break;
			default:
				value = "";
				break;
			}
		}
		return value;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getFbTimeStart() {
		return fbTimeStart;
	}

	public void setFbTimeStart(String fbTimeStart) {
		this.fbTimeStart = fbTimeStart;
	}

	public String getFbTimeEnd() {
		return fbTimeEnd;
	}

	public void setFbTimeEnd(String fbTimeEnd) {
		this.fbTimeEnd = fbTimeEnd;
	}

	public String getShWorkerId() {
		return shWorkerId;
	}

	public void setShWorkerId(String shWorkerId) {
		this.shWorkerId = shWorkerId;
	}

	public String getSortAvgPrice() {
		return sortAvgPrice;
	}

	public void setSortAvgPrice(String sortAvgPrice) {
		this.sortAvgPrice = sortAvgPrice;
	}

	public String getSortArea() {
		return sortArea;
	}

	public void setSortArea(String sortArea) {
		this.sortArea = sortArea;
	}

	public String getSortTotalPrice() {
		return sortTotalPrice;
	}

	public void setSortTotalPrice(String sortTotalPrice) {
		this.sortTotalPrice = sortTotalPrice;
	}

	public String getSortModifyTime() {
		return sortModifyTime;
	}

	public void setSortModifyTime(String sortModifyTime) {
		this.sortModifyTime = sortModifyTime;
	}

	public String getSortLookCount() {
		return sortLookCount;
	}

	public void setSortLookCount(String sortLookCount) {
		this.sortLookCount = sortLookCount;
	}

	public String getSortAccCount() {
		return sortAccCount;
	}

	public void setSortAccCount(String sortAccCount) {
		this.sortAccCount = sortAccCount;
	}

	public String getSortSearchCount() {
		return sortSearchCount;
	}

	public void setSortSearchCount(String sortSearchCount) {
		this.sortSearchCount = sortSearchCount;
	}

	public Integer getDitieQuery() {
		return ditieQuery;
	}

	public void setDitieQuery(Integer ditieQuery) {
		this.ditieQuery = ditieQuery;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public boolean isIncludeAgentShop() {
		return includeAgentShop;
	}

	public void setIncludeAgentShop(boolean includeAgentShop) {
		this.includeAgentShop = includeAgentShop;
	}

	public String getPriceValue() {
		return priceValue;
	}

	public void setPriceValue(String priceValue) {
		this.priceValue = priceValue;
	}

	public String getPriceValueStr() {

		return "";
	}

	public String getBaseHouseName() {
		return baseHouseName;
	}

	public void setBaseHouseName(String baseHouseName) {
		this.baseHouseName = baseHouseName;
	}

	public boolean isIncrViewCount() {
		return incrViewCount;
	}

	public void setIncrViewCount(boolean incrViewCount) {
		this.incrViewCount = incrViewCount;
	}

	public Double getComLngStart() {
		return comLngStart;
	}

	public void setComLngStart(Double comLngStart) {
		this.comLngStart = comLngStart;
	}

	public Double getComLngEnd() {
		return comLngEnd;
	}

	public void setComLngEnd(Double comLngEnd) {
		this.comLngEnd = comLngEnd;
	}

	public Double getComLatStart() {
		return comLatStart;
	}

	public void setComLatStart(Double comLatStart) {
		this.comLatStart = comLatStart;
	}

	public Double getComLatEnd() {
		return comLatEnd;
	}

	public void setComLatEnd(Double comLatEnd) {
		this.comLatEnd = comLatEnd;
	}

	public String getYsfWorkerId() {
		return ysfWorkerId;
	}

	public void setYsfWorkerId(String ysfWorkerId) {
		this.ysfWorkerId = ysfWorkerId;
	}

	public String getSxWorkerId() {
		return sxWorkerId;
	}

	public void setSxWorkerId(String sxWorkerId) {
		this.sxWorkerId = sxWorkerId;
	}

	public String getZrWorkerId() {
		return zrWorkerId;
	}

	public void setZrWorkerId(String zrWorkerId) {
		this.zrWorkerId = zrWorkerId;
	}

	public String getUrlNum() {
		return urlNum;
	}

	public void setUrlNum(String urlNum) {
		this.urlNum = urlNum;
	}

	public String getUrlStr() {
		return urlStr;
	}

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

	public String getSkWorkerId() {
		return skWorkerId;
	}

	public void setSkWorkerId(String skWorkerId) {
		this.skWorkerId = skWorkerId;
	}

	public String getUpTimeStart() {
		return upTimeStart;
	}

	public void setUpTimeStart(String upTimeStart) {
		this.upTimeStart = upTimeStart;
	}

	public String getUpTimeEnd() {
		return upTimeEnd;
	}

	public void setUpTimeEnd(String upTimeEnd) {
		this.upTimeEnd = upTimeEnd;
	}

	public boolean isIncludeRealPrice() {
		return includeRealPrice;
	}

	public void setIncludeRealPrice(boolean includeRealPrice) {
		this.includeRealPrice = includeRealPrice;
	}

	public String getSuggestKey() {
		return suggestKey;
	}

	public void setSuggestKey(String suggestKey) {
		this.suggestKey = suggestKey;
	}

	public Integer getFhId() {
		return fhId;
	}

	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}

}
