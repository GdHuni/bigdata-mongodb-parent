package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.ISzplBolDao;
import com.leyoujia.bigdata.entity.spider.SzplBol;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SzplXmServiceImpl implements ISzplBolService {

	@Autowired
	private ISzplBolDao szplBolDao;
	
	@Override
	public void insert(List<SzplBol> list) {
		szplBolDao.insert(list);
	}
}
