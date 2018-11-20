package com.leyoujia.bigdata.entity.hq;

import java.io.Serializable;
import java.util.Date;

/**
 * @功能描述: 历史成交记录
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.hq.EsfCjHqInfo.java
 * @创建作者: 朱攀
 * @问题反馈: zhup@jjshome.com
 * @创建日期: 2016年8月17日 上午11:23:02
 */
public class EsfCjHqHistoryInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 楼盘名称*/
	private String lpName;
	/**建筑面积 */
	private Double buildArea;
	/**成交时间 */
	private Date cjDate;
	/**成交价 */
	private Double cjPrice;
	/**过户时间-缴费取新证 */
	private Date ghsj;
	/**成交经纪人ID */
	private String cjWId;
	/**成交经纪人 */
	private String cjWName;
	/**室 */
	private Integer room;
	/**厅 */
	private Integer hall;
	

	public String getLpName() {
		return lpName;
	}

	public void setLpName(String lpName) {
		this.lpName = lpName;
	}

	public Double getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(Double buildArea) {
		this.buildArea = buildArea;
	}

	public Date getCjDate() {
		return cjDate;
	}

	public void setCjDate(Date cjDate) {
		this.cjDate = cjDate;
	}

	public Double getCjPrice() {
		return cjPrice;
	}

	public void setCjPrice(Double cjPrice) {
		this.cjPrice = cjPrice;
	}

	public Date getGhsj() {
		return ghsj;
	}

	public void setGhsj(Date ghsj) {
		this.ghsj = ghsj;
	}

	public String getCjWId() {
		return cjWId;
	}

	public void setCjWId(String cjWId) {
		this.cjWId = cjWId;
	}

	public String getCjWName() {
		return cjWName;
	}

	public void setCjWName(String cjWName) {
		this.cjWName = cjWName;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getHall() {
		return hall;
	}

	public void setHall(Integer hall) {
		this.hall = hall;
	}

	
}
