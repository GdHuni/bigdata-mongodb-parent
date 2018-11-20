package com.leyoujia.common.analytics.modle;

import java.io.Serializable;

/**
 * yeconglin on 2015/8/26 10:11
 */
public class Event implements Serializable {

    private String eventId;//自定义事件id
    private String eventDetail;//自定义事件具体参数
    private String starttime;//开始时间
    private String endtime;//结束时间
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event() {
        super();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }
}
