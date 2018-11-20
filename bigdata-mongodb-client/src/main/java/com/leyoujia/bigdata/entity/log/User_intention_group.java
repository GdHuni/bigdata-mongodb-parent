package com.leyoujia.bigdata.entity.log;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @功能描述: 客户意向模型 
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.log.User_intention_group.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年12月14日 下午2:28:31
 */
public class User_intention_group implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 日志类别 102-房产网 101-手机APP */
	private String _log_type;
	//用户识别码
	/** 手机 */
	private String _tel_num;
	/** cookies */
	private String _cookies;
	/** ip */
	//@Indexed
	private String _ip;
	/** userid */
	//@Indexed
	private String _user_id;
	
	/** 房源的浏览记录 */
	private Map<String, ViewHouse> _view_house;

	/** 地段 */
	private Map<String, Integer> _diduan;
	/** 价格 */
	private Map<String, Integer> _jiage;
	/** 面积 esf-zf */
	private Map<String, Integer> _mianji;
	/** 户型 */
	private Map<String, Integer> _huxing;
	/** 朝向 esf-zf */
	private Map<String, Integer> _chaoxiang;
	/** 装修 */
	private Map<String, Integer> _zhuangxiu;
	/** 楼龄 */
	private Map<String, Integer> _louling;
	/** 特色 */
	private Map<String, Integer> _tese;
	/** 类型 */
	private Map<String, Integer> _leixing;
	/** 关键字 */
	private Map<String, Integer> _keywords;
	
	/** 历史的GEO坐标-时间 */
	private Map<String, Integer> _geo_history;
	/** 更新时间 */
	private String _update_date;

	public User_intention_group() {}
	public User_intention_group(User_intention obj) {
		if(obj!=null){
			if(StringUtils.isNotEmpty(obj.get_log_type())){
				this._log_type = obj.get_log_type();
			}
			if(StringUtils.isNotEmpty(obj.get_tel_num())){
				this._tel_num = obj.get_tel_num();
			}
			if(StringUtils.isNotEmpty(obj.get_cookies())){
				this._cookies = obj.get_cookies();
			}
			if(StringUtils.isNotEmpty(obj.get_ip())){
				this._ip = obj.get_ip();
			}
			if(StringUtils.isNotEmpty(obj.get_user_id())){
				this._user_id = obj.get_user_id();
			}
			if(obj.get_view_house()!=null){
				this._view_house = new HashMap<String, ViewHouse>();
				this._view_house.put(obj.get_view_house().getApp_type()+obj.get_view_house().getApp_id(), obj.get_view_house());
			}
			if(StringUtils.isNotEmpty(obj.get_diduan())){
				this._diduan = new HashMap<String, Integer>();
				this._diduan.put(obj.get_diduan(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_jiage())){
				this._jiage = new HashMap<String, Integer>();
				this._jiage.put(obj.get_jiage(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_mianji())){
				this._mianji = new HashMap<String, Integer>();
				this._mianji.put(obj.get_mianji(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_huxing())){
				this._huxing = new HashMap<String, Integer>();
				this._huxing.put(obj.get_huxing(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_chaoxiang())){
				this._chaoxiang = new HashMap<String, Integer>();
				this._chaoxiang.put(obj.get_chaoxiang(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_zhuangxiu())){
				this._zhuangxiu = new HashMap<String, Integer>();
				this._zhuangxiu.put(obj.get_zhuangxiu(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_louling())){
				this._louling = new HashMap<String, Integer>();
				this._louling.put(obj.get_louling(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_tese())){
				this._tese = new HashMap<String, Integer>();
				this._tese.put(obj.get_tese(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_leixing())){
				this._leixing = new HashMap<String, Integer>();
				this._leixing.put(obj.get_leixing(), 1);
			}
			if(StringUtils.isNotEmpty(obj.get_keywords())){
				this._keywords = new HashMap<String, Integer>();
				this._keywords.put(obj.get_keywords(), 1);
			}
		}
	}
	
	public void set_USER_INTENTION(User_intention obj){
		if(obj!=null){
			if(StringUtils.isNotEmpty(obj.get_log_type())){
				this._log_type = obj.get_log_type();
			}
			if(StringUtils.isNotEmpty(obj.get_tel_num())){
				this._tel_num = obj.get_tel_num();
			}
			if(StringUtils.isNotEmpty(obj.get_cookies())){
				this._cookies = obj.get_cookies();
			}
			if(StringUtils.isNotEmpty(obj.get_ip())){
				this._ip = obj.get_ip();
			}
			if(StringUtils.isNotEmpty(obj.get_user_id())){
				this._user_id = obj.get_user_id();
			}
			if(obj.get_view_house()!=null){
				if(this._view_house==null) this._view_house = new HashMap<String, ViewHouse>();
				String key = obj.get_view_house().getApp_type()+obj.get_view_house().getApp_id();
				ViewHouse vh = this._view_house.get(key);
				if(vh!=null){
					obj.get_view_house().setCount(vh.getCount()+1);
				}
				this._view_house.put(key, obj.get_view_house());
			}
			if(StringUtils.isNotEmpty(obj.get_diduan())){
				Integer count = 0;
				if(this._diduan==null){
					this._diduan = new HashMap<String, Integer>();
				}else{
					count = this._diduan.get(obj.get_diduan());
					if(count==null) count = 0;
				}
				this._diduan.put(obj.get_diduan(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_jiage())){
				Integer count = 0;
				if(this._jiage==null){
					this._jiage = new HashMap<String, Integer>();
				}else{
					count = this._jiage.get(obj.get_jiage());
					if(count==null) count = 0;
				}
				this._jiage.put(obj.get_jiage(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_mianji())){
				Integer count = 0;
				if(this._mianji==null){
					this._mianji = new HashMap<String, Integer>();
				}else{
					count = this._mianji.get(obj.get_mianji());
					if(count==null) count = 0;
				}
				this._mianji.put(obj.get_mianji(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_huxing())){
				Integer count = 0;
				if(this._huxing==null){
					this._huxing = new HashMap<String, Integer>();
				}else{
					count = this._huxing.get(obj.get_huxing());
					if(count==null) count = 0;
				}
				this._huxing.put(obj.get_huxing(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_chaoxiang())){
				Integer count = 0;
				if(this._chaoxiang==null){
					this._chaoxiang = new HashMap<String, Integer>();
				}else{
					count = this._chaoxiang.get(obj.get_chaoxiang());
					if(count==null) count = 0;
				}
				this._chaoxiang.put(obj.get_chaoxiang(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_zhuangxiu())){
				Integer count = 0;
				if(this._zhuangxiu==null){
					this._zhuangxiu = new HashMap<String, Integer>();
				}else{
					count = this._zhuangxiu.get(obj.get_zhuangxiu());
					if(count==null) count = 0;
				}
				this._zhuangxiu.put(obj.get_zhuangxiu(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_louling())){
				Integer count = 0;
				if(this._louling==null){
					this._louling = new HashMap<String, Integer>();
				}else{
					count = this._louling.get(obj.get_louling());
					if(count==null) count = 0;
				}
				this._louling.put(obj.get_louling(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_tese())){
				Integer count = 0;
				if(this._tese==null){
					this._tese = new HashMap<String, Integer>();
				}else{
					count = this._tese.get(obj.get_tese());
					if(count==null) count = 0;
				}
				this._tese.put(obj.get_tese(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_leixing())){
				Integer count = 0;
				if(this._leixing==null){
					this._leixing = new HashMap<String, Integer>();
				}else{
					count = this._leixing.get(obj.get_leixing());
					if(count==null) count = 0;
				}
				this._leixing.put(obj.get_leixing(), ++count);
			}
			if(StringUtils.isNotEmpty(obj.get_keywords())){
				Integer count = 0;
				if(this._keywords==null){
					this._keywords = new HashMap<String, Integer>();
				}else{
					count = this._keywords.get(obj.get_keywords());
					if(count==null) count = 0;
				}
				this._keywords.put(obj.get_keywords(), ++count);
			}
		}
	}
	

	
	public void set_USER_INTENTION_GROUP(User_intention_group obj){
		if(obj!=null){
			if(StringUtils.isNotEmpty(obj.get_log_type())){
				this._log_type = obj.get_log_type();
			}
			if(StringUtils.isNotEmpty(obj.get_tel_num())){
				this._tel_num = obj.get_tel_num();
			}
			if(StringUtils.isNotEmpty(obj.get_cookies())){
				this._cookies = obj.get_cookies();
			}
			if(StringUtils.isNotEmpty(obj.get_ip())){
				this._ip = obj.get_ip();
			}
			if(StringUtils.isNotEmpty(obj.get_user_id())){
				this._user_id = obj.get_user_id();
			}
			if(obj.get_view_house()!=null){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if(this._view_house==null) this._view_house = new HashMap<String, ViewHouse>();
				for (Map.Entry<String, ViewHouse> entry : obj.get_view_house().entrySet()) {
					ViewHouse newvh = entry.getValue();
					String key = newvh.getApp_type()+newvh.getApp_id();
					ViewHouse vh = this._view_house.get(key);
					if(vh!=null){
						Integer count = vh.getCount();
						newvh.setCount(count+newvh.getCount());
						try {
							if(sdf.parse(vh.getUpdate_time()).getTime()>sdf.parse(newvh.getUpdate_time()).getTime()){
								newvh.setUpdate_time(vh.getUpdate_time());
							}
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
					this._view_house.put(key, newvh);
				}
			}
			if(obj.get_diduan()!=null){
				if(this._diduan==null)
					this._diduan = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_diduan().entrySet()) {
					Integer count = 0;
					count = this._diduan.get(entry.getKey());
					if(count==null) count = 0;
					this._diduan.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_jiage()!=null){
				if(this._jiage==null)
					this._jiage = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_jiage().entrySet()) {
					Integer count = 0;
					count = this._jiage.get(entry.getKey());
					if(count==null) count = 0;
					this._jiage.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_mianji()!=null){
				if(this._mianji==null)
					this._mianji = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_mianji().entrySet()) {
					Integer count = 0;
					count = this._mianji.get(entry.getKey());
					if(count==null) count = 0;
					this._mianji.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_huxing()!=null){
				if(this._huxing==null)
					this._huxing = new HashMap<String, Integer>();
				Map<String, Integer> _map = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_huxing().entrySet()) {
					if (entry.getKey() != null) {
						if (entry.getKey().indexOf("@") > -1) {
							String key [] = entry.getKey().split("@");
							for (int i = 0;i < key.length; i++) {
								_map.put(key[i], entry.getValue());
							}
						}
						if (entry.getKey().indexOf(" ") > -1) {
							String key [] = entry.getKey().split(" ");
							for (int i = 0;i < key.length; i++) {
								_map.put(key[i].replace("房", ""), entry.getValue());
							}
						}
					}
				}
				int j = 0;
				for (Map.Entry<String, Integer> entry : _map.entrySet()) {
					Integer count = 0;
					count = this._huxing.get(entry.getKey());
					if(count==null) count = 0;
					this._huxing.put(entry.getKey(), count+entry.getValue());
					j = 1;
				}
				if (j == 0) {
					for (Map.Entry<String, Integer> entry : obj.get_huxing().entrySet()) {
						Integer count = 0;
						count = this._huxing.get(entry.getKey());
						if(count==null) count = 0;
						this._huxing.put(entry.getKey(), count+entry.getValue());
					}
				}
			}
			if(obj.get_chaoxiang()!=null){
				if(this._chaoxiang==null)
					this._chaoxiang = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_chaoxiang().entrySet()) {
					Integer count = 0;
					count = this._chaoxiang.get(entry.getKey());
					if(count==null) count = 0;
					this._chaoxiang.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_zhuangxiu()!=null){
				if(this._zhuangxiu==null)
					this._zhuangxiu = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_zhuangxiu().entrySet()) {
					Integer count = 0;
					count = this._zhuangxiu.get(entry.getKey());
					if(count==null) count = 0;
					this._zhuangxiu.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_louling()!=null){
				if(this._louling==null)
					this._louling = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_louling().entrySet()) {
					Integer count = 0;
					count = this._louling.get(entry.getKey());
					if(count==null) count = 0;
					this._louling.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_tese()!=null){
				if(this._tese==null)
					this._tese = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_tese().entrySet()) {
					Integer count = 0;
					count = this._tese.get(entry.getKey());
					if(count==null) count = 0;
					this._tese.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_leixing()!=null){
				if(this._leixing==null)
					this._leixing = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_leixing().entrySet()) {
					Integer count = 0;
					count = this._leixing.get(entry.getKey());
					if(count==null) count = 0;
					this._leixing.put(entry.getKey(), count+entry.getValue());
				}
			}
			if(obj.get_keywords()!=null){
				if(this._keywords==null)
					this._keywords = new HashMap<String, Integer>();
				for (Map.Entry<String, Integer> entry : obj.get_keywords().entrySet()) {
					Integer count = 0;
					count = this._keywords.get(entry.getKey());
					if(count==null) count = 0;
					this._keywords.put(entry.getKey(), count+entry.getValue());
				}
			}
		}
	}
	
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

	public Map<String, ViewHouse> get_view_house() {
		return _view_house;
	}
	public void set_view_house(Map<String, ViewHouse> _view_house) {
		this._view_house = _view_house;
	}
	public Map<String, Integer> get_diduan() {
		return _diduan;
	}

	public void set_diduan(Map<String, Integer> _diduan) {
		this._diduan = _diduan;
	}

	public Map<String, Integer> get_jiage() {
		return _jiage;
	}

	public void set_jiage(Map<String, Integer> _jiage) {
		this._jiage = _jiage;
	}

	public Map<String, Integer> get_mianji() {
		return _mianji;
	}

	public void set_mianji(Map<String, Integer> _mianji) {
		this._mianji = _mianji;
	}

	public Map<String, Integer> get_huxing() {
		return _huxing;
	}

	public void set_huxing(Map<String, Integer> _huxing) {
		this._huxing = _huxing;
	}

	public Map<String, Integer> get_chaoxiang() {
		return _chaoxiang;
	}

	public void set_chaoxiang(Map<String, Integer> _chaoxiang) {
		this._chaoxiang = _chaoxiang;
	}

	public Map<String, Integer> get_zhuangxiu() {
		return _zhuangxiu;
	}
	public void set_zhuangxiu(Map<String, Integer> _zhuangxiu) {
		this._zhuangxiu = _zhuangxiu;
	}
	public Map<String, Integer> get_louling() {
		return _louling;
	}
	public void set_louling(Map<String, Integer> _louling) {
		this._louling = _louling;
	}
	public Map<String, Integer> get_tese() {
		return _tese;
	}
	public void set_tese(Map<String, Integer> _tese) {
		this._tese = _tese;
	}
	public Map<String, Integer> get_leixing() {
		return _leixing;
	}
	public void set_leixing(Map<String, Integer> _leixing) {
		this._leixing = _leixing;
	}
	public Map<String, Integer> get_geo_history() {
		return _geo_history;
	}

	public void set_geo_history(Map<String, Integer> _geo_history) {
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
	public Map<String, Integer> get_keywords() {
		return _keywords;
	}
	public void set_keywords(Map<String, Integer> _keywords) {
		this._keywords = _keywords;
	}
	public String get_log_type() {
		return _log_type;
	}
	public void set_log_type(String _log_type) {
		this._log_type = _log_type;
	}
}
