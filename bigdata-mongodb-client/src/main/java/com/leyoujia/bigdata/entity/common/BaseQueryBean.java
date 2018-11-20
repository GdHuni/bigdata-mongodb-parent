package com.leyoujia.bigdata.entity.common;

import java.io.Serializable;

public class BaseQueryBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 当前页 */
	private int pageNo=1;

	/** 每页大小 */
	private int pageSize=12;

	/** 总记录数 */
	private int totalRecord;
	
	private String applyId;  //调用放的唯一id

	/**
	 * 获得当前页 
	 * @return
	 */
	public int getPageNo() {
		if(pageNo < 1){
			return 1;
		}
		/*int totalPage = getTotalPage();
		if(pageNo > totalPage){
			return totalPage;
		}*/
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * 获得分页大小
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * 获得总记录数
	 * @return
	 */
	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	/**
	 * 分页开始数
	 * @return
	 */
	public int getStart() {
		int start =  (getPageNo() - 1) * pageSize;
		if(start < 0){
			return 0;
		}
		return start;
	}
	
	/**
     * 分页结束数
     *
     * @return
     */
    public int getEnd() {
        if (getStart() + pageSize >= totalRecord) {
            return totalRecord;
        }
        if (pageSize == 0) {
            pageSize = 10;
        }
        return getStart() + pageSize;
    }
	
	public int getTotalPage() {
		if(pageSize==0)
		{
			pageSize = 10;
		}
		if(totalRecord==0)
		{
			return 0;
		}
		return (totalRecord+pageSize-1)/pageSize;
	}

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	
	/**
     * 分页开始数
     *Elasticsearch分页使用
     * @return
     */
    public int getElasticStart() {
    	 if (pageNo < 1) {
    		 pageNo = 1;
         }
    	 if(pageSize <= 0){
    		 pageSize = 10;
    	 }
        int start = (pageNo - 1) * pageSize;
        if (start < 0) {
            return 0;
        }
        return start;
    }
}
