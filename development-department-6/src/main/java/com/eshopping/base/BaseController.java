package com.eshopping.base;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 基本类
 * @Author: YTF
 * @Date: 2021/2/23
 */
// @Slf4j

public class BaseController {

    /**
     * Logger 对象用来记录特定系统或应用程序组件的日志消息
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 日期格式
     */
    protected final static String DATE_FORMATE = "yyyy-MM-dd";

    /**
     * ---返回服务端处理结果---
     * @param obj 服务端输出对象
     * @return 输出处理结果给前段JSON格式数据
     */
    public String responseResult(Object obj) {
        String jsonObj = null;
        if (obj != null) {
            logger.info("后端返回对象：{}", obj);
            jsonObj = JSONObject.toJSONString(obj);
            logger.info("后端返回数据：" + jsonObj);
        }
        logger.info("输出结果：{}", jsonObj);
        /* log.info("输出结果：{}", jsonObj); */
        return jsonObj;
    }


    // ----- 重载判断null的操作 -----

    public boolean isEmpty(String str) { return (null == str) || (str.trim().length() <= 0); }
    public boolean isEmpty(Character cha) { return (null == cha) || cha.equals(' '); }
    public boolean isEmpty(Integer i) { return (null == i) || (i == 0); }
    public boolean isEmpty(Object obj) { return (null == obj); }
    public boolean isEmpty(Object[] objs) { return (null == objs) || (objs.length <= 0); }
    public boolean isEmpty(Collection<?> obj) { return (null == obj) || obj.isEmpty(); }
    public boolean isEmpty(Set<?> set) { return (null == set) || set.isEmpty(); }
    public boolean isEmpty(Serializable obj) { return null == obj; }
    public boolean isEmpty(Map<?, ?> map) { return (null == map) || map.isEmpty(); }
}
