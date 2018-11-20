package com.leyoujia.bigdata.util;

import com.leyoujia.sonarplugins.CheckParam;

/**
 * @功能描述: 系统常量设置
 * @项目版本: 1.0.0
 * @项目名称: 大数据
 * @相对路径: com.jjshome.funds.util.SystemConstant.java
 * @创建作者: 欧阳文斌
 * @问题反馈: ouyangwenbin2009@live.cn
 * @创建日期: 2015年3月13日 下午5:59:06
 */ 
public class SystemConstant 
{
	/** 项目根目录 */
	public static final String WEB_ROOT = System.getProperty("big.data.root");
	/** 判断是否是windows系统 */
	public static boolean IS_WINDOWS = System.getProperty("os.name").startsWith("win")||System.getProperty("os.name").startsWith("Win");
	/** 意向模型 redis的index */
	public static Integer YXMX_INDEX = 1001;
	/** USER IP 对应关系 */
	public static Integer U2P_INDEX = 1002;
	public static Integer U2P_INDEX_APP = 1003;
	public static String FCW_INDEX = "102";
	public static String APP_INDEX = "101";
	/** 意向模型 redis的name */
	@CheckParam(online="YXMX_")
	public static String YXMX_NAME = "YXMX_";
	
	/** 朝向 */
	public static String[] CHAOXIANG_ARRAY= {"不限","东","南","西","北","东南","东北","西南","西北","南北通透","东西"};
	/** 楼龄 */
	public static String[] LOULING_ARRAY= {"不限","2年以下","2-5年","5-10年","10年以上"};
	/** 二手房特色 */
	public static String[] TESE_ESF_ARRAY= {"不限","免个税","满两年","红本在手"/*,"学区房","独家"*/,"随时可看","新上","降价","急售","一二手皆可"};
	/** 装修 */
	public static String[] ZHUANGXIU_ARRAY= {"不限","毛坯","普通装修","简装","精装修","豪华装修"};
	/** 户型 */
	public static String[] HUXING_ARRAY= {"不限","一室","二室","三室","四室","五室","五室以上"};
	/** 租房特色 */
	public static String[] TESE_ZF_ARRAY= {"不限","拎包入住","带家私","带家电","可上网","有电梯","随时可看","新上"};
	/** 新房类型 */
	public static String[] LEIXING_ARRAY= {"普通住宅","复式住宅","商住两用","别墅","商铺","写字楼","厂房"};
	/** 楼层 */
	public static String[] LOUCENG_ARRAY= {"填充","低","中","高"};
	/** redis代理序号 */
	public static Integer PROXY_INDEX = 8123;
	/** redis代理key */
	@CheckParam(online="KDL_PROXY_KEY")
	public static String PROXY_KEY = "KDL_PROXY_KEY";
	/** 代理验证网站 */
	@CheckParam(online="http://shenzhen.jjshome.com")
	public static String CHECK_URL = "http://shenzhen.jjshome.com";
}
