package com.leyoujia.bigdata.entity.result;

/**
 * 
 * @author sahala
 * 
 * @param <T>
 */
public class DetailResultBean<T> extends BaseResultBean {

	private static final long serialVersionUID = 200482141055833800L;
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
