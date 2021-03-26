package com.eshopping.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * dao——sever——sever具体实现类
 * @author JXHC
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 获取一个BaseDao
     * @return BaseDao<T>
     */
    public abstract BaseDao<T> getBaseDao();


    //======================= 增 ================================
    /**
     * --- 通过sql插入一个实体 ---
     * @param sql sql语句
     */
    @Override
    public void insertBySql(String sql) { this.getBaseDao().insertBySql(sql); }

    /**
     * --- 插入一个实体 ---
     * @param entity 实体
     * @return 成功与否
     */
    @Override
    public int insert(T entity) { return this.getBaseDao().insert(entity); }

    /**
     * --- 批量新增 ---
     * @param list 实体表单
     */
    @Override
    public void insertBatch(List<T> list) { this.getBaseDao().insertBatch(list); }


    //======================= 删 ================================
    /**
     * --- 根据实体主键删除一个实体 ---
     * @param id 主键
     */
    @Override
    public void deleteById(Serializable id) { this.getBaseDao().deleteById(id); }

    /**
     * --- 通过sql删除 ---
     * @param sql sql片段
     */
    @Override
    public void deleteBySql(String sql) { this.getBaseDao().deleteBySql(sql); }

    /**
     * --- 通过实体删除 ---
     * @param entity 实体
     */
    @Override
    public void deleteByEntity(T entity) { this.getBaseDao().deleteByEntity(entity); }

    /**
     * --- 通过list删除 ---
     * @param params list
     */
    @Override
    public void deleteByList(List<Object> params) { this.getBaseDao().deleteByList(params); }

    /**
     * --- 通过map删除 ---
     * @param params map
     */
    @Override
    public void deleteByMap(Map<String, Object> params) { this.getBaseDao().deleteByMap(params); }


    //======================= 查 ================================
    /**
     * --- 根据主键获取一个实体 ---
     * @param id 主键
     * @return 实体
     */
    @Override
    public T getById(Serializable id) { return this.getBaseDao().getById(id); }

    /**
     * --- 通过对象查询 ---
     * @param entity 实体
     * @return 实体
     */
    @Override
    public T getByEntity(T entity) { return this.getBaseDao().getByEntity(entity); }

    /**
     * --- 根据主键获取一个实体 ---
     * @param sql sql片段
     * @return 实体
     */
    @Override
    public T getBySql(String sql) { return this.getBaseDao().getBySql(sql); }

    /**
     * --- 通过map查询 ---
     * @param params map
     * @return 实体
     */
    @Override
    public T getByMap(Map<String, Object> params) { return this.getBaseDao().getByMap(params); }

    /**
     * --- 查询sql返回实体列表 ---
     * @param sql sql片段
     * @return 实体列表
     */
    @Override
    public List<T> listBySql(String sql) { return this.getBaseDao().listBySql(sql); }

    /**
     * --- 通过对象返回实体列表 ---
     * @param entity 实体
     * @return 实体列表
     */
    @Override
    public List<T> listByEntity(T entity) { return this.getBaseDao().listByEntity(entity); }

    /**
     * --- 根据参数查询 ---
     * @param params 实体map
     * @return 实体表单
     */
    @Override
    public List<T> listByMap(Map<String, Object> params) { return this.getBaseDao().listByMap(params); }

    /**
     * --- 查询sql返回map列表 ---
     * @param sql sql片段
     * @return 实体map表单
     */
    @Override
    public Map<String, Object> mapBySql(String sql) { return this.getBaseDao().mapBySql(sql); }

    /**
     * --- 查询sql返回map列表 ---
     * @param sql sql片段
     * @return 实体map表单
     */
    @Override
    public List<Map<String, Object>> listMapBySql(String sql) { return this.getBaseDao().listMapBySql(sql); }


    //======================= 改 ================================
    /**
     * --- 通过id进行修改 ---
     * @param id 主键
     */
    @Override
    public void updateById(Serializable id) { this.getBaseDao().updateById(id); }

    /**
     * --- 通过sql修改 ---
     * @param sql sql片段
     */
    @Override
    public void updateBySql(String sql) { this.getBaseDao().updateBySql(sql); }

    /**
     * --- 更新一个实体 ---
     * @param entity 实体
     */
    @Override
    public void update(T entity) { this.getBaseDao().update(entity); }

    /**
     * 批量修改
     */
    @Override
    public void updateBatch(List<T> list) { this.getBaseDao().updateBatch(list); }



    //======================= 判断空 ================================

    public boolean isEmpty(String str) { return (null == str) || (str.trim().length() <= 0); }
    public boolean isEmpty(Character cha) { return (null == cha) || cha.equals(' '); }
    public boolean isEmpty(Object obj) { return (null == obj); }
    public boolean isEmpty(Object[] objs) { return (null == objs) || (objs.length <= 0); }
    public boolean isEmpty(Collection<?> obj) { return (null == obj) || obj.isEmpty(); }
    public boolean isEmpty(Set<?> set) { return (null == set) || set.isEmpty(); }
    public boolean isEmpty(Serializable obj) { return null == obj; }
    public boolean isEmpty(Map<?, ?> map) { return (null == map) || map.isEmpty(); }
}
