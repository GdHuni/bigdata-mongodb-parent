package com.leyoujia.bigdata.service.kcr;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IUserIntentionGroupDao;
import com.leyoujia.bigdata.entity.kcr.dto.KCustomerRecommendModel;
import com.leyoujia.bigdata.entity.kcr.param.UserId;
import com.leyoujia.bigdata.entity.log.User_intention_group;
import com.leyoujia.bigdata.entity.log.ViewHouse;
import com.leyoujia.bigdata.exception.KCRServiceException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserIntentionGroupImpl implements IUserIntentionGroupService {

	Logger logger = LoggerFactory.getLogger(UserIntentionGroupImpl.class);
	
	@Autowired
	private IUserIntentionGroupDao userIntentionGroupDao;

	/* (non-Javadoc)
	 * @see com.jjshome.bigdata.service.kcr.IUserIntentionGroupService#queryUIG(com.jjshome.bigdata.entity.log._USER_INTENTION_GROUP)
	 */
	@Override
	public User_intention_group queryUIG(User_intention_group query) {
		User_intention_group result = new User_intention_group();
		try {
			List<String> ips = new ArrayList<String>();
			if(StringUtils.isNotEmpty(query.get_user_id())&&!"null".equals(query.get_user_id())&&!"0".equals(query.get_user_id())){
				List<User_intention_group> result_list = userIntentionGroupDao.queryUIGByUserId(query.get_user_id());
				if(result!=null){
					int size = 0;
					for (User_intention_group object : result_list) {
						if(!ips.contains(object.get_ip())) ips.add(object.get_ip());
						if(size++>10) break;
					}
					result.set_USER_INTENTION_GROUP(userIntentionGroupDao.queryUIGByIps(ips,query.get_user_id()));
				}
			}else if (StringUtils.isNotEmpty(query.get_ip())) {
				ips.add(query.get_ip());
				result.set_USER_INTENTION_GROUP(userIntentionGroupDao.queryUIGByIps(ips,query.get_user_id()));
			}
		} catch (Exception e) {
			logger.error("UserIntentionGroupImpl@queryUIG",e);
		}
		return result;
	}

	@Override
	public boolean updateUIG(User_intention_group uigroup)
			throws KCRServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUIG(User_intention_group uigroup)
			throws KCRServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int insertAPIData(UserId userid) throws KCRServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ViewHouse> queryHouseByUIG(KCustomerRecommendModel kcrm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startKCR(String user_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User_intention_group getRedisGroup(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
