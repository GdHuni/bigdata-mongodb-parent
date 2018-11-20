package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IProxyDao;
import com.leyoujia.bigdata.entity.spider.ProxyEntity;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProxyServiceImpl implements IProxyService {

	@Autowired
	private IProxyDao proxyDao;
	
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IProxyService#insert(com.jjshome.bigdata.entity.spider.ProxyEntity)
	 */
	@Override
	public void insert(ProxyEntity proxyEntity) {
		proxyDao.insert(proxyEntity);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IProxyService#queryUsed()
	 */
	@Override
	public ProxyEntity queryUsed() {
		ProxyEntity proxyEntity = new ProxyEntity();
		proxyEntity.setUsed(true);
		return proxyDao.queryOne(proxyEntity);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IProxyService#queryExists(java.lang.String)
	 */
	@Override
	public boolean queryExists(String host) {
		ProxyEntity proxyEntity = new ProxyEntity();
		proxyEntity.setHost(host);
		ProxyEntity proxy = proxyDao.queryOne(proxyEntity);
		return proxy!=null;
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IProxyService#deleteAll()
	 */
	@Override
	public void deleteAll(){
		proxyDao.deleteAll();
	}
}
