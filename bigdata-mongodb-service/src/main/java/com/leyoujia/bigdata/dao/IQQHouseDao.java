package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.spider.qqhouse.QQHouseQeury;
import com.leyoujia.bigdata.entity.spider.qqhouse.QQ_HOUSE;

import java.util.List;

/**
 * @功能描述: QQDAO
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.dao.IQQHouseDao.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月18日 上午11:40:23
 */ 
public interface IQQHouseDao {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月18日 上午11:47:05
	 * @param list
	 */ 
	public void insert(List<QQ_HOUSE> list);
	
	/**  
	 * @功能描述: 针对QQ_HOUSE表更新数据处理状态
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月12日 下午3:16:07
	 * @param key
	 */ 
	public void update_status(Object key);
	/**  
	 * @功能描述: 查询
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月21日 上午11:26:02
	 * @param obj
	 * @return
	 */ 
	public List<QQ_HOUSE> query(QQHouseQeury obj);

	/**  
	 * @功能描述: 根据类名查询
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月21日 上午11:23:38
	 * @param QQHouseQeury cs-count_date
	 * @return
	 */ 
	public List<Object> queryByClass(QQHouseQeury obj, String className) throws ClassNotFoundException;
	public void fang_house_insert(List<Object> list);
	
	
	/**
	 * 
	* @author ytc@jjshome.com  
	* @date 2015年12月16日 下午3:08:12 
	* @Title: queryFangHouseCountByCity 
	* @Description: TODO
	* @param @param city
	* @param @return
	* @return int
	* @throws
	 */
	public long queryFangHouseCountByCity(String city);
}
