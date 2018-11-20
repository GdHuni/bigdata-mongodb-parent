package com.leyoujia.bigdata.entity.spider.qqhouse;

import java.io.Serializable;

/**
 * @功能描述: 搜房房产爬取的信息实体类 
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qqhouse._FANG_HOUSE.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年10月8日 下午4:48:59
 */ 
public class _FANG_HOUSE extends HouseBase implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 修改字段 逗号分隔
	 */
	private String modifyField;

	public String getModifyField() {
		return modifyField;
	}

	public void setModifyField(String modifyField) {
		this.modifyField = modifyField;
	}
}
