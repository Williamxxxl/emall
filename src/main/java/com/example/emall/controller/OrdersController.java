package com.example.emall.controller;

import com.example.emall.entity.Data;
import com.example.emall.entity.Orderdetail;
import com.example.emall.entity.Orders;
import com.example.emall.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Classname OrdersController
 * @Description TODO
 * @Date 2021/7/21 8:52
 * @Created by William
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    /**
     * @Description 获取所有订单 分页 模糊查询 按时间查询
     * @param map
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Orders>
     * @date 2021/7/21 9:42
     * @author William
     */
    @RequestMapping("/getOrders")
    public Data getOrders(@RequestBody(required = false) Map map, int pageNum, int pageSize){
        return ordersService.getOrders(map,pageNum,pageSize);
    }
    /**
     * @Description 获取订单明细列表
     * @param gname
     * @return java.util.List<com.example.emall.entity.Orderdetail>
     * @date 2021/7/23 9:27
     * @author William
     */
    @RequestMapping("/getOrderdetails")
    public PageInfo<Orderdetail> getOrderdetails(String gname, int pageNum, int pageSize){
        return ordersService.getOrderdetails(gname,pageNum,pageSize);
    }
    /**
     * @Description 插入新订单并返回oid
     * @param orders
     * @return int
     * @date 2021/7/21 9:44
     * @author William
     */
    @RequestMapping("/getOid")
    public int getOid(@RequestBody Orders orders){
        return ordersService.getOid(orders);
    }
    /**
     * @Description 修改订单状态,取消订单使用
     * @param orders
     * @return int
     * @date 2021/7/21 9:45
     * @author William
     */
    @RequestMapping("/changeState")
    public int changeState(@RequestBody Orders orders){
        return ordersService.changeState(orders);
    }
    /**
     * @Description 批量插入订单
     * @param orderdetails
     * @return int
     * @date 2021/7/21 11:12
     * @author William
     */
    @RequestMapping("/addOrders")
    public int addOrders(@RequestBody List<Orderdetail> orderdetails){
        return ordersService.addOrders(orderdetails);
    }
    /**
     * @Description 获取每日销售额
     * @param map
     * @return java.util.Map
     * @date 2021/7/26 10:42
     * @author William
     */
    @RequestMapping("/getDaySale")
    public List<Map> getDaySale(@RequestBody Map map){
        return ordersService.getDaySale(map);
    }
    /**
     * @Description 依据种类查看销量
     * @param map
     * @return java.util.List<java.util.Map>
     * @date 2021/7/26 13:49
     * @author William
     */
    @RequestMapping("/getSortSale")
    public List<Map> getSortSale(@RequestBody Map map){
        return ordersService.getSortSale(map);
    }
    /**
     * @Description 员工销售业绩排行
     * @param map
     * @return java.util.List<java.util.Map>
     * @date 2021/7/26 17:37
     * @author William
     */
    @RequestMapping("/getEmpSale")
    public List<Map> getEmpSale(@RequestBody Map map){
        return ordersService.getEmpSale(map);
    }
}
