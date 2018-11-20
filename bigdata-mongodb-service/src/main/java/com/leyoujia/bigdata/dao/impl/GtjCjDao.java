package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IGtjCjDao;
import com.leyoujia.bigdata.entity.spider.gtj.CJ_DAY;
import com.leyoujia.bigdata.entity.spider.gtj.CJ_MONTH;
import com.leyoujia.bigdata.entity.spider.gtj._CJ_PM;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 日成交记录Dao实现
 * @author xyy
 * @date 2015-07-18
 *
 */
@Service
public class GtjCjDao extends AbstractBaseMongoTemplete implements IGtjCjDao {
	/*
	 * (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IGtjCjDao#insertCjDay(java.util.List)
	 */
	@Override
	public void insertCjDay(List<CJ_DAY> list) {
		if (list != null) {
			CJ_DAY cjDay = list.get(0); // 如果之前已经爬取过一次，不再进行更新
			// 判重 城市cj_city成交日期cj_date成交类型cj_date
			Query query = Query.query(Criteria.where("cj_city").is(
					cjDay.getCj_city()));
			query.addCriteria(Criteria.where("cj_date").is(cjDay.getCj_date()));
			query.addCriteria(Criteria.where("cj_type").is(cjDay.getCj_type()));
			query.addCriteria(Criteria.where("cj_place").is(cjDay.getCj_place()));
			List<CJ_DAY> result = mongoTemplate.find(query, CJ_DAY.class);
			if (result != null&&result.size()>0)
				return;
			mongoTemplate.insertAll(list);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IGtjCjDao#insertCjMonth(java.util.List)
	 */
	@Override
	public void insertCjMonth(List<CJ_MONTH> list) {
		if (list != null) {
			CJ_MONTH cjMonth = list.get(0); // 如果之前已经爬取过一次，不再进行更新
			// 判重 城市cj_city成交日期cj_date成交类型cj_date
			Query query = Query.query(Criteria.where("cj_city").is(
					cjMonth.getCj_city()));
			query.addCriteria(Criteria.where("cj_month").is(cjMonth.getCj_month()));
			query.addCriteria(Criteria.where("cj_type").is(cjMonth.getCj_type()));
			query.addCriteria(Criteria.where("cj_place").is(cjMonth.getCj_place()));
			List<CJ_MONTH> result = mongoTemplate.find(query, CJ_MONTH.class);
			if (result != null&&result.size()>0)
				return;
			mongoTemplate.insertAll(list);
		}
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IGtjCjDao#insertCjGsPm(java.util.List)
	 */
	@Override
	public void insertCjGsPm(List<_CJ_PM> list) {
		if (list != null) {
			_CJ_PM cjpm = list.get(0); 
			// 如果之前已经爬取过一次，不再进行更新
			Query query = Query.query(Criteria.where("cj_city").is(cjpm.getCj_city()));
			query.addCriteria(Criteria.where("cj_place").is(cjpm.getCj_place()));
			query.addCriteria(Criteria.where("cj_date").is(cjpm.getCj_date()));
			List<_CJ_PM> result = mongoTemplate.find(query, _CJ_PM.class);
			if (result != null&&result.size()>0)
				return;
			mongoTemplate.insertAll(list);
		}
	}
}
