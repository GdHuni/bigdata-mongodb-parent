package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：搜索框-热搜楼盘-当用户点击了搜索框中的热门楼盘则记录事件
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.ASS0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class ASS0001 implements Serializable{
	private static final long serialVersionUID = 1L;

    /** 来源 					:0-首页 1-新房 2-二手房 3-租房 4-地图找房 5-小区 */
    private String source;
    /** 楼盘ID				:888 */
    private Integer lpId;
    /** 检索楼盘的类型			:1-新房 2-二手房 3-租房 */
    private Integer type;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Integer getLpId() {
		return lpId;
	}
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
}
