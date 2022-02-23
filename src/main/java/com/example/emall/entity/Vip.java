package com.example.emall.entity;

/**
 * @Classname Vip
 * @Description TODO
 * @Date 2021/7/19 22:04
 * @Created by William
 */
public class Vip {
    private int vid;
    private String vname;
    private double bal;
    private int point;
    private String tel;
    private Vclass vclass;

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Vclass getVclass() {
        return vclass;
    }

    public void setVclass(Vclass vclass) {
        this.vclass = vclass;
    }
}
