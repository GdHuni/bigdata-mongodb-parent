package com.leyoujia.bigdata.util;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: jjs Date: 13-9-10 Time: 下午4:56 To change
 * this template use File | Settings | File Templates.
 */
public class StringUtil {
	public static String getChinaCharacter(String str) {
		String returnStr = null;
		if (str != null) {
			try {
				returnStr = new String(str.getBytes("ISO-8859-1"), "UTF-8");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return returnStr;
	}

	public static String clearNotChi(String str) {
		if (StringUtils.isBlank(str)) {
			return "";
		}
		char leftC = '(';
		char leftC2 = '（';
		if(str.indexOf(leftC) != -1){
			str = str.substring(0,str.indexOf(leftC));
		}
		if(str.indexOf(leftC2) != -1){
			str = str.substring(0,str.indexOf(leftC2));
		}
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (isChinese(c)) {
				res += c;
			}
		}
		return res;
	}

	public static boolean isChinese(char a) {
		int v = (int) a;
		return (v >= 19968 && v <= 171941);
	}

	public static boolean containsChinese(String s) {
		if (null == s || "".equals(s.trim()))
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (isChinese(s.charAt(i)))
				return true;
		}
		return false;
	}
	
	public static String clearSpecial(String data) {  
        StringBuffer appender = new StringBuffer("");  
        if (StringUtils.isNotBlank(data)) {  
            appender = new StringBuffer(data.length());  
              
            for (int i = 0; i < data.length(); i++) {  
                char ch = data.charAt(i);  
                if ((ch == 0x9) || (ch == 0xA) || (ch == 0xD)  
                        || ((ch >= 0x20) && (ch <= 0xD7FF))  
                        || ((ch >= 0xE000) && (ch <= 0xFFFD))  
                        || ((ch >= 0x10000) && (ch <= 0x10FFFF))){
                	appender.append(ch);  
                }
            }
        }
        return appender.toString();  
    }

	
	/**
     * 过滤字符串，只保留数字、字母、汉字 -  ·
     * @param key
     * @return
     */
	public static  String StringFilter(String key) {
		if (StringUtils.isNotEmpty(key)) {
			String  str = key.replaceAll("[^0-9a-zA-Z\u4e00-\u9fa5·\\-]+","").toLowerCase(); 
			return str;
		}else{
			return "";
		}
	}
	/**
     * 拉伯数字1-9与中文数字一到九之间的相互转换
     * 如一房一厅 可以 和1房1厅 互转 室 房
     * @param key
     * @return 转换后的字符串
     */
	public static  String convertStr(String key) {
		Map<String, String > keyMap = new HashMap<String, String>();
		keyMap.put("1", "一");
		keyMap.put("2", "二");
		keyMap.put("3", "三");
		keyMap.put("4", "四");
		keyMap.put("5", "五");
		keyMap.put("6", "六");
		keyMap.put("7", "七");
		keyMap.put("8", "八");
		keyMap.put("9", "九");
		keyMap.put("一", "1");
		keyMap.put("二", "2");
		keyMap.put("三", "3");
		keyMap.put("四", "4");
		keyMap.put("五", "5");
		keyMap.put("六", "6");
		keyMap.put("七", "7");
		keyMap.put("八", "8");
		keyMap.put("九", "9");
//		keyMap.put("室", "房");
//		keyMap.put("房", "室");
		StringBuilder returnString = new StringBuilder();
		if (StringUtils.isNotEmpty(key)) {
			char str[] = key.toCharArray();
			for (char c : str) {
				if(keyMap.containsKey(c+"")){
					returnString.append(keyMap.get(c+""));
				}else{
					returnString.append(c+"");
				}
			}
		}
		return returnString.toString();
	}
	/**
	 * 判断是否为汉字的 一二三四五六七八九 和 数字的 0 1 2 3 4 5 6 7 8 9  房 室
	 * @param key
	 * @return 包含为true
	 */
	public static boolean isContainDigOrChinese(String key)
	{
		if (StringUtils.isNotEmpty(key)) {
			String  regex = "^(?!.*(1|2|3|4|5|6|7|8|9|一|二|三|四|五|六|七|八|九)).*$";
			return !key.matches(regex);
		}
		return false;
	}
	
	public static void main(String[] args) {
		String key = "x啊是看一得见2啊asda送点卷期";
		System.out.println(isContainDigOrChinese(key));
		System.out.println(convertStr(key));
	}
	
}
