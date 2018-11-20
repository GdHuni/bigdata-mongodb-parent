package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IGtjCjDao;
import com.leyoujia.bigdata.entity.spider.gtj.CJ_DAY;
import com.leyoujia.bigdata.entity.spider.gtj.CJ_MONTH;
import com.leyoujia.bigdata.entity.spider.gtj._CJ_PM;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 日成交记录服务类实现类
 * @author xyy
 * @date 2015-07-18
 */
@Service
public class GtjCjServiceImpl implements IGtjCjService {

	@Autowired
	private IGtjCjDao gtjCjDao;

	@Override
	public void insertCjDay(List<CJ_DAY> list) {
		gtjCjDao.insertCjDay(list);
	}

	@Override
	public void insertCjMonth(List<CJ_MONTH> list) {
		gtjCjDao.insertCjMonth(list);
	}

	@Override
	public void insertCjGsPm(List<_CJ_PM> list) {
		gtjCjDao.insertCjGsPm(list);
	}
	
	
}
