package com.leyoujia.bigdata.service.cfj;

import com.leyoujia.bigdata.entity.IdRobotResult;
import com.leyoujia.bigdata.entity.cfj.HouseInfo;
import com.leyoujia.bigdata.entity.cfj.dto.*;
import com.leyoujia.bigdata.entity.cfj.vo.AreaInfo;
import com.leyoujia.bigdata.entity.cfj.vo.IndexPlace;
import com.leyoujia.bigdata.entity.cfj.vo.SearchInfo;

import java.util.List;
import java.util.Map;

/** 
 * @功能描述： 房价信息页
 * @项目版本： 1.0
 * @项目名称： 大数据-查房价 
 * @创建作者： 沈阳
 * @创建日期： 2016年5月10日 上午11:35:44 
 */
public interface IHouseInfoService {
	
	/**  
	* @功能描述: 根据楼盘id查询成交记录
	* @使用对象: 房产网-二手房成交记录
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月10日 下午3:48:41
	* @param:  int lpId
	* @return: List<HouseInfo>
	*/ 
	public List<HouseInfo> queryHouseInfoByLPID(int lpId);
	
	/**  
	* @功能描述: 根据片区查询涨幅最高楼盘
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月11日 下午2:03:57
	* @param:  CJMonthDto cjMonth
	* @return: List<LpPrice>
	*/ 
	public List<LpPriceDto> queryRisePrice(CJMonthDto cjMonth);
	
	/**  
	* @功能描述: 根据片区查询附近房价最低楼盘
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月11日 下午7:25:30
	* @param:  CJMonthDto cjMonth
	* @return: List<LpPriceDto>
	*/ 
	public List<LpPriceDto> queryMinPrice(CJMonthDto cjMonth);
	
	/**  
	* @功能描述: 根据月份查询当月以及上月成交量
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月11日 下午8:27:02
	* @param:  CJMonthDto cjMonth
	* @return: List<CJCTDto>
	*/ 
	public List<CJCTDto> queryCJCT(CJMonthDto cjMonth);
	
	/**  
	* @功能描述: 根据日期和区域查询带看量以及环比带看量
	* @使用对象: 房产网-小区频道
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月11日 下午9:54:05
	* @param:  FollowDateDto fDate
	* @return: List<DKCTDto>
	*/ 
	public List<DKCTDto> queryDKCT(FollowDateDto fDate);
	
	/**  
	* @功能描述: 根据户型以及面积查询成交价走势
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月12日 下午6:47:07
	* @param:  RoomNumDto rNum
	* @return: List<CJPriceDto>
	*/ 
	public List<CJPriceDto> queryCJPrice(RoomNumDto rNum);
	
	/**  
	* @功能描述: 根据户型及面积查询挂牌均价
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月17日 下午9:09:20
	* @param:  RoomNumDto rNum
	* @return: List<GPPriceDto>
	*/ 
	public List<GPPriceDto> queryGPPrice(RoomNumDto rNum);
	
	/**  
	* @功能描述: 根据坐标以及半径查找最近的楼盘成交均价
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月16日 下午5:25:39
	* @param:  LocationDto loc
	* @return: List<mapPriceDto>
	*/ 
	public List<MapPriceDto> queryMapPrice(LocationDto loc);
	
	/**  
	* @功能描述: 查询各片区均价及涨幅情况
	* @使用对象: 大数据-查房价
	* @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月19日 下午9:41:31
	* @param:  CJMonthDto cjMonth
	* @return: List<PlacePriceDto>
	*/ 
	public List<PlacePriceDto> queryPlacePrice(CJMonthDto cjMonth);
	
	/**  
	 * @功能描述: 检索关键字 1-name 2-spell
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年5月19日 上午10:39:18
	 * @param keyword
	 * @param type
	 * @return
	 */ 
	public List<SearchInfo> queryKeyWords(String keyWord, Integer type);
	
	/**  
	 * @功能描述: 查询地区
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年5月19日 下午6:00:30
	 * @param query
	 * @return
	 */ 
	public IndexPlace queryIndexPlace(IndexPlace query);

	/**  
	 * @功能描述: 查询片区下的全部楼盘
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年9月29日 下午6:17:46
	 * @param query
	 * @return
	 */ 
	public IndexPlace queryIndexPlaceByNext(IndexPlace query);
	
	/**  
	* @功能描述: 查询城市的上月成交均价以及套数
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	* @创建作者: 沈阳
	* @创建日期: 2016年5月20日 上午11:24:04
	* @param:  CJMonthDto cjMonth
	* @return: List<CJCTDto>
	*/ 
	public Object queryPriceCT(CJMonthDto cjMonth);
	
	/**  
	 * @功能描述: 各区均价查询
	 * @使用对象: 大数据-查房价
	 * @更新内容: 2016-11-21 14:37 始终返回上月均价
	 * @接口版本: 1.1.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年5月20日 下午5:52:11
	 * @param cjMonth
	 * @return
	 */ 
	public List<LpPriceDto> queryAreaPrice(CJMonthDto cjMonth);
	
	/**  
	 * @功能描述: 成交记录查询
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年5月20日 下午5:52:11
	 * @param cjMonth
	 * @return
	 */ 
	public List<CjDetailDto> queryCjList(CJMonthDto cjMonth, String isLogin);
	
	/**  
	 * @功能描述: 查询区域基本信息
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年5月21日 下午6:21:51
	 * @param query
	 * @return
	 */ 
	public AreaInfo queryAreaById(IndexPlace query);
	
	/**  
	 * @功能描述: 查询需要验证的身份证号
	 * @使用对象: 大数据-采集器
	 * @接口版本: 1.3.1
	 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
	 * @创建日期: 2017年10月9日 下午4:11:47
	 * @return
	 */ 
	public List<String> queryCheckIds(Integer days);
	
	/**  
	 * @功能描述: 查询当前运行状态
	 * @使用对象: 大数据-采集器
	 * @接口版本: 1.3.1
	 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
	 * @创建日期: 2018年3月9日 下午3:16:27
	 * @return
	 */ 
	public IdRobotResult queryResultIds();
	
	/**  
	 * @功能描述: 修改身份证状态 1-正常 2-异常
	 * @使用对象: 大数据-采集器
	 * @接口版本: 1.3.1
	 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
	 * @创建日期: 2017年10月9日 下午5:15:31
	 * @param id status
	 */ 
	public void updateCheckId(Map<String, Object> params);
	
	/**  
	 * @功能描述: 查询代理服务器
	 * @使用对象: 分布式网络爬虫
	 * @接口版本: 1.3.1
	 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
	 * @创建日期: 2017年11月6日 下午2:22:07
	 * @return
	 */ 
	public List<String> queryProxy();
}
