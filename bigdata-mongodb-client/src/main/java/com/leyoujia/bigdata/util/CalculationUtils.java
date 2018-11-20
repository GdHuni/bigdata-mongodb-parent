package com.leyoujia.bigdata.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

/**
 * java精度运算工具类基于BigDecimal
 *
 * @author QHN
 */
public class CalculationUtils {
	
	/**默认除法精度*/
	private static final int DEFAULT_DIV_SCALE = 2;
	
	private CalculationUtils(){
		
	}
	
    /**
     * 浮点数-精确加法运算
     *
     * @return
     * 
	 */   
	public static double add(double v1, double v2){
		return BigDecimal.valueOf(v1).add(BigDecimal.valueOf(v2)).doubleValue();    
	}
	
    /**
     * 浮点数-精确减法法运算
     *
     * @return
     * 
	 */
	public static double subtract(double v1, double v2){
		return BigDecimal.valueOf(v1).subtract(BigDecimal.valueOf(v2)).doubleValue();    
	}
	
    /**
     * 浮点数-精确乘法法运算
     *
     * @return
     * 
	 */   
	public static double multiply(double v1, double v2){
		return BigDecimal.valueOf(v1).multiply(BigDecimal.valueOf(v2)).doubleValue();    
	}
	
    /**
     * 浮点数-精确除法运算
     * @param scale 精度
     * @return
     * 
	 */   
	public static double div(double v1, double v2, Integer scale){
		if(scale != null){
			return BigDecimal.valueOf(v1).divide(BigDecimal.valueOf(v2),scale,BigDecimal.ROUND_HALF_UP).doubleValue();
		}else{
			return BigDecimal.valueOf(v1).divide(BigDecimal.valueOf(v2),DEFAULT_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
		}	    
	}
	
	/**
     * 浮点数-保留小数位数
     * @param scale 精度
     * @return
     * 
	 */
	public static double formartDouble(double value, int scale){
		return BigDecimal.valueOf(value).round(new MathContext(scale)).doubleValue();
	}
	
	/**
	 * double格式化，pattern为空时默认保留两位小数点
	 * @param value
	 * @param pattern
	 * @return
	 */
	public static String formartDouble(double value, String pattern){
		if(StringUtils.isBlank(pattern)){
			pattern = "##0.00";
		}
		DecimalFormat f = new DecimalFormat(pattern);
		return f.format(value);
	}
}
