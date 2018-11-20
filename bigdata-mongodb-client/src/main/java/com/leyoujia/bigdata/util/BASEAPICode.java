package com.leyoujia.bigdata.util;

import com.leyoujia.sonarplugins.CheckParam;

public interface BASEAPICode {
	
	@CheckParam(online="50001")
	public static final String SYS_ERROR_CODE = "50001";
	@CheckParam(online="系统异常")
	public static final String SYS_ERROR_DESCRIPTION = "系统异常";
	
	@CheckParam(online="50002")
	public static final String PARAM_ERROR_CODE = "50002";
	@CheckParam(online="参数不能为空")
	public static final String PARAM_ERROR_DESCRIPTION = "参数不能为空";
	
	@CheckParam(online="50003")
	public static final String DATA_ERROR_CODE = "50003";
	@CheckParam(online="没有数据")
	public static final String DATA_ERROR_DESCRIPTION = "没有数据";
	
	@CheckParam(online="50004")
	public static final String PARAM_LENGTH_ERROR_CODE = "50004";
	@CheckParam(online="参数超出长度")
	public static final String PARAM_LENGTH_ERROR_DESCRIPTION = "参数超出长度";
	
	@CheckParam(online="50008")
	public static final String SUCCESS_ERROR_CODE = "50008";
	@CheckParam(online="成功")
	public static final String SUCCESS_ERROR_DESCRIPTION = "成功";
}
