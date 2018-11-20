package com.leyoujia.bigdata.service.param;

import com.leyoujia.bigdata.entity.param.EtlLog;

import java.util.List;

public interface IEtlLogService {
	/**  
	 * @功能描述: 查询ETL运行日志
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年3月21日 下午6:13:45
	 * @param etlkey
	 * @return
	 */ 
	public List<EtlLog> query(String etlkey);
}
