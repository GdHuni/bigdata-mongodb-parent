package com.leyoujia.bigdata.entity;

import java.io.Serializable;
import java.util.UUID;

/**
 * @功能描述: 测试实体类
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.funds.entity.TestEndtity.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年3月13日 下午5:58:19
 */ 
public class TestEndtity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**  */
	private Integer id;
	/**  */
	private String name;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		name = UUID.randomUUID().toString();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
