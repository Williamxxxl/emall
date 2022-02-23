package com.example.emall.util;

import com.example.emall.entity.Data;
import com.example.emall.entity.Orders;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Pagging
 * @Description TODO
 * @Date 2021/7/22 21:57
 * @Created by William
 */
public class Pagging {
    public static Data main(List list, int pageNum, int pageSize) {
        Data data = new Data();
        ArrayList info1 = new ArrayList();

        int num = pageSize;
        if (pageNum * pageSize > list.size()) {
            num = list.size() - (pageNum - 1) * pageSize;
        }
        for (int i = 0; i < num; i++) {
            Orders orders = (Orders) list.get((pageNum - 1) * pageSize + i);
            info1.add(orders);
        }
        data.setInfo(info1);
        data.setRowtotal(list.size());
        return data;

    }
}
