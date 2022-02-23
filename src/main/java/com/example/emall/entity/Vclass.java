package com.example.emall.entity;

/**
 * @Classname Vclass
 * @Description TODO
 * @Date 2021/7/19 21:45
 * @Created by William
 */
public class Vclass {
    private int classid;
    private String classname;
    private int amount;
    private double discount;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
