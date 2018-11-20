package com.leyoujia.common.analytics.modle.bigdata.evobj;

import com.leyoujia.common.analytics.modle.bigdata.evobj.child.ContentObj;
import com.leyoujia.common.analytics.modle.bigdata.evobj.child.LocationObj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：内容曝光
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ABG0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年8月31日 下午3:53:40
 */ 
public class ABG0001 implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 曝光内容信息 */
	private ContentObj content;
	/** 曝光位置信息 */
	private LocationObj location;
	/** 城市ID */
	private String cityId;
	/** 页面ID */
	private String pageId;
	
	public ContentObj getContent() {
		return content;
	}
	public void setContent(ContentObj content) {
		this.content = content;
	}
	public LocationObj getLocation() {
		return location;
	}
	public void setLocation(LocationObj location) {
		this.location = location;
	}
	public String cityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String pageId() {
		return pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
}
