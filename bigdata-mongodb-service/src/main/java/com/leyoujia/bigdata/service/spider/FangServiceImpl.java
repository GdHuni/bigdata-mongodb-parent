package com.leyoujia.bigdata.service.spider;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IFangLpDicDao;
import com.leyoujia.bigdata.entity.spider.LpDic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class FangServiceImpl implements IFangService {

	@Autowired
	private IFangLpDicDao fangLpDicDao;
	
	@Override
	public void insertLpDic(List<LpDic> list) {
		fangLpDicDao.insert(list);
	}

	@Override
	public void updateLpDic(List<LpDic> list) {
		fangLpDicDao.update(list);
	}
}
