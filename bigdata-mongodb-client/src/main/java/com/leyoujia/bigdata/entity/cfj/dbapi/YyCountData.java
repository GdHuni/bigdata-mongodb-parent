package com.leyoujia.bigdata.entity.cfj.dbapi;

import java.io.Serializable;

/**
 * @功能描述: 预约带看房源相关属性
 * @项目版本: V1.0
 * @相对路径: com.jjshome.bigdata.entity.cfj.dbapi.YyCountData
 * @创建作者: xiejinyan
 * @创建日期: 2016年8月9日 下午3:47:34
 */
public class YyCountData implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 总数 */
	private Integer count;
	/** 当月累积的预约单数 */
	private Integer currNum;
	/**房源ID*/
	private Integer fhId;
	/**归属方类型*/
	private String blType;
	/**租售类型*/
	private String blClass;
	/**二手租成交量*/
	private Integer zfCjCt;
	/**二手售成交量*/
	private Integer efCjCt;
	/**一手售成交量*/
	private Integer ysCjCt;
	/**所有成交量*/
	private Integer allCjCt;

	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCurrNum() {
		return currNum;
	}
	public void setCurrNum(Integer currNum) {
		this.currNum = currNum;
	}
	public Integer getFhId() {
		return fhId;
	}
	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}
	public String getBlType() {
		return blType;
	}
	public void setBlType(String blType) {
		this.blType = blType;
	}
	public String getBlClass() {
		return blClass;
	}
	public void setBlClass(String blClass) {
		this.blClass = blClass;
	}
	public Integer getZfCjCt() {
		return zfCjCt;
	}
	public void setZfCjCt(Integer zfCjCt) {
		this.zfCjCt = zfCjCt;
	}
	public Integer getEfCjCt() {
		return efCjCt;
	}
	public void setEfCjCt(Integer efCjCt) {
		this.efCjCt = efCjCt;
	}
	public Integer getYsCjCt() {
		return ysCjCt;
	}
	public void setYsCjCt(Integer ysCjCt) {
		this.ysCjCt = ysCjCt;
	}
	public Integer getAllCjCt() {
		return allCjCt;
	}
	public void setAllCjCt(Integer allCjCt) {
		this.allCjCt = allCjCt;
	}
}
