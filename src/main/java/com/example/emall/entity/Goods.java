package com.example.emall.entity;

/**
 * @Classname Goods
 * @Description 商品实体类
 * @Date 2021/7/20 9:03
 * @Created by William
 */
public class Goods {
    private int gid;
    private String gname;
    private Sort sort;
    private Provider provider;
    private double price;
    private String unit;
    private int gstate;
    private int isdiscount;

    public int getGstate() {
        return gstate;
    }

    public void setGstate(int gstate) {
        this.gstate = gstate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(int isdiscount) {
        this.isdiscount = isdiscount;
    }
}
