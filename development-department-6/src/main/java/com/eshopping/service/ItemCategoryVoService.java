package com.eshopping.service;

import com.eshopping.base.BaseService;
import com.eshopping.pojo.ItemCategory;
import com.eshopping.pojo.vo.ItemCategoryVo;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/24
 */
public interface ItemCategoryVoService extends BaseService<ItemCategoryVo> {
    /**
     * 获取一级类目并储存子类信息
     * @return 一级类目列表
     */
    List<ItemCategoryVo> showList();

    /**
     * 通过父类id查询类目
     * @param id 父类目id
     * @return 查询出的子类目列表
     */
    List<ItemCategoryVo> getChildBySql(Integer id);
}
