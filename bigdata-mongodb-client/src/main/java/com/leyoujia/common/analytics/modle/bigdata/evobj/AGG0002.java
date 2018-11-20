package com.leyoujia.common.analytics.modle.bigdata.evobj;

import java.io.Serializable;

/**
 * @功能描述: 事件埋点：房产网用户id、房产网用户名、对应的经纪人工号、对应经纪人号码
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.evobj.AGG0002.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月26日 上午10:18:49
 */ 
public class AGG0002 implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 房产网用户id											:00 */
	private String fUid; 
	/** 房产网用户名		:张先生 */
	private Integer fUName;
	/** 对应经纪人手机号或者400									:13888888888 */
	private String num;
	/** 对应的经纪人工号，新房详情时，为空						:00000000 */
	private String wid;
	public String getfUid() {
		return fUid;
	}
	public void setfUid(String fUid) {
		this.fUid = fUid;
	}
	public Integer getfUName() {
		return fUName;
	}
	public void setfUName(Integer fUName) {
		this.fUName = fUName;
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
