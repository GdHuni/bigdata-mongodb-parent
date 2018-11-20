package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 项目栋阁
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Xm_dg.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年7月5日 下午5:00:10
 */ 
public class Xm_dg extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 项目ID;
	private String 项目名称;
	private String 宗地号;
	private String 城市;
	private String 所在区域;
	private String 宗地位置;
	private String 合同文号;
	private String 使用年限;
	private String 房屋用途;
	private String 土地用途;
	private String 宗地面积;
	private String 总建筑面积;
	public String get项目ID() {
		return 项目ID;
	}
	public void set项目ID(String 项目id) {
		项目ID = 项目id;
	}
	public String get项目名称() {
		return 项目名称;
	}
	public void set项目名称(String 项目名称) {
		this.项目名称 = 项目名称;
	}
	public String get宗地号() {
		return 宗地号;
	}
	public void set宗地号(String 宗地号) {
		this.宗地号 = 宗地号;
	}
	public String get城市() {
		return 城市;
	}
	public void set城市(String 城市) {
		this.城市 = 城市;
	}
	public String get所在区域() {
		return 所在区域;
	}
	public void set所在区域(String 所在区域) {
		this.所在区域 = 所在区域;
	}
	public String get宗地位置() {
		return 宗地位置;
	}
	public void set宗地位置(String 宗地位置) {
		this.宗地位置 = 宗地位置;
	}
	public String get合同文号() {
		return 合同文号;
	}
	public void set合同文号(String 合同文号) {
		this.合同文号 = 合同文号;
	}
	public String get使用年限() {
		return 使用年限;
	}
	public void set使用年限(String 使用年限) {
		this.使用年限 = 使用年限;
	}
	public String get房屋用途() {
		return 房屋用途;
	}
	public void set房屋用途(String 房屋用途) {
		this.房屋用途 = 房屋用途;
	}
	public String get土地用途() {
		return 土地用途;
	}
	public void set土地用途(String 土地用途) {
		this.土地用途 = 土地用途;
	}
	public String get宗地面积() {
		return 宗地面积;
	}
	public void set宗地面积(String 宗地面积) {
		this.宗地面积 = 宗地面积;
	}
	public String get总建筑面积() {
		return 总建筑面积;
	}
	public void set总建筑面积(String 总建筑面积) {
		this.总建筑面积 = 总建筑面积;
	}
}