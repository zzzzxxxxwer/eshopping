package com.eshopping.base;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Description: dao——数据持久层方法
 * @Author: JXHC
 * @Date: 2021/3/16
 */
public interface BaseDao<T> {
    //======================= 增 ================================
    /**
     * --- 通过sql插入一个实体 ---
     * @param sql sql语句
     */
    void insertBySql(@Param("sql") String sql);

    /**
     * --- 插入一个实体 ---
     * @param entity 实体
     * @return 成功与否
     */
    int insert(T entity);

    /**
     * --- 批量新增 ---
     * @param list 实体列表
     */
    void insertBatch(List<T> list);

    //======================= 删 ================================
    /**
     * --- 根据实体主键删除一个实体 ---
     * @param id 主键
     */
    void deleteById(Serializable id);

    /**
     * --- 通过sql删除 ---
     * @param sql sql片段
     */
    void deleteBySql(@Param("sql") String sql);

    /**
     * --- 通过实体删除 ---
     * @param entity 实体
     */
    void deleteByEntity(T entity);

    /**
     * --- 通过list删除 ---
     * @param params list
     */
    void deleteByList(List<Object> params);

    /**
     * --- 通过map删除 ---
     * @param params map
     */
    void deleteByMap(Map<String, Object> params);

    //======================= 查 ================================
    /**
     * --- 根据主键获取一个实体 ---
     * @param id 主键
     * @return 实体
     */
    T getById(Serializable id);

    /**
     * --- 通过实体对象获取一个实体 ---
     * @param entity 实体
     * @return 实体
     */
    T getByEntity(T entity);

    /**
     * --- 通过sql获取一个实体 ---
     * @param sql sql片段
     * @return 实体
     */
    T getBySql(@Param("sql") String sql);

    /**
     * --- 通过map查询 ---
     * @param params map
     * @return 实体
     */
    T getByMap(Map<String, Object> params);

    /**
     * --- 查询sql返回实体列表 ---
     * @param sql sql片段
     * @return 实体列表
     */
    List<T> listBySql(@Param("sql") String sql);

    /**
     * --- 通过对象返回实体列表 ---
     * @param entity 实体
     * @return 实体列表
     */
    List<T> listByEntity(T entity);

    /**
     * --- 根据参数查询 ---
     * @param params 实体map
     * @return 实体表单
     */
    List<T> listByMap(Map<String, Object> params);

    /**
     * --- 查询一个sql返回map ---
     * @param sql sql片段
     * @return map
     */
    Map<String, Object> mapBySql(@Param("sql") String sql);

    /**
     * --- 查询sql返回map列表 ---
     * @param sql sql片段
     * @return list<map>
     */
    List<Map<String, Object>> listMapBySql(@Param("sql") String sql);

    //======================= 改 ================================
    /**
     * --- 通过id进行修改 ---
     * @param id 主键
     */
    void updateById(Serializable id);

    /**
     * --- 通过sql修改 ---
     * @param sql sql片段
     */
    void updateBySql(@Param("sql") String sql);

    /**
     * --- 更新一个实体 ---
     * @param entity 实体
     */
    void update(T entity);

    /**
     * --- 批量修改 ---
     * @param list 实体列表
     */
    void updateBatch(List<T> list);
}
