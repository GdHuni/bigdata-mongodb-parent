package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述: 珠海房产网实体类
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Zh_Fangchan.java
 * @创建作者: 杨献
 * @问题反馈: yangx@jjshome.com
 * @创建日期: 2017年4月11日 下午2:08:52
 */
public class Zh_Fangchan extends CommonMongo {

	private static final long serialVersionUID=1L;
	private String 项目名称;
	private String 座落;
	private String 房屋建筑面积;
	private String 附记;
	private String 开发企业名称;
	private String 幢号楼号;
	public String get项目名称() {
		return 项目名称;
	}
	public void set项目名称(String 项目名称) {
		this.项目名称 = 项目名称;
	}
	public String get座落() {
		return 座落;
	}
	public void set座落(String 座落) {
		this.座落 = 座落;
	}
	public String get房屋建筑面积() {
		return 房屋建筑面积;
	}
	public void set房屋建筑面积(String 房屋建筑面积) {
		this.房屋建筑面积 = 房屋建筑面积;
	}
	public String get附记() {
		return 附记;
	}
	public void set附记(String 附记) {
		this.附记 = 附记;
	}
	public String get开发企业名称() {
		return 开发企业名称;
	}
	public void set开发企业名称(String 开发企业名称) {
		this.开发企业名称 = 开发企业名称;
	}
	public String get幢号楼号() {
		return 幢号楼号;
	}
	public void set幢号楼号(String 幢号楼号) {
		this.幢号楼号 = 幢号楼号;
	}
	public String get层高() {
		return 层高;
	}
	public void set层高(String 层高) {
		this.层高 = 层高;
	}
	public String get所在层() {
		return 所在层;
	}
	public void set所在层(String 所在层) {
		this.所在层 = 所在层;
	}
	public String get房间号() {
		return 房间号;
	}
	public void set房间号(String 房间号) {
		this.房间号 = 房间号;
	}
	public String get户型() {
		return 户型;
	}
	public void set户型(String 户型) {
		this.户型 = 户型;
	}
	public String get用途() {
		return 用途;
	}
	public void set用途(String 用途) {
		this.用途 = 用途;
	}
	public String get建筑面积() {
		return 建筑面积;
	}
	public void set建筑面积(String 建筑面积) {
		this.建筑面积 = 建筑面积;
	}
	public String get套内面积() {
		return 套内面积;
	}
	public void set套内面积(String 套内面积) {
		this.套内面积 = 套内面积;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String 层高;
	private String 所在层;
	private String 房间号;
	private String 户型;
	private String 用途;
	private String 建筑面积;
	private String 套内面积;
	@Override
	public String toString() {
		return "Zh_Fangchan [项目名称=" + 项目名称 + ", 座落=" + 座落 + ", 房屋建筑面积="
				+ 房屋建筑面积 + ", 附记=" + 附记 + ", 开发企业名称=" + 开发企业名称 + ", 幢号楼号="
				+ 幢号楼号 + ", 层高=" + 层高 + ", 所在层=" + 所在层 + ", 房间号=" + 房间号
				+ ", 户型=" + 户型 + ", 用途=" + 用途 + ", 建筑面积=" + 建筑面积 + ", 套内面积="
				+ 套内面积 + "]";
	}

}
