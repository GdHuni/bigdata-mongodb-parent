package com.leyoujia.bigdata.entity.spider.lianjia;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * 功能描述:链家经纪人信息 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.lianjia.Lianjia_agent.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年6月12日 上午10:54:55
 */
public class Lianjia_agent extends CommonMongo {
	private static final long serialVersionUID = 1L;
	/* 姓名*/
	private String name;
	/* 编号*/
	private String code;
	/* 城市*/
	private String city;
	/* 头像*/
	private String picture_url;
	/* 门店*/
	private String shop;
	/* 电话*/
	private String telephone;
	/* 标签*/
	private String label;
	/*入职年限 */
	private String years;
	/*个人成绩 */
	private String performance;
	/* 综合评分*/
	private String grade;
	/* 主营板块*/
	private String main_plate;
	/* 重点小区*/
	private String main_community;
	/* 评价星级*/
	private String five_star;
	private String four_star;
	private String three_star;
	private String two_star;
	private String one_star;
	/* 历史成交套数*/
	private String sell_count;
	/* 历史带看*/
	private String see_total;
	/* 历史近30天带看*/
	private String see_month;
	/*总评价数*/
	private String comment_count;
	/* 门店坐标*/
	private String coord;
	
	
	
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public String getComment_count() {
		return comment_count;
	}
	public void setComment_count(String comment_count) {
		this.comment_count = comment_count;
	}
	public String getFive_star() {
		return five_star;
	}
	public void setFive_star(String five_star) {
		this.five_star = five_star;
	}
	public String getFour_star() {
		return four_star;
	}
	public void setFour_star(String four_star) {
		this.four_star = four_star;
	}
	public String getThree_star() {
		return three_star;
	}
	public void setThree_star(String three_star) {
		this.three_star = three_star;
	}
	public String getTwo_star() {
		return two_star;
	}
	public void setTwo_star(String two_star) {
		this.two_star = two_star;
	}
	public String getOne_star() {
		return one_star;
	}
	public void setOne_star(String one_star) {
		this.one_star = one_star;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getSell_count() {
		return sell_count;
	}
	public void setSell_count(String sell_count) {
		this.sell_count = sell_count;
	}
	public String getSee_total() {
		return see_total;
	}
	public void setSee_total(String see_total) {
		this.see_total = see_total;
	}
	public String getSee_month() {
		return see_month;
	}
	public void setSee_month(String see_month) {
		this.see_month = see_month;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture_url() {
		return picture_url;
	}
	public void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMain_plate() {
		return main_plate;
	}
	public void setMain_plate(String main_plate) {
		this.main_plate = main_plate;
	}
	public String getMain_community() {
		return main_community;
	}
	public void setMain_community(String main_community) {
		this.main_community = main_community;
	}
	
	

}
