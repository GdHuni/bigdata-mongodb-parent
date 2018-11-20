package com.leyoujia.bigdata.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.bigdata.dao.IGuestDao;
import com.leyoujia.bigdata.dao.ITongjiDao;
import com.leyoujia.bigdata.dao.IUserDao;
import com.leyoujia.bigdata.entity.Guest;
import com.leyoujia.bigdata.entity.TestEndtity;
import com.leyoujia.bigdata.entity.User;
import com.leyoujia.bigdata.entity._IP_TAOBAO_OBJECT;
import com.leyoujia.bigdata.entity.tongji.BrowseRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;


@Service
public class MainServiceImpl implements IMainService {

	@Autowired
	private IUserDao mainDao;
	@Autowired
	private IGuestDao guestDao;
	@Autowired
	private ITongjiDao tongjiDao;
	
	
	/* (non-Javadoc)
	 * @see com.jjshome.funds.service.IMainService#addTest(com.jjshome.funds.entity.TestEndtity)
	 */
	@Override
	public void addTest(TestEndtity testEndtity) {
		try {
			mainDao.insert(new User(UUID.randomUUID().toString(), "name", 21));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addGuest(Guest guest) {
		guestDao.insert(guest);
	}

	@Override
	public void addTaobaoIpAddr(_IP_TAOBAO_OBJECT object) {
		guestDao.insertIpAddr(object);
	}
	
	@Override
	public List<_IP_TAOBAO_OBJECT> queryTaobaoIpAddr(_IP_TAOBAO_OBJECT object) {
		return guestDao.queryIpAddr(object);
	}

	@Override
	public List<BrowseRecord> queryBrowseRecord(BrowseRecord brecord) {
		return tongjiDao.queryBrowseRecord(brecord);
	}
}
