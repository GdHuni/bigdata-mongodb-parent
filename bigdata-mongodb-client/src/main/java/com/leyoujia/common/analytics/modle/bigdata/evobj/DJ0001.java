package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 点击事件对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.em.DJ0001.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年4月5日 上午11:15:41
 */ 
public class DJ0001 implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 点击按钮的标识		类名+控件名 */
	private String sign;
	/** 点击按钮的描述 */
	private String name;
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
