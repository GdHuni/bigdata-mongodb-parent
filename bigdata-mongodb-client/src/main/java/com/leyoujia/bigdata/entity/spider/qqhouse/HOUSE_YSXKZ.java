package com.leyoujia.bigdata.entity.spider.qqhouse;

import java.io.Serializable;

public class HOUSE_YSXKZ implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 预售许可证 */
    private String ysxkz;
    /** 发证时间 */
    private String date;
    /** 绑定栋哥 */
    private String dgs;

    public String getYsxkz() {
        return ysxkz;
    }

    public void setYsxkz(String ysxkz) {
        this.ysxkz = ysxkz;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDgs() {
        return dgs;
    }

    public void setDgs(String dgs) {
        this.dgs = dgs;
    }
}
