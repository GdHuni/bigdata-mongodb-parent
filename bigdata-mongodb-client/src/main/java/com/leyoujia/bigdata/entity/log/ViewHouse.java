package com.leyoujia.bigdata.entity.log;

import java.io.Serializable;

/**
 * @功能描述: 房源浏览记录
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.log.ViewHouse.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月14日 下午1:56:10
 */ 
public class ViewHouse implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 应用类别 1-一手楼 2-二手房 3-租房 4-经纪人 */
	private Integer app_type;
	/** 应用ID 楼盘ID/房号ID/房号ID/员工ID */
	private String app_id;
	/** 浏览次数 */
	private Integer count;
	/** 最近浏览时间 */
	private String update_time;
	public Integer getApp_type() {
		return app_type;
	}
	public void setApp_type(Integer app_type) {
		this.app_type = app_type;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
	public String getMapKey() {
		return this.getApp_type()+this.getApp_id();
	}
}
