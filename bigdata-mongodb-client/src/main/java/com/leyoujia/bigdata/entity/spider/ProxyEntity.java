package com.leyoujia.bigdata.entity.spider;

import java.io.Serializable;

/**
 * @功能描述: 代理服务器实体类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.spider.proxy.proxyEntity.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年4月7日 上午10:24:13
 */ 
public class ProxyEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/** IP */
	private String host;
	/** 端口 */
	private String port;
	/** 地址 */
	private String addr;
	/** 是否可用 */
	private Boolean used;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Boolean isUsed() {
		return used;
	}
	public void setUsed(Boolean used) {
		this.used = used;
	}
}
