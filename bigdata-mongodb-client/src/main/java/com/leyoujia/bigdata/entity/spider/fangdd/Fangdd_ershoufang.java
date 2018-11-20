package com.leyoujia.bigdata.entity.spider.fangdd;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 房多多二手房实体类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.fangdd.Fangdd_ershoufang.java
 * @创建作者: 杨献
 * @问题反馈: yangx@jjshome.com
 * @创建日期: 2017年3月27日上午10:39:39
 */
public class Fangdd_ershoufang extends CommonMongo {
	private static final long serialVersionUID=1L;
	
	private String 楼盘名称;
	private String 房源编号;
	private String 小区编码;
	private String 城市编码;
	
	private String 挂牌总价;
	private String 户型;
	private String 面积;
	private String 单价;
	private String 楼层;
	private String 房屋朝向;
	private String 产权;
	private String 类型;
	private String 竣工时间;
	private String 地址;
	public String get楼盘名称() {
		return 楼盘名称;
	}
	public void set楼盘名称(String 楼盘名称) {
		this.楼盘名称 = 楼盘名称;
	}
	public String get房源编号() {
		return 房源编号;
	}
	public void set房源编号(String 房源编号) {
		this.房源编号 = 房源编号;
	}
	public String get小区编码() {
		return 小区编码;
	}
	public void set小区编码(String 小区编码) {
		this.小区编码 = 小区编码;
	}
	public String get城市编码() {
		return 城市编码;
	}
	public void set城市编码(String 城市编码) {
		this.城市编码 = 城市编码;
	}
	public String get挂牌总价() {
		return 挂牌总价;
	}
	public void set挂牌总价(String 挂牌总价) {
		this.挂牌总价 = 挂牌总价;
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
	public String get楼层() {
		return 楼层;
	}
	public void set楼层(String 楼层) {
		this.楼层 = 楼层;
	}
	public String get房屋朝向() {
		return 房屋朝向;
	}
	public void set房屋朝向(String 房屋朝向) {
		this.房屋朝向 = 房屋朝向;
	}
	public String get产权() {
		return 产权;
	}
	public void set产权(String 产权) {
		this.产权 = 产权;
	}
	public String get类型() {
		return 类型;
	}
	public void set类型(String 类型) {
		this.类型 = 类型;
	}
	public String get竣工时间() {
		return 竣工时间;
	}
	public void set竣工时间(String 竣工时间) {
		this.竣工时间 = 竣工时间;
	}
	public String get地址() {
		return 地址;
	}
	public void set地址(String 地址) {
		this.地址 = 地址;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Fangdd_ershoufang [楼盘名称=" + 楼盘名称 + ", 房源编号=" + 房源编号 + ", 小区编码="
				+ 小区编码 + ", 城市编码=" + 城市编码 + ", 挂牌总价=" + 挂牌总价 + ", 户型=" + 户型
				+ ", 面积=" + 面积 + ", 单价=" + 单价 + ", 楼层=" + 楼层 + ", 房屋朝向=" + 房屋朝向
				+ ", 产权=" + 产权 + ", 类型=" + 类型 + ", 竣工时间=" + 竣工时间 + ", 地址=" + 地址
				+ "]";
	}
	
	
}
