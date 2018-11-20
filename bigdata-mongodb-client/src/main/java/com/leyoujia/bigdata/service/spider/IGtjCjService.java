package com.leyoujia.bigdata.service.spider;

import com.leyoujia.bigdata.entity.spider.gtj.CJ_DAY;
import com.leyoujia.bigdata.entity.spider.gtj.CJ_MONTH;
import com.leyoujia.bigdata.entity.spider.gtj._CJ_PM;

import java.util.List;

/**
 * 国土局成交记录服务接口
 * @author xyy
 * @date 2015-07-18
 *
 */
public interface IGtjCjService {
	/**  
	 * @功能描述: 插入日成交记录
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月18日 下午3:38:22
	 * @param list
	 */ 
	public void insertCjDay(List<CJ_DAY> list);
	
	/**  
	 * @功能描述: 插入月成交记录
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月18日 下午3:38:22
	 * @param list
	 */ 
	public void insertCjMonth(List<CJ_MONTH> list);
	
	/**  
	 * @功能描述: 插入成交公司排名
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年7月18日 下午3:38:22
	 * @param list
	 */ 
	public void insertCjGsPm(List<_CJ_PM> list);
}
