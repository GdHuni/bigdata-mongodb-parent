package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：二手房/租/新房详情页-电话-点击对应的经纪人、对应经纪人号码，房源详情页ID
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.AGG0001.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class AGG0001 implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 类型											:1-一手楼 2二手房 3-租房 */
	private Integer type; 
	/** 详情界面ID（新房为楼盘ID，租房二手房为房号ID）		:888 */
	private Integer did;
	/** 手机号或者400									:13888888888 */
	private String num;
	/** 经纪人ID，新房详情时，为空						:00000000 */
	private String wid;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
}
