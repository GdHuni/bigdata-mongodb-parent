package com.leyoujia.bigdata.entity.spider.school;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 深圳幼儿园实体类
 * @项目版本: V1.0.0
 * @相对路径: com.jjshome.bigdata.entity.spider.school.Sz_Yery_School
 * @创建作者: xiejinyan
 * @创建日期: 2017年6月27日 下午4:03:43
 */
public class SzYerySchool extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String 学校名称;
    private String 所属地;
    private String 学校性质;
    private String 办学层次;
    private String 办园时间;
    private String 学校等级;
    private String 联系电话;
    private String 学校地址;
    private String 学校描述;
    private String 招生信息;
    private String 爬取时间;
	public String get学校名称() {
		return 学校名称;
	}
	public void set学校名称(String 学校名称) {
		this.学校名称 = 学校名称;
	}
	public String get所属地() {
		return 所属地;
	}
	public void set所属地(String 所属地) {
		this.所属地 = 所属地;
	}
	public String get学校性质() {
		return 学校性质;
	}
	public void set学校性质(String 学校性质) {
		this.学校性质 = 学校性质;
	}
	public String get办学层次() {
		return 办学层次;
	}
	public void set办学层次(String 办学层次) {
		this.办学层次 = 办学层次;
	}
	public String get办园时间() {
		return 办园时间;
	}
	public void set办园时间(String 办园时间) {
		this.办园时间 = 办园时间;
	}
	public String get学校等级() {
		return 学校等级;
	}
	public void set学校等级(String 学校等级) {
		this.学校等级 = 学校等级;
	}
	public String get联系电话() {
		return 联系电话;
	}
	public void set联系电话(String 联系电话) {
		this.联系电话 = 联系电话;
	}
	public String get学校地址() {
		return 学校地址;
	}
	public void set学校地址(String 学校地址) {
		this.学校地址 = 学校地址;
	}
	public String get学校描述() {
		return 学校描述;
	}
	public void set学校描述(String 学校描述) {
		this.学校描述 = 学校描述;
	}
	public String get招生信息() {
		return 招生信息;
	}
	public void set招生信息(String 招生信息) {
		this.招生信息 = 招生信息;
	}
	public String get爬取时间() {
		return 爬取时间;
	}
	public void set爬取时间(String 爬取时间) {
		this.爬取时间 = 爬取时间;
	}
    
}
