package com.leyoujia.bigdata.entity.cfj.api;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

import java.util.List;

/**
 * @功能描述: 返回对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.CjhqResult.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午2:32:05
 */ 
public class CjhqResult<T> extends BaseQueryBean {
	private static final long serialVersionUID = 1L;
	/** 数量 */
	private Integer count;
	/** 信息 */
	private String msg;
	/** 数据最新更新时间 */
	private String updateDate;
	private List<T> datas;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
