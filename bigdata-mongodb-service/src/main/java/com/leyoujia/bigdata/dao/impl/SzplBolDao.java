package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.ISzplBolDao;
import com.leyoujia.bigdata.entity.spider.SzplBol;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SzplBolDao extends AbstractBaseMongoTemplete implements ISzplBolDao {

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.ISzplBolDao#insert(java.util.List)
	 */
	@Override
	public void insert(List<SzplBol> list) {
		try {
			mongoTemplate.insertAll(list);
		} catch (Exception e) {
			//若是更新
			if(list!=null){
				for(SzplBol szplBol: list){
					Update update = new Update();
					Query query = Query.query(Criteria.where("_id").is(szplBol.getId()));
					update.set("zone", new String(szplBol.getZone()));
					update.set("name", new String(szplBol.getName()));
					update.set("number", new String(szplBol.getNumber()));
					update.set("company", new String(szplBol.getCompany()));
					update.set("date", new String(szplBol.getDate()));
					mongoTemplate.upsert(query, update, SzplBol.class);
				}
			}
		}
	}
}
