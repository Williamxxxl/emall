package com.example.emall.entity;

/**
 * @Classname Admin
 * @Description TODO
 * @Date 2021/7/18 12:01
 * @Created by William
 */
public class Admin {
    private int aid;
    private String loginid;
    private String loginpwd;

    public int getUid() {
        return aid;
    }

    public void setUid(int uid) {
        this.aid = uid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }
}
