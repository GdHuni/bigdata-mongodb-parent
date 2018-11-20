package com.leyoujia.bigdata.entity.log;

import java.io.Serializable;

/**
 * @功能描述: 客户意向模型 
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.log.User_intention.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月14日 下午2:28:31
 */ 
public class User_intention implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 日志类别 102-房产网 101-手机APP */
	private String _log_type;
	//用户识别码
	/** 手机 */
	private String _tel_num;
	/** cookies */
	private String _cookies;
	/** ip */
	private String _ip;
	/** 房产网userid */
	private String _user_id;
	
	/** 房源的浏览记录 */
	private ViewHouse _view_house;
	
	/** 地段 */
	private String _diduan;
	/** 价格 */
	private String _jiage;
	/** 面积 esf-zf */
	private String _mianji;
	/** 户型 */
	private String _huxing;
	/** 朝向 esf-zf */
	private String _chaoxiang;
	/** 装修 */
	private String _zhuangxiu;
	/** 楼龄 */
	private String _louling;
	/** 特色 */
	private String _tese;
	/** 类型 */
	private String _leixing;
	/** 关键字 */
	private String _keywords;
	
	/** 历史的GEO坐标 */
	private String _geo_history;
	/** 事件时间 */
	private String _update_date;

	public String get_tel_num() {
		return _tel_num;
	}

	public void set_tel_num(String _tel_num) {
		this._tel_num = _tel_num;
	}

	public String get_cookies() {
		return _cookies;
	}

	public void set_cookies(String _cookies) {
		this._cookies = _cookies;
	}

	public String get_ip() {
		return _ip;
	}

	public void set_ip(String _ip) {
		this._ip = _ip;
	}

	public ViewHouse get_view_house() {
		return _view_house;
	}

	public void set_view_house(ViewHouse _view_house) {
		this._view_house = _view_house;
	}

	public String get_diduan() {
		return _diduan;
	}

	public void set_diduan(String _diduan) {
		this._diduan = _diduan;
	}

	public String get_jiage() {
		return _jiage;
	}

	public void set_jiage(String _jiage) {
		this._jiage = _jiage;
	}

	public String get_mianji() {
		return _mianji;
	}

	public void set_mianji(String _mianji) {
		this._mianji = _mianji;
	}

	public String get_huxing() {
		return _huxing;
	}

	public void set_huxing(String _huxing) {
		this._huxing = _huxing;
	}

	public String get_chaoxiang() {
		return _chaoxiang;
	}

	public void set_chaoxiang(String _chaoxiang) {
		this._chaoxiang = _chaoxiang;
	}

	public String get_zhuangxiu() {
		return _zhuangxiu;
	}

	public void set_zhuangxiu(String _zhuangxiu) {
		this._zhuangxiu = _zhuangxiu;
	}

	public String get_louling() {
		return _louling;
	}

	public void set_louling(String _louling) {
		this._louling = _louling;
	}

	public String get_tese() {
		return _tese;
	}

	public void set_tese(String _tese) {
		this._tese = _tese;
	}

	public String get_leixing() {
		return _leixing;
	}

	public void set_leixing(String _leixing) {
		this._leixing = _leixing;
	}

	public String get_geo_history() {
		return _geo_history;
	}

	public void set_geo_history(String _geo_history) {
		this._geo_history = _geo_history;
	}

	public String get_update_date() {
		return _update_date;
	}

	public void set_update_date(String _update_date) {
		this._update_date = _update_date;
	}

	public String get_user_id() {
		return _user_id;
	}

	public void set_user_id(String _user_id) {
		this._user_id = _user_id;
	}

	public String get_keywords() {
		return _keywords;
	}

	public void set_keywords(String _keywords) {
		this._keywords = _keywords;
	}

	public String get_log_type() {
		return _log_type;
	}

	public void set_log_type(String _log_type) {
		this._log_type = _log_type;
	}
}
