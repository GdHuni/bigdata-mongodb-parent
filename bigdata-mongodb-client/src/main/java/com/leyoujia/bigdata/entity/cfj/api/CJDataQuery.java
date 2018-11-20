package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 成交统计数据查询
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.CJDataQuery.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午4:01:07
 */ 
public class CJDataQuery implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 楼盘ID */
	private Integer lpId;
	/** 1租 2售 */
	private Integer type;
	/** 去年当月 */
	private String month1;
	/** 上月 */
	private String month2;
	/** 当月 */
	private String month3;
	public Integer getLpId() {
		return lpId;
	}
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
	public String getMonth1() {
		return month1;
	}
	public void setMonth1(String month1) {
		this.month1 = month1;
	}
	public String getMonth2() {
		return month2;
	}
	public void setMonth2(String month2) {
		this.month2 = month2;
	}
	public String getMonth3() {
		return month3;
	}
	public void setMonth3(String month3) {
		this.month3 = month3;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
}
