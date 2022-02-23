package com.example.emall.entity;

/**
 * @Classname Orderdetail
 * @Description TODO
 * @Date 2021/7/20 17:27
 * @Created by William
 */
public class Orderdetail {
    private int oid;
    private Goods goods;
    private double quantity;
    private double total;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
