package com.leyoujia.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/*
使用spring boot专用dubbo就不用这样配置 */
//@ImportResource({"classpath:dubbo.xml"})
public class ServiceApplicationMain {
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplicationMain.class, args);
	}
}
