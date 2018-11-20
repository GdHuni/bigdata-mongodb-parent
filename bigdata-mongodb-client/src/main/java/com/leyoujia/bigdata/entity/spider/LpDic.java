package com.leyoujia.bigdata.entity.spider;

import java.io.Serializable;

public class LpDic implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 城市 */
	private String city;
	/** 区域 */
	private String area;
	/** 片区 */
	private String place;
	/** 所在区域*/
	private String szqy;
	/** 楼盘名称 */
	private String name;
	/** 楼盘拼音缩写 */
	private String nameSpell;
	/** 地址 */
	private String addr;
	/** 建筑年代 */
	private String bulidYear;
	/** 运行主键 */
	private String execId;
	/**项目特色*/
	private String xmts;
	/** 邮编*/
	private String yb;
	/**产权描述*/
	private String cqms;
	/**物业类别*/
	private String wylb;
	/**竣工时间*/
	private String jgsj;
	/**开 发 商*/
	private String kfs;
	/**建筑结构*/
	private String jzjg;
	/**建筑类别*/
	private String jzlb;
	/**建筑面积*/
	private String jzmj;
	/**占地面积*/
	private String zdmj;
	/**当期户数*/
	private String dqhs;
	/**总 户 数*/
	private String zhs;
	/**绿 化 率*/
	private String lhl;
	/**容 积 率*/
	private String rjl;
	/**物业办公电话*/
	private String wybgdh;
	/**物 业 费*/
	private String wyf;
	/**附加信息*/
	private String fjxx;
	/**物业办公地点*/
	private String wybgdd;
	/**供水*/
	private String gs;
	/**供电*/
	private String gd;
	/**供暖*/
	private String gn;
	/**燃气*/
	private String rq;
	/**通讯设备*/
	private String txsb;
	/**电梯服务*/
	private String dtfw;
	/**安全管理*/
	private String aqgl;
	/**卫生服务*/
	private String wsfw;
	/**小区入口*/
	private String xqrk;
	/**停 车 位*/
	private String tcw;
	/**地铁*/
	private String dt;
	/**公交*/
	private String gj;
	/**幼儿园*/
	private String yey;
	/**中小学*/
	private String zxx;
	/**大学*/
	private String dx;
	/**商场*/
	private String sc;
	/**医院*/
	private String yy;
	/**邮局*/
	private String yj;
	/**银行*/
	private String yh;
	/**其他*/
	private String qt;
	/**小区内部配套*/
	private String xqnbpt;
	/**经纬度*/
	private String jwd;
	/**开盘时间 */
	private String kpsj;
	/**交房时间 */
	private String jfsj;
	/**售楼电话 */
	private String sldh;
	/**售楼地址 */
	private String sldz;
	/**预售证*/
	private String ysz;
	/**历史开盘价格*/
	private String lskpjg;
	/**投资商*/
	private String tzs;
	/**承建商*/
	private String cjs;
	/**代理商*/
	private String dls;
	/**建筑及园林设计单位*/
	private String ylsjdw;
	/**景观设计单位*/
	private String jgsjdw;
	/**小区简介*/
	private String xqjj;
	/**总层数*/
	private String zcs;
	/**物业公司*/
	private String wygs;
	/**装修情况*/
	private String zxqk;
	
	
	public String getZxqk() {
		return zxqk;
	}
	public void setZxqk(String zxqk) {
		this.zxqk = zxqk;
	}
	public String getWygs() {
		return wygs;
	}
	public void setWygs(String wygs) {
		this.wygs = wygs;
	}
	public String getZcs() {
		return zcs;
	}
	public void setZcs(String zcs) {
		this.zcs = zcs;
	}
	public String getXqjj() {
		return xqjj;
	}
	public void setXqjj(String xqjj) {
		this.xqjj = xqjj;
	}
	public String getGn() {
		return gn;
	}
	public void setGn(String gn) {
		this.gn = gn;
	}
	public String getSzqy() {
		return szqy;
	}
	public void setSzqy(String szqy) {
		this.szqy = szqy;
	}
	public String getXmts() {
		return xmts;
	}
	public void setXmts(String xmts) {
		this.xmts = xmts;
	}
	public String getYb() {
		return yb;
	}
	public void setYb(String yb) {
		this.yb = yb;
	}
	public String getCqms() {
		return cqms;
	}
	public void setCqms(String cqms) {
		this.cqms = cqms;
	}
	public String getWylb() {
		return wylb;
	}
	public void setWylb(String wylb) {
		this.wylb = wylb;
	}
	public String getJgsj() {
		return jgsj;
	}
	public void setJgsj(String jgsj) {
		this.jgsj = jgsj;
	}
	public String getKfs() {
		return kfs;
	}
	public void setKfs(String kfs) {
		this.kfs = kfs;
	}
	public String getJzjg() {
		return jzjg;
	}
	public void setJzjg(String jzjg) {
		this.jzjg = jzjg;
	}
	public String getJzlb() {
		return jzlb;
	}
	public void setJzlb(String jzlb) {
		this.jzlb = jzlb;
	}
	public String getJzmj() {
		return jzmj;
	}
	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	public String getZdmj() {
		return zdmj;
	}
	public void setZdmj(String zdmj) {
		this.zdmj = zdmj;
	}
	public String getDqhs() {
		return dqhs;
	}
	public void setDqhs(String dqhs) {
		this.dqhs = dqhs;
	}
	public String getZhs() {
		return zhs;
	}
	public void setZhs(String zhs) {
		this.zhs = zhs;
	}
	public String getLhl() {
		return lhl;
	}
	public void setLhl(String lhl) {
		this.lhl = lhl;
	}
	public String getRjl() {
		return rjl;
	}
	public void setRjl(String rjl) {
		this.rjl = rjl;
	}
	public String getWybgdh() {
		return wybgdh;
	}
	public void setWybgdh(String wybgdh) {
		this.wybgdh = wybgdh;
	}
	public String getWyf() {
		return wyf;
	}
	public void setWyf(String wyf) {
		this.wyf = wyf;
	}
	public String getFjxx() {
		return fjxx;
	}
	public void setFjxx(String fjxx) {
		this.fjxx = fjxx;
	}
	public String getWybgdd() {
		return wybgdd;
	}
	public void setWybgdd(String wybgdd) {
		this.wybgdd = wybgdd;
	}
	public String getGs() {
		return gs;
	}
	public void setGs(String gs) {
		this.gs = gs;
	}
	public String getGd() {
		return gd;
	}
	public void setGd(String gd) {
		this.gd = gd;
	}
	public String getRq() {
		return rq;
	}
	public void setRq(String rq) {
		this.rq = rq;
	}
	public String getTxsb() {
		return txsb;
	}
	public void setTxsb(String txsb) {
		this.txsb = txsb;
	}
	public String getDtfw() {
		return dtfw;
	}
	public void setDtfw(String dtfw) {
		this.dtfw = dtfw;
	}
	public String getAqgl() {
		return aqgl;
	}
	public void setAqgl(String aqgl) {
		this.aqgl = aqgl;
	}
	public String getWsfw() {
		return wsfw;
	}
	public void setWsfw(String wsfw) {
		this.wsfw = wsfw;
	}
	public String getXqrk() {
		return xqrk;
	}
	public void setXqrk(String xqrk) {
		this.xqrk = xqrk;
	}
	public String getTcw() {
		return tcw;
	}
	public void setTcw(String tcw) {
		this.tcw = tcw;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getGj() {
		return gj;
	}
	public void setGj(String gj) {
		this.gj = gj;
	}
	public String getYey() {
		return yey;
	}
	public void setYey(String yey) {
		this.yey = yey;
	}
	public String getZxx() {
		return zxx;
	}
	public void setZxx(String zxx) {
		this.zxx = zxx;
	}
	public String getDx() {
		return dx;
	}
	public void setDx(String dx) {
		this.dx = dx;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public String getYy() {
		return yy;
	}
	public void setYy(String yy) {
		this.yy = yy;
	}
	public String getYj() {
		return yj;
	}
	public void setYj(String yj) {
		this.yj = yj;
	}
	public String getYh() {
		return yh;
	}
	public void setYh(String yh) {
		this.yh = yh;
	}
	public String getQt() {
		return qt;
	}
	public void setQt(String qt) {
		this.qt = qt;
	}
	public String getXqnbpt() {
		return xqnbpt;
	}
	public void setXqnbpt(String xqnbpt) {
		this.xqnbpt = xqnbpt;
	}
	public String getJwd() {
		return jwd;
	}
	public void setJwd(String jwd) {
		this.jwd = jwd;
	}
	public String getKpsj() {
		return kpsj;
	}
	public void setKpsj(String kpsj) {
		this.kpsj = kpsj;
	}
	public String getJfsj() {
		return jfsj;
	}
	public void setJfsj(String jfsj) {
		this.jfsj = jfsj;
	}
	public String getSldh() {
		return sldh;
	}
	public void setSldh(String sldh) {
		this.sldh = sldh;
	}
	public String getSldz() {
		return sldz;
	}
	public void setSldz(String sldz) {
		this.sldz = sldz;
	}
	public String getYsz() {
		return ysz;
	}
	public void setYsz(String ysz) {
		this.ysz = ysz;
	}
	public String getLskpjg() {
		return lskpjg;
	}
	public void setLskpjg(String lskpjg) {
		this.lskpjg = lskpjg;
	}
	public String getTzs() {
		return tzs;
	}
	public void setTzs(String tzs) {
		this.tzs = tzs;
	}
	public String getCjs() {
		return cjs;
	}
	public void setCjs(String cjs) {
		this.cjs = cjs;
	}
	public String getDls() {
		return dls;
	}
	public void setDls(String dls) {
		this.dls = dls;
	}
	public String getYlsjdw() {
		return ylsjdw;
	}
	public void setYlsjdw(String ylsjdw) {
		this.ylsjdw = ylsjdw;
	}
	public String getJgsjdw() {
		return jgsjdw;
	}
	public void setJgsjdw(String jgsjdw) {
		this.jgsjdw = jgsjdw;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameSpell() {
		return nameSpell;
	}
	public void setNameSpell(String nameSpell) {
		this.nameSpell = nameSpell;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBulidYear() {
		return bulidYear;
	}
	public void setBulidYear(String bulidYear) {
		this.bulidYear = bulidYear;
	}
	public String getExecId() {
		return execId;
	}
	public void setExecId(String execId) {
		this.execId = execId;
	}
}
