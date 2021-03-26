package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/16
 */
public class ItemCategory implements Serializable {
    private Integer id;
    private String name;
    private  Integer parentId;
    private Integer isDeleted;
    private Date gmtCreate;
    private Date gmtModified;

    public ItemCategory(Integer id, String name, Integer parentId, Integer isDeleted,
                        Date gmtCreate, Date gmtModified) {
        this.id = id;   this.name = name;   this.parentId = parentId;   this.isDeleted = isDeleted;
        this.gmtCreate = gmtCreate;     this.gmtModified = gmtModified;
    }

    public ItemCategory() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getParentId() { return parentId; }
    public void setParentId(Integer parentId) { this.parentId = parentId; }

    public Integer getIsDeleted() { return isDeleted; }
    public void setIsDeleted(Integer isDeleted) { this.isDeleted = isDeleted; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "ItemCategory{" + "id=" + id + ", name='" + name + '\'' +
                ", parentId=" + parentId + ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + '}';
    }
}
