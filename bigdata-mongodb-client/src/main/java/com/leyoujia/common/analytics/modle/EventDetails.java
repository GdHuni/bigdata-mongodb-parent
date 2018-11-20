package com.leyoujia.common.analytics.modle;

/**
 * Created by Administrator on 2016/4/20.
 */
public class EventDetails {
    //    例：底部点击新房
    private String clsname;//类名，MainActivity.class
    private String onClickId;//新房按钮名称；R.id.new_house
    private String des;//可不填 ，例：点击新房

    private long id;

    public EventDetails(){
    }

    public EventDetails( String clsname, String onClickId, String des) {
        this.clsname = clsname;
        this.onClickId = onClickId;
        this.des = des;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClsname() {
        return clsname;
    }

    public void setClsname(String clsname) {
        this.clsname = clsname;
    }

    public String getOnClickId() {
        return onClickId;
    }

    public void setOnClickId(String onClickId) {
        this.onClickId = onClickId;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
