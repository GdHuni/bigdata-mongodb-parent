package com.leyoujia.bigdata.entity.cfj;

import java.io.Serializable;

/** 
 * @功能描述：  成交楼盘信息
 * @项目版本： 1.0
 * @项目名称： 大数据-查房价 
 * @创建作者： 沈阳
 * @创建日期： 2016年5月9日 下午3:35:09 
 */
public class HouseInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/** ID */
	private int id;
	/** 楼盘ID */
	private int lpId;
	/** 楼盘名称 */
	private String lpName;
	/** 楼盘名称首字母 */
	private String lpNameSpell;
	/** 楼盘名称全拼 */
	private String lpNameFull;
	/** 房源ID */
	private int fyId;
	/** 房号ID */
	private int fhId;
	/** 房号名称 */
	private String fhName;
	/** 城市编码 */
	private String cityCode;
	/** 区域 */
	private String areaCode;
	/** 城区名称 */
	private String areaName;
	/** 片区 */
	private String placeCode;
	/** 片区名称 */
	private String placeName;
	/** 图片路径 */
	private String imgURL;
	/** 房源编号 */
	private String houseNO;
	/** 室 */
	private int room;
	/** 厅 */
	private int hall;
	/** 卫 */
	private int toilet;
	/** 挂牌价（登盘价）单位万 */
	private String salePrice;
	/** 建筑面积-平米 */
	private String buildArea;
	/** 朝向 */
	private int forward;
	/** 总楼层 */
	private int totalFloor;
	/** 楼层 */
	private int floor;
	/** 装修情况 */
	private int fitment;
	/** 户型结构（建造类型） */
	private int structure;
	/** 标签（可上网，拎包入住） */
	private String tags;
	/** 建造年代 */
	private String houseBuildTime;
	/** 登盘时间 */
	private String regDate;
	/** 坐标X */
	private double comLNG;
	/** 坐标Y */
	private double comLAT;
	/** 是否有地铁 */
	private int isDitie;
	/** 楼盘地址 */
	private String comAddr;
	/** 成交id */
	private String cjId;
	/** 成交时间 */
	private String cjDate;
	/** 成交天数 */
	private int cjDays;
	/** 成交价（单位元） */
	private double cjPrice;
	/** 成交单价（单位元） */
	private double cjUnitPrice;
	/** 成交经纪人ID */
	private String cjWId;
	/** 成交经纪人 */
	private String cjWName;
	/** 成交经纪人电话 */
	private String cjWPhone;
	/** 成交数据来源（乐有家内部系统，国土局） */
	private int cjType;
	/** 产权性质 */
	private int cjXz;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getLpNameSpell() {
		return lpNameSpell;
	}
	public void setLpNameSpell(String lpNameSpell) {
		this.lpNameSpell = lpNameSpell;
	}
	public String getLpNameFull() {
		return lpNameFull;
	}
	public void setLpNameFull(String lpNameFull) {
		this.lpNameFull = lpNameFull;
	}
	public int getFyId() {
		return fyId;
	}
	public void setFyId(int fyId) {
		this.fyId = fyId;
	}
	public int getFhId() {
		return fhId;
	}
	public void setFhId(int fhId) {
		this.fhId = fhId;
	}
	public String getFhName() {
		return fhName;
	}
	public void setFhName(String fhName) {
		this.fhName = fhName;
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
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getHouseNO() {
		return houseNO;
	}
	public void setHouseNO(String houseNO) {
		this.houseNO = houseNO;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getHall() {
		return hall;
	}
	public void setHall(int hall) {
		this.hall = hall;
	}
	public int getToilet() {
		return toilet;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}
	public int getForward() {
		return forward;
	}
	public void setForward(int forward) {
		this.forward = forward;
	}
	public int getTotalFloor() {
		return totalFloor;
	}
	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getFitment() {
		return fitment;
	}
	public void setFitment(int fitment) {
		this.fitment = fitment;
	}
	public int getStructure() {
		return structure;
	}
	public void setStructure(int structure) {
		this.structure = structure;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getHouseBuildTime() {
		return houseBuildTime;
	}
	public void setHouseBuildTime(String houseBuildTime) {
		this.houseBuildTime = houseBuildTime;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
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
	public int getIsDitie() {
		return isDitie;
	}
	public void setIsDitie(int isDitie) {
		this.isDitie = isDitie;
	}
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	public String getCjId() {
		return cjId;
	}
	public void setCjId(String cjId) {
		this.cjId = cjId;
	}
	public String getCjDate() {
		return cjDate;
	}
	public void setCjDate(String cjDate) {
		this.cjDate = cjDate;
	}
	public int getCjDays() {
		return cjDays;
	}
	public void setCjDays(int cjDays) {
		this.cjDays = cjDays;
	}
	public double getCjPrice() {
		return cjPrice;
	}
	public void setCjPrice(double cjPrice) {
		this.cjPrice = cjPrice;
	}
	public double getCjUnitPrice() {
		return cjUnitPrice;
	}
	public void setCjUnitPrice(double cjUnitPrice) {
		this.cjUnitPrice = cjUnitPrice;
	}
	public String getCjWId() {
		return cjWId;
	}
	public void setCjWId(String cjWId) {
		this.cjWId = cjWId;
	}
	public String getCjWName() {
		return cjWName;
	}
	public void setCjWName(String cjWName) {
		this.cjWName = cjWName;
	}
	public String getCjWPhone() {
		return cjWPhone;
	}
	public void setCjWPhone(String cjWPhone) {
		this.cjWPhone = cjWPhone;
	}
	public int getCjType() {
		return cjType;
	}
	public void setCjType(int cjType) {
		this.cjType = cjType;
	}
	public int getCjXz() {
		return cjXz;
	}
	public void setCjXz(int cjXz) {
		this.cjXz = cjXz;
	}

	
	
}
