package com.example.emall.entity;

/**
 * @Classname Data
 * @Description TODO
 * @Date 2021/7/22 21:58
 * @Created by William
 */
public class Data {
    String desc;
    Object info;
    String token;
    int rowtotal;

    public int getRowtotal() {
        return rowtotal;
    }

    public void setRowtotal(int rowtotal) {
        this.rowtotal = rowtotal;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
