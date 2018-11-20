package com.leyoujia.bigdata.service.hq;

import com.leyoujia.bigdata.entity.hq.EsfCjHqCount;
import com.leyoujia.bigdata.entity.hq.EsfCjHqHouseMonth;
import com.leyoujia.bigdata.entity.hq.EsfCjHqLpFollowCt;

import java.util.List;
import java.util.Map;

/**
 * 成交行情服务接口
 * @author ytc
 * @date 2015-03-01
 */
public interface ICjHqCountService {

	/**  
	 * @功能描述: 获取最近一年成交行情
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: ytc
	 * @创建日期: 2016年11月12日 下午4:29:27
	 * @param cjHqCount
	 * @return
	 */ 
	List<EsfCjHqCount> queryCjHqCountRecentYear(EsfCjHqCount cjHqCount);
	
	/**  
	 * @功能描述: 小区居室统计
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: ytc
	 * @创建日期: 2016年11月12日 下午4:29:53
	 * @param cjHqCount
	 * @return
	 */ 
	List<EsfCjHqCount> queryCjHqRoomCount(EsfCjHqCount cjHqCount);
	
	/**  
	 * @功能描述: 带看次数和环比值,dkCount:带看次数<br>dkCountPercent同比增加或者下降率，status:增长状态（1增长，-1下降，0持平）
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:29:56
	 * @param esfCjHqLpFollowCt
	 * @return
	 */ 
	public Map<String,Object> queryCjHqHaveWatchTimes(EsfCjHqLpFollowCt esfCjHqLpFollowCt);
	
	/**  
	 * @功能描述: 价格走势和成交均价（十三个月）,以及最近一个月的成交均价和价格趋势
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:29:59
	 * @param esfCjHqHouseMonth
	 * @return resultMap:{monthStr:'1月,2月',avgPriceStr:'456,132',status:1,currentAvgPricePercent:23.0,currentAvgPrice:4566.0,currentMonth:12月}
	 */ 
	public Map<String,Object> queryCjHqTheAvgPriceTrend(EsfCjHqHouseMonth esfCjHqHouseMonth);
	
	/**  
	 * @功能描述: 获取挂牌均价和在售数量
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:30:01
	 * @param esfCjHqHouseMonth
	 * @return resultMap:{cjAvgPriceOfGuaPai:2344,onSaleCount:0}
	 */ 
	public Map<String,Object> queryCjHqTheAvgPriceOfGuaPai(EsfCjHqHouseMonth esfCjHqHouseMonth);
	
	/**  
	 * @功能描述: 市场成交量 按月统计当前月和上月 ,currentVolumeCount:月成交量<br>currentVolumePercent月成交同比增加或者下降率，status:增长状态（1增长，-1下降，0持平）
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:30:03
	 * @param cjHqCount
	 * @return
	 */ 
	Map<String,Object> queryCjHqTradeVolume(EsfCjHqCount cjHqCount);
	
	/**  
	 * @功能描述: 涨幅最高楼盘数据
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:30:05
	 * @param cjHqCount
	 * @return
	 */ 
	List<EsfCjHqCount> queryCjHqTheHighestIncreaseLps(EsfCjHqCount cjHqCount);
	
	/**  
	 * @功能描述: 附近均价最低 筛选条件有做 区域选择,比数据 需要比区域刷选条件上一级<br/>如：筛选条件有 片区，此SQL语句条件为上一级区域
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:30:08
	 * @param cjHqCount
	 * @return
	 */ 
	List<EsfCjHqCount> queryCjHqLowestPriceLpsNearby(EsfCjHqCount cjHqCount);

	/**  
	 * @功能描述: 查询下一级所有节点集合
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:30:10
	 * @param esfCjHqHouseMonth
	 * @return cityCode 业务编码， lpName 业务名称
	 */ 
	List<EsfCjHqHouseMonth> qrySubNode(EsfCjHqHouseMonth esfCjHqHouseMonth);

}
