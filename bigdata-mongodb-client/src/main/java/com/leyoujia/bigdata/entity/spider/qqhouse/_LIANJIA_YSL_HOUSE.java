package com.leyoujia.bigdata.entity.spider.qqhouse;

import com.leyoujia.bigdata.entity.spider.common.CommonMongo;

/**
 * @功能描述: 链家一手楼数据
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.spider.qqhouse._LIANJIA_YSL_HOUSE.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年11月24日 下午2:20:27
 */ 
public class _LIANJIA_YSL_HOUSE extends CommonMongo {
	private static final long serialVersionUID = 1L;
	/** 楼盘名称 */
	private String name;
	/** 楼盘电话 */
	private String phone;
	/** 楼盘描述 */
	private String lpms;
	/** 楼盘地址 */
	private String addr;
	
	/** 楼盘信息 */
	/** 开发商 */
	private String kfs;
	/** 最新开盘 */
	private String zxkp;
	/** 最早交房 */
	private String zzjf;
	/** 产权年限 */
	private String cqnx;
	/** 规划户数 */
	private String ghhs;
	/** 车位情况 */
	private String cwqk;
	/** 装修状况 */
	private String zxqk;
	/** 建筑类型 */
	private String jzlx;
	/** 物业类型 */
	private String wylx;
	/** 参考均价 */
	private String ckjj;

	/** 物业信息 */
	/** 物业公司 */
	private String wygs;
	/** 占地面积 */
	private String zdmj;
	/** 建筑面积 */
	private String jzmj;
	/** 容积率 */
	private String rjl;
	/** 绿化率 */
	private String lhl;
	/** 物业费用 */
	private String wyfy;
	/** 供暖方式 */
	private String gnfs;
	/** 水电燃气 */
	private String sdrq;
	/** 嫌恶设施 */
	private String xess;
	
	/** 百度地图X */
	private String x;
	/** 百度地图Y */
	private String y;
	
	/** 楼盘所在城市 */
	private String city_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLpms() {
		return lpms;
	}
	public void setLpms(String lpms) {
		this.lpms = lpms;
	}
	public String getKfs() {
		return kfs;
	}
	public void setKfs(String kfs) {
		this.kfs = kfs;
	}
	public String getZxkp() {
		return zxkp;
	}
	public void setZxkp(String zxkp) {
		this.zxkp = zxkp;
	}
	public String getZzjf() {
		return zzjf;
	}
	public void setZzjf(String zzjf) {
		this.zzjf = zzjf;
	}
	public String getCqnx() {
		return cqnx;
	}
	public void setCqnx(String cqnx) {
		this.cqnx = cqnx;
	}
	public String getGhhs() {
		return ghhs;
	}
	public void setGhhs(String ghhs) {
		this.ghhs = ghhs;
	}
	public String getCwqk() {
		return cwqk;
	}
	public void setCwqk(String cwqk) {
		this.cwqk = cwqk;
	}
	public String getZxqk() {
		return zxqk;
	}
	public void setZxqk(String zxqk) {
		this.zxqk = zxqk;
	}
	public String getJzlx() {
		return jzlx;
	}
	public void setJzlx(String jzlx) {
		this.jzlx = jzlx;
	}
	public String getWylx() {
		return wylx;
	}
	public void setWylx(String wylx) {
		this.wylx = wylx;
	}
	public String getCkjj() {
		return ckjj;
	}
	public void setCkjj(String ckjj) {
		this.ckjj = ckjj;
	}
	public String getWygs() {
		return wygs;
	}
	public void setWygs(String wygs) {
		this.wygs = wygs;
	}
	public String getZdmj() {
		return zdmj;
	}
	public void setZdmj(String zdmj) {
		this.zdmj = zdmj;
	}
	public String getJzmj() {
		return jzmj;
	}
	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	public String getRjl() {
		return rjl;
	}
	public void setRjl(String rjl) {
		this.rjl = rjl;
	}
	public String getLhl() {
		return lhl;
	}
	public void setLhl(String lhl) {
		this.lhl = lhl;
	}
	public String getWyfy() {
		return wyfy;
	}
	public void setWyfy(String wyfy) {
		this.wyfy = wyfy;
	}
	public String getGnfs() {
		return gnfs;
	}
	public void setGnfs(String gnfs) {
		this.gnfs = gnfs;
	}
	public String getSdrq() {
		return sdrq;
	}
	public void setSdrq(String sdrq) {
		this.sdrq = sdrq;
	}
	public String getXess() {
		return xess;
	}
	public void setXess(String xess) {
		this.xess = xess;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
}
