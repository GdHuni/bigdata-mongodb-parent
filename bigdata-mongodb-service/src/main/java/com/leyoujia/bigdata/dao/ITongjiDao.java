package com.leyoujia.bigdata.dao;

import com.leyoujia.bigdata.entity.tongji.BrowseRecord;

import java.util.List;

public interface ITongjiDao { 
	public List<BrowseRecord> queryBrowseRecord(BrowseRecord brecord);
}
