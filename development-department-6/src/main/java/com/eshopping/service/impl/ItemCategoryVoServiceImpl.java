package com.eshopping.service.impl;

import com.eshopping.base.BaseDao;
import com.eshopping.base.BaseServiceImpl;
import com.eshopping.dao.ItemCategoryVoMapper;
import com.eshopping.pojo.vo.ItemCategoryVo;
import com.eshopping.service.ItemCategoryService;
import com.eshopping.service.ItemCategoryVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/24
 */
@Service
public class ItemCategoryVoServiceImpl extends BaseServiceImpl<ItemCategoryVo>
        implements ItemCategoryVoService {
    @Autowired
    ItemCategoryVoMapper itemCategoryVoMapper;
    @Autowired
    private ItemCategoryService itemCategoryService;

    @Override
    public BaseDao<ItemCategoryVo> getBaseDao() { return itemCategoryVoMapper; }

    @Override
    public List<ItemCategoryVo> showList() {
        /* ---获取一级类目，储存子类信息--- */
        List<ItemCategoryVo> list = listBySql
                ("SELECT * FROM item_category WHERE parent_id IS NULL AND is_deleted!=1");
        for (ItemCategoryVo itemCategoryVo : list) { findChildren(itemCategoryVo); }
        return list;
    }

    @Override
    public List<ItemCategoryVo> getChildBySql(Integer id) {
        ItemCategoryVo itemCategoryVo = new ItemCategoryVo(itemCategoryService.getById(id));
        /* ---通过父类id查询子类目--- */
        findChildren(itemCategoryVo);
        return itemCategoryVo.getChildren();
    }

    private void findChildren(ItemCategoryVo itemCategoryVo) {
        /* ---获取子类方法--- */
        // 查询子类列表
        List<ItemCategoryVo> children = listBySql("SELECT * FROM item_category WHERE parent_id="
                + itemCategoryVo.getId());
        if (children != null) {
            // 若子类不为空，则赋值，并对子类列表递归
            itemCategoryVo.setChildren(children);
            for (ItemCategoryVo one : children) { findChildren(one); }
        }
        // 获取Item表对应该类目的实体商品
    }
}
