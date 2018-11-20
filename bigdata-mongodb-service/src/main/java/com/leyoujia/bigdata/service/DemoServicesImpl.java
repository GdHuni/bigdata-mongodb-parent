package com.leyoujia.bigdata.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service()
public class DemoServicesImpl implements IDemoServices {


    @Override
    public String getName() {
        return "测试dubbo接口";
    }
}
