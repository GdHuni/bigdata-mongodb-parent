package com.leyoujia.common.analytics.modle;

/**
 * Created by Administrator on 2016/4/20.
 */
public class ApiFailure {

    private String url;//请求接口
    private String params;//参数
    private String info;//信息

    public ApiFailure(String url, String params, String info) {
        this.url = url;
        this.params = params;
        this.info = info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
