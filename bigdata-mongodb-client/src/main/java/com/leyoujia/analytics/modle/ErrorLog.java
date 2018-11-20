package com.leyoujia.analytics.modle;

import java.io.Serializable;

/**
 * yeconglin on 2015/8/27 11:39
 */
public class ErrorLog implements Serializable {
    private static final long serialVersionUID = 1L;
    private MobInfo mobInfo;
    private String errorLog;

    public ErrorLog() {
        super();
    }

    public MobInfo getMobInfo() {
        return mobInfo;
    }

    public void setMobInfo(MobInfo mobInfo) {
        this.mobInfo = mobInfo;
    }

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }
}
