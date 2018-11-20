package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 深圳中原学校
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Zy_Sz_School.java
 * @创建作者: 张丽洪
 * @问题反馈: 1248069229@qq.com
 * @创建日期: 2017年2月9日 08:52:28
 */
public class Zy_Sz_School extends CommonMongo {
    private String 城市;

    private String 城区;

    private String 地址;

    private String 学校名称;

    private String 学校类型;

    private String 学校简介;

    private String 联系方式;

    public String get城市() {
        return 城市;
    }

    public void set城市(String 城市) {
        this.城市 = 城市;
    }

    public String get城区() {
        return 城区;
    }

    public void set城区(String 城区) {
        this.城区 = 城区;
    }

    public String get地址() {
        return 地址;
    }

    public void set地址(String 地址) {
        this.地址 = 地址;
    }

    public String get学校名称() {
        return 学校名称;
    }

    public void set学校名称(String 学校名称) {
        this.学校名称 = 学校名称;
    }

    public String get学校类型() {
        return 学校类型;
    }

    public void set学校类型(String 学校类型) {
        this.学校类型 = 学校类型;
    }

    public String get学校简介() {
        return 学校简介;
    }

    public void set学校简介(String 学校简介) {
        this.学校简介 = 学校简介;
    }

    public String get联系方式() {
        return 联系方式;
    }

    public void set联系方式(String 联系方式) {
        this.联系方式 = 联系方式;
    }
}
