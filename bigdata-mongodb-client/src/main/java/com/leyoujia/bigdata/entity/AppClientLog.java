package com.leyoujia.bigdata.entity;

import com.alibaba.fastjson.JSONObject;
import com.leyoujia.common.analytics.modle.bigdata.BasisInfo;
import com.leyoujia.common.analytics.modle.bigdata.ErrorInfo;
import com.leyoujia.common.analytics.modle.bigdata.MobileInfo;
import com.leyoujia.common.analytics.modle.bigdata.PageInfo;
import com.leyoujia.common.analytics.modle.bigdata.em.AppID;
import com.leyoujia.common.analytics.modle.bigdata.em.EventID;
import com.leyoujia.common.analytics.modle.bigdata.evobj.DJ0001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @功能描述: APP日志埋点 存储转换对象
 * @项目版本: 1.1.3
 * @项目名称: 大数据
 * @相对路径: com.jjshome.bigdata.entity.AppClientLog.java
 * @创建作者: <a href="mailto:ouyangwenbin2009@live.cn">欧阳文斌</a>
 * @创建日期: 2017年4月17日 下午5:35:08
 */ 
public class AppClientLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 唯一标识 必填 */
	private String uuid;
	/** 设备编码 非必填 */
	private String ssid;
	/** APP标识 必填 */
	private String aid;
	/** APP版本 必填 */
	private String ver;
	/** 日志的插入时间 不填（服务器填充） */
	private String it;
	
	/** 基本信息 */
	private BasisInfo bi;
	
	/** 手机设备信息 */
	private MobileInfo mi;

	/** 浏览记录 */
	private List<PageInfo> pis;

	/** 事件记录 */
	private List<EventInfo> evs;

	/** 错误记录 */
	private List<ErrorInfo> eis;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public BasisInfo getBi() {
		return bi;
	}

	public void setBi(BasisInfo bi) {
		this.bi = bi;
	}

	public MobileInfo getMi() {
		return mi;
	}

	public void setMi(MobileInfo mi) {
		this.mi = mi;
	}

	public List<PageInfo> getPis() {
		return pis;
	}

	public void setPis(List<PageInfo> pis) {
		this.pis = pis;
	}

	public List<EventInfo> getEvs() {
		return evs;
	}

	public void setEvs(List<EventInfo> evs) {
		this.evs = evs;
	}

	public List<ErrorInfo> getEis() {
		return eis;
	}

	public void setEis(List<ErrorInfo> eis) {
		this.eis = eis;
	}
	public static void main(String[] args) {
		AppClientLog log = new AppClientLog();
		log.setUuid("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
		log.setSsid("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
		log.setAid(AppID.云办公.toString());
		log.setVer("5.3.2");
		
		MobileInfo mi = new MobileInfo();
		mi.setBrand("samsung");
		mi.setBua("Mozilla/5.0 (Linux; Android 6.0.1; SM-G9350 Build/MMB29M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/46.0.2490.76 Mobile Safari/537.36");
		mi.setModel("SM-G9350");
		mi.setOst("android");
		mi.setOsv("5.4.2");
		mi.setPhone("13888888888");
		log.setMi(mi);
		
		BasisInfo bi = new BasisInfo();
		bi.setIp("125.125.236.12");
		bi.setLat("22.493108");
		bi.setLng("113.369424");
		bi.setNp("1");
		bi.setNt("4g");
		log.setBi(bi);

		List<PageInfo> pis = new ArrayList<PageInfo>();
		PageInfo p1 = new PageInfo();
		p1.setEt("2017-04-01 14:05:36");
		p1.setId("com.leyoujia.common.analytics.modle.bigdata.AppClientLog");
		p1.setSt("2017-04-01 14:05:30");
		PageInfo p2 = new PageInfo();
		p2.setEt("2017-04-01 14:05:39");
		p2.setId("com.leyoujia.common.analytics.modle.bigdata.AppClientLog");
		p2.setSt("2017-04-01 14:05:38");
		pis.add(p1);
		pis.add(p2);
		log.setPis(pis);
		
		List<EventInfo> evs = new ArrayList<EventInfo>();
		EventInfo ei1 = new EventInfo();
		ei1.setEt("2017-04-01 4:05:36");
		ei1.setId(EventID.点击.toString());
		DJ0001 dj = new DJ0001();
		dj.setName("xxxx");
		dj.setSign("xxxx");
		ei1.setObj(dj);
		EventInfo ei2 = new EventInfo();
		ei2.setEt("2017-04-01 4:05:36");
		ei2.setId(EventID.点击.toString());
		DJ0001 dj1 = new DJ0001();
		dj1.setName("xxxx");
		dj1.setSign("xxxx");
		ei2.setObj(dj1);
		evs.add(ei1);
		evs.add(ei2);
		log.setEvs(evs);
		
		List<ErrorInfo> eis = new ArrayList<ErrorInfo>();
		ErrorInfo e1 = new ErrorInfo();
		e1.setErr("xxxxxx");
		e1.setEt("2017-04-01 4:05:36");
		e1.setId("xxxxx");
		eis.add(e1);
		log.setEis(eis);
		String text = JSONObject.toJSONString(log);
		System.out.println(text);
		AppClientLog obj = JSONObject.parseObject(text, AppClientLog.class);
		System.out.println(obj.toString());
	}
}