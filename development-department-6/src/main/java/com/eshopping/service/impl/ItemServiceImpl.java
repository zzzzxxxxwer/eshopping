package com.eshopping.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseDao;
import com.eshopping.base.BaseServiceImpl;
import com.eshopping.dao.ItemMapper;
import com.eshopping.entity.RespPageEntity;
import com.eshopping.pojo.Item;
import com.eshopping.service.ItemService;
import com.eshopping.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/23
 */
@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public BaseDao<Item> getBaseDao() { return itemMapper; }

    @Override
    public List<Item> showAll() {
        /* ---展示所有商品--- */
        return listBySql("SELECT * FROM item ORDER BY id");
    }

    @Override
    public List<Item> showTop() {
        /* ---顶部展示--- */
        String sql = "SELECT * FROM item WHERE is_deleted!=1 ORDER BY sale_num ASC LIMIT 0,"
                + Constant.SHOW_NUM;
        return listBySql(sql);
    }

    @Override
    public List<Item> showList(Integer i) {
        /* ---首页列表（热门、热销、收藏）--- */
        String sql = "SELECT * FROM item WHERE is_deleted!=1 ORDER BY ";
        if (Constant.POPULAR == i) {
            sql += "sale_num DESC";
        } else if (Constant.HOT_SELL == i) {
            sql += "sale_num";
        } else if (Constant.HIGH_COLLECT == i) {
            sql += "collect_num";
        } else {
            // 查询条件有误，直接返回空列表
            return null;
        }
        sql += " LIMIT 0, " + Constant.LIST_NUM;
        return listBySql(sql);
    }

    @Override
    public List<Item> showItemByCategory(Integer id) {
        /* ---通过类别获取商品--- */
        String sql = "SELECT * FROM item WHERE is_deleted!=1 AND category_id=" + id;
        return listBySql(sql);
    }

    @Override
    public List<Item> showItemByName(String name) {
        /* ---通过名称获取商品--- */
        String sql = "SELECT * FROM item WHERE name LIKE '%" + name + "%' ORDER BY id";
        return listBySql(sql);
    }

    @Override
    public Item details(Integer id) {
        /* ---获取商品详情--- */
        String sql = "SELECT * FROM item WHERE is_deleted!=1 AND id=" + id;
        return getBySql(sql);
    }

    @Override
    public boolean addItem(JSONObject form) {
        /* ---添加商品方法--- */
        if (form.get("categoryId") != null) {
            StringBuilder sql = new StringBuilder("INSERT INTO item(name, price, collection_num, sale_num, image_url, note, discount, category_id, is_delete) VALUES ('")
                    .append(form.get("name")).append("', '").append(form.get("price")).append("', 0, 0, '").append(form.get("url1"));
            if (form.get("url2") != null) {
                sql.append(",").append((String) form.get("url2"));
                if (form.get("url3") != null) {
                    sql.append(",").append((String) form.get("url3"));
                    if (form.get("url4") != null) {
                        sql.append(",").append((String) form.get("url4"));
                        if (form.get("url5") != null) {
                            sql.append(",").append((String) form.get("url5"));
                        }
                    }
                }
            }
            sql.append("', '").append(form.get("note")).append("', ").append(form.get("discount"))
                    .append(", ").append(form.get("categoryId")).append(", 0)");
            updateBySql(sql.toString());
            return true;
        }
        return false;
    }

    @Override
    public void deleteItem(Integer id) {
        /* ---删除（上架下架方法）--- */
        Item item = getById(id);
        String sql = (item.getIsDeleted() != 1) ? "UPDATE item SET is_deleted=1 WHERE id=" + id
                : "UPDATE item SET is_deleted=0 WHERE id=" + id;
        itemMapper.updateBySql(sql);
    }

    @Override
    public void change(JSONObject newForm) {
        /* ---修改商品方法--- */
    }
    @Transactional
    public RespPageEntity getAllUserByPage(Integer page, Integer size) {
        RespPageEntity pageEntity = new RespPageEntity();
        // 默认从0开始
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        // 获取当前页的用户信息
        List<Item> items = itemMapper.getAllUserByPage(page, size);
        pageEntity.setData(items);
        // 获取当前用户总量
        Long total = itemMapper.getTotal();
        pageEntity.setTotal(total);
        return pageEntity;
    }

    //商品收藏
    @Override
    public ItemMapper collect(Integer id) {
        return itemMapper.collect(id);
    }
}
