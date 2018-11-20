package com.leyoujia.common.analytics.modle.bigdata;

import com.alibaba.fastjson.JSONObject;
import com.leyoujia.common.analytics.modle.bigdata.em.AppID;
import com.leyoujia.common.analytics.modle.bigdata.em.EventID;
import com.leyoujia.common.analytics.modle.bigdata.evobj.DJ0001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @功能描述: 
APP公用埋点SDK，适用所有乐有家APP软件的日志埋点。<br>
<font color=red>实现APP埋点格式化，统一化，以及请求头的封装处理。</font><br>
方便了以后对APP用户行为分析，以及建立了服务端日志和客户端日志打通的桥梁。<br>
日志上传采用HTTP接口的方式，将APP在一个时间段内的用户操作等数据，<br>
整理成一条json传输到大数据日志存储的服务器，再由CDH解析入库。<br>
<font color=red>1.APP在安装成功，并生成UUID时（或是重新生成UUID时），则立即上传一次日志。</font><br>
<font color=red>2.APP启动时，检测历史是否存在没有提交的日志，有则立即上传。</font><br>
<font color=red>3.在APP正常运行期间，每五分钟上传一次日志。</font><br>
json对象格式参考{@link AppClientLog}<br>
同时，该SDK会统一封装Request的请求头，以便于服务端埋点获取更多有效信息<br>
<font color=red>Header参数和说明</font><br>
np		-	网络供应商 1-移动 2-联通 3-电信 0-其他				:1<br>
nt		-	"NO NETWORK" "WIFI" "2G" "3G" "4G" "OTHER"	:4G<br>
uuid	-	唯一标识										:85C1430B-EBCC-304B-8ED9-95C494B2A7AF<br>
ssid	-	设备编码										:A0D85A6E-398B-4A1A-B26B-5D9F0C6358C1<br>
aid		-	APP标识{@link AppID}							:APP001<br>
ver		-	APP版本										:5.4.3<br>
lng		-	经度											:113.369424<br>
lat		-	纬度											:22.493108<br>
示例：<br>
JJSHOME-APP:np=1,nt=4G,uuid=85C1430B-EBCC-304B-8ED9-95C494B2A7AF,ssid=A0D85A6E-398B-4A1A-B26B-5D9F0C6358C1,aid=APP001,ver=5.4.3,lng=113.369424,lat=22.493108<br>
<font color=blue>java版本下载地址：</font><a href="https://172.16.2.230/svn/BIG_DATA/trunk/Web/Trunk/bigdata/bigdata-client/doc/bigdata-log.jar" target="_blank">bigdata-log.jar</a><br>
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.common.analytics.modle.bigdata.AppClientLog.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2017年3月28日 下午2:16:55
 */ 
public class AppClientLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 唯一标识 必填 */
	private String uuid;
	/** 设备编码(联合MD5值) 非必填 */
	private String ssid;
	/** 设备ID 非必填 */
	private String meid;
	/** APP标识 必填 */
	private AppID aid;
	/** APP版本 必填 */
	private String ver;
	/** 日志的插入时间 不填（服务器填充） */
	private String it;
	
	/** 基本信息 */
	private BasisInfo bi;
	
	/** 手机设备信息 */
	private MobileInfo mi;

	/** 浏览记录{@link PageInfo} */
	private List<PageInfo> pis;

	/** 事件记录{@link EventInfo} */
	private List<EventInfo> evs;

	/** 错误记录{@link ErrorInfo} */
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

	public String getMeid() {
		return meid;
	}

	public void setMeid(String meid) {
		this.meid = meid;
	}
	
	public String getAid() {
		return aid.toString();
	}

	public void setAid(AppID aid) {
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
		log.setAid(AppID.云办公);
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
		p1.setId("com.jjshome.common.analytics.modle.bigdata.AppClientLog");
		p1.setSt("2017-04-01 14:05:30");
		PageInfo p2 = new PageInfo();
		p2.setEt("2017-04-01 14:05:39");
		p2.setId("com.jjshome.common.analytics.modle.bigdata.AppClientLog");
		p2.setSt("2017-04-01 14:05:38");
		pis.add(p1);
		pis.add(p2);
		log.setPis(pis);
		
		List<EventInfo> evs = new ArrayList<EventInfo>();
		EventInfo ei1 = new EventInfo();
		ei1.setEt("2017-04-01 4:05:36");
		ei1.setId(EventID.点击);
		DJ0001 dj = new DJ0001();
		dj.setName("xxxx");
		dj.setSign("xxxx");
		ei1.setObj(dj);
		EventInfo ei2 = new EventInfo();
		ei2.setEt("2017-04-01 4:05:36");
		ei2.setId(EventID.点击);
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
		System.out.println(JSONObject.toJSONString(log));
	}
}