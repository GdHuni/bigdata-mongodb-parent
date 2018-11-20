package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.BIDataMongoTemplete;
import com.leyoujia.bigdata.dao.IKyFollowRecordsDao;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class KyFollowRecordsDao extends BIDataMongoTemplete implements IKyFollowRecordsDao{

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IKyFollowRecordsDao#query(int, java.lang.String)
	 */
	@Override
	public long query(int fhId, String sDate) {
		Query query = Query.query(Criteria.where("FH_ID").is(1968683));
		query.addCriteria(Criteria.where("INSERT_DATE").gte(sDate));
		return mongoTemplate.count(query, "ODS_KY_FOLLOW_RECORDS");
	}
	
}
