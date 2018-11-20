package com.leyoujia.bigdata.service.spider;

import com.leyoujia.bigdata.entity.spider.LpDic;

import java.util.List;

/**
 * @功能描述: 搜房网爬虫接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.spider.IFangService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月13日 下午4:01:57
 */ 
public interface IFangService {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月13日 下午3:29:27
	 * @param list
	 */ 
	public void insertLpDic(List<LpDic> list);
	/**  
	 * @功能描述: 更新
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月13日 下午3:29:27
	 * @param list
	 */ 
	public void updateLpDic(List<LpDic> list);
}
