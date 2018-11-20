package com.leyoujia.bigdata.entity.kcr.param;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class LpParam implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id; 
	private String[] huxing;
	private String[] chaoXiang;
	private Double maxJunjia;
	private Double minJunjia;
	private Double minPrice;
	private Double maxPrice;
	private Double maxMianji;
	private Double minMianji;
	private String name;
	private Double minX;
	private Double maxX;
	private Double minY;
	private Double maxY; 
	private Double mapX;
	private Double mapY;
	private String cityCode;
	private List<String> agentId;
	private List<String> ips;
	private Integer type;
	private List<Integer> ids;
	
	private final Double JL = 0.01;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
	public Double getMaxJunjia() {
		return maxJunjia;
	}
	public void setMaxJunjia(Double maxJunjia) {
		this.maxJunjia = maxJunjia;
	}
	public Double getMinJunjia() {
		return minJunjia;
	}
	public void setMinJunjia(Double minJunjia) {
		this.minJunjia = minJunjia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getMinX() {
		if (maxX != null) {
			maxX = maxX-JL;
		}
		return minX;
	}
	public void setMinX(Double minX) {
		this.minX = minX;
	}
	public Double getMaxX() {
		if (maxX != null) {
			maxX = maxX+JL;
		}
		return maxX;
	}
	public void setMaxX(Double maxX) {
		this.maxX = maxX;
	}
	public Double getMinY() {
		if (minY != null) {
			minY = minY-JL;
		}
		return minY;
	}
	public void setMinY(Double minY) {
		this.minY = minY;
	}
	public Double getMaxY() {
		if (maxY != null) {
			maxY = maxY+JL;
		}
		return maxY;
	}
	public void setMaxY(Double maxY) {
		this.maxY = maxY;
	}
	public Double getJL() {
		return JL;
	}
	public Double getMaxMianji() {
		return maxMianji;
	}
	public void setMaxMianji(Double maxMianji) {
		this.maxMianji = maxMianji;
	}
	public Double getMinMianji() {
		return minMianji;
	}
	public void setMinMianji(Double minMianji) {
		this.minMianji = minMianji;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Double getMapX() {
		return mapX;
	}
	public void setMapX(Double mapX) {
		this.mapX = mapX;
	}
	public Double getMapY() {
		return mapY;
	}
	public void setMapY(Double mapY) {
		this.mapY = mapY;
	}
	public String[] getHuxing() {
		return huxing;
	}
	public void setHuxing(String[] huxing) {
		this.huxing = huxing;
	}
	public String[] getChaoXiang() {
		return chaoXiang;
	}
	public void setChaoXiang(String[] chaoXiang) {
		this.chaoXiang = chaoXiang;
	}
	/**  
	 * @功能描述: 判断是否存在6户型
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月24日 下午6:35:34
	 * @return
	 */ 
	public boolean isHuxing6(){
		if(this.huxing!=null) return Arrays.asList(this.huxing).contains("6")?true:false;
		return false;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public List<String> getAgentId() {
		return agentId;
	}
	public void setAgentId(List<String> agentId) {
		this.agentId = agentId;
	}
	public List<String> getIps() {
		return ips;
	}
	public void setIps(List<String> ips) {
		this.ips = ips;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	 
}
