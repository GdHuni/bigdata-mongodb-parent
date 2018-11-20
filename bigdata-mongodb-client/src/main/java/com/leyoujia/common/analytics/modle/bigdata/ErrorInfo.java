package com.leyoujia.common.analytics.modle.bigdata;

import java.io.Serializable;


/**
 * @功能描述: APP错误日志
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.ErrorInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年4月5日 上午11:22:19
 */ 
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 页面标识  	异常信息的MD5值 */
    private String id;
    /** 错误类别 	ERR01-请求错误，ERR02-应用错误 */
    private String type;
    /** 错误信息 	syntax error, expect {, actual EOF, pos 0 */
    private String err;
    /** 错误时间			:2017-04-01 4:05:36 */
    private String et;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getErr() {
		return err;
	}
	public void setErr(String err) {
		this.err = err;
	}
	public String getEt() {
		return et;
	}
	public void setEt(String et) {
		this.et = et;
	}
}
