package com.leyoujia.bigdata.dao.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.ICommonDao;
import com.leyoujia.bigdata.entity.spider.common.CommonMongo;
import com.leyoujia.bigdata.entity.spider.common.QuerySpiderVo;
import com.leyoujia.bigdata.entity.spider.gtj.Gz_clfy;
import com.leyoujia.sonarplugins.CheckParam;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.apache.commons.lang3.StringUtils;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*import org.bson.Document;*/

@Service
public class CommonDao extends AbstractBaseMongoTemplete implements ICommonDao {
	private static Logger logger = LoggerFactory.getLogger(CommonDao.class);
	private final boolean saveOnLine = "saveOnLine".equals(System.getProperty("bigdata.spidervm"))?true:false;
	@CheckParam(online="http://data.jjshome.com/common/insert-spider-jsonobject")
	private static final String saveUrl1 = "http://data.jjshome.com/common/insert-spider-jsonobject";
	@CheckParam(online="http://data.jjshome.com/common/insert-spider-jsonarray")
	private static final String saveUrl2 = "http://data.jjshome.com/common/insert-spider-jsonarray";
	@CheckParam(online="http://data.jjshome.com/common/insert-spider-collection")
	private static final String saveUrl3 = "http://data.jjshome.com/common/insert-spider-collection";
	@CheckParam(online="http://data.jjshome.com/common/insert-spider-collections")
	private static final String saveUrl4 = "http://data.jjshome.com/common/insert-spider-collections";
	@CheckParam(online="http://data.jjshome.com/common/select-spider-jsonarray")
	private static final String selectUrl1 = "http://data.jjshome.com/common/select-spider-jsonarray";
	@CheckParam(online="http://data.jjshome.com/common/select-spider-jsonobject")
	private static final String selectUrl2 = "http://data.jjshome.com/common/select-spider-jsonobject";
	
	/**本地测试接口**/
	//private static final String saveUrl1 = "http://172.16.5.30:8080/common/insert-spider-jsonobject";
	//private static final String saveUrl2 = "http://172.16.5.30:8080/common/insert-spider-jsonarray";
	//private static final String saveUrl3 = "http://172.16.5.30:8080/common/insert-spider-collection";
	//private static final String saveUrl4 = "http://172.16.5.30:8080/common/insert-spider-collections";
	//private static final String selectUrl1 = "http://172.16.5.30:8080/common/select-spider-jsonarray";
	//private static final String selectUrl2 = "http://172.16.5.30:8080/common/select-spider-jsonobject";
	@CheckParam(online="6a03312c-585b-4449-a7ae-f83dbb7f9409")
	private static String KEY = "6a03312c-585b-4449-a7ae-f83dbb7f9409";
	
	
	private void saveList(List<Object> list,boolean isDistinct){
		try {
			if(list!=null&&list.size()>0){
				Object object = list.get(0);
				URL url = new URL(saveUrl2);
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		        conn.setRequestMethod("POST");
		        conn.addRequestProperty("SAVE-KEY", KEY);
		        conn.setDoOutput(true);
				StringBuffer params = new StringBuffer();
		        // 表单参数与get形式一样 
				//数据json文本
		        params.append("dataJson").append("=").append(URLEncoder.encode(JSONArray.toJSONString(list), "UTF-8")).append("&")
	            .append("className").append("=").append(object.getClass().getName()).append("&").append("isDistinct").append("=").append(isDistinct);
		        byte[] bypes = params.toString().getBytes();
		        conn.getOutputStream().write(bypes);// 输入参数
		        InputStream inStream=conn.getInputStream();
		        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
		        logger.info(br.readLine());
			}
		}catch (Exception e) {
	        logger.error("CommonDao@saveList", e);
		}
	}
	
	
	private void saveOne(Object object,boolean isDistinct){
		try {
			URL url = new URL(saveUrl1);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.addRequestProperty("SAVE-KEY", KEY);
	        conn.setDoOutput(true);
			StringBuffer params = new StringBuffer();
	        // 表单参数与get形式一样 
			//数据json文本
	        params.append("dataJson").append("=").append(URLEncoder.encode(JSONObject.toJSONString(object), "UTF-8")).append("&")
            .append("className").append("=").append(object.getClass().getName()).append("&").append("isDistinct").append("=").append(isDistinct);
	        byte[] bypes = params.toString().getBytes();
	        conn.getOutputStream().write(bypes);// 输入参数
	        InputStream inStream=conn.getInputStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
	        logger.info(br.readLine());
		}catch (Exception e) {
	        logger.error("CommonDao@saveOne", e);
		}
	}
	

	@Override
	public void insert_exclude_queryAndRemove(List<Object> list) {
		if(list!=null){
			mongoTemplate.insertAll(list);
		}
	}

	@Override
	public void insert_one(Object object) {
		if(saveOnLine){
			saveOne(object,true);
			return;
		}
		if(object!=null){
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				if(!mongoTemplate.collectionExists(object.getClass())){
					DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(object.getClass());

                   // MongoCollection<Document> collection = /mongoTemplate.createCollection(object.getClass());
                    dBCollection.createIndex("unique_key");
				}
				CommonMongo queryObj = (CommonMongo) object;
				Query query = Query.query(Criteria.where("unique_key").is(queryObj.getUnique_key()));
				List<Object> result = (List<Object>) mongoTemplate.find(query, object.getClass());
				if(result!=null&&result.size()>0){
					mongoTemplate.remove(query, object.getClass());
				}
				mongoTemplate.insert(object);
			}else if(Gz_clfy.class.isAssignableFrom(object.getClass())){
				Gz_clfy queryObj = (Gz_clfy) object;
				Query query = Query.query(Criteria.where("fybh").is(queryObj.getFybh()));
				List<Gz_clfy> result = (List<Gz_clfy>) mongoTemplate.find(query, object.getClass());
				if(result!=null
						&&result.size()>0
						&&queryObj.getStatus().equals(result.get(0).getStatus())){
					return;
				}
				mongoTemplate.insert(object);
			}else{
				mongoTemplate.insert(object);
			}
		}
	}
	
	@Override
	public void insert_list(List<Object> list) {
		if(saveOnLine){
			saveList(list,true);
			return;
		}
		if(list!=null){
			Object object = list.get(0);
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				if(!mongoTemplate.collectionExists(object.getClass())){
					DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(object.getClass());
					dBCollection.createIndex("unique_key");
				}
				for(Object obj: list){
					CommonMongo queryObj = (CommonMongo) obj;
					Query query = Query.query(Criteria.where("unique_key").is(queryObj.getUnique_key()));
					List<Object> result = (List<Object>) mongoTemplate.find(query, obj.getClass());
					if(result!=null&&result.size()>0){
						mongoTemplate.remove(query, obj.getClass());
					}
					mongoTemplate.insert(obj);
				}
			}else if(Gz_clfy.class.isAssignableFrom(object.getClass())){
				for(Object obj: list){
					Gz_clfy queryObj = (Gz_clfy) obj;
					Query query = Query.query(Criteria.where("fybh").is(queryObj.getFybh()));
					List<Gz_clfy> result = (List<Gz_clfy>) mongoTemplate.find(query, obj.getClass());
					if(result!=null
							&&result.size()>0
							&&queryObj.getStatus().equals(result.get(0).getStatus())){
						continue;
					}
					mongoTemplate.insert(obj);
				}
			}else{
				mongoTemplate.insertAll(list);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.ICommonDao#insert_collection(com.alibaba.fastjson.JSONObject, java.lang.String)
	 */
	@Override
	public void insert_collection(JSONObject object,String collectionName){
		if(saveOnLine){
			saveCollection(object, collectionName,true);
			return;
		}
		//判断表是否存在 不存在 则创建
		if(!mongoTemplate.collectionExists(collectionName)){
			DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(collectionName);
			dBCollection.createIndex("unique_key");
		}
		String update_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		object.put("update_date", update_date);
		String unique_key = object.getString("unique_key");
		if(StringUtils.isNotEmpty(unique_key)){
			Query query = Query.query(Criteria.where("unique_key").is(unique_key));
			if(mongoTemplate.exists(query, collectionName)){
				mongoTemplate.remove(query, collectionName);
			}
		}
		mongoTemplate.insert(object, collectionName);
	}
	
	@Override
	public void insert_collections(JSONArray jsonArray, String collectionName) {
		if(saveOnLine){
			saveCollections(jsonArray, collectionName,true);
			return;
		}
		//判断表是否存在 不存在 则创建
		if(!mongoTemplate.collectionExists(collectionName)){
			DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(collectionName);
			dBCollection.createIndex("unique_key");
		}
		String update_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			object.put("update_date", update_date);
			String unique_key = object.getString("unique_key");
			if(StringUtils.isNotEmpty(unique_key)){
				Query query = Query.query(Criteria.where("unique_key").is(unique_key));
				if(mongoTemplate.exists(query, collectionName)){
					mongoTemplate.remove(query, collectionName);
				}
			}
			mongoTemplate.insert(object, collectionName);
		}
	}
	
	@Override
	public void insert_oneAll(Object object) {
		if(saveOnLine){
			saveOne(object,false);
			return;
		}
		if(object!=null){
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				if(!mongoTemplate.collectionExists(object.getClass())){
					DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(object.getClass());
					dBCollection.createIndex("unique_key");
				}
				mongoTemplate.insert(object);
			}else if(Gz_clfy.class.isAssignableFrom(object.getClass())){
				Gz_clfy queryObj = (Gz_clfy) object;
				mongoTemplate.insert(object);
			}else{
				mongoTemplate.insert(object);
			}
		}
	}
	
	@Override
	public void insert_listAll(List<Object> list) {
		if(saveOnLine){
			saveList(list,false);
			return;
		}
		if(list!=null){
			Object object = list.get(0);
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				if(!mongoTemplate.collectionExists(object.getClass())){
					DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(object.getClass());
					dBCollection.createIndex("unique_key");
				}
				mongoTemplate.insert(list,object.getClass());
			}else if(Gz_clfy.class.isAssignableFrom(object.getClass())){
				for(Object obj: list){
					Gz_clfy queryObj = (Gz_clfy) obj;
					Query query = Query.query(Criteria.where("fybh").is(queryObj.getFybh()));
					List<Gz_clfy> result = (List<Gz_clfy>) mongoTemplate.find(query, obj.getClass());
					if(result!=null
							&&result.size()>0
							&&queryObj.getStatus().equals(result.get(0).getStatus())){
						continue;
					}
					mongoTemplate.insert(obj);
				}
			}else{
				mongoTemplate.insertAll(list);
			}
		}
	}
	
	@Override
	public void insert_collectionAll(JSONObject object, String collectionName) {
		if(saveOnLine){
			saveCollection(object, collectionName,false);
			return;
		}
		//判断表是否存在 不存在 则创建
		if(!mongoTemplate.collectionExists(collectionName)){
			DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(collectionName);
			dBCollection.createIndex("unique_key");
		}
		String update_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		object.put("update_date", update_date);
		mongoTemplate.insert(object, collectionName);
	}
	
	@Override
	public void insert_collectionsAll(JSONArray jsonArray, String collectionName) {
		if(saveOnLine){
			saveCollections(jsonArray, collectionName,false);
			return;
		}
		//判断表是否存在 不存在 则创建
		if(!mongoTemplate.collectionExists(collectionName)){
			DBCollection dBCollection = (DBCollection) mongoTemplate.createCollection(collectionName);
			dBCollection.createIndex("unique_key");
		}
		String update_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		JSONArray _jsonArray = new JSONArray();
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			object.put("update_date", update_date);
			_jsonArray.add(object);
		}
		mongoTemplate.insert(_jsonArray, collectionName);
	}
	
	
	private void saveCollection(JSONObject object,String collectionName,boolean isDistinct){
		try {
			URL url = new URL(saveUrl3);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.addRequestProperty("SAVE-KEY", KEY);
	        conn.setDoOutput(true);
			StringBuffer params = new StringBuffer();
	        // 表单参数与get形式一样 
			//数据json文本
	        params.append("dataJson").append("=").append(URLEncoder.encode(JSONObject.toJSONString(object), "UTF-8")).append("&")
            .append("collectionName").append("=").append(collectionName).append("&").append("isDistinct").append("=").append(isDistinct);
	        byte[] bypes = params.toString().getBytes();
	        conn.getOutputStream().write(bypes);// 输入参数
	        InputStream inStream=conn.getInputStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
	        logger.info(br.readLine());
		}catch (Exception e) {
	        logger.error("CommonDao@saveCollection", e);
		}
	}
	
	
	private void saveCollections(JSONArray jsonArray,String collectionName,boolean isDistinct){
		try {
			URL url = new URL(saveUrl4);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.addRequestProperty("SAVE-KEY", KEY);
	        conn.setDoOutput(true);
			StringBuffer params = new StringBuffer();
	        // 表单参数与get形式一样 
			//数据json文本
	        params.append("dataJson").append("=").append(URLEncoder.encode(JSONArray.toJSONString(jsonArray), "UTF-8")).append("&")
            .append("collectionName").append("=").append(collectionName).append("&").append("isDistinct").append("=").append(isDistinct);
	        byte[] bypes = params.toString().getBytes();
	        conn.getOutputStream().write(bypes);// 输入参数
	        InputStream inStream=conn.getInputStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
	        logger.info(br.readLine());
		}catch (Exception e) {
	        logger.error("CommonDao@saveCollection", e);
		}
	}
	
	@Override
	public Object select_one(Object object) {
		if(saveOnLine){
			return selectOne(object);
		}
		if(object!=null){
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				CommonMongo queryObj = (CommonMongo) object;
				Query query = Query.query(Criteria.where("unique_key").is(queryObj.getUnique_key()));
				List<Object> result = (List<Object>) mongoTemplate.find(query, object.getClass());
				if(result!=null&&result.size()>0){
					return result.get(0);
				}
			}
		}
		return null;
	}
	private Object selectOne(Object object) {
		try {
			URL url = new URL(selectUrl2);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.addRequestProperty("SAVE-KEY", KEY);
	        conn.setDoOutput(true);
			StringBuffer params = new StringBuffer();
	        // 表单参数与get形式一样 
			//数据json文本
	        params.append("dataJson").append("=").append(URLEncoder.encode(JSONObject.toJSONString(object), "UTF-8")).append("&")
            .append("className").append("=").append(object.getClass().getName());
	        byte[] bypes = params.toString().getBytes();
	        conn.getOutputStream().write(bypes);// 输入参数
	        InputStream inStream=conn.getInputStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
	        String text = "";
	        String line = "";
	        while((line = br.readLine()) != null){
	        	text = text + line;
	        }
	        Object goal = JSONObject.parseObject(text).get("goal");
	        return JSONObject.parseObject(JSONObject.toJSONString(goal), object.getClass());
		}catch (Exception e) {
	        logger.error("CommonDao@selectOne", e);
		}
		return null;
		
	}
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.ICommonDao#select_list(com.jjshome.bigdata.entity.spider.common.QuerySpiderVo)
	 */
	@Override
	public PageInfo<Object> select_list(QuerySpiderVo queryVo){
		if(saveOnLine){
			return selectList(queryVo);
		}
		PageInfo<Object> result = new PageInfo<Object>();
		
		if(StringUtils.isNotEmpty(queryVo.getQuery_json())){
			result = byQuery(queryVo);
		}else{
			result = byObject(queryVo);
		}

		return result;
	}

	private PageInfo<Object> selectList(QuerySpiderVo queryVo) {
		try {
				URL url = new URL(selectUrl1);
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		        conn.setRequestMethod("POST");
		        conn.addRequestProperty("SAVE-KEY", KEY);
		        conn.setDoOutput(true);
				StringBuffer params = new StringBuffer();
		        // 表单参数与get形式一样 
				//数据json文本
				Object objectClass = queryVo.getClass_object();
				queryVo.setClass_object(null);
				queryVo.setTotalRecord(Integer.MAX_VALUE-queryVo.getPageSize());
				params.append("objectJson").append("=").append(URLEncoder.encode(JSONObject.toJSONString(objectClass), "UTF-8")).append("&")
	            .append("className").append("=").append(objectClass.getClass().getName()).append("&")
	            .append("queryVo").append("=").append(URLEncoder.encode(JSONObject.toJSONString(queryVo), "UTF-8"));
				
		        byte[] bypes = params.toString().getBytes();
		        conn.getOutputStream().write(bypes);// 输入参数
		        InputStream inStream=conn.getInputStream();
		        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
		        String text = "";
		        String line = "";
		        while((line = br.readLine()) != null){
		        	text = text + line;
		        }
		        JSONObject pagelist = (JSONObject) JSONObject.parseObject(text).get("select_listInfo");
		        JSONArray datalist = pagelist.getJSONArray("list");
		        List<Object> list = (List<Object>) JSONObject.parseArray(JSONArray.toJSONString(datalist), objectClass.getClass());
		        PageInfo<Object> seleInfo = JSONObject.parseObject(JSONObject.toJSONString(pagelist), PageInfo.class);
		        seleInfo.setList(list);
		        return seleInfo;
		}catch (Exception e) {
	        logger.error("CommonDao@selectList", e);
		}
		return null;
	}
	/**  
	 * @功能描述: 通过对象属性查询 （基本简单的）
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年9月23日 下午2:10:32
	 * @return
	 */ 
	private PageInfo<Object> byObject(QuerySpiderVo queryVo){
		PageInfo<Object> result = new PageInfo<Object>();
		Query query = new Query();
		Object object = queryVo.getClass_object();
		List<Criteria> listor = new ArrayList<Criteria>();
		JSONObject jsonObject = (JSONObject) JSONObject.toJSON(object);
		for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
	    	String name = entry.getKey();
	    	Object value = entry.getValue();
	    	if(value!=null&&""!=value){
		    	//判断条件
		        if(name.endsWith("_gt")){
		        	name = name.substring(0, name.length()-3);
		        	query.addCriteria(Criteria.where(name).gt(value));
		        }else if(name.endsWith("_lt")){
		        	name = name.substring(0, name.length()-3);
		        	query.addCriteria(Criteria.where(name).lt(value));
		        }else if(name.endsWith("_gte")){
		        	name = name.substring(0, name.length()-4);
		        	query.addCriteria(Criteria.where(name).gte(value));
		        }else if(name.endsWith("_lte")){
		        	name = name.substring(0, name.length()-4);
		        	query.addCriteria(Criteria.where(name).lte(value));
		        }else if(name.endsWith("_like")){
		        	name = name.substring(0, name.length()-5);
		        	query.addCriteria(Criteria.where(name).regex(""+value));
		        }else if(name.endsWith("_likeor")){
		        	name = name.substring(0, name.length()-7);
		        	String values = value.toString();
	        		String[] vs = values.split(",");
	        		for (String v : vs) {
	        			listor.add(Criteria.where(name).regex(v));
					}
		        }else if(name.equals("order_by_asc")){
	        		query.with(new Sort(Direction.ASC,value.toString()));
		        }else if(name.equals("order_by_desc")){
	        		query.with(new Sort(Direction.DESC,value.toString()));
		        }else{
		        	query.addCriteria(Criteria.where(name).is(value));
		        }
	    	}
        }
		
		if(listor!=null&&listor.size()>0){
			Criteria[] cs = new Criteria[listor.size()];
			int i = 0;
			for (Criteria criteria : listor) {
				cs[i++]=criteria;
			}
			Criteria or = new Criteria();
			or.orOperator(cs);
			query.addCriteria(or);
		}

		long total = mongoTemplate.count(query, object.getClass());
		queryVo.setTotalRecord((int) total);
		query.skip(queryVo.getStart()).limit(queryVo.getPageSize());
		List<Object> datas = (List<Object>) mongoTemplate.find(query, object.getClass());
		result = new PageInfo<Object>(datas, 5, (int) total, queryVo.getPageNo(), queryVo.getPageSize());
		return result;
	}
	/**  
	 * @功能描述: 通过查询体查询 （复杂的）
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年9月23日 下午2:10:39
	 * @return
	 */ 
	private PageInfo<Object> byQuery(QuerySpiderVo queryVo){
		PageInfo<Object> result = new PageInfo<Object>();
		String queryJson = queryVo.getQuery_json();
		DBObject queryObject = JSONObject.parseObject(queryJson, BasicDBObject.class);
		BasicQuery query = new BasicQuery(String.valueOf(queryObject));

		Object object = queryVo.getClass_object();

		/** Edit By OuyangWenbin When 2016年12月8日 下午1:57:17 */
		// 性能问题先关闭排序
		//Edit End
		String sortJson = queryVo.getSort_json();
		DBObject sortObject = JSONObject.parseObject(sortJson, BasicDBObject.class);
		if(sortObject!=null){
			query.setSortObject((Document) sortObject);
		}else{
			JSONObject jsonObject = (JSONObject) JSONObject.toJSON(object);
			for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
		    	String name = entry.getKey();
		    	Object value = entry.getValue();
		    	if(value!=null&&""!=value){
			    	//判断条件
			        if(name.equals("order_by_asc")){
		        		query.with(new Sort(Direction.ASC,value.toString()));
			        }else if(name.equals("order_by_desc")){
		        		query.with(new Sort(Direction.DESC,value.toString()));
			        }
		    	}
	        }
		}
		String collectionName = queryVo.getCollectionName();
		long total = 0L;
		List<Object> datas = null;
		int currentPage = queryVo.getPageNo()-1;
		int pageSize = queryVo.getPageSize();
		query.skip(currentPage*pageSize);
		query.limit(queryVo.getPageSize());
		/*try {
			query.with(new Sort(new Sort.Order(Sort.Direction.DESC, "update_date")));//按更新时间倒叙
		} catch (Exception e) {
		}*/
		if(collectionName==null || StringUtils.isEmpty(collectionName)){
			total = mongoTemplate.count(query, object.getClass());
			datas = (List<Object>) mongoTemplate.find(query, object.getClass());
		}else {
			total = mongoTemplate.count(query, object.getClass(),collectionName);
			datas = (List<Object>) mongoTemplate.find(query, object.getClass(),collectionName);
		}
		queryVo.setTotalRecord((int) total);
		query.skip(queryVo.getStart()).limit(queryVo.getPageSize());
		result = new PageInfo<Object>(datas, 5, (int) total, queryVo.getPageNo(), queryVo.getPageSize());
		return result;
	}
	

	@Override
	public List<?> findByNatural(Class t, int skip, int limit) {
		Query query = new Query();
		query.skip(skip).limit(limit);
		return mongoTemplate.find(query, t);
	}

	@Override
	public void update_status(Object object) {
		if(object != null){
			if(CommonMongo.class.isAssignableFrom(object.getClass())){
				CommonMongo queryObj = (CommonMongo) object;
				Query query = Query.query(Criteria.where("unique_key").is(queryObj.getUnique_key()));
				List<Object> result = (List<Object>) mongoTemplate.find(query, object.getClass());
				mongoTemplate.remove(query, object.getClass());
				if(result != null && result.size() > 0){
					for(Object obj: result){
						CommonMongo updObj = (CommonMongo)obj;
						updObj.setUsed(1);
						mongoTemplate.insert(updObj);
					}
				}
			}
		}
	}

	/**
	 * 更新
	 */
	@Override
	public void update_first(QuerySpiderVo queryVo, JSONObject object,String collectionName) {
		try {
			String queryJson = queryVo.getQuery_json();
			DBObject queryObject = JSONObject.parseObject(queryJson, BasicDBObject.class);
			BasicQuery query = new BasicQuery(String.valueOf(queryObject));

			Update update = new Update();
			String update_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			update.set("update_time", update_time);
			for (Map.Entry<String, Object> entry : object.entrySet()) {
				update.set(entry.getKey(), entry.getValue());
			}
			mongoTemplate.updateFirst(query, update, collectionName);
			
		} catch (Exception e) {
			logger.error("CommonDao@update_first", e);
		}
		
	}
	
	
	@Override
	public void removeObject(JSONObject jsonObject, String collectionName) {
		try {
			DBObject queryObject = JSONObject.parseObject(JSONObject.toJSONString(jsonObject), BasicDBObject.class);
			mongoTemplate.remove(queryObject, collectionName);
		} catch (Exception e) {
			logger.error("CommonDao@removeObject", e);
		}
	}
	
	
	@Override
	public void removeByQuery(QuerySpiderVo queryVo, String collectionName) {
		try {
			String queryJson = queryVo.getQuery_json();
			if(!StringUtils.isBlank(queryJson)){
				DBObject queryObject = JSONObject.parseObject(queryJson, BasicDBObject.class);
				BasicQuery query = new BasicQuery(String.valueOf(queryObject));
				mongoTemplate.remove(query, collectionName);
			}
		} catch (Exception e) {
			logger.error("CommonDao@removeByQuery", e);
		}
	}
	
	
}
