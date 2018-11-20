package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IQQHouseDao;
import com.leyoujia.bigdata.entity.spider.qqhouse.QQHouseQeury;
import com.leyoujia.bigdata.entity.spider.qqhouse.QQ_HOUSE;
import com.leyoujia.bigdata.entity.spider.qqhouse._FANG_HOUSE;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @功能描述: QQhouse Dao层
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.dao.impl.QQHouseDao.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月18日 上午11:39:29
 */ 
@Service
public class QQHouseDao extends AbstractBaseMongoTemplete implements IQQHouseDao {

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IQQHouseDao#insert(java.util.List)
	 */
	@Override
	public void insert(List<QQ_HOUSE> list) {
		if(list!=null){
			for(QQ_HOUSE obj: list){
				Query query = Query.query(Criteria.where("key").is(obj.getKey()));
				List<QQ_HOUSE> result = mongoTemplate.find(query, QQ_HOUSE.class);
				if(result!=null&&result.size()>0){
					//只统计增量数据
					continue;
					//mongoTemplate.remove(query, QQ_HOUSE.class);
				}
				mongoTemplate.insert(obj);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IQQHouseDao#query(com.jjshome.bigdata.entity.spider.qqhouse.QQHouseQeury)
	 */
	@Override
	public List<QQ_HOUSE> query(QQHouseQeury obj) {
		Query query = Query.query(Criteria.where("cs").is(obj.getCs()));
		if(StringUtils.isNotEmpty(obj.getCount_date())){
			query.addCriteria(Criteria.where("count_date").gt(obj.getCount_date()));
		}
		List<QQ_HOUSE> result = mongoTemplate.find(query, QQ_HOUSE.class);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IQQHouseDao#queryByClass(com.jjshome.bigdata.entity.spider.qqhouse.QQHouseQeury, java.lang.String)
	 */
	@Override
	public List<Object> queryByClass(QQHouseQeury obj, String className) throws ClassNotFoundException {
		Query query = Query.query(Criteria.where("cs").is(obj.getCs()));
		if(StringUtils.isNotEmpty(obj.getCount_date())){
			query.addCriteria(Criteria.where("count_date").gt(obj.getCount_date()));
		}
		@SuppressWarnings("unchecked")
		List<Object> result = (List<Object>) mongoTemplate.find(query, Class.forName(className));
		return result;
	}
	
	@Override
	public void fang_house_insert(List<Object> list) {
		if(list!=null){
			for(Object o: list){
				_FANG_HOUSE tree = (_FANG_HOUSE)o;
				Query query = Query.query(Criteria.where("key").is(tree.getKey()));
				List<_FANG_HOUSE> result = mongoTemplate.find(query, _FANG_HOUSE.class);
				if(result!=null&&result.size()>0){
					tree.setStatus(result.get(0).getStatus());
					mongoTemplate.remove(query, _FANG_HOUSE.class);
				}
				mongoTemplate.insert(tree);
			}
		}
	}

	@Override
	public long queryFangHouseCountByCity(String city) {
		Query query = Query.query(Criteria.where("cs").is(city));
		return mongoTemplate.count(query, _FANG_HOUSE.class);
	}

	@Override
	public void update_status(Object key) {
		Query query = Query.query(Criteria.where("key").is(key));
		List<_FANG_HOUSE> result = mongoTemplate.find(query, _FANG_HOUSE.class);
		mongoTemplate.remove(query, _FANG_HOUSE.class);
		for(_FANG_HOUSE obj: result){
			obj.setStatus(1);
			mongoTemplate.insert(obj);
		}
	}
}
