package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.spider.LpDic;

import java.util.List;

public interface IFangLpDicDao {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月13日 下午3:29:27
	 * @param list
	 */ 
	public void insert(List<LpDic> list);
	/**  
	 * @功能描述: 更新
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月13日 下午3:29:27
	 * @param list
	 */ 
	public void update(List<LpDic> list);
}
