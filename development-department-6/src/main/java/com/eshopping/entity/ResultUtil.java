package com.eshopping.entity;

/**
 * @author ThisPC
 * @date 2021/3/23
 */
public class ResultUtil {
    /** 成功且带数据 **/
    public static Result success(Object object) {
        Result result = new Result();
        result.setFlag(ResultEnum.SUCCESS.getFlag());
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setData(object);
        return result;
    }

    /** 成功但不带数据 **/
    public static Result success() { return success(null); }

    /** 失败 **/
    public static Result error(Integer flag,String code) {
        Result result = new Result();
        result.setFlag(flag);
        result.setCode(code);
        return result;
    }
}
