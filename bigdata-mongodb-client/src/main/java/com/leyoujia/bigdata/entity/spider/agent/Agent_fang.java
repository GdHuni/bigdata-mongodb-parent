package com.leyoujia.bigdata.entity.spider.agent;

/**
 * @功能描述: 搜房网的经纪人
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.agent.Agent_fang.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月6日 下午1:31:01
 */ 
public class Agent_fang extends AgentCommon {
	private static final long serialVersionUID = 1L;
	private String 所属公司;
	public String get所属公司() {
		return 所属公司;
	}
	public void set所属公司(String 所属公司) {
		this.所属公司 = 所属公司;
	}
}
