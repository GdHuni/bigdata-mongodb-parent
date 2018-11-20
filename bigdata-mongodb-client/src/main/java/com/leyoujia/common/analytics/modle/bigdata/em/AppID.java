package com.leyoujia.common.analytics.modle.bigdata.em;

/**
 * @功能描述: 应用ID， 可拓展
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.EventID.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年3月10日 下午4:03:57
 */ 
public enum AppID {
	/** <font color="red">APP001</font> */
	房产网("APP001"),
	/** <font color="red">APP002</font> */
	云办公("APP002"),
	/** <font color="red">APP003</font> */
	随手考("APP003"),
	/** <font color="red">APP004</font> */
	项目管家("APP004"),
	/** <font color="red">APP005</font> */
	乐助手("APP005");
	
	/** 事件ID */
	private String aid;
	private AppID(String id){
		this.aid = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString(){
		return aid;
	}
}
