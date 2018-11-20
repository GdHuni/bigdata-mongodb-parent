package com.leyoujia.common.analytics.modle;

import java.io.Serializable;

/**
 * yeconglin on 2015/9/7 14:21
 * 浏览记录
 */
public class Cookies implements Serializable {

    private long id;
    private String pageName;//访问页面描述
    private String startTime;//访问开始时间
    private String endTime;//离开页面事件  2015-12-05 14:05:36
    private String className;//访问页面名称

    public Cookies() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
