package com.leyoujia.bigdata.entity.spider.common;

import java.io.Serializable;

/**
 * @功能描述: mongodb存储公用类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.common.CommonMongo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年11月24日 下午6:12:51
 */ 
public class CommonMongo implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 唯一约束 */
	private String unique_key;

	/** 最新爬取时间 */
	private String update_date;

	/** 数据处理状态 字段存在-则是处理过了  不存在就是未处理*/
	private Integer used;

	public String getUnique_key() {
		return unique_key;
	}

	public void setUnique_key(String unique_key) {
		this.unique_key = unique_key;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}
}
