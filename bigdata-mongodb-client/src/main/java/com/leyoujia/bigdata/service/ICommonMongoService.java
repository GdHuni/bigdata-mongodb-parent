package com.leyoujia.bigdata.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.leyoujia.bigdata.entity.spider.common.CommonMongo;
import com.leyoujia.bigdata.entity.spider.common.QuerySpiderVo;
import com.leyoujia.bigdata.entity.spider.test.amazon_product;
import com.leyoujia.bigdata.entity.spider.test.amazon_tree;

import java.util.List;

/**
 * @功能描述: mongodb公用接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.ICommonMongoService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月22日 下午9:19:43
 */ 
public interface ICommonMongoService {
	public void amazon_tree_insert(List<amazon_tree> list);
	public void amazon_product_insert(List<amazon_product> list);
	public amazon_tree amazon_tree_queryOne(String _id);
	public List<amazon_tree> amazon_tree_queryAll();
	public List<amazon_product> amazon_product_queryList(amazon_product product);
	/**  
	 * @功能描述: 对象储存<br><b><font color="red">调用此方案，你需要将你存储object对象类丢在mongoDB服务中</font></b>
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年8月19日 上午11:01:05
	 * @param object
	 */ 
	public void insert_objeck(Object object);
	
	/**
	 * @功能描述: 全量插入
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2017年12月14日 上午11:29:54
	 * @param object
	 */
	public void insert_objeckAll(Object object);
	/**  
	 * @功能描述: 对象储存<br><b><font color="red">调用此方案，你需要将你存储object对象类丢在mongoDB服务中</font></b>
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年8月19日 上午11:03:02
	 * @param list
	 */ 
	public void insert_list(List<Object> list);
	
	/**
	 * 
	 * @功能描述: 全量插入
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2017年12月14日 上午11:30:18
	 * @param list
	 */
	public void insert_listAll(List<Object> list);
	
	/**  
	 * @功能描述: 根据表名，存储json对象
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
	 * @创建日期: 2017年6月8日 下午2:26:18
	 * @param object
	 * @param collectionName
	 */ 
	public void insert_collection(JSONObject object, String collectionName);

	/**
	 *
	 * @功能描述:根据表名，存储json对象，全量插入
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2017年12月14日 上午11:30:26
	 * @param object
	 * @param collectionName
	 */
	public void insert_collectionAll(JSONObject object, String collectionName);

	/**
	 * @功能描述: 根据表名，存储jsonArray对象
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2018年1月3日 下午4:42:05
	 * @param jsonArray
	 * @param collectionName
	 */
	public void insert_collections(JSONArray jsonArray, String collectionName);

	/**
	 *
	 * @功能描述:根据表名，存储jsonArray对象，全量插入
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2017年12月14日 上午11:30:35
	 * @param jsonArray
	 * @param collectionName
	 */
	public void insert_collectionsAll(JSONArray jsonArray, String collectionName);

	/**
	 * @功能描述: 对象储存<br><b><font color="red">调用此方案，你需要将你存储object对象类丢在mongoDB服务中,不做query和remove操作</font></b>
	 * @创建作者: 张丽洪
	 * @创建日期: 2017年1月16日 10:47:56
	 * @param list
	 */
	public void insert_exclude_queryAndRemove(List<Object> list);


	/**
	 * @功能描述: 根据ID查询对应的对象
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年7月6日 下午6:36:38
	 * @param object
	 * @return
	 */
	public Object select_one(Object object);

	/**
	 * @功能描述: 通用列表查 PS:范围查询使用特殊后缀属性 例如<br>update_date_gt(大于)<br>update_date_lt(小于)<br>以及gte、lte
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年9月13日 下午4:42:10
	 * @param object
	 * @return
	 */
	public PageInfo<?> select_list(QuerySpiderVo query);

	/**
	 * @功能描述: 查询list根据natural排序
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月10日 下午4:42:39
	 * @param t
	 * @param skip
	 * @param limit
	 * @return
	 */
	public List<?> findByNatural(Class t, int skip, int limit);

	/**
	 * @功能描述: 针对QQ_HOUSE表更新数据处理状态(修改的字段为 {@link HouseBase})
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月12日 下午3:16:07
	 * @param key
	 */
	public void update_status(Object key);

	/**
	 * @功能描述: 针对 CommonMongo 对象更新其 used 字段为已使用， 必须有主键　unique_key
	 * @创建作者: 陈彦昊
	 * @创建日期: 2016年11月04日 下午3:16:07
	 * @param object
	 */
	public void update_status_by_key(CommonMongo object);

	/**
	 *
	 * @功能描述:http请求更新操作
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2018年2月10日 上午11:26:59
	 * @param query
	 * @param object
	 * @param collectionName
	 */
	public void update_first(QuerySpiderVo query, JSONObject object, String collectionName);
	
	/**
	 * 
	 * @功能描述: 删除一条数据
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2018年4月23日 上午11:59:20
	 * @param jsonObject
	 * @param collectionName
	 */
	public void removeObject(JSONObject jsonObject, String collectionName);
	
	/**
	 * 
	 * @功能描述: 按条件删除
	 * @使用对象:
	 * @接口版本: 1.1.3
	 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
	 * @创建日期: 2018年4月23日 上午11:59:24
	 * @param query
	 * @param collectionName
	 */
	public void removeByQuery(QuerySpiderVo query, String collectionName);
}
