package com.eshopping.service;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseService;
import com.eshopping.dao.ItemMapper;
import com.eshopping.entity.RespPageEntity;
import com.eshopping.pojo.Item;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/23
 */
public interface ItemService extends BaseService<Item> {

    /**
     * 展示所有商品
     * @return 商品列表
     */
    List<Item> showAll();

    /**
     * 查询热销
     * @return 热销列表
     */
    List<Item> showTop();

    /**
     * 首页列表（热门、热销、收藏）
     * @param i 传入选择参数
     * @return 对应商品表
     */
    List<Item> showList(Integer i);

    /**
     * 通过类别获取商品
     * @param id 类别id
     * @return 商品列表
     */
    List<Item> showItemByCategory(Integer id);

    /**
     * 通过名称获取商品
     * @param name 名称（模糊查询）
     * @return 商品列表
     */
    List<Item> showItemByName(String name);

    /**
     * 获取商品详情
     * @param id 商品id
     * @return 商品详情
     */
    Item details(Integer id);

    /**
     * 添加商品方法
     * @param newForm 包含待添加商品信息的jsonObject
     */
    boolean addItem(JSONObject newForm);

    /**
     * 删除与恢复方法
     * @param id 待删除数据id
     */
    void deleteItem(Integer id);

    /**
     * 修改商品方法
     * @param newForm 包含待修改商品信息的jsonObject
     */
    void change(JSONObject newForm);
    RespPageEntity getAllUserByPage(Integer page, Integer size);//分页功能
    public ItemMapper collect(Integer id);//商品收藏量+1
}
