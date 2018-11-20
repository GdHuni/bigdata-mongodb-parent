package com.leyoujia.bigdata.entity.kcr;

import java.io.Serializable;

/**
 * 接口日志记录
 * @author lenovo
 *
 */
public class KcrInterfaceLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private String methodName;	//方法名
	private String params;		//参数
	private String applyId;		//调用方的id
	private Long zxTime;		//执行时长 (毫秒)
	private String createDate;	//创建时间
	private String data;		//数据
	private String remark;		//其他信息
	
	public KcrInterfaceLog(){}
	
	public KcrInterfaceLog(String methodName,String params,String applyId,Long zxTime,String createDate,String data,String remark) {
		this.methodName = methodName;
		this.params = params;
		this.applyId = applyId;
		this.zxTime = zxTime;
		this.createDate = createDate;
		this.data = data;
		this.remark = remark;
	}
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getApplyId() {
		return applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	 
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	} 

	public Long getZxTime() {
		return zxTime;
	}

	public void setZxTime(Long zxTime) {
		this.zxTime = zxTime;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
