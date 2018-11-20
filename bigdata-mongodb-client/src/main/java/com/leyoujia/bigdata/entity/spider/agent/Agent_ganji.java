package com.leyoujia.bigdata.entity.spider.agent;


/**
 * @功能描述: 赶集网
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.agent.Agent_ganji.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月7日 下午2:54:50
 */ 
public class Agent_ganji extends AgentCommon {
	private static final long serialVersionUID = 1L;
	private String 所属公司;
	private String 所属分行;
	private String 服务小区;
	public String get所属公司() {
		return 所属公司;
	}
	public void set所属公司(String 所属公司) {
		this.所属公司 = 所属公司;
	}
	public String get所属分行() {
		return 所属分行;
	}
	public void set所属分行(String 所属分行) {
		this.所属分行 = 所属分行;
	}
	public String get服务小区() {
		return 服务小区;
	}
	public void set服务小区(String 服务小区) {
		this.服务小区 = 服务小区;
	}
}
