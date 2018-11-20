package com.leyoujia.bigdata.service.bdapi;

import com.leyoujia.bigdata.entity.cfj.dbapi.YyCountData;

import java.util.List;

/**
 * @功能描述: 大数据对外的接口api
 * @项目版本: 
 * @相对路径: com.jjshome.bigdata.service.bdapi.IBigDataApiService
 * @创建作者: xiejinyan
 * @创建日期: 2016年8月8日 下午6:13:13
 */
public interface IBigDataApiService {
	
	/**  
	 * @功能描述: 房产网经纪人+项目--查询个人当月的实收业绩
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 实收业绩
	 */ 
	public String queryShYjForWId(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未实勘房源数量的接口
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 未实勘数量
	 */ 
	public Integer queryWSklTotal(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未实勘房源房号ID，和数量的接口（精确到天）（数量及房源ID)
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return fhId列表 
	 */ 
	public List<YyCountData> queryWSkl(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未跟进房数量的接口
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 未跟进房数量
	 */ 
	public Integer queryWGjfyTotal(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未跟进房源房号ID，和数量的接口（精确到天）（数量及房源ID)
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return fhId列表 
	 */ 
	public List<YyCountData> queryWGjfy(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未描述房源房数量的接口
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 未描述房源房数量
	 */ 
	public Integer queryWMslfyTotal(String workerId);
	
	/**  
	 * @功能描述: 房产网经纪人+项目--提供以人为单位获取未描述房源房号ID，和数量的接口（精确到天）（数量及房源ID)
	 * @使用对象: 房产网-经纪人+
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return fhId列表 
	 */ 
	public List<YyCountData> queryWMslfy(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--带看数据-提供此员工作为经纪人的历史带看总数；
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 带看总和数 count; 服务总人数 currNum;
	 */ 
	public YyCountData queryDaikanData(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--接单率数据-提供此员工的经纪人接单率；1、接单率=成功接单总数/需接单总数
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 接单率数据
	 */ 
	public String queryJieDanLvData(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--预约看房及时处理率-提供此员工的预约看房订单的处理率情况
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 预约看房及时处理率
	 */ 
	public String queryYyKfCllData(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--预约看房数据-提供此经纪人的预约看房总数及当月累积的预约单数
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 预约看房数据YyCountData  kfCount预约看房总数  currNum当月累积的预约单数 
	 */ 
	public YyCountData queryYyKfData(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--预约委托数据-提供此经纪人的预约委托总数及当月累积的委托单数
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 预约委托数据YyCountData  kfCount预约看房总数  currNum当月累积的预约单数 
	 */ 
	public YyCountData queryYyWtData(String workerId);
	
	/**  
	 * @功能描述: 用户组诚信档案项目--成交数据
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return 预约委托数据YyCountData  二手租成交量zfCjCt;	二手售成交量efCjCt;	一手售成交量ysCjCt;	所有成交量allCjCt; 
	 */ 
	public YyCountData queryCjCtData(String workerId);
	
	/**  
	 * @功能描述: 根据workerid查询该人员管控范围内人员workerid的集合的接口
	 * @使用对象: 用户组-诚信档案
	 * @接口版本: 1.0.0
	 * @param workerId
	 * @return  人员workerid的集合
	 */ 
	public String[] queryWorkerIds(String workerId);
	
}
