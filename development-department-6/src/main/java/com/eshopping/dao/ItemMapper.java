package com.eshopping.dao;

import com.eshopping.base.BaseDao;
import com.eshopping.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/23
 */
@Repository
@Mapper
public interface ItemMapper extends BaseDao<Item> {
    List<Item> getAllUserByPage(@Param("page") Integer page, @Param("size") Integer size);//
    Long getTotal();//分页功能
    public ItemMapper collect(@Param("id") Integer id);
}
