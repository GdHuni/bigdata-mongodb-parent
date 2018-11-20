package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.log.User_intention_group;

import java.util.List;


/**
 * @功能描述: 客户意向10MIN表数据接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.dao.IUserIntentionGroupDao.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月18日 下午3:54:38
 */ 
public interface IUserIntentionGroupDao {
	
	/**  
	 * @功能描述: 根据IP查询列表
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月18日 下午4:01:01
	 * @param ip
	 * @return
	 */ 
	public User_intention_group queryUIGByIps(List<String> ips, String userId);
	
	/**  
	 * @功能描述: 根据userid查询列表
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月18日 下午4:01:14
	 * @param userId
	 * @return
	 */ 
	public List<User_intention_group> queryUIGByUserId(String userId);
}
