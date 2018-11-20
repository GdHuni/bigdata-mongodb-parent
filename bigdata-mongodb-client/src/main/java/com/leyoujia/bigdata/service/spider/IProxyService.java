package com.leyoujia.bigdata.service.spider;

import com.leyoujia.bigdata.entity.spider.ProxyEntity;

public interface IProxyService {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月7日 上午10:54:16
	 * @param proxyEntity
	 */ 
	public void insert(ProxyEntity proxyEntity);
	
	/**  
	 * @功能描述: 获取当前可用的proxy
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月7日 上午10:57:26
	 * @return
	 */ 
	public ProxyEntity queryUsed();
	
	/**  
	 * @功能描述: 判断时候存在 不可用的IP
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月7日 上午10:55:08
	 * @param host
	 * @return
	 */ 
	public boolean queryExists(String host);
	
	public void deleteAll();
}
