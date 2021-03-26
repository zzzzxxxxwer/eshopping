package com.eshopping.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.eshopping.base.BaseDao;
import com.eshopping.base.BaseServiceImpl;
import com.eshopping.dao.ItemCategoryMapper;
import com.eshopping.pojo.ItemCategory;
import com.eshopping.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ThisPC
 * @date 2021/3/19
 */
@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {
    @Autowired
    ItemCategoryMapper itemCategoryMapper;

    @Override
    public BaseDao<ItemCategory> getBaseDao() { return itemCategoryMapper; }

    @Override
    public boolean addItemCategory(JSONObject newForm) {
        /* ---添加方法--- */
        if (newForm.get("cateName") != null) {
            String sql = (newForm.get("pId") != null)
                    ? ("INSERT INTO item_category(parent_id, name) VALUES (" + newForm.get("pId") + ", '")
                    : "INSERT INTO item_category(name) VALUES ('";
            sql += newForm.get("cateName") + "')";
            insertBySql(sql);
            return true;
        }
        return false;
    }

    @Override
    public void changeItemCategory(String name, Integer id) {
        /* ---修改方法--- */
        String sql = "UPDATE item_category SET name='" + name + "' WHERE id=" + id;
        updateBySql(sql);
    }

    @Override
    public void deleteItemCategory(Integer id) {
        /* ---删除（上架下架方法）--- */
        ItemCategory itemCategory = getById(id);
        String sql = (itemCategory.getIsDeleted() != 1)
                ? "UPDATE item_category SET is_deleted=1 WHERE id=" + id
                : "UPDATE item_category SET is_deleted=0 WHERE id=" + id;
        itemCategoryMapper.updateBySql(sql);
    }
}
