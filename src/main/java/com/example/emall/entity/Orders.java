package com.example.emall.entity;

import java.util.List;

/**
 * @Classname Orders
 * @Description TODO
 * @Date 2021/7/20 23:49
 * @Created by William
 */
public class Orders {
    private int oid;
    private int paytype;
    private double sum;
    private String otime;
    private String ename;
    private List<Orderdetail> orderlist;
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPaytype() {
        return paytype;
    }

    public void setPaytype(int paytype) {
        this.paytype = paytype;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public List<Orderdetail> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<Orderdetail> orderlist) {
        this.orderlist = orderlist;
    }
}
