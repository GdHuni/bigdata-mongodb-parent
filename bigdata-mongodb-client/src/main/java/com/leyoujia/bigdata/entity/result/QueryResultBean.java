package com.leyoujia.bigdata.entity.result;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

public class QueryResultBean<T> extends BaseResultBean implements Serializable {

    private static final long serialVersionUID = -6811495919370053255L;

    private List<T> datas;

    private int totalRecord;

    private int currentPage;

    private int pageSize;

    private String features;

    private String suggestKey;
    
    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getCurrentPage() {
        if (currentPage < 1) {
            currentPage = 1;
        }
        if (currentPage >= getTotalPage()) {
            currentPage = getTotalPage();
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    //总页数
    public int getTotalPage() {
        if (pageSize == 0) {
            pageSize = 10;
        }
        if (totalRecord == 0) {
            return 0;
        }
        return (totalRecord + pageSize - 1) / pageSize;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

	public String getSuggestKey() {
		return suggestKey;
	}

	public void setSuggestKey(String suggestKey) {
		this.suggestKey = suggestKey;
	}

}
