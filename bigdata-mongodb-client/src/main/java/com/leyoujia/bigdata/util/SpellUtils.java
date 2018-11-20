package com.leyoujia.bigdata.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.commons.lang.StringUtils;

public class SpellUtils {

    /**
     * @param src
     * @return
     */
    public static String getFull(String src) {

        char[] srcChar = src.toCharArray();
        String[] srcArry = new String[srcChar.length];
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();

        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_V);
        String result = "";
        try {
            for (int i = 0; i < srcChar.length; i++) {
                if (Character.toString(srcChar[i])
                        .matches("[\\u4E00-\\u9FA5]+")) {
                    srcArry = PinyinHelper.toHanyuPinyinStringArray(srcChar[i],
                            format);
                    result += srcArry[0];
                } else
                    result += Character.toString(srcChar[i]);
            }
            return result;
        } catch (BadHanyuPinyinOutputFormatCombination e1) {
            e1.printStackTrace();
        }
        return result;
    }

    /**
     * @param str
     * @return
     */
    public static String getFirst(String str) {

        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                result += pinyinArray[0].charAt(0);
            } else {
                result += word;
            }
        }
        return result;
    }

    public static String subLongStr(String content, int maxSize) {
        if (StringUtils.isEmpty(content)) {
            return "";
        }
        int index = 0;
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < content.length(); i++) {
            String retContent = content.substring(i, i + 1);
            boolean isChina = retContent.matches("[\u4E00-\u9FA5]");
            boolean isCapital = retContent.matches("[A-Z]");

            if (index == maxSize) {
                sBuffer.append("..");
                break;
            }

            if ((index == maxSize - 1 && isChina)) {
                continue;
            }

            if (isChina || isCapital) {
                index = index + 2;
            } else {
                index = index + 1;
            }
            sBuffer.append(retContent);

            if (index > maxSize) {
                sBuffer.append("..");
                break;
            }
        }
        return sBuffer.toString();
    }

    /**
     * 用于高亮显示
     *
     * @param text     查询出来的文本
     * @param keyWord  关键词
     * @param style    html代码的前缀如<font color=\"red\">"    r
     * @param endStyle html 的结束   如</font>
     *                 如果包含关键字 将关键字加上 , "</font>"
     * @return
     * @auto zlq
     */
    public static String getHighlighterByContext(String text, String keyWord, String style, String endStyle) {
        if (text.contains(keyWord)) {
            int start = text.indexOf(keyWord.charAt(0));
            int end = text.indexOf(keyWord.charAt(keyWord.length() - 1));
            StringBuffer sb = new StringBuffer();
            sb.append(StringUtils.substring(text, 0, start));
            sb.append(style).append(keyWord).append(endStyle);
            sb.append(StringUtils.substring(text, end + 1, text.length()));
            return sb.toString();
        } else {
            return text;
        }
    }
    
}
