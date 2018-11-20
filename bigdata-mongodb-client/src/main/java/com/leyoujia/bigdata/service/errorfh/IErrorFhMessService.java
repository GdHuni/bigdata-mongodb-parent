package com.leyoujia.bigdata.service.errorfh;

import com.leyoujia.bigdata.entity.common.EasyUIQueryVO;
import com.leyoujia.bigdata.entity.common.EasyUIResultBean;
import com.leyoujia.bigdata.entity.errorfh.ErrorFhMess;
import com.leyoujia.bigdata.entity.errorfh.ErrorLpVO;

import java.util.List;

/**
 * @功能描述: 异常房源
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.errorfh.IErrorFhMessService.java
 * @创建作者: 朱攀
 * @问题反馈: zhup@jjshome.com
 * @创建日期: 2016年9月13日 下午2:16:52
 */
public interface IErrorFhMessService {
	
	/**
	 * @功能描述: 根据房号ID查询异常房源类型 (修改成数据同步的方式)
	 * @使用对象: 二手房
	 * @接口版本: 1.0.0
	 * @param fhId
	 * @return
	 */
	@Deprecated
	public List<ErrorFhMess> qryErrorFhMessByFhId(Integer fhId);
	
	/**  
	 * @功能描述: 总共被标记异常的明细数据
	 * @使用对象: 大数据
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月15日 下午4:11:55
	 * @param EASY UI查询对象
	 * @return
	 */ 
	public EasyUIResultBean<ErrorLpVO> queryErrorMess(EasyUIQueryVO query);
	
	/**  
	 * @功能描述: 删除异常数据
	 * @使用对象: 大数据
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月15日 下午5:09:10
	 * @param ids
	 */ 
	public void delErrorMess(List<Integer> ids);
	
	/**  
	 * @功能描述: 处理异常数据
	 * @使用对象: 大数据
	 * @接口版本: 1.0.0
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月20日 下午5:45:51
	 * @param ids
	 */ 
	public void execErrorMess(List<Integer> ids);
}
