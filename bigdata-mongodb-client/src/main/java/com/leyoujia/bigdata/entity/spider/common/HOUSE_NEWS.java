package com.leyoujia.bigdata.entity.spider.common;

import java.io.Serializable;

/**
 * @功能描述: 房产关联新闻
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.common.HOUSE_NEW.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月17日 下午5:50:13
 */ 
public class HOUSE_NEWS implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 图片key type_id */
	private String key;
	/** 标题 */
	private String title;
	/** 新闻时间 */
	private String news_date;
	/** 新闻类容 */
	private String news_text;
	/** 新闻往外链接 */
	private String news_url;
	/** 统计时间 */
	private String count_date;
	/** 作者 */
	private String author;

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNews_date() {
		return news_date;
	}
	public void setNews_date(String news_date) {
		this.news_date = news_date;
	}
	public String getNews_text() {
		return news_text;
	}
	public void setNews_text(String news_text) {
		this.news_text = news_text;
	}
	public String getNews_url() {
		return news_url;
	}
	public void setNews_url(String news_url) {
		this.news_url = news_url;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
