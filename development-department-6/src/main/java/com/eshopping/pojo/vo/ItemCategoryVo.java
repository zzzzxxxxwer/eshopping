package com.eshopping.pojo.vo;

import com.eshopping.pojo.ItemCategory;

import java.util.Date;
import java.util.List;

/**
 * @author ThisPC
 * @date 2021/3/19
 */
public class ItemCategoryVo extends ItemCategory {

    private Integer soldNum;
    private List<ItemCategoryVo> children;

    public ItemCategoryVo() { super(); }

    public ItemCategoryVo(ItemCategory ic) {
        super(ic.getId(), ic.getName(), ic.getParentId(), ic.getIsDeleted(),
                ic.getGmtCreate(), ic.getGmtModified());
    }

    public ItemCategoryVo(Integer id, String name, Integer parentId, Integer level,
                          Integer isDeleted, Date gmtCreate, Date gmtModified,
                          Integer soldNum, List<ItemCategoryVo> children) {
        super(id, name, parentId, isDeleted, gmtCreate, gmtModified);
        this.soldNum = soldNum;     this.children = children;
    }

    public Integer getSoldNum() { return soldNum; }
    public void setSoldNum(Integer soldNum) { this.soldNum = soldNum; }

    public List<ItemCategoryVo> getChildren() { return children; }
    public void setChildren(List<ItemCategoryVo> children) { this.children = children; }

    @Override
    public String toString() {
        return "ItemCategoryVo{" + "soldNum=" + soldNum + ", children=" + children + '}';
    }
}
