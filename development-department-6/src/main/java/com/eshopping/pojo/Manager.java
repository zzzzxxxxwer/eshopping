package com.eshopping.pojo;

import java.io.Serializable;

/**
 * 管理员
 * Serializable接口的作用是实现序列化
 * @author ThisPC
 */
public class Manager implements Serializable {

    /**
     * 主键，登录名，密码，姓名
     */
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    public Manager(Integer id, String userName, String passWord, String realName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.realName = realName;
    }

    public Manager() {
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public String getPassWord() { return passWord; }

    public void setPassWord(String passWord) { this.passWord = passWord; }

    public String getRealName() { return realName; }

    public void setRealName(String realName) { this.realName = realName; }

    @Override
    public String toString() {
        return "Manage{" + "id=" + id + ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' + ", realName='" + realName + '\'' +
                '}';
    }
}
