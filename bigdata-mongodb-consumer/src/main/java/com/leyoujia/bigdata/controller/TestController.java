package com.leyoujia.bigdata.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leyoujia.bigdata.service.ICommonMongoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class TestController {

    @Reference()
    private ICommonMongoService commonMongoService;

    @GetMapping("hello")
    public String hello() {
        JSONObject Json = new JSONObject();
        JSONArray array = new JSONArray();
        Json.put("name","zhouhu");
        Json.put("why","test");
        Json.put("ok","ok");
        array.add(Json);
        commonMongoService.insert_collections(array,"s");
        //System.out.println("woaini");
       // BigdataResult<List<Integer>> houseSample = recommendService.getHouseSample("011457");
        return "sucess";
    }


}