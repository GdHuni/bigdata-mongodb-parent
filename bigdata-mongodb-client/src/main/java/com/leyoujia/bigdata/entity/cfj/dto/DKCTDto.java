package com.leyoujia.bigdata.entity.cfj.dto;

import java.io.Serializable;

/** 
 * @功能描述： 带看量及环比Dto
 * @项目名称： 大数据-查房价  
 * @项目版本： 1.0
 * @创建作者： 沈阳
 * @创建日期： 2016年5月11日 下午9:42:00 
 */
public class DKCTDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/** 带看量 */
	private int dkCT;
	/** 环比带看量 */
	private int dkAnnularCT;
	
	
	public int getDkCT() {
		return dkCT;
	}
	public void setDkCT(int dkCT) {
		this.dkCT = dkCT;
	}
	public int getDkAnnularCT() {
		return dkAnnularCT;
	}
	public void setDkAnnularCT(int dkAnnularCT) {
		this.dkAnnularCT = dkAnnularCT;
	}
		
}
