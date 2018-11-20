package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.ISzplXmDao;
import com.leyoujia.bigdata.entity.spider.SzplXm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SzplXmDao extends AbstractBaseMongoTemplete implements ISzplXmDao {

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.ISzplXmDao#insert(java.util.List)
	 */
	@Override
	public void insert(List<SzplXm> szplXm) {
		mongoTemplate.insertAll(szplXm);		
	}
}
