package com.leyoujia.bigdata.service.kcr;

import com.leyoujia.bigdata.entity.kcr.dto.KCustomerRecommendModel;
import com.leyoujia.bigdata.entity.kcr.param.UserId;
import com.leyoujia.bigdata.entity.log.User_intention_group;
import com.leyoujia.bigdata.entity.log.ViewHouse;
import com.leyoujia.bigdata.exception.KCRServiceException;

import java.util.List;

/**
 * @功能描述: mongodb 客户意向接口
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.service.kcr.IUserIntentionGroupService.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月18日 下午3:51:43
 */ 
public interface IUserIntentionGroupService {

	/**  
	 * @功能描述: 开始处理用户意向模型
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月19日 下午6:31:49
	 * @param 用户房产网的ID
	 */ 
	public void startKCR(String user_id);
	
	/**
	 * @功能描述: 根据更新的mongdo记录获取历史的用户意向
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月18日 下午3:49:37
	 * @param query
	 * @return
	 */
	public User_intention_group queryUIG(User_intention_group query);
	
	
	/**
	 * 更新
	 * @param uigroup
	 * @return
	 */
	public boolean updateUIG(User_intention_group uigroup)throws KCRServiceException;
	
	/**
	 * 新增
	 * @param uigroup
	 * @return
	 */
	public boolean insertUIG(User_intention_group uigroup)throws KCRServiceException;
	
	/**
	 * api接口数据
	 * @param uigroup
	 * @return
	 */
	public int insertAPIData(UserId userid)throws KCRServiceException;
	
	/**  
	 * @功能描述: 根据意向查询房源
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2015年12月23日 下午3:05:53
	 * @param kcrm
	 * @return
	 */ 
	public List<ViewHouse> queryHouseByUIG(KCustomerRecommendModel kcrm);
	
	/**  
	 * @功能描述: 获取内存中的意向
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年1月18日 下午6:45:27
	 * @param userId
	 * @return
	 */ 
	public User_intention_group getRedisGroup(String userId);
}
