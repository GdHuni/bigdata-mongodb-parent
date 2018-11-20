package com.leyoujia.bigdata.entity.spider.gtj;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * 
 * @功能描述：湖南湘潭户型类 
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.gtj.Xt_hx.java
 * @创建作者: <a href="mailto:yangx@jjshome.com">杨献</a>
 * @创建日期: 2017年4月27日 下午3:51:07
 */
public class Xt_hx extends CommonMongo {

	private static final long serialVersionUID = 1L;
	private String 居室;
	private String 户型图;
	public String get居室() {
		return 居室;
	}
	public void set居室(String 居室) {
		this.居室 = 居室;
	}
	public String get户型图() {
		return 户型图;
	}
	public void set户型图(String 户型图) {
		this.户型图 = 户型图;
	}
	
}
