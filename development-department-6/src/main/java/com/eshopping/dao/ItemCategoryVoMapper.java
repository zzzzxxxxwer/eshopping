package com.eshopping.dao;

import com.eshopping.base.BaseDao;
import com.eshopping.pojo.vo.ItemCategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ThisPC
 * @date 2021/3/24
 */
@Repository
@Mapper
public interface ItemCategoryVoMapper extends BaseDao<ItemCategoryVo> {
}
