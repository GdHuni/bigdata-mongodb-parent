package com.leyoujia.bigdata.entity.spider.qqhouse;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 房天下资讯数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qqhouse.Fang_zx.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2016年3月26日 下午3:53:23
 */
public class Fang_zx extends CommonMongo {
    /** 主键 */
    private String id;
    /** 标题 */
    private String title;
    /** 来源 */
    private String source;
    /** 作者 */
//    private String author;
    /** 新闻时间 */
    private String release_date;
    /** 摘要 */
    private String summary;
    /** 城市 */
    private String city;
    /** 新闻内容 */
    private String content;
    /** 新闻往外链接 */
    private String url;
    /** 标签 使用 ; 分隔 */
    private String labels;
    /** 关联的楼盘名称 */
    private String lp_name;
    /** 关联的楼盘地址 */
    private String lp_url;
    /** 来源 0 : 来源于房天下资讯市场模块  ---- 2 : 来源于房天下新房动态模块 */
    private Integer orign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getLp_name() {
        return lp_name;
    }

    public void setLp_name(String lp_name) {
        this.lp_name = lp_name;
    }

    public String getLp_url() {
        return lp_url;
    }

    public void setLp_url(String lp_url) {
        this.lp_url = lp_url;
    }

    public Integer getOrign() {
        return orign;
    }

    public void setOrign(Integer orign) {
        this.orign = orign;
    }
}
