package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.ISzplXmDao;
import com.leyoujia.bigdata.entity.spider.SzplXm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SzplBolServiceImpl implements ISzplXmService {

	@Autowired
	private ISzplXmDao szplXmDao;
	
	@Override
	public void insert(List<SzplXm> list) {
		szplXmDao.insert(list);
	}
}
