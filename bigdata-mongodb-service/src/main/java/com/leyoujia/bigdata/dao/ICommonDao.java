package com.leyoujia.bigdata.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.leyoujia.bigdata.entity.spider.common.QuerySpiderVo;

import java.util.List;

public interface ICommonDao {
	public void insert_one(Object object);
	public void insert_oneAll(Object object);
	public void insert_list(List<Object> list);
	public void insert_listAll(List<Object> list);
	public void insert_collection(JSONObject object, String collectionName);
	public void insert_collectionAll(JSONObject object, String collectionName);
	public void insert_collections(JSONArray jsonArray, String collectionName);
	public void insert_collectionsAll(JSONArray jsonArray, String collectionName);
	public Object select_one(Object object);
	public PageInfo<Object> select_list(QuerySpiderVo query);
	public List<?> findByNatural(Class t, int skip, int limit);
	public void update_status(Object object);
	public void update_first(QuerySpiderVo query, JSONObject object, String collectionName);
	public void insert_exclude_queryAndRemove(List<Object> list);
	public void removeObject(JSONObject jsonObject, String collectionName);
	public void removeByQuery(QuerySpiderVo querySpiderVo, String collectionName);
}
