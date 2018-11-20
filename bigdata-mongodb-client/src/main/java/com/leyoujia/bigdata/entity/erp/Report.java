package com.leyoujia.bigdata.entity.erp;

import com.leyoujia.bigdata.entity.common.BaseQueryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @功能描述: 研究报告
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.erp.Report.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年3月27日 下午2:47:31
 */ 
public class Report extends BaseQueryBean {

	private static final long serialVersionUID = 1L;
	/** ID编号 */
	private Integer id;
	/** 标题 */
	private String salesTitle;
	/** 内容 */
	private String salesContent;
	/** 上传人 */
	private String salesUploadWorkerName;
	/** 上传时间 */
	private Date salesUploadTime;
	/** 点击次数 */
	private Integer salesClickNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSalesTitle() {
		return salesTitle;
	}
	public void setSalesTitle(String salesTitle) {
		this.salesTitle = salesTitle;
	}
	public String getSalesContent() {
		return salesContent;
	}
	public void setSalesContent(String salesContent) {
		this.salesContent = salesContent;
	}
	public String getSalesUploadWorkerName() {
		return salesUploadWorkerName;
	}
	public void setSalesUploadWorkerName(String salesUploadWorkerName) {
		this.salesUploadWorkerName = salesUploadWorkerName;
	}
	public Date getSalesUploadTime() {
		return salesUploadTime;
	}
	public String getSalesUploadTimeStr() {
		String result = "未知";
		if(salesUploadTime!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
			result = sdf.format(salesUploadTime);
		}
		return result;
	}
	public void setSalesUploadTime(Date salesUploadTime) {
		this.salesUploadTime = salesUploadTime;
	}
	public Integer getSalesClickNumber() {
		return salesClickNumber;
	}
	public void setSalesClickNumber(Integer salesClickNumber) {
		this.salesClickNumber = salesClickNumber;
	}
}