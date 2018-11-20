package com.leyoujia.bigdata.entity.hq;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * @功能描述: 历史成交记录查询条件
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.hq.EsfCjHqHistoryQueryBean.java
 * @创建作者: 朱攀
 * @问题反馈: zhup@jjshome.com
 * @创建日期: 2016年8月17日 上午11:23:02
 */
public class EsfCjHqHistoryQueryBean extends BaseQueryBean {

	private static final long serialVersionUID = 1L;
	/**楼盘ID */
	private String lpId; 
	/**成交经纪人ID */
	private String cjWId;

	public String getLpId() {
		return lpId;
	}

	public void setLpId(String lpId) {
		this.lpId = lpId;
	}

	public String getCjWId() {
		return cjWId;
	}

	public void setCjWId(String cjWId) {
		this.cjWId = cjWId;
	}

}
