package com.leyoujia.bigdata.entity.kcr;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

import java.util.List;

/**
 * 数据返回 分页
 * @author tyc
 *
 * @param <T>
 */
public class ReturnData<T> extends BaseQueryBean {
	private int recordcount = 0; 

	private List<T> resultlist;

	public List<T> getResultlist() {
		return resultlist;
	}

	public void setResultlist(List<T> resultlist) {
		this.resultlist = resultlist;
	}

	public int getRecordcount() {
		return recordcount;
	}

	public void setRecordcount(int recordcount) {
		this.recordcount = recordcount;
	}
}
