package com.eshopping.dao;

import com.eshopping.base.BaseDao;
import com.eshopping.pojo.ItemCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ThisPC
 * @date 2021/3/19
 */
@Repository
@Mapper
public interface ItemCategoryMapper extends BaseDao<ItemCategory> {
}
