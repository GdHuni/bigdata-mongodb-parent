package com.leyoujia.bigdata.entity.spider.test;

import java.io.Serializable;

/**
 * @功能描述: 亚马逊产品
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.test.amazon_product.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月24日 上午9:21:05
 */ 
public class amazon_product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** key */
	private String _id;
	/** 父产品名称 */
	private String _pname;
	/** 父 ID */
	private String _pid;
	/** PageKey */
	private String _page_key;
	/** 产品名称 */
	private String _name;
	/** 序列号 */
	private String _order;
	/** 产品链接 */
	private String _src_url;
	/** 标题 */
	private String _title;
	/** List Price */
	private String _list_price;
	/** Price */
	private String _price;
	/** customer reviews count */
	private String _customer_reviews_count;
	/** answered questions count */
	private String _answered_questions_count;
	/** 更新时间 */
	private String count_date;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_pid() {
		return _pid;
	}
	public void set_pid(String _pid) {
		this._pid = _pid;
	}
	public String get_order() {
		return _order;
	}
	public void set_order(String _order) {
		this._order = _order;
	}
	public String get_src_url() {
		return _src_url;
	}
	public void set_src_url(String _src_url) {
		this._src_url = _src_url;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_list_price() {
		return _list_price;
	}
	public void set_list_price(String _list_price) {
		this._list_price = _list_price;
	}
	public String get_price() {
		return _price;
	}
	public void set_price(String _price) {
		this._price = _price;
	}
	public String get_customer_reviews_count() {
		return _customer_reviews_count;
	}
	public void set_customer_reviews_count(String _customer_reviews_count) {
		this._customer_reviews_count = _customer_reviews_count;
	}
	public String get_answered_questions_count() {
		return _answered_questions_count;
	}
	public void set_answered_questions_count(String _answered_questions_count) {
		this._answered_questions_count = _answered_questions_count;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
	public String get_pname() {
		return _pname;
	}
	public void set_pname(String _pname) {
		this._pname = _pname;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_page_key() {
		return _page_key;
	}
	public void set_page_key(String _page_key) {
		this._page_key = _page_key;
	}
}
