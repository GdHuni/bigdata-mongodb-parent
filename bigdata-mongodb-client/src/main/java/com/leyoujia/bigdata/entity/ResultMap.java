package com.leyoujia.bigdata.entity;

import java.io.Serializable;

/** 
 * @功能描述： 
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月17日 下午1:42:57 
 */
public class ResultMap implements Serializable{
	private static final long serialVersionUID = 1L;
	private int currentPage = 1;
	private Object datas;
	private String errorCode;
	private String errorMsg;
	private int pageSize = 20;
	private boolean success = false;
	private int totalPage = 1;
	private int totalRecord;
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public Object getDatas() {
		return datas;
	}
	public void setDatas(Object datas) {
		this.datas = datas;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
	
}
