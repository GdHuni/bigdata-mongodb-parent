package com.leyoujia.bigdata.entity.spider.gtj.zs;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述:中山土地 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.zs._ZS_Land.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年7月11日 下午3:36:07
 */
public class _ZS_Land_notice extends CommonMongo {
	private static final long serialVersionUID = 1L;
	private String number;//土地编号
	private String area;
	private String use;
	private String address;
	private String bidding_way;//竞价方式
	private String starting_total_price;
	private String starting_average_price;
	private String notice_date;
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
	public String getStarting_total_price() {
		return starting_total_price;
	}
	public void setStarting_total_price(String starting_total_price) {
		this.starting_total_price = starting_total_price;
	}
	public String getStarting_average_price() {
		return starting_average_price;
	}
	public void setStarting_average_price(String starting_average_price) {
		this.starting_average_price = starting_average_price;
	}


	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
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
	
	
	
}
