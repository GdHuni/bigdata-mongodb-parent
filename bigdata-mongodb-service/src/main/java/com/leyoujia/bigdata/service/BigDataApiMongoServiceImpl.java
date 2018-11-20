package com.leyoujia.bigdata.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IKyFollowRecordsDao;
import com.leyoujia.bigdata.service.bdapi.IBigDataApiMongoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Service
public class BigDataApiMongoServiceImpl implements IBigDataApiMongoService {

	private static Logger logger = LoggerFactory.getLogger(BigDataApiMongoServiceImpl.class);
	
	@Autowired
	private IKyFollowRecordsDao kyFollowRecordsDao;

	@Override
	public long queryFollowCountByFhId(int fhId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		//数量取上个月
		cal.add(Calendar.DATE, -15);
		String sDate = sdf.format(cal.getTime());
		long result = 0;
		try {
			result = kyFollowRecordsDao.query(fhId, sDate);
		} catch (Exception e) {
			logger.error("BigDataApiMongoServiceImpl@queryFollowCountByFhId", e);
		}
		return result;
	}
}
