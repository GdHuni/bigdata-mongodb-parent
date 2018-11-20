package com.leyoujia.bigdata.entity.cfj.vo;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

/**
 * @功能描述: 
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.vo.QueryCjhqVO.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年7月4日 上午10:27:42
 */ 
public class QueryCjhqVO extends BaseQueryBean {
	private static final long serialVersionUID = 1L;
	/** 房号ID */
	private Integer fhId;
	/** 类型 1、租 4、售 */
	private Integer type;
	public Integer getType() {
		return type;
	}
	/**  
	 * @功能描述: 1、租 4、售
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年7月4日 上午10:33:59
	 * @param type
	 */ 
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getFhId() {
		return fhId;
	}
	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
}
