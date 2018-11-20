package com.leyoujia.bigdata.entity;
/**
 * @功能描述: 统一响应格式
 * @项目版本: 1.0.0
 * @项目名称: 大数据接口中心
 * @相对路径: com.jjshome.bigdata.entity.JSONResponse.java
 * @创建作者: <a href="mailto:luow@jjshome.com">罗武</a>
 * @创建日期: 2017年10月24日 下午3:37:22
 */
public class JSONResponse {
	private Integer code;
	private String msg;
	private Object data;
	
	public JSONResponse() {
		super();
	}

	public JSONResponse(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
