package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：首页-附近房源-点击的房源ID
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ASY0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午9:50:20
 */ 
public class ASY0001 implements Serializable{
	private static final long serialVersionUID = 1L;

    /** 房号ID 					:888*/
    private Integer fhId;

	public Integer getFhId() {
		return fhId;
	}

	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
}
