package com.leyoujia.bigdata.service.esf;

import com.leyoujia.bigdata.entity.esf.AppHouseNumber;
import com.leyoujia.bigdata.entity.esf.OdsHouseNumber;
import com.leyoujia.bigdata.entity.result.DetailResultBean;

import java.util.List;

/**
 * @功能描述: 自助获取房源编码
 * @项目版本: 1.0.0
 * @项目名称: 大数据接口中心
 * @相对路径: com.jjshome.bigdata.service.esf.IEsfHouseInfoService.java
 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
 * @创建日期: 2017年10月25日 下午4:28:19
 */
public interface IHouseNumberService {

	/**
	 * @功能描述: 根据条件获取要爬取的房屋列表
	 * @使用对象: 大数据 
	 * @接口版本: 1.0.0 
	 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
	 * @创建日期: 2017年10月25日 下午4:31:54
	 * <p>返回对象参考{@link List}<{@link OdsHouseNumber}></p>
	 * @param appHouseNumber
	 * @return
	 */
	public List<OdsHouseNumber> getHouseInfoByCondition(AppHouseNumber appHouseNumber);
	/**
	 * @功能描述: 根据查询结果插入或更新数据
	 * @使用对象: 大数据 
	 * @接口版本: 1.0.0 
	 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
	 * @创建日期: 2017年10月26日 上午8:57:28
	 * <p>返回对象参考{@link boolean}</p>
	 * @param appHouseNumber
	 * @return
	 */
	public boolean insertOrUpdateHouseInfo(AppHouseNumber appHouseNumber);
	
	/**
	 * @功能描述: 根据房号ID获取房屋信息，
	 * @使用对象: 大数据 
	 * @接口版本: 1.0.0 
	 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
	 * @创建日期: 2017年11月6日 上午10:18:37
	 * <p>返回对象参考{@link AppHouseNumber}</p>
	 * @param appHouseNumber
	 * @return
	 */
	public AppHouseNumber getHouseNumberByFhId(AppHouseNumber appHouseNumber);
	/**
	 * @功能描述: 根据查询条件获取房源编码列表
	 * @使用对象: 大数据 
	 * @接口版本: 1.0.0 
	 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
	 * @创建日期: 2017年11月7日 上午9:53:29
	 * <p>返回对象参考{@link List}<{@link AppHouseNumber}></p>
	 * @param appHouseNumber
	 * @return
	 */
	public List<AppHouseNumber> getHouseNumbersByCondition(AppHouseNumber appHouseNumber);
	/**  
	 * @功能描述: 提供给成交查询房源   产权状态   的接口 查询参数
	 * @使用对象:
	 * @接口版本: 1.1.1
	 * @创建作者: <a href="mailto:guox@jjshome.com">郭雄</a>
	 * @创建日期: 2018年4月20日 下午3:05:26
	 * @param appHouseNumber
	 * @return
	 */ 
	public DetailResultBean<AppHouseNumber> getHouseInfoForCJ(AppHouseNumber appHouseNumber);
}
