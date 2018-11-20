package com.leyoujia.bigdata.entity.spider.qqhouse;

import com.leyoujia.bigdata.entity.spider.common.HOUSE_HX;
import com.leyoujia.bigdata.entity.spider.common.HOUSE_IMG;
import com.leyoujia.bigdata.entity.spider.common.HOUSE_NEWS;

import java.io.Serializable;
import java.util.List;

public class HouseBase implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 楼盘地址 */
	private String key;
	/** 楼盘地址 */
	private String lpdz;
	/** 开盘时间 */
	private String kpsj;
	/** 入住时间 */
	private String rzsj;
	/** 打折优惠 */
	private String dzyh;
	/** 参考价格 */
	private String ckjg;
	/** 电话 */
	private String dh;
	/** 楼盘名称 */
	private String lpmc;
	/** 产权年限 */
	private String cqnx;
	/** 装修情况 */
	private String zxqk;
	/** 建筑类别 */
	private String jzlb;
	/** 开发商 */
	private String kfs;
	/** 物业公司 */
	private String wygs;
	/** 物业费 */
	private String wyf;
	/** 容积率 */
	private String rjl;
	/** 绿化率 */
	private String lhl;
	/** 停车位 */
	private String tcw;
	/** 物业类别 */
	private String wylb;
	
	/** 户型 */
	private String hx;
	/** 室 */
	private String s;
	/** 厅 */
	private String t;
	/** 卫 */
	private String w;
	/** 面积 */
	private String area;
	/** 首付 */
	private String sf;
	/** 总价 */
	private String zj;
	/** 月供 */
	private String yg;
	/** 楼盘别名 */
	private String lpbm;
	/** 城市 */
	private String cs;
	/** 区域 */
	private String qy;
	/** 片区 */
	private String pq;
	/** 地图X坐标 */
	private String x;
	/** 地图Y坐标 */
	private String y;
	/** 楼盘简介 */
	private String lpjj;
	/** 爬取日期 */
	private String count_date;
	/** 楼盘名称-模糊查询 */
	private String lpmc_like;
	/** 楼盘别名-模糊查询 */
	private String lpbm_like;
	/** 城市-模糊查询 */
	private String cs_like;
	/** 楼盘名称-模糊查询 */
	private String lpmc_likeor;
	/** 楼盘别名-模糊查询 */
	private String lpbm_likeor;
	/** 城市-模糊查询 */
	private String cs_likeor;
	
	/**-------新加字段-------*/
	/** 别名 */
	private String bm;
	/**预售许可证*/
	private String ysxkz;
	/**售楼地址*/
	private String sldz;
	/**建材装修*/
	private String jczx;
	/**楼层状况*/
	private String lczk;
	/**占地面积*/
	private String zdmj;
	/**开工时间*/
	private String kgsj;
	/**户数*/
	private String hs;
	/**项目特色*/
	private String xmts;
	
	/**id*/
	private String id;
	/**标签*/
	private String bq;
	
	/***url***/
	private String url;
	
	private String uid;
	
	/** 图片 */
	private List<HOUSE_IMG> imgs;
	/** 楼盘新闻 */
	private List<HOUSE_NEWS> news;
	/** 户型集合 */
	private List<HOUSE_HX> hxs;
	/** 预售许可证 */
	private List<HOUSE_YSXKZ> xkzs;
	/** 数据处理状态 字段存在-则是处理过了  不存在就是未处理*/
	private Integer status;
	
	/** 正序字段 */
	private String order_by_asc;
	/** 倒序字段 */
	private String order_by_desc;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getXmts() {
		return xmts;
	}
	public void setXmts(String xmts) {
		this.xmts = xmts;
	}
	public String getBm() {
		return bm;
	}
	public void setBm(String bm) {
		this.bm = bm;
	}
	public String getYsxkz() {
		return ysxkz;
	}
	public void setYsxkz(String ysxkz) {
		this.ysxkz = ysxkz;
	}
	
	public String getSldz() {
		return sldz;
	}
	public void setSldz(String sldz) {
		this.sldz = sldz;
	}
	public String getJczx() {
		return jczx;
	}
	public void setJczx(String jczx) {
		this.jczx = jczx;
	}
	public String getLczk() {
		return lczk;
	}
	public void setLczk(String lczk) {
		this.lczk = lczk;
	}
	public String getZdmj() {
		return zdmj;
	}
	public void setZdmj(String zdmj) {
		this.zdmj = zdmj;
	}
	public String getKgsj() {
		return kgsj;
	}
	public void setKgsj(String kgsj) {
		this.kgsj = kgsj;
	}
	public String getHs() {
		return hs;
	}
	public void setHs(String hs) {
		this.hs = hs;
	}
	public String getLpdz() {
		return lpdz;
	}
	public void setLpdz(String lpdz) {
		this.lpdz = lpdz;
	}
	public String getKpsj() {
		return kpsj;
	}
	public void setKpsj(String kpsj) {
		this.kpsj = kpsj;
	}
	public String getRzsj() {
		return rzsj;
	}
	public void setRzsj(String rzsj) {
		this.rzsj = rzsj;
	}
	public String getDzyh() {
		return dzyh;
	}
	public void setDzyh(String dzyh) {
		this.dzyh = dzyh;
	}
	public String getCkjg() {
		return ckjg;
	}
	public void setCkjg(String ckjg) {
		this.ckjg = ckjg;
	}
	public String getDh() {
		return dh;
	}
	public void setDh(String dh) {
		this.dh = dh;
	}
	public String getLpmc() {
		return lpmc;
	}
	public void setLpmc(String lpmc) {
		this.lpmc = lpmc;
	}
	public String getCqnx() {
		return cqnx;
	}
	public void setCqnx(String cqnx) {
		this.cqnx = cqnx;
	}
	public String getZxqk() {
		return zxqk;
	}
	public void setZxqk(String zxqk) {
		this.zxqk = zxqk;
	}
	public String getJzlb() {
		return jzlb;
	}
	public void setJzlb(String jzlb) {
		this.jzlb = jzlb;
	}
	public String getKfs() {
		return kfs;
	}
	public void setKfs(String kfs) {
		this.kfs = kfs;
	}
	public String getWygs() {
		return wygs;
	}
	public void setWygs(String wygs) {
		this.wygs = wygs;
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
	public String getTcw() {
		return tcw;
	}
	public void setTcw(String tcw) {
		this.tcw = tcw;
	}
	public String getWylb() {
		return wylb;
	}
	public void setWylb(String wylb) {
		this.wylb = wylb;
	}
	public List<HOUSE_IMG> getImgs() {
		return imgs;
	}
	public void setImgs(List<HOUSE_IMG> imgs) {
		this.imgs = imgs;
	}
	public List<HOUSE_NEWS> getNews() {
		return news;
	}
	public void setNews(List<HOUSE_NEWS> news) {
		this.news = news;
	}
	public String getHx() {
		return hx;
	}
	public void setHx(String hx) {
		this.hx = hx;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSf() {
		return sf;
	}
	public void setSf(String sf) {
		this.sf = sf;
	}
	public String getZj() {
		return zj;
	}
	public void setZj(String zj) {
		this.zj = zj;
	}
	public String getYg() {
		return yg;
	}
	public void setYg(String yg) {
		this.yg = yg;
	}
	public String getLpbm() {
		return lpbm;
	}
	public void setLpbm(String lpbm) {
		this.lpbm = lpbm;
	}
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}
	public String getQy() {
		return qy;
	}
	public void setQy(String qy) {
		this.qy = qy;
	}
	public String getPq() {
		return pq;
	}
	public void setPq(String pq) {
		this.pq = pq;
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
	public String getLpjj() {
		return lpjj;
	}
	public void setLpjj(String lpjj) {
		this.lpjj = lpjj;
	}
	/** 需求没有 */
	public String getWyf() {
		return wyf;
	}
	public void setWyf(String wyf) {
		this.wyf = wyf;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getCount_date() {
		return count_date;
	}
	public void setCount_date(String count_date) {
		this.count_date = count_date;
	}
	public List<HOUSE_HX> getHxs() {
		return hxs;
	}
	public void setHxs(List<HOUSE_HX> hxs) {
		this.hxs = hxs;
	}
	public String getLpmc_like() {
		return lpmc_like;
	}
	public void setLpmc_like(String lpmc_like) {
		this.lpmc_like = lpmc_like;
	}
	public String getLpbm_like() {
		return lpbm_like;
	}
	public void setLpbm_like(String lpbm_like) {
		this.lpbm_like = lpbm_like;
	}
	public String getCs_like() {
		return cs_like;
	}
	public void setCs_like(String cs_like) {
		this.cs_like = cs_like;
	}
	public String getLpmc_likeor() {
		return lpmc_likeor;
	}
	public void setLpmc_likeor(String lpmc_likeor) {
		this.lpmc_likeor = lpmc_likeor;
	}
	public String getLpbm_likeor() {
		return lpbm_likeor;
	}
	public void setLpbm_likeor(String lpbm_likeor) {
		this.lpbm_likeor = lpbm_likeor;
	}
	public String getCs_likeor() {
		return cs_likeor;
	}
	public void setCs_likeor(String cs_likeor) {
		this.cs_likeor = cs_likeor;
	}
	public String getOrder_by_asc() {
		return order_by_asc;
	}
	public void setOrder_by_asc(String order_by_asc) {
		this.order_by_asc = order_by_asc;
	}
	public String getOrder_by_desc() {
		return order_by_desc;
	}
	public void setOrder_by_desc(String order_by_desc) {
		this.order_by_desc = order_by_desc;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<HOUSE_YSXKZ> getXkzs() {
		return xkzs;
	}

	public void setXkzs(List<HOUSE_YSXKZ> xkzs) {
		this.xkzs = xkzs;
	}
}
