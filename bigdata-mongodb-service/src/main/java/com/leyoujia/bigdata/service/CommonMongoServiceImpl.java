package com.leyoujia.bigdata.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.leyoujia.bigdata.dao.IAmazonDao;
import com.leyoujia.bigdata.dao.ICommonDao;
import com.leyoujia.bigdata.dao.IQQHouseDao;
import com.leyoujia.bigdata.entity.spider.common.CommonMongo;
import com.leyoujia.bigdata.entity.spider.common.QuerySpiderVo;
import com.leyoujia.bigdata.entity.spider.test.amazon_product;
import com.leyoujia.bigdata.entity.spider.test.amazon_tree;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service()
public class  CommonMongoServiceImpl implements ICommonMongoService {

	@Autowired
	private IAmazonDao amazonDao;
	@Autowired
	private ICommonDao commonDao;
	@Autowired
	private IQQHouseDao qqHouseDao;
	@Override
	public void amazon_tree_insert(List<amazon_tree> tree) {
		amazonDao.tree_insert(tree);
	}

	@Override
	public amazon_tree amazon_tree_queryOne(String _id) {
		return amazonDao.tree_queryOne(_id);
	}

	@Override
	public void amazon_product_insert(List<amazon_product> list) {
		amazonDao.product_insert(list);
	}

	@Override
	public List<amazon_tree> amazon_tree_queryAll() {
		return amazonDao.tree_queryAll();
	}

	@Override
	public List<amazon_product> amazon_product_queryList(amazon_product product) {
		return amazonDao.product_queryList(product);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.ICommonMongoService#insert_objeck(java.lang.Object)
	 */
	@Override
	public void insert_objeck(Object object){
		if(object!=null)
			commonDao.insert_one(object);
	}

	@Override
	public void insert_objeckAll(Object object) {
		if(object!=null)
			commonDao.insert_oneAll(object);
		
	}
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.ICommonMongoService#insert_list(java.util.List)
	 */
	@Override
	public void insert_list(List<Object> list){
		if(list!=null&&list.size()>0)
			commonDao.insert_list(list);
	}
	
	@Override
	public void insert_listAll(List<Object> list) {
		if(list!=null&&list.size()>0)
			commonDao.insert_listAll(list);
		
	}
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.ICommonMongoService#insert_collection(com.alibaba.fastjson.JSONObject, java.lang.String)
	 */
	@Override
	public void insert_collection(JSONObject object,String collectionName){
		if(object!=null && StringUtils.isNotEmpty(collectionName))
			commonDao.insert_collection(object, collectionName);
	}

	@Override
	public void insert_collectionAll(JSONObject object, String collectionName ) {
		if(object!=null && StringUtils.isNotEmpty(collectionName))
			commonDao.insert_collectionAll(object, collectionName);
		
	}
	
	@Override
	public void insert_collections(JSONArray jsonArray, String collectionName) {
		if(jsonArray!=null && StringUtils.isNotEmpty(collectionName))
			commonDao.insert_collections(jsonArray, collectionName);
	}
	
	@Override
	public void insert_collectionsAll(JSONArray jsonArray, String collectionName ) {
		if(jsonArray!=null && StringUtils.isNotEmpty(collectionName))
			commonDao.insert_collectionsAll(jsonArray, collectionName);
		
	}
	
	@Override
	public void insert_exclude_queryAndRemove(List<Object> list) {
		if(list!=null&&list.size()>0)
			commonDao.insert_exclude_queryAndRemove(list);
	}

	/* (non-Javadoc)
         * @see com.jjshome.bigdata.service.ICommonMongoService#findByNatural(java.lang.Class, int, int)
         */
	@Override
	public List<?> findByNatural(Class t, int skip, int limit) {
		return commonDao.findByNatural(t, skip, limit);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.ICommonMongoService#select_one(java.lang.Object)
	 */
	@Override
	public Object select_one(Object object) {
		return commonDao.select_one(object);
	}
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.ICommonMongoService#select_list(com.jjshome.bigdata.entity.spider.common.QuerySpiderVo)
	 */
	@Override
	public PageInfo<?> select_list(QuerySpiderVo query){
		PageInfo<Object> result = new PageInfo<Object>();
		
		if(query.getClass_object()==null) return result;
		
		try {
			result = commonDao.select_list(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update_status(Object key) {
		try {
			qqHouseDao.update_status(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update_status_by_key(CommonMongo object) {
		try {
			commonDao.update_status(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update_first(QuerySpiderVo query, JSONObject object,
			String collectionName) {
		commonDao.update_first(query, object, collectionName);
	}
	
	@Override
	public void removeObject(JSONObject jsonObject, String collectionName) {
		commonDao.removeObject(jsonObject, collectionName);
	}

	@Override
	public void removeByQuery(QuerySpiderVo query, String collectionName) {
		commonDao.removeByQuery(query, collectionName);
	}
	
	

}
