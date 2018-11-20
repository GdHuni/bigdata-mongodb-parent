package com.leyoujia.bigdata.service.kcr;

import com.leyoujia.bigdata.entity.common.ResultBean;
import com.leyoujia.bigdata.entity.kcr.AgentVisitorRecord;
import com.leyoujia.bigdata.entity.kcr.ReturnData;
import com.leyoujia.bigdata.entity.kcr.UserIntention;
import com.leyoujia.bigdata.entity.kcr.dto.KCustomerRecommend;
import com.leyoujia.bigdata.entity.kcr.dto.KCustomerRecommendModel;
import com.leyoujia.bigdata.entity.kcr.param.AgentId;
import com.leyoujia.bigdata.entity.kcr.param.UserId;
import com.leyoujia.bigdata.entity.log.ViewHouse;
import com.leyoujia.bigdata.exception.KCRServiceException;

import java.util.List;

public interface ICustomerRecommendService {
	
	 /**
	 * 客户意向
	 * @param kcRecommend
	 * @return
	 */
	 public List<UserIntention> userIntention(UserId userId) throws KCRServiceException;
	 
	 /**  
	 * @功能描述: 根据房产网用户ID查询用户画像
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月19日 下午8:35:21
	 * @param userId
	 * @return
	 */ 
	public KCustomerRecommend queryCostomerByUserId(String userId) throws KCRServiceException;
	
	/**  
	 * @功能描述: 根据房产网用户ID查询用户的意向模型
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月19日 下午8:36:51
	 * @param userId
	 * @return
	 */ 
	public KCustomerRecommendModel queryModelByUserId(String userId) throws KCRServiceException;
	 
	 /**
	  * 客户浏览记录 (1-一手 2-二手 3-租房 4-经纪人)
	  * @param kcRecommend
	  * @return
	  */
	 public ResultBean<ViewHouse> queryViewHouse(UserId user) throws KCRServiceException;
	 
	 /**
	  * 精确推荐
	  * @param kcRecommend
	  * @return
	  */
	 public List<ViewHouse> queryUIGHouse(String userId) throws KCRServiceException;
	 
	 /**
	  * 浏览经纪人的用户列表
	  * @param AgentId 
	  * @return
	  */
	 public ReturnData<AgentVisitorRecord> agentVisitorRecord(AgentId agentId) throws KCRServiceException;
	 
	/**  
	 * @功能描述: 开始处理用户意向模型
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月19日 下午6:31:49
	 * @param 用户房产网的ID
	 */ 
	public void startKCR(String user_id);
}
