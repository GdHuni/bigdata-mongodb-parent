package com.leyoujia.bigdata.entity.spider.gtj;

import com.alibaba.fastjson.JSONObject;
import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 惠州公共资源交易中心 土地与矿业网上挂牌交易
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Gtj_jiaoyi.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年1月6日 09:28:39
 */
public class Gtj_jiaoyi extends CommonMongo {

    private static final long serialVersionUID = 1L;
    private JSONObject jsonObj;

    public JSONObject getJsonObj() {
        return jsonObj;
    }

    public void setJsonObj(JSONObject jsonObj) {
        this.jsonObj = jsonObj;
    }
}
