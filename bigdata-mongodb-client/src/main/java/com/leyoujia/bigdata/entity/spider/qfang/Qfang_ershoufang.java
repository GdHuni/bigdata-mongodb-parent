package com.leyoujia.bigdata.entity.spider.qfang;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;


/**
 * @功能描述: Q房二手房
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qfang.Qfang_ershoufang.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年11月26日 下午6:35:21
 */ 
public class Qfang_ershoufang extends CommonMongo {
	private static final long serialVersionUID = 1L;

	private String 城市编码;
	private String 房屋编码;
	private String 小区编码;
	private String 小区名称;
	private String 户型;
	private String 面积;
	private String 装修;
	private String 楼层;
	private String 年代;
	private String 城区;
	private String 片区;
	private String 地址;
	private String 总价;
	private String 均价;
	private String 对口学校;
	public String get城市编码() {
		return 城市编码;
	}
	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
	}
	public String get房屋编码() {
		return 房屋编码;
	}
	public void set房屋编码(String 房屋编码) {
		this.房屋编码 = 房屋编码;
	}
	public String get小区编码() {
		return 小区编码;
	}
	public void set小区编码(String 小区编码) {
		this.小区编码 = 小区编码;
	}
	public String get小区名称() {
		return 小区名称;
	}
	public void set小区名称(String 小区名称) {
		this.小区名称 = 小区名称;
	}
	public String get户型() {
		return 户型;
	}
	public void set户型(String 户型) {
		this.户型 = 户型;
	}
	public String get面积() {
		return 面积;
	}
	public void set面积(String 面积) {
		this.面积 = 面积;
	}
	public String get装修() {
		return 装修;
	}
	public void set装修(String 装修) {
		this.装修 = 装修;
	}
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
	public String get年代() {
		return 年代;
	}
	public void set年代(String 年代) {
		this.年代 = 年代;
	}
	public String get城区() {
		return 城区;
	}
	public void set城区(String 城区) {
		this.城区 = 城区;
	}
	public String get片区() {
		return 片区;
	}
	public void set片区(String 片区) {
		this.片区 = 片区;
	}
	public String get地址() {
		return 地址;
	}
	public void set地址(String 地址) {
		this.地址 = 地址;
	}
	public String get总价() {
		return 总价;
	}
	public void set总价(String 总价) {
		this.总价 = 总价;
	}
	public String get均价() {
		return 均价;
	}
	public void set均价(String 均价) {
		this.均价 = 均价;
	}
	public String get对口学校() {
		return 对口学校;
	}
	public void set对口学校(String 对口学校) {
		this.对口学校 = 对口学校;
	}
}