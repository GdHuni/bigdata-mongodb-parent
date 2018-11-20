package com.leyoujia.bigdata.entity.common;

import java.io.Serializable;

/**
 * @功能描述: EASY UI查询对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.common.EasyUIQueryVO.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年10月15日 上午11:09:39
 * @param <T>
 */ 
public class EasyUIQueryVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 页数 */
	private Integer page;
	/** 大小 */
	private Integer rows;
	/** 排序列字段名 */
	private String sort;
	/** 排序方式，可以是 'asc' 或者 'desc'，默认值是 'asc' */
	private String order;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSort() {
		if("lpUnitDiff".equals(sort))
			sort = "CAST(ABS(A.CJ_UNIT_PRICE - A.LP_CJ_UNIT_PRICE)/A.LP_CJ_UNIT_PRICE*100 AS DECIMAL(11,2))";
		if("cjDate".equals(sort))
			sort = "CJ_DATE";
		if("lpId".equals(sort))
			sort = "LP_ID";
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	/**  
	 * @功能描述: 分页开始
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月15日 下午3:56:59
	 * @return
	 */ 
	public int getStart(){
		int start =  (page - 1) * rows;
		if(start < 0){
			return 0;
		}
		return start;
	}
	/**  
	 * @功能描述: 分页结束
	 * @创建作者: 欧阳文斌
	 * @创建日期: 2016年10月15日 下午3:57:10
	 * @return
	 */ 
	public int getEnd(){
		if(rows==null){
			rows = 20;
		}
        return rows;
	}
}
