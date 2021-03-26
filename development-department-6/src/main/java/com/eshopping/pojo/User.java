package com.eshopping.pojo;

import java.util.Date;

/**
 * @author ThisPC
 * @date 2021/3/18
 */
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String phone;
    private String realName;
    private String sex;
    private String address;
    private String email;
    private Date gmtCreate;
    private Date gmtModified;

    public User(Integer id, String userName, String passWord, String phone,
                String realName, String sex, String address,
                String email, Date gmtCreate, Date gmtModified) {
        this.id = id;   this.userName = userName;   this.passWord = passWord;
        this.phone = phone; this.realName = realName;   this.sex = sex;
        this.address = address;     this.email = email;
        this.gmtCreate = gmtCreate; this.gmtModified = gmtModified;
    }

    public User() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPassWord() { return passWord; }
    public void setPassWord(String passWord) { this.passWord = passWord; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getRealName() { return realName; }
    public void setRealName(String realName) { this.realName = realName; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getGmtCreate() { return gmtCreate; }
    public void setGmtCreate(Date gmtCreate) { this.gmtCreate = gmtCreate; }

    public Date getGmtModified() { return gmtModified; }
    public void setGmtModified(Date gmtModified) { this.gmtModified = gmtModified; }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' + ", phone='" + phone + '\'' +
                ", realName='" + realName + '\'' + ", sex='" + sex + '\'' +
                ", address='" + address + '\'' + ", email='" + email + '\'' +
                ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified +
                '}';
    }
}
