package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/18
 */
public class ItemOrder implements Serializable {
    private Integer id;
    private com.eshopping.pojo.Item item;
    private com.eshopping.pojo.User user;
    private String code;
    private String total;
    private Integer isDeleted;
    /**
     * 0、新建发货  1、已取消  2、已发货  3、已收货  4、已评价
     */
    private Integer status;
    private Date gmtCreate;
    private Date gmtModified;

    public ItemOrder(Integer id, Item item, User user, String code,
                     String total, Integer isDeleted, Integer status,
                     Date gmtCreate, Date gmtModified) {
        this.id = id;   this.item = item;   this.user = user;
        this.code = code;   this.total = total;
        this.isDeleted = isDeleted; this.status = status;
        this.gmtCreate = gmtCreate; this.gmtModified = gmtModified;
    }

    public ItemOrder() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getTotal() { return total; }
    public void setTotal(String total) { this.total = total; }

    public Integer getIsDeleted() { return isDeleted; }
    public void setIsDeleted(Integer isDeleted) { this.isDeleted = isDeleted; }

    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "ItemOrder{" + "id=" + id + ", item=" + item +
                ", user=" + user + ", code='" + code + '\'' +
                ", total='" + total + '\'' + ", isDeleted=" + isDeleted +
                ", status=" + status + ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified + '}';
    }
}
