package com.eshopping.service;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseService;
import com.eshopping.pojo.ItemCategory;


/**
 * @author ThisPC
 * @date 2021/3/19
 */
public interface ItemCategoryService extends BaseService<ItemCategory> {

    /**
     * 通过JSONObject添加
     * @param editForm 键：字段    值：字段值（Object）
     * @return 成功与否
     */
    boolean addItemCategory(JSONObject editForm);

    /**
     * 修改方法
     * @param name 修改后名字
     * @param id 待修改货物编号
     */
    void changeItemCategory(String name, Integer id);

    /**
     * 删除与恢复方法
     * @param id 待删除数据id
     */
    void deleteItemCategory(Integer id);
}
