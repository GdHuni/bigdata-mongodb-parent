package com.leyoujia.common.analytics.modle.bigdata.em;

import com.leyoujia.common.analytics.modle.bigdata.evobj.*;

/**
 * @功能描述: 事件ID， 可拓展
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.EventID.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年3月10日 下午4:03:57
 */ 
public enum EventID {
	/** <font color="red">{@link JH0001}</font> */
	激活("JH0001"),
	/** <font color="red">{@link DJ0001}</font> */
	点击("DJ0001"),
	/** <font color="red">{@link ASY0001}</font> */
	首页_附近房源("ASY0001"),
	/** <font color="red">{@link ASY0002}</font> */
	首页_首部广告("ASY0002"),
	/** <font color="red">{@link ASY0003}</font> */
	首页_热点资讯("ASY0003"),
	/** <font color="red">{@link ASY0004}</font> */
	首页_淘房超人("ASY0004"),
	/** <font color="red">{@link ASS0001}</font> */
	搜索框_热搜楼盘("ASS0001"),
	/** <font color="red">{@link ACS0001}</font> */
	出售_返回("ACS0001"),
	/** <font color="red">{@link ACZ0002}</font> */
	出租_返回("ACZ0002"),
	/** <font color="red">{@link AZX0001}</font> */
	租房详情页_猜你喜欢("AZX0001"),
	/** <font color="red">{@link AGG0001}</font> */
	详情页_电话("AGG0001"),
	/** <font color="red">{@link AGG0002}</font> */
	APP底部_消息("AGG0002"),
	/** <font color="red">{@link AGG0003}</font> */
	详情页_联系经纪人_咨询("AGG0003"),
	/** <font color="red">{@link ABG0001}</font> */
	曝光("ABG0001");

	
	/** 事件ID */
	private String eid;
	private EventID(String id){
		this.eid = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString(){
		return eid;
	}
}
