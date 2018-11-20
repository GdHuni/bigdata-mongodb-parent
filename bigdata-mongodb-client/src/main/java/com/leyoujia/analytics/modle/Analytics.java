package com.leyoujia.analytics.modle;

import java.io.Serializable;
import java.util.List;

/**
 * yeconglin on 2015/8/27 15:28
 */
public class Analytics implements Serializable {

    private static final long serialVersionUID = 1L;
    private MobInfo mobInfo;
    private List<Event> events;

    private List<Cookies> cookies;
    /** 日志时间 */
    private String _insert_date;

    public String get_insert_date() {
        return _insert_date;
    }

    public void set_insert_date(String _insert_date) {
        this._insert_date = _insert_date;
    }

    public List<Cookies> getCookies() {
        return cookies;
    }

    public void setCookies(List<Cookies> cookies) {
        this.cookies = cookies;
    }

    public Analytics() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public MobInfo getMobInfo() {
        return mobInfo;
    }

    public void setMobInfo(MobInfo mobInfo) {
        this.mobInfo = mobInfo;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
