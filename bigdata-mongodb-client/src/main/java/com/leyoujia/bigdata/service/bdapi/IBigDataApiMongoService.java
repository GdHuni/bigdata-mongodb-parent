package com.leyoujia.bigdata.service.bdapi;


/**
 * @功能描述: 
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.bdapi.IBigDataApiMongoService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年8月25日 下午4:47:34
 */ 
public interface IBigDataApiMongoService {
	/**  
	 * @功能描述: 根据房号ID查询近15天的跟进数量
	 * @使用对象: 二手房
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年8月25日 下午4:45:29
	 * @param fhId
	 * @return
	 */ 
	public long queryFollowCountByFhId(int fhId);
}
