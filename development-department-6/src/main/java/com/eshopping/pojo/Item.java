package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/17
 */
public class Item implements Serializable {
    /**
     * 编号，名称，价格，收藏数，购买数
     */
    private Integer id;
    private String name;
    private Float price;
    private Integer collectNum;
    private Integer saleNum;
    /**
     * 图片信息，商品描述
     */
    private String imageUrl;
    private String note;
    /**
     * 折扣，是否下架，创建日期，更改日期
     */
    private Integer discount;
    private Integer categoryId;
    private Integer isDeleted;
    private Date gmtCreate;
    private Date gmtModified;

    public Item(Integer id, String name, Float price, Integer collectNum, Integer saleNum,
                String imageUrl, String note, Integer discount, Integer categoryId,
                Integer isDeleted, Date gmtCreate, Date gmtModified) {
        this.id = id;   this.name = name;   this.price = price; this.collectNum = collectNum;
        this.saleNum = saleNum;     this.imageUrl = imageUrl;   this.note = note;
        this.discount = discount;   this.categoryId = categoryId;   this.isDeleted = isDeleted;
        this.gmtCreate = gmtCreate;     this.gmtModified = gmtModified;
    }

    public Item() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Float getPrice() { return price; }
    public void setPrice(Float price) { this.price = price; }

    public Integer getCollectNum() { return collectNum; }
    public void setCollectNum(Integer collectNum) { this.collectNum = collectNum; }

    public Integer getSaleNum() { return saleNum; }
    public void setSaleNum(Integer saleNum) { this.saleNum = saleNum; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getNote() { return note; }
    public void setNote(String node) { this.note = node; }

    public Integer getDiscount() { return discount; }
    public void setDiscount(Integer discount) { this.discount = discount; }

    public Integer getCategoryId() { return categoryId; }
    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public int getIsDeleted() { return isDeleted; }
    public void setIsDeleted(Integer isDeleted) { this.isDeleted = isDeleted; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + ", price='" + price + '\'' +
                ", collectNum=" + collectNum + ", saleNum=" + saleNum +
                ", imageUrl='" + imageUrl + '\'' + ", note='" + note + '\'' +
                ", discount=" + discount + ", categoryId=" + categoryId + ", isDeleted=" +
                isDeleted + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + '}';
    }
}
