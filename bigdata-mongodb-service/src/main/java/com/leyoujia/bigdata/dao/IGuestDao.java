package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.Guest;
import com.leyoujia.bigdata.entity._IP_TAOBAO_OBJECT;

import java.util.List;

public interface IGuestDao {
	/**  
	 * @功能描述: 插入
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月24日 下午5:59:00
	 * @param guest
	 */ 
	public void insert(Guest guest);
	public void insertIpAddr(_IP_TAOBAO_OBJECT object);
	public List<_IP_TAOBAO_OBJECT> queryIpAddr(_IP_TAOBAO_OBJECT object);
}
