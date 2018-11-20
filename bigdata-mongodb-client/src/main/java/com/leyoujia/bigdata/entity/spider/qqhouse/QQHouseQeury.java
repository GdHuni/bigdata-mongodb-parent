package com.leyoujia.bigdata.entity.spider.qqhouse;

import java.io.Serializable;

/**
 * @功能描述: 房产网查询类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qqhouse.QQHouseQeury.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月21日 上午11:21:55
 */ 
public class QQHouseQeury implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 城市 */
	private String cs;
	/** 统计日期 */
	private String count_date;
	public String getCs() {
		return cs;
	}
	/**  
	 * @功能描述: 设置城市 (深圳-东莞... 腾讯房产网里面的城市
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月21日 上午11:21:05
	 * @param cs
	 */ 
	public void setCs(String cs) {
		this.cs = cs;
	}
	public String getCount_date() {
		return count_date;
	}
	/**  
	 * @功能描述: 设置统计日期
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月21日 上午11:20:55
	 * @param count_date
	 */ 
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
}
