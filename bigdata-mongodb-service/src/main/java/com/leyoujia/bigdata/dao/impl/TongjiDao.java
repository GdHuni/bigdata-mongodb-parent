package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.ITongjiDao;
import com.leyoujia.bigdata.entity.tongji.BrowseRecord;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TongjiDao extends AbstractBaseMongoTemplete implements ITongjiDao {

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IGuestDao#insert(com.jjshome.bigdata.entity.Guest)
	 */
	 
	
	public List<BrowseRecord> queryBrowseRecord(BrowseRecord brecord) {
		Query query = new Query();
		if (StringUtils.isNotEmpty(brecord.getIp())) { 
			query.addCriteria(Criteria.where("ip").is(brecord.getIp()));
		}
		if (StringUtils.isNotEmpty(brecord.getJjshome_())) {
			query.addCriteria(Criteria.where("jjshome_").is(brecord.getJjshome_()));
		}
		if (StringUtils.isNotEmpty(brecord.getJjsc())) {
			query.addCriteria(Criteria.where("jjsc").is(brecord.getJjsc()));
		}
		List<BrowseRecord> result = mongoTemplate.find(query, BrowseRecord.class);
		
		return result;
	}
}
