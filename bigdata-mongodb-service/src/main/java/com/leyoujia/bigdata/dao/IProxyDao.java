package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.spider.ProxyEntity;

public interface IProxyDao {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月24日 下午5:59:00
	 * @param guest
	 */ 
	public void insert(ProxyEntity proxyEntity);
	
	/**  
	 * @功能描述: 查询
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月7日 上午11:01:26
	 * @param proxyEntity
	 * @return
	 */ 
	public ProxyEntity queryOne(ProxyEntity proxyEntity);
	
	public void deleteAll();
}
