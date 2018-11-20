package com.leyoujia.bigdata.entity.cfj.dto;

import com.leyoujia.bigdata.entity.cfj.CfjBasisObject;

/** 
 * @功能描述： 按月份和区域的查询条件dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月11日 上午10:48:16 
 */
public class CJMonthDto extends CfjBasisObject{
	private static final long serialVersionUID = 1L;
	/** 开始月份 */
	private String sMonth;
	/** 结束月份 */
	private String eMonth;
	/** 分页数量 */
	private Integer limitCount;
	/** 城市代码 */
	private String cityCode;
	
	public String getsMonth() {
		return sMonth;
	}
	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}
	public String geteMonth() {
		return eMonth;
	}
	public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}
	public Integer getLimitCount() {
		return limitCount;
	}
	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
}
