package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/18
 */
public class Comment implements Serializable {
    private Integer id;
    private User user;
    private Item item;
    private String content;
    private Date gmtCreate;
    private Date gmtModified;

    public Comment(Integer id, User user, Item item, String content,
                   Date gmtCreate, Date gmtModified) {
        this.id = id;               this.user = user;
        this.item = item;           this.content = content;
        this.gmtCreate = gmtCreate; this.gmtModified = gmtModified;
    }

    public Comment() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", user=" + user +
                ", item=" + item + ", content='" + content + '\'' +
                ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified +
                '}';
    }
}
