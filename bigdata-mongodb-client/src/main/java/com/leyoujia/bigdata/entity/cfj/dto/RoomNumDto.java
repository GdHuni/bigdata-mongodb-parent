package com.leyoujia.bigdata.entity.cfj.dto;

import com.leyoujia.bigdata.entity.cfj.CfjBasisObject;

/** 
 * @功能描述： 根据面积维度以及户型维护查询均价走势
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月12日 下午4:31:04 
 */
public class RoomNumDto extends CfjBasisObject{
	
	private static final long serialVersionUID = 1L;
	/** 开始月份 */
	private String sMonth;
	/** 结束月份 */
	private String eMonth;
	
	/** 面积维度
	 *  1：50 以下
	 *  2：50-70
	 *  3：70-90
	 *  4：90-110
	 *  5：110-130
	 *  6：130-150
	 *  7：150-200
	 *  8：200 以上
	*/
	private Integer buildAreaNum;
	/** 面积维度
	 *  1：1
	 *  2：2
	 *  3：3
	 *  4：4
	 *  5：5
	 *  6：5以上
	*/
	private Integer roomNum;
	
	public Integer getBuildAreaNum() {
		return buildAreaNum;
	}
	public void setBuildAreaNum(Integer buildAreaNum) {
		this.buildAreaNum = buildAreaNum;
	}
	public Integer getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}
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
}
