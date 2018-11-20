package com.leyoujia.bigdata.entity.spider.qfang.gujia;


import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:Qfang估价实体类 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qfang.Qfang_gujia.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年6月23日 上午11:25:37
 */
public class Qfang_gujia extends CommonMongo {
	private static final long serialVersionUID = 1L;
	
	private String gardename;
	private String gardenId;
	private String gardenInternalID;
	private String gardenAddress;
	private String gardenumber;//楼盘编码
	private String city;
	private String district;//城区               
	private String area;//片区
	
	private String buildingName;
	private String buildingId;
	
	private String floorNum;
	private String roomNoId;
	private String roomNumber;
	private String buildArea;
	private String maxFloor;
	private String direction;//朝向
	private String roomCode;
	private String bedRoom;
	private String livingRoom;
	private String bathRoom;
	private String kitchen;
	
	
	private String total_prices;
	private String average_price;
	private String priceUpDown;
	private String calculating_basis;//计算基数
	private String query_number;//查询人次
	private String inSell;
	private String sold_six_month;
	private String new_unitPrice;

	
	
	
	public String getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(String bathRoom) {
		this.bathRoom = bathRoom;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(String bedRoom) {
		this.bedRoom = bedRoom;
	}

	public String getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
	}

	public String getGardename() {
		return gardename;
	}

	public void setGardename(String gardename) {
		this.gardename = gardename;
	}


	public String getGardenId() {
		return gardenId;
	}

	public void setGardenId(String gardenId) {
		this.gardenId = gardenId;
	}


	public String getGardenInternalID() {
		return gardenInternalID;
	}

	public void setGardenInternalID(String gardenInternalID) {
		this.gardenInternalID = gardenInternalID;
	}

	public String getGardenAddress() {
		return gardenAddress;
	}

	public void setGardenAddress(String gardenAddress) {
		this.gardenAddress = gardenAddress;
	}

	public String getGardenumber() {
		return gardenumber;
	}

	public void setGardenumber(String gardenumber) {
		this.gardenumber = gardenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getRoomNoId() {
		return roomNoId;
	}

	public void setRoomNoId(String roomNoId) {
		this.roomNoId = roomNoId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}

	public String getMaxFloor() {
		return maxFloor;
	}

	public void setMaxFloor(String maxFloor) {
		this.maxFloor = maxFloor;
	}


	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getTotal_prices() {
		return total_prices;
	}

	public void setTotal_prices(String total_prices) {
		this.total_prices = total_prices;
	}

	public String getAverage_price() {
		return average_price;
	}

	public void setAverage_price(String average_price) {
		this.average_price = average_price;
	}

	public String getPriceUpDown() {
		return priceUpDown;
	}

	public void setPriceUpDown(String priceUpDown) {
		this.priceUpDown = priceUpDown;
	}

	public String getCalculating_basis() {
		return calculating_basis;
	}

	public void setCalculating_basis(String calculating_basis) {
		this.calculating_basis = calculating_basis;
	}

	public String getQuery_number() {
		return query_number;
	}

	public void setQuery_number(String query_number) {
		this.query_number = query_number;
	}

	public String getInSell() {
		return inSell;
	}

	public void setInSell(String inSell) {
		this.inSell = inSell;
	}

	public String getSold_six_month() {
		return sold_six_month;
	}

	public void setSold_six_month(String sold_six_month) {
		this.sold_six_month = sold_six_month;
	}

	public String getNew_unitPrice() {
		return new_unitPrice;
	}

	public void setNew_unitPrice(String new_unitPrice) {
		this.new_unitPrice = new_unitPrice;
	}
	
	
	
	
	
	
	
	
	
	
	

}
