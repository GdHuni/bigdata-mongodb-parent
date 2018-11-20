package com.leyoujia.bigdata.service.cfj;

import com.github.pagehelper.PageInfo;
import com.leyoujia.bigdata.entity.ResultMap;
import com.leyoujia.bigdata.entity.cfj.api.*;
import com.leyoujia.bigdata.entity.cfj.vo.QueryCjhqVO;
import com.leyoujia.bigdata.entity.cfj.vo.QueryGjCjVO;

/**
 * @功能描述: 查房价API接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.cfj.ICjhqApiService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 上午10:30:51
 */ 
public interface ICjhqApiService {

	/**  
	 * @功能描述: 根据楼盘ID查询成交记录
	 * @使用对象: 大数据-查房价
	 * @接口版本: 1.0.1
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午2:13:50
	 * @param 楼盘ID
	 * @param 分页大小(<font color="red">null则查询全部</font>)
	 * @return
	 */ 
	public CjhqResult<CJInfo> queryCjListByLpId(Integer lpId, Integer limitCount);
	
	/**  
	 * @功能描述: 根据楼盘ID查询成交记录
	 * @使用对象: 二手房-二手房内网成交信息
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午2:13:50
	 * @param 楼盘ID
	 * @param 分页大小(<font color="red">null则查询全部</font>)
	 * @return
	 */ 
	public PageInfo<CJInfo> queryCjListByEsf(QueryCjhqVO query);

	/**  
	 * @功能描述: 根据楼盘ID查询数量统计数据
	 * @使用对象: 房产网-二手房成交信息
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午4:03:39
	 * @param lpId
	 * @return
	 */ 
	public CJData queryCjCountByLpId(Integer lpId);

	/**  
	 * @功能描述: 根据楼盘ID查询数量统计数据-三个月
	 * @使用对象: 房产网-二手房成交信息
	 * @接口版本: 1.0.1
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午4:03:39
	 * @param lpId
	 * @return
	 */ 
	public CJData queryCjCountByLpId1(Integer lpId);
	/**  
	 * @功能描述: 根据楼盘ID查询均价统计数据
	 * @使用对象: 房产网-二手房成交信息
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午4:03:58
	 * @param lpId
	 * @return
	 */ 
	public CJData queryCjPriceByLpId(Integer lpId);
	public CJData queryCjCountByLpId2(Integer lpId, Integer type);
	
	/**  
	 * @功能描述: 查询楼盘价格数量趋势数据
	 * @使用对象: 房产网-二手房成交信息
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:10:26
	 * @param lpId
	 * @return
	 */ 
	public LpChartData queryCjhq(Integer lpId);
	
	/**  
	 * @功能描述: 查询户型分类统计
	 * @使用对象: 房产网-二手房成交信息
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月2日 下午5:02:51
	 * @param lpId
	 * @return
	 */ 
	public LpPieData queryCjRoom(Integer lpId);
	
	/**  
	 * @功能描述: COA的地图找房接口
	 * @使用对象: OA组-开铺成交查询
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月7日 下午2:03:51
	 * @param templng
	 * @param templat
	 * @param tempR
	 * @return
	 */ 
	public ResultMap mapPrice(Double lng, Double lat, Double radius);	
	
	/**  
	 * @功能描述: 根据楼盘ID查询成交记录
	 * @使用对象: 估价-成交列表查询
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午2:13:50
	 * @param 楼盘ID
	 * @param 分页大小(<font color="red">null则查询全部</font>)
	 * @return
	 */ 
	public PageInfo<GjCJInfo> queryCjListByGj(QueryGjCjVO query);
}
