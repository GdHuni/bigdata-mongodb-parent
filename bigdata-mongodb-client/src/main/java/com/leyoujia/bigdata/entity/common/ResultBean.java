package com.leyoujia.bigdata.entity.common;

import java.io.Serializable;
import java.util.List;

public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = -6811495919370053255L;

    private List<T> datas;
	/** 当前页 */
	private int pageNo;

	/** 每页大小 */
	private int pageSize;

	/** 总记录数 */
	private int totalRecord;

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
	public int getTotalPage() {
		if(pageSize==0)
		{
			pageSize = 10;
		}
		if(totalRecord==0)
		{
			return 0;
		}
		return (totalRecord+pageSize-1)/pageSize;
	}
}
