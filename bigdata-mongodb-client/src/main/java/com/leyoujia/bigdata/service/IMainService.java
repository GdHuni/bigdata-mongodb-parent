package com.leyoujia.bigdata.service;

import com.leyoujia.bigdata.entity.Guest;
import com.leyoujia.bigdata.entity.TestEndtity;
import com.leyoujia.bigdata.entity._IP_TAOBAO_OBJECT;
import com.leyoujia.bigdata.entity.tongji.BrowseRecord;

import java.util.List;

/**
 * @功能描述: 模板
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.funds.service.IMainService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年3月13日 下午5:58:44
 */ 
public interface IMainService {

	/**  
	 * @功能描述: 模板
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月13日 下午5:58:47
	 * @param testEndtity
	 */ 
	public void addTest(TestEndtity testEndtity);

	/**  
	 * @功能描述: 新增访问者
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月24日 下午3:32:35
	 * @param guest
	 */ 
	public void addGuest(Guest guest);
	
	/**  
	 * @功能描述: 新增IP库
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月24日 下午3:32:35
	 * @param guest
	 */ 
	public void addTaobaoIpAddr(_IP_TAOBAO_OBJECT object);
	
	public List<_IP_TAOBAO_OBJECT> queryTaobaoIpAddr(_IP_TAOBAO_OBJECT object);
	
	public List<BrowseRecord> queryBrowseRecord(BrowseRecord brecord);
}
