package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IFangLpDicDao;
import com.leyoujia.bigdata.entity.spider.LpDic;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FangDicDao extends AbstractBaseMongoTemplete implements IFangLpDicDao {

	@Override
	public void insert(List<LpDic> lpDics) {
		if(lpDics!=null){
			for(LpDic lpDic: lpDics){
				Update update = new Update();
				Query query = Query.query(Criteria.where("name").is(lpDic.getName()));
				List<LpDic> result = mongoTemplate.find(query, LpDic.class);
				if(result!=null&&result.size()>0){
					update.set("name", new String(lpDic.getName()));
					mongoTemplate.upsert(query, update, LpDic.class);
				}else{
					mongoTemplate.insert(lpDic);
				}
			}
		}
	}

	@Override
	public void update(List<LpDic> list) {
		if(list!=null){
			for(LpDic lpDic: list){
				Update update = new Update();
				Query query = Query.query(Criteria.where("name").is(lpDic.getName()));
				update.set("name", new String(lpDic.getName()));
				mongoTemplate.upsert(query, update, LpDic.class);
			}
		}
	}
}
