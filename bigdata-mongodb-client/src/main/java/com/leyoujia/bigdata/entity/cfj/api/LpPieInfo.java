package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 查询对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.LpPieInfo.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月2日 下午5:00:43
 */ 
public class LpPieInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 户型 */
	private Integer room;
	/** 总套数 */
	private Integer count;
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
