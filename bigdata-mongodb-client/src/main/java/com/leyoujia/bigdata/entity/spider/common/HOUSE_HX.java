package com.leyoujia.bigdata.entity.spider.common;

import java.io.Serializable;

/**
 * @功能描述: 户型
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.common.HOUSE_HX.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年7月21日 下午8:14:06
 */ 
public class HOUSE_HX implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 面积 */
	private String mj;
	/** 室 */
	private String s;
	/** 厅 */
	private String t;
	/** 卫 */
	private String w;
	/** 厨 */
	private String c;
	/** 户型图 */
	private String img;
	/** 源 */
	private String src;
	/***--------新加字段--------***/
	/**参考均价*/
	private String ckjj;
	/**户型分布*/
	private String hxfb;
	/**参考总价*/
	private String ckzj;
	/***朝向*/
	private String cx;
	/**建筑类别*/
	private String jzlb;
	/**居住面积*/
	private String jzmj;
	
	/**楼层*/
	private String lc;			//相当于建筑类别
	
	/**标签*/
	private String bq;
	
	
	
	
	
	
	
	
	
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getJzmj() {
		return jzmj;
	}
	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	public String getLc() {
		return lc;
	}
	public void setLc(String lc) {
		this.lc = lc;
	}
	public String getCkjj() {
		return ckjj;
	}
	public void setCkjj(String ckjj) {
		this.ckjj = ckjj;
	}
	public String getHxfb() {
		return hxfb;
	}
	public void setHxfb(String hxfb) {
		this.hxfb = hxfb;
	}
	public String getCkzj() {
		return ckzj;
	}
	public void setCkzj(String ckzj) {
		this.ckzj = ckzj;
	}
	public String getCx() {
		return cx;
	}
	public void setCx(String cx) {
		this.cx = cx;
	}
	public String getJzlb() {
		return jzlb;
	}
	public void setJzlb(String jzlb) {
		this.jzlb = jzlb;
	}
	public String getMj() {
		return mj;
	}
	public void setMj(String mj) {
		this.mj = mj;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
}
