package com.example.emall.mapper;
import com.example.emall.entity.Orderdetail;
import com.example.emall.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

 /**
 * @Classname OrderMapper
 * @Description 订单相关mapper接口
 * @Date 2021/7/20 17:19
 * @Created by William
 */
@Mapper
public interface OrdersMapper {
    public List<Orders> getOrders(Map map);
    public int getOid(Orders orders);
    public int changeState(Orders orders);
    public int addOrders(List<Orderdetail> orderdetails);
    public List<Orderdetail> getOrderdetails(String gname);
    public List<Map> getDaySale(Map map);
    public List<Map> getSortSale(Map map);
    public List<Map> getEmpSale(Map map);
}
