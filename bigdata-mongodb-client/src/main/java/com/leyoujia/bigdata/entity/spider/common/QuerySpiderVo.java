package com.leyoujia.bigdata.entity.spider.common;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * @功能描述: mongodb爬虫模块公用查询对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.common.QuerySpiderVo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年9月13日 下午5:17:49
 */ 
public class QuerySpiderVo extends BaseQueryBean {
	private static final long serialVersionUID = 1L;
	/** 需要查询的对象 */
	private Object class_object;
	/** mongodb查询对象 */
	private String query_json;
	private String sort_json;
	/** JsonObject对象集合名称*/
	private String collectionName;
	public QuerySpiderVo(){
	}
	public QuerySpiderVo(Object object){
		this.class_object = object;
	}
	public Object getClass_object() {
		return class_object;
	}
	public void setClass_object(Object class_object) {
		this.class_object = class_object;
	}
	public String getQuery_json() {
		return query_json;
	}
	public void setQuery_json(String query_json) {
		this.query_json = query_json;
	}
	public String getSort_json() {
		return sort_json;
	}
	public void setSort_json(String sort_json) {
		this.sort_json = sort_json;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	
}