package com.leyoujia.bigdata.entity.spider.gtj.zs;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:中山土地成交 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.zs._ZS_Land_cj.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年7月11日 下午4:01:35
 */
public class _ZS_Land_cj  extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String number;//土地编号
	private String area;
	private String use;
	private String address;
	private String bidding_way;//竞价方式
	private String deal_total_price;
	private String deal_average_price;
	private String area_for_talents;
	private String competitive_person;
	private String result;
	private String deal_date;
	private String age_limit;
	private String plot_ratio;
	private String green_ratio;
	private String building_density;
	private String max_headroom;
	private String investment_intensity;//投资强度
	private String cash_deposit;//保证金
	private String evaluate_records;//估价备案号
	private String raise_price;//加价
	private String start_date;
	private String end_date;
	private String remark;//备注
	private String level;//是否整平
	private String infrastructure;//基础设施
	private String starting_total_price;
	
	
	public String getStarting_total_price() {
		return starting_total_price;
	}
	public void setStarting_total_price(String starting_total_price) {
		this.starting_total_price = starting_total_price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBidding_way() {
		return bidding_way;
	}
	public void setBidding_way(String bidding_way) {
		this.bidding_way = bidding_way;
	}
	
	

	public String getDeal_total_price() {
		return deal_total_price;
	}
	public void setDeal_total_price(String deal_total_price) {
		this.deal_total_price = deal_total_price;
	}
	public String getDeal_average_price() {
		return deal_average_price;
	}
	public void setDeal_average_price(String deal_average_price) {
		this.deal_average_price = deal_average_price;
	}
	public String getArea_for_talents() {
		return area_for_talents;
	}
	public void setArea_for_talents(String area_for_talents) {
		this.area_for_talents = area_for_talents;
	}
	public String getCompetitive_person() {
		return competitive_person;
	}
	public void setCompetitive_person(String competitive_person) {
		this.competitive_person = competitive_person;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDeal_date() {
		return deal_date;
	}
	public void setDeal_date(String deal_date) {
		this.deal_date = deal_date;
	}
	public String getAge_limit() {
		return age_limit;
	}
	public void setAge_limit(String age_limit) {
		this.age_limit = age_limit;
	}
	public String getPlot_ratio() {
		return plot_ratio;
	}
	public void setPlot_ratio(String plot_ratio) {
		this.plot_ratio = plot_ratio;
	}
	public String getGreen_ratio() {
		return green_ratio;
	}
	public void setGreen_ratio(String green_ratio) {
		this.green_ratio = green_ratio;
	}
	public String getBuilding_density() {
		return building_density;
	}
	public void setBuilding_density(String building_density) {
		this.building_density = building_density;
	}
	public String getMax_headroom() {
		return max_headroom;
	}
	public void setMax_headroom(String max_headroom) {
		this.max_headroom = max_headroom;
	}
	public String getInvestment_intensity() {
		return investment_intensity;
	}
	public void setInvestment_intensity(String investment_intensity) {
		this.investment_intensity = investment_intensity;
	}
	public String getCash_deposit() {
		return cash_deposit;
	}
	public void setCash_deposit(String cash_deposit) {
		this.cash_deposit = cash_deposit;
	}
	public String getEvaluate_records() {
		return evaluate_records;
	}
	public void setEvaluate_records(String evaluate_records) {
		this.evaluate_records = evaluate_records;
	}
	public String getRaise_price() {
		return raise_price;
	}
	public void setRaise_price(String raise_price) {
		this.raise_price = raise_price;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(String infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	

}
