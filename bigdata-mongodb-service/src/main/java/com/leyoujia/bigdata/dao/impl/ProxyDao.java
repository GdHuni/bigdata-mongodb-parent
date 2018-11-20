package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IProxyDao;
import com.leyoujia.bigdata.entity.spider.ProxyEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class ProxyDao extends AbstractBaseMongoTemplete implements IProxyDao {
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IProxyDao#insert(com.jjshome.bigdata.entity.spider.ProxyEntity)
	 */
	@Override
	public void insert(ProxyEntity proxyEntity){
		mongoTemplate.insert(proxyEntity);
	}
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IProxyDao#queryOne(com.jjshome.bigdata.entity.spider.ProxyEntity)
	 */
	@Override
	public ProxyEntity queryOne(ProxyEntity proxyEntity){
		Query query = new Query();
		if(StringUtils.isNotEmpty(proxyEntity.getHost())){
			query.addCriteria(new Criteria("host").is(proxyEntity.getHost()));
		}
		if(proxyEntity.isUsed()!=null&&proxyEntity.isUsed()){
			query = new Query();
		}
		return mongoTemplate.findOne(query, ProxyEntity.class);
	}
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IProxyDao#deleteAll()
	 */
	@Override
	public void deleteAll(){
		mongoTemplate.dropCollection(ProxyEntity.class);
	}
}
