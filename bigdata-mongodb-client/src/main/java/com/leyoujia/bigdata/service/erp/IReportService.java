package com.leyoujia.bigdata.service.erp;

import com.leyoujia.bigdata.entity.common.ResultBean;
import com.leyoujia.bigdata.entity.erp.Report;

/**
 * @功能描述: 报表接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.erp.IReportService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年3月27日 下午3:03:33
 */ 
public interface IReportService {

	/**  
	 * @功能描述: 列表
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月13日 下午5:58:47
	 * @param testEndtity
	 */ 
	public ResultBean<Report> queryList(Report query);

	/**  
	 * @功能描述: 详情
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年3月27日 下午3:04:22
	 * @param id
	 * @return
	 */ 
	public Report queryOne(Integer id);
}
