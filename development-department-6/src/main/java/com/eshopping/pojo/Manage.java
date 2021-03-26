package com.eshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员
 * Serializable接口的作用是实现序列化
 * @author ThisPC
 */
public class Manage implements Serializable {

    /**
     * 主键，登录名，密码，姓名
     */
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private Date gmtCreate;
    private Date gmtModified;

    public Manage(Integer id, String userName, String passWord, String realName,
                  Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.realName = realName;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Manage() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPassWord() { return passWord; }
    public void setPassWord(String passWord) { this.passWord = passWord; }

    public String getRealName() { return realName; }
    public void setRealName(String realName) { this.realName = realName; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "Manage{" + "id=" + id + ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' + ", realName='" + realName + '\'' +
                ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + '}';
    }
}
