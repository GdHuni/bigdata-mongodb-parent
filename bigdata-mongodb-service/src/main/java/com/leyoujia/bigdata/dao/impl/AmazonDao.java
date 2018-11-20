package com.leyoujia.bigdata.dao.impl;

import com.leyoujia.bigdata.dao.AbstractBaseMongoTemplete;
import com.leyoujia.bigdata.dao.IAmazonDao;
import com.leyoujia.bigdata.entity.spider.test.amazon_product;
import com.leyoujia.bigdata.entity.spider.test.amazon_tree;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonDao extends AbstractBaseMongoTemplete implements IAmazonDao{

	@Override
	public void tree_insert(List<amazon_tree> list) {
		if(list!=null){
			for(amazon_tree tree: list){
				Query query = Query.query(Criteria.where("pname").is(tree.getPname()));
				query.addCriteria(Criteria.where("name").is(tree.getName()));
				List<amazon_tree> result = mongoTemplate.find(query, amazon_tree.class);
				if(result!=null&&result.size()>0){
					mongoTemplate.remove(query, amazon_tree.class);
				}
				mongoTemplate.insert(tree);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.dao.IAmazonDao#product_insert(java.util.List)
	 */
	@Override
	public void product_insert(List<amazon_product> list) {
		if(list!=null){
			Query query = Query.query(Criteria.where("_pid").is(list.get(0).get_pid()));
			query.addCriteria(Criteria.where("_page_key").is(list.get(0).get_page_key()));
			List<amazon_product> result = mongoTemplate.find(query, amazon_product.class);
			if(result!=null&&result.size()>0){
				mongoTemplate.remove(query, amazon_product.class);
			}
			mongoTemplate.insertAll(list);
		}
	}

	@Override
	public amazon_tree tree_queryOne(String _id) {
		Query query = Query.query(Criteria.where("_id").is(_id));
		List<amazon_tree> result = mongoTemplate.find(query, amazon_tree.class);
		if(result!=null&&result.size()>0){
			return result.get(0);
		}
		return null;
	}

	@Override
	public List<amazon_tree> tree_queryAll() {
		return mongoTemplate.findAll(amazon_tree.class);
	}
	
	@Override
	public List<amazon_product> product_queryList(amazon_product product){
		Query query = Query.query(Criteria.where("_pid").is(product.get_pid()));
		query.addCriteria(Criteria.where("_page_key").is(product.get_page_key()));
		List<amazon_product> result = mongoTemplate.find(query, amazon_product.class);
		return result;
	}
}
