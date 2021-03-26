package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/18
 */
public class News implements Serializable {
    private Integer id;
    private String name;
    private String content;
    private Date gmtCreate;
    private Date gmtModified;

    public News(Integer id, String name, String content, Date gmtCreate, Date gmtModified) {
        this.id = id;   this.name = name;   this.content = content;
        this.gmtCreate = gmtCreate; this.gmtModified = gmtModified;
    }

    public News() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "News{" + "id=" + id + ", name='" + name + '\'' +
                ", content='" + content + '\'' + ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified + '}';
    }
}
