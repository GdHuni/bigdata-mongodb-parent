package com.leyoujia.bigdata.entity.cfj.vo;

import com.leyoujia.bigdata.entity.cfj.CfjBasisObject;

import java.util.List;

/**
 * @功能描述: 查房价首页地区VO
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.vo.IndexPlace.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年5月19日 下午5:39:01
 */ 
public class IndexPlace extends CfjBasisObject{
	private static final long serialVersionUID = 1L;
	/** 子对象 */
	private List<SearchInfo> childDatas;
	/** 楼盘所属片区对象 */
	private SearchInfo parentData;
	/** 经度 */
	private Double lng;
	/** 纬度 */
	private Double lat;
	public List<SearchInfo> getChildDatas() {
		return childDatas;
	}
	public void setChildDatas(List<SearchInfo> childDatas) {
		this.childDatas = childDatas;
	}
	public SearchInfo getParentData() {
		return parentData;
	}
	public void setParentData(SearchInfo parentData) {
		this.parentData = parentData;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
}
