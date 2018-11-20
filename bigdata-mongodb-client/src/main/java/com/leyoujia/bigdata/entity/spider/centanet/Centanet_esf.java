package com.leyoujia.bigdata.entity.spider.centanet;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:二手房 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.centanet.Centanet_esf.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年5月23日 下午3:59:05
 */
public class Centanet_esf  extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 城市编码;
	private String 小区编码;
	private String 小区名称;
	private String 小区地址;
	private String 房屋名称;
	private String 中原编码;
	private String 房源编码;
	private String 更新时间;
	/** 统计时间为近3个月内当前房源的带看总数 */
	private String 带看次数;	
	private String 总价;
	private String 户型;
	private String 面积;
	private String 单价;
	private String 朝向;
	private String 年代;
	private String 楼层;
	private String 装修;
	
	private String 房源标签;

	public String get城市编码() {
		return 城市编码;
	}

	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
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

	public String get小区地址() {
		return 小区地址;
	}

	public void set小区地址(String 小区地址) {
		this.小区地址 = 小区地址;
	}

	public String get房屋名称() {
		return 房屋名称;
	}

	public void set房屋名称(String 房屋名称) {
		this.房屋名称 = 房屋名称;
	}

	public String get中原编码() {
		return 中原编码;
	}

	public void set中原编码(String 中原编码) {
		this.中原编码 = 中原编码;
	}

	public String get房源编码() {
		return 房源编码;
	}

	public void set房源编码(String 房源编码) {
		this.房源编码 = 房源编码;
	}

	public String get更新时间() {
		return 更新时间;
	}

	public void set更新时间(String 更新时间) {
		this.更新时间 = 更新时间;
	}

	public String get带看次数() {
		return 带看次数;
	}

	public void set带看次数(String 带看次数) {
		this.带看次数 = 带看次数;
	}

	public String get总价() {
		return 总价;
	}

	public void set总价(String 总价) {
		this.总价 = 总价;
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

	public String get单价() {
		return 单价;
	}

	public void set单价(String 单价) {
		this.单价 = 单价;
	}

	public String get朝向() {
		return 朝向;
	}

	public void set朝向(String 朝向) {
		this.朝向 = 朝向;
	}

	public String get年代() {
		return 年代;
	}

	public void set年代(String 年代) {
		this.年代 = 年代;
	}

	public String get楼层() {
		return 楼层;
	}

	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}

	public String get装修() {
		return 装修;
	}

	public void set装修(String 装修) {
		this.装修 = 装修;
	}

	public String get房源标签() {
		return 房源标签;
	}

	public void set房源标签(String 房源标签) {
		this.房源标签 = 房源标签;
	}
	
	
	
}
