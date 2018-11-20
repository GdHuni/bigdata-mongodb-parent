package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.spider.test.amazon_product;
import com.leyoujia.bigdata.entity.spider.test.amazon_tree;

import java.util.List;

public interface IAmazonDao {
	public void tree_insert(List<amazon_tree> list);
	public void product_insert(List<amazon_product> list);
	public amazon_tree tree_queryOne(String _id);
	public List<amazon_tree> tree_queryAll();
	public List<amazon_product> product_queryList(amazon_product product);
}
