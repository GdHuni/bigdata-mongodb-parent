package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IQQHouseDao;
import com.leyoujia.bigdata.entity.spider.qqhouse.QQHouseQeury;
import com.leyoujia.bigdata.entity.spider.qqhouse.QQ_HOUSE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @功能描述: 实现类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.spider.QQHouseServiceImpl.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月18日 上午11:48:47
 */
@Service
public class QQHouseServiceImpl implements IQQHouseService {
	private static Logger logger = LoggerFactory.getLogger(QQHouseServiceImpl.class);
	@Autowired
	private IQQHouseDao qqHouseDao;
	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IQQHouseService#insert(java.util.List)
	 */
	@Override
	public void insert(List<QQ_HOUSE> list) {
		qqHouseDao.insert(list);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IQQHouseService#query(com.jjshome.bigdata.entity.spider.qqhouse.QQHouseQeury)
	 */
	@Override
	public List<QQ_HOUSE> query(QQHouseQeury obj) {
		return qqHouseDao.query(obj);
	}

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.spider.IQQHouseService#queryByClass(com.jjshome.bigdata.entity.spider.qqhouse.QQHouseQeury, java.lang.String)
	 */
	@Override
	public List<Object> queryByClass(QQHouseQeury obj, String className) {
		List<Object> result = null;
		try {
			result = qqHouseDao.queryByClass(obj, className);
		} catch (ClassNotFoundException e) {
			logger.error("QQHouseServiceImpl@queryByClass:error", e);
		}
		return result;
	}
	@Override
	public void fang_house_insert(List<Object> list) {
		qqHouseDao.fang_house_insert(list);
	}

	@Override
	public long queryFangHouseCountByCity(String city) {
		// TODO Auto-generated method stub
		return qqHouseDao.queryFangHouseCountByCity(city);
	}
}
