package com.leyoujia.bigdata.entity.cfj.api;

import java.io.Serializable;

/**
 * @功能描述: 成交记录查询对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.cfj.api.CJInfoQuery.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年6月1日 下午2:23:59
 */ 
public class CJInfoQuery implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 楼盘ID */
	private Integer lpId;
	/** 分页大小 */
	private Integer limitCount;
	
	/** 成交租售类型 */
	private Integer cjLx;
	public CJInfoQuery(){
		
	}
	public CJInfoQuery(Integer lpId, Integer limitCount,Integer cjLx){
		this.lpId = lpId;
		this.limitCount = limitCount;	
		this.cjLx = cjLx;
	}
	public Integer getLpId() {
		return lpId;
	}
	/**  
	 * @功能描述: 设置查询的楼盘ID
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午2:08:23
	 * @param lpId
	 */ 
	public void setLpId(Integer lpId) {
		this.lpId = lpId;
	}
	public Integer getLimitCount() {
		return limitCount;
	}
	/**  
	 * @功能描述: 设置查询的分页大小
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年6月1日 下午2:08:37
	 * @param limitCount
	 */ 
	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}
	public Integer getCjLx() {
		return cjLx;
	}
	public void setCjLx(Integer cjLx) {
		this.cjLx = cjLx;
	}
}
