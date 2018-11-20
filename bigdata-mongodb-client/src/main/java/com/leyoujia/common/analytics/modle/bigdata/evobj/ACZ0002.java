package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：出租-返回-用户返回时，填写的所有内容：楼盘名称、栋阁房号、期望租价、同时委托出租、称呼、性别、手机号码
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ACZ0002.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class ACZ0002 implements Serializable{
	private static final long serialVersionUID = 1L;

    /** <font color="red">提交的表单元素，json对象</font> 					:{xxx:xxx,yyy:yyy} */
    private Object jsonObject;

	public Object getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(Object jsonObject) {
		this.jsonObject = jsonObject;
	}
}
