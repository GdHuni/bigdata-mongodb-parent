package com.leyoujia.bigdata.service.hq;

import com.leyoujia.bigdata.entity.common.ResultBean;
import com.leyoujia.bigdata.entity.hq.EsfCjHqHistoryInfo;
import com.leyoujia.bigdata.entity.hq.EsfCjHqHistoryQueryBean;
import com.leyoujia.bigdata.entity.hq.EsfCjHqHouseInfo;
import com.leyoujia.bigdata.entity.hq.EsfCjHqLpInfo;

import java.util.List;
import java.util.Map;


/**
 * 成交行情服务接口
 * @author xyy
 * @date 2015-03-01
 */
public interface ICjHqInfoService {

	/**  
	 * @功能描述: 根据城市编码查询成交记录
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:24:19
	 * @param city
	 * @return
	 */ 
	List<EsfCjHqHouseInfo> queryCjHqInfoList(String city);

	/**  
	 * @功能描述: 根据条件查询已满足的成交记录
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:24:43
	 * @param esfCjHqHouse
	 * @return
	 */ 
	List<EsfCjHqHouseInfo> queryCjHqInfoListByParamer(
            EsfCjHqHouseInfo esfCjHqHouse);

	/**
	 * @功能描述: 根据房源ID查询房源成交行情
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:24:50
	 * @param id
	 * @return
	 */
	EsfCjHqHouseInfo queryCjHqInfoById(Integer id);

	/**
	 * @功能描述: 查询和当前房源相关的推荐房源
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:25:22
	 * @param info
	 * @return
	 */
	List<EsfCjHqHouseInfo> queryFyForShowMore(EsfCjHqHouseInfo info);

	/**
	 * @功能描述: 根据条件查询成交总数
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: QHN
	 * @创建日期: 2016年11月12日 下午4:25:20
	 * @param esfCjHqHouse
	 * @return
	 */
	int queryCjHqInfoCountByParamer(
            EsfCjHqHouseInfo esfCjHqHouse);

	/**
	 * @功能描述: 获取统计数据
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: ytc
	 * @创建日期: 2016年11月12日 下午4:25:18
	 * @param lpId
	 * @param cjYear
	 * @return
	 */
	EsfCjHqHouseInfo queryCjHqPriceCount(int lpId, String cjYear);
	
	/**  
	 * @功能描述: 根据关键词搜索
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年11月12日 下午4:25:16
	 * @param cjHqInfo
	 * @return
	 */ 
	List<EsfCjHqHouseInfo> queryLpNameByParamer(EsfCjHqHouseInfo cjHqInfo);

	/**  
	 * @功能描述: 查询成交日期起止时间内的成交单数
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: zxg
	 * @创建日期: 2016年11月12日 下午4:25:14
	 * @param info
	 * @return
	 */ 
	int queryCjHqInfoCountRecentTreeMonth(EsfCjHqHouseInfo info);
	
	/**  
	 * @功能描述: 根据房号ID查询成交行情
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: zxg
	 * @创建日期: 2016年11月12日 下午4:25:12
	 * @param fhId
	 * @return
	 */ 
	EsfCjHqHouseInfo queryCjHqInfoByFhId(Integer fhId);
	
	/**  
	 * @功能描述: 根据楼盘ID查询近30日的成交行情
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年11月12日 下午4:25:09
	 * @param lpId
	 * @return
	 */ 
	int queryCjHqInfoCountRecentOneMonth(Integer lpId);
	
	/**  
	 * @功能描述: 根据楼盘ID查询时间段内的成交均价
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年11月12日 下午4:25:07
	 * @param params
	 * @return
	 */ 
	double queryCjHqInfoTimeBondAvgPrice(Map<String, Object> params);
	
	/**
	 * @功能描述: 1.根据楼盘ID(lpId)查询二手房房源所在楼盘的历史成交记录
	 * 			  2.根据成交经纪人ID(cjWId)该经纪人未主单人的成交记录
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建作者: 朱攀
	 * @创建日期: 2016年8月17日 上午11:27:03
	 * @param params: lpId:楼盘ID;cjWId:成交经纪人ID;
	 * @return lpName:楼盘名称;buildArea:建筑面积;cjDate:成交时间;cjPrice:成交价;
	 * 		   ghsj:过户时间-缴费取新证;cjWId:成交经纪人ID;cjWName:成交经纪人
	 */
	public ResultBean<EsfCjHqHistoryInfo> queryCjHqHistory(EsfCjHqHistoryQueryBean params);
	
	/**
	 * @功能描述: 根据楼盘ID查询楼盘信息
	 * @使用对象: 房产网-成交行情
	 * @接口版本: 1.0.0
	 * @创建日期: 2016年8月27日 下午2:34:51
	 * @param lpId 楼盘ID
	 * @return
	 */
	public EsfCjHqLpInfo getEsfCjHqLpInfo(String lpId);

}
