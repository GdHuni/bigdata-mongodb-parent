package com.leyoujia.bigdata.entity.errorfh;

import java.io.Serializable;

/**
 * @功能描述: 异常房源信息
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.errorfh.ErrorFhMess.java
 * @创建作者: 朱攀
 * @问题反馈: zhup@jjshome.com
 * @创建日期: 2016年9月13日 下午2:10:53
 */
public class ErrorFhMess implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer fhId;// 房号ID
	private Integer errorNum;// 异常编码
	private Integer rsType;// 租售类型

	public Integer getFhId() {
		return fhId;
	}

	public void setFhId(Integer fhId) {
		this.fhId = fhId;
	}

	public Integer getErrorNum() {
		return errorNum;
	}

	public void setErrorNum(Integer errorNum) {
		this.errorNum = errorNum;
	}

	public Integer getRsType() {
		return rsType;
	}

	public void setRsType(Integer rsType) {
		this.rsType = rsType;
	}

}
