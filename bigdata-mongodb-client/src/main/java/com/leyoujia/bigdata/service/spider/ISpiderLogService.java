package com.leyoujia.bigdata.service.spider;

import com.leyoujia.bigdata.entity.spider.SpiderLog;

/**
 * @功能描述: 爬虫日志Service
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.spider.ISpiderLogService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月10日 下午8:25:13
 */ 
public interface ISpiderLogService {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月10日 下午8:25:47
	 * @param log
	 */ 
	public void insert(SpiderLog log);
	
	/**  
	 * @功能描述:修改
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年4月10日 下午8:25:47
	 * @param log
	 */ 
	public void update(SpiderLog log);
}
