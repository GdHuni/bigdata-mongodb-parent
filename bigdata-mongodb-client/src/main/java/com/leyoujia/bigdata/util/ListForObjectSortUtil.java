package com.leyoujia.bigdata.util;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 此工具类用来给list为对象的集合进行排序
 */
public class ListForObjectSortUtil {
    private static Logger logger = Logger.getLogger(ListForObjectSortUtil.class);

    /**
     * @param list   集合
     * @param method 方法名 如 “getSaleTotal”
     * @param sort   倒序还是正序排序  "desc"倒序 否则为正序排列
     * @param <E>
     * @auto zlq
     */
    public static <E> void Sort(List<E> list, final String method, final String sort) {
        Collections.sort(list, new Comparator<Object>() {
            public int compare(Object a, Object b) {
                int ret = 0;
                try {
                    Method m1 = ((E) a).getClass().getMethod(method, null);
                    Method m2 = ((E) b).getClass().getMethod(method, null);
                    if (sort != null && "desc".equals(sort))// 倒序
                        ret = m2.invoke(((E) b), null).toString()
                                .compareTo(m1.invoke(((E) a), null).toString());
                    else
                        // 正序
                        ret = m1.invoke(((E) a), null).toString()
                                .compareTo(m2.invoke(((E) b), null).toString());
                } catch (Exception e) {
                    logger.error("ListForObjectSort@Sort error params :", e);
                }
                return ret;
            }
        });
    }
    public static <E> List<E> listSort(List<E> lists,String method,int sort) throws Exception {
        for(int n=0;n<lists.size()-1;n++){
            for(int m=n+1;m<lists.size();m++){
                Method mh = ((E)lists.get(n)).getClass().getMethod(method,null);
                Object obj = mh.invoke(((E)lists.get(n)), null);
                int i= NumberUtils.toInt(obj+"");
                Method mh1 = ((E)lists.get(m)).getClass().getMethod(method,null);
                Object obj1 = mh1.invoke(((E)lists.get(m)), null);
                int j= NumberUtils.toInt(obj1+"");
                if(j>i){
                    Object o = lists.get(n);
                    Object o1 = lists.get(m);
                    lists.set(n,(E)o1);
                    lists.set(m,(E)o);
                }
            }
        }
        return lists;
    }
}
