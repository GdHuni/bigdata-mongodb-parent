package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IGuestDao;
import com.leyoujia.bigdata.entity.Guest;
import com.leyoujia.bigdata.entity._IP_TAOBAO_OBJECT;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestDao extends AbstractBaseMongoTemplete implements IGuestDao {
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IGuestDao#insert(com.jjshome.bigdata.entity.Guest)
	 */
	@Override
	public void insert(Guest guest) {
		mongoTemplate.insert(guest);
	}

	@Override
	public void insertIpAddr(_IP_TAOBAO_OBJECT object) {
		Query query = Query.query(Criteria.where("ip").is(object.getIp()));
		List<_IP_TAOBAO_OBJECT> result = mongoTemplate.find(query, _IP_TAOBAO_OBJECT.class);
		if(result!=null&&result.size()>0){
			mongoTemplate.remove(query, _IP_TAOBAO_OBJECT.class);
		}
		mongoTemplate.insert(object);
	}
	
	public List<_IP_TAOBAO_OBJECT> queryIpAddr(_IP_TAOBAO_OBJECT object) {
		Query query = Query.query(Criteria.where("ip").is(object.getIp()));
		List<_IP_TAOBAO_OBJECT> result = mongoTemplate.find(query, _IP_TAOBAO_OBJECT.class);
		
		return result;
	}
}
