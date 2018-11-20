package com.leyoujia.bigdata.entity.spider.common;

import java.io.Serializable;

/**
 * @功能描述: 房产数据图片
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.common.HOUSE_IMG.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月17日 下午5:47:28
 */ 
public class HOUSE_IMG implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 图片key type_id */
	private String key;
	/** 图片类别 */
	private String type;
	/** 图片路径 */
	private String url;
	/** 统计时间 */
	private String count_date;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
}
