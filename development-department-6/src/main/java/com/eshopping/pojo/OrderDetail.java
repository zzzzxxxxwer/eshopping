package com.eshopping.pojo;

import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/18
 */
public class OrderDetail {
    private Integer id;
    private Item item;
    private ItemOrder itemOrder;
    private Integer status;
    private Integer num;
    private String total;
    private Date gmtCreate;
    private Date gmtModified;

    public OrderDetail(Integer id, Item item, ItemOrder itemOrder, Integer status,
                       Integer num, String total, Date gmtCreate, Date gmtModified) {
        this.id = id;   this.item = item;   this.itemOrder = itemOrder;
        this.status = status;   this.num = num;     this.total = total;
        this.gmtCreate = gmtCreate;     this.gmtModified = gmtModified;
    }

    public OrderDetail() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public ItemOrder getItemOrder() { return itemOrder; }
    public void setItemOrder(ItemOrder itemOrder) { this.itemOrder = itemOrder; }

    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }

    public Integer getNum() { return num; }
    public void setNum(Integer num) { this.num = num; }

    public String getTotal() { return total; }
    public void setTotal(String total) { this.total = total; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "OrderDetail{" + "id=" + id + ", item=" + item +
                ", itemOrder=" + itemOrder + ", status=" + status +
                ", num=" + num + ", total='" + total + '\'' +
                ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified +
                '}';
    }
}
