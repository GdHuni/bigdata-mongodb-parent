package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IUserIntentionGroupDao;
import com.leyoujia.bigdata.entity.log.User_intention_group;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class UserIntentionGroupDao extends AbstractBaseMongoTemplete implements IUserIntentionGroupDao {

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IUserIntentionGroupDao#queryUIGByIps(java.util.List)
	 */
	@Override
	public User_intention_group queryUIGByIps(List<String> ips, String userId) {
		if(CollectionUtils.isEmpty(ips)) return null;
		User_intention_group result = new User_intention_group();
		List<User_intention_group> query_result = new ArrayList<User_intention_group>();
		Query query = new Query();
		if(ips.size()==1){
			query.addCriteria(Criteria.where("_ip").is(ips.get(0)));
		}else if(ips.size()>1){
			query.addCriteria(Criteria.where("_ip").in(ips));
		}
		if(StringUtils.isNotEmpty(userId)){
			Criteria criteria = new Criteria();
			criteria.orOperator(
					Criteria.where("_user_id").is(null)
					,Criteria.where("_user_id").is("null")
					,Criteria.where("_user_id").is("0")
					,Criteria.where("_user_id").is(userId));
			query.addCriteria(criteria);
		}
		
		/** Edit By OuyangWenbin When 2016年5月26日 下午6:09:11 */
		//只统计近90天数据
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -90);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String _start_date = format.format(calendar.getTime());
		query.addCriteria(Criteria.where("_update_date").gt(_start_date));
		//Edit End
		
		query_result = mongoTemplate.find(query, User_intention_group.class);
		if(query_result!=null){
			for (User_intention_group object : query_result) {
				result.set_USER_INTENTION_GROUP(object);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IUserIntentionGroupDao#queryUIGByUserId(java.lang.String)
	 */
	@Override
	public List<User_intention_group> queryUIGByUserId(String userId) {
		List<User_intention_group> query_result = new ArrayList<User_intention_group>();
		Query query = Query.query(Criteria.where("_user_id").is(userId));
		/** Edit By OuyangWenbin When 2016年5月26日 下午6:09:11 */
		//只统计近90天数据
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -90);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String _start_date = format.format(calendar.getTime());
		query.addCriteria(Criteria.where("_update_date").gt(_start_date));
		//Edit End
		query_result = mongoTemplate.find(query, User_intention_group.class);
		return query_result;
	}
}
