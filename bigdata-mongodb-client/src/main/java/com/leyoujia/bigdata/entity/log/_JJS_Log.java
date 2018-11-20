package com.leyoujia.bigdata.entity.log;

import java.io.Serializable;


/**
 * @功能描述: 格式化后的log对象
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.log._JJS_Log.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月14日 上午11:11:19
 */ 
public class _JJS_Log implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 日志类别 102-房产网 101-手机APP */
	private String type;
	//用户识别码
	/** 手机号 */
	private String tel_num;
	/** cookies */
	private String cookies;
	/** ip */
	private String ip;

	/** 城市编码 */
	private String cityCode;
	/** 用户ID */
	private String userId;
	
	/** 操作发生时间 */
	private String s_date;
	/** 操作结束时间 */
	private String e_date;
	
	/** 1一手楼2二手房3租房 */
	private int url_type;
	
	/** 上次URL */
	private String old_url;
	/** 当前URL */
	private String new_url;
	/** 标签 */
	private String tags;
	/** 关键字 */
	private String keyWord;
	/** 坐标 */
	private long[] geo;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTel_num() {
		return tel_num;
	}
	public void setTel_num(String tel_num) {
		this.tel_num = tel_num;
	}
	public String getCookies() {
		return cookies;
	}
	public void setCookies(String cookies) {
		this.cookies = cookies;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String e_date) {
		this.e_date = e_date;
	}
	public String getOld_url() {
		return old_url;
	}
	public void setOld_url(String old_url) {
		this.old_url = old_url;
	}
	public String getNew_url() {
		return new_url;
	}
	public void setNew_url(String new_url) {
		this.new_url = new_url;
	}
	public long[] getGeo() {
		return geo;
	}
	public void setGeo(long[] geo) {
		this.geo = geo;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public int getUrl_type() {
		return url_type;
	}
	public void setUrl_type(int url_type) {
		this.url_type = url_type;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
