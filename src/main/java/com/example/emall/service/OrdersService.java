package com.example.emall.service;

import com.example.emall.entity.Data;
import com.example.emall.entity.Orderdetail;
import com.example.emall.entity.Orders;
import com.example.emall.mapper.OrdersMapper;
import com.example.emall.util.Pagging;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname OrdersService
 * @Description TODO
 * @Date 2021/7/21 8:49
 * @Created by William
 */
@Service
public class OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    public Data getOrders(Map map, int pageNum, int pageSize){
        List<Orders> orders = ordersMapper.getOrders(map);
        Data main = Pagging.main(orders, pageNum, pageSize);
        return main;
    }
    public int getOid(Orders orders){
        ordersMapper.getOid(orders);
        int oid = orders.getOid();
//        System.out.println(oid);
        return oid;
    }
    public int changeState(Orders orders){
        return ordersMapper.changeState(orders);
    }
    public int addOrders(List<Orderdetail> orderdetails){
        return ordersMapper.addOrders(orderdetails);
    }

    public PageInfo<Orderdetail> getOrderdetails(String gname, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Orderdetail> orderdetails = ordersMapper.getOrderdetails(gname);
        PageInfo<Orderdetail> orderdetailPageInfo = new PageInfo<>(orderdetails);
        return orderdetailPageInfo;
    }

    public List<Map> getDaySale(Map map){
//        System.out.println(map.get("enddate"));
//        System.out.println(map.size());
        return ordersMapper.getDaySale(map);
    }
    public List<Map> getSortSale(Map map){
//        System.out.println(map.get("enddate"));
//        System.out.println(map.size());
        return ordersMapper.getSortSale(map);
    }

    public List<Map> getEmpSale(Map map){
        return ordersMapper.getEmpSale(map);
    }
}
