package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 楼盘图表数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.LpChartData.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午4:57:42
 */ 
public class LpChartData implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 均价 */
	private Double price;
	/** 均价环比 */
	private Double priceCent;
	/** 数量 */
	private Integer count;
	/** 数量环比 */
	private Double countCent;
	/** 月份 */
	private String month;
	/** 环比月份 */
	private String centMonth;
	/** 年份 */
	private String[] xAxis;
	private Double[] yPrice;
	private Integer[] yCount;
	/**  
	 * @功能描述: 均价
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:07:25
	 * @return
	 */ 
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	/**  
	 * @功能描述: 均价环比
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:07:33
	 * @return
	 */ 
	public Double getPriceCent() {
		return priceCent;
	}
	public void setPriceCent(Double priceCent) {
		this.priceCent = priceCent;
	}
	/**  
	 * @功能描述: 市场成交数量
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:07:41
	 * @return
	 */ 
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	/**  
	 * @功能描述: 成交数量环比
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:07:50
	 * @return
	 */ 
	public Double getCountCent() {
		return countCent;
	}
	public void setCountCent(Double countCent) {
		this.countCent = countCent;
	}
	/**  
	 * @功能描述: 月份
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:07:59
	 * @return
	 */ 
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	/**  
	 * @功能描述: 环比月份
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:08:05
	 * @return
	 */ 
	public String getCentMonth() {
		return centMonth;
	}
	public void setCentMonth(String centMonth) {
		this.centMonth = centMonth;
	}
	/**  
	 * @功能描述: X轴<br/>format:<font color="red">16/01</font>
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:08:11
	 * @return
	 */ 
	public String[] getxAxis() {
		return xAxis;
	}
	public void setxAxis(String[] xAxis) {
		this.xAxis = xAxis;
	}
	/**  
	 * @功能描述: 价格趋势
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:09:52
	 * @return
	 */ 
	public Double[] getyPrice() {
		return yPrice;
	}
	public void setyPrice(Double[] yPrice) {
		this.yPrice = yPrice;
	}
	/**  
	 * @功能描述: 数量趋势
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午5:10:02
	 * @return
	 */ 
	public Integer[] getyCount() {
		return yCount;
	}
	public void setyCount(Integer[] yCount) {
		this.yCount = yCount;
	}
}
