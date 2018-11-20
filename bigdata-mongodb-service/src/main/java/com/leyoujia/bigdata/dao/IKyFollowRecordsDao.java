package com.leyoujia.bigdata.dao;


/**
 * @功能描述: 数据库 mongodb仓库科客源跟进记录
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.dao.IKyFollowRecordsDao.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年8月25日 下午4:43:34
 */ 
public interface IKyFollowRecordsDao {
	/**  
	 * @功能描述: 客源跟进数据量查询
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年8月25日 下午4:43:56
	 * @param fhId
	 * @param sDate
	 * @return
	 */ 
	public long query(int fhId, String sDate);
}
