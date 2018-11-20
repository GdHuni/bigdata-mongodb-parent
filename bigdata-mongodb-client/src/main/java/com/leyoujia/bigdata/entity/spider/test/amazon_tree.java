package com.leyoujia.bigdata.entity.spider.test;

import java.io.Serializable;

/**
 * @功能描述: 亚马逊 商品树
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.test.amazon_tree.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月22日 下午8:38:33
 */ 
public class amazon_tree implements Serializable{
	private static final long serialVersionUID = 1L;
	/** KEY */
	private String _id;
	/** 父名称 */
	private String pname;
	/** 名称 */
	private String name;
	/** URL */
	private String url;
	/** 统计日期 */
	private String count_date;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
}
