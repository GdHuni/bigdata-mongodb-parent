package com.leyoujia.bigdata.entity.common;

import java.io.Serializable;
import java.util.List;

/**
 * @功能描述: EASY UI返回对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.common.EasyUIResultBean.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年10月15日 上午11:09:39
 * @param <T>
 */ 
public class EasyUIResultBean<T> implements Serializable {

    private static final long serialVersionUID = -6811495919370053255L;

    /** 记录 */
    private List<T> rows;
	/** 总记录数 */
	private int total;
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
