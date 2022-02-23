package com.example.emall.controller;

import com.example.emall.entity.Vip;
import com.example.emall.service.VipService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname VipController
 * @Description TODO
 * @Date 2021/7/19 22:55
 * @Created by William
 */
@RestController
@RequestMapping("/vip")
public class VipController {
    @Autowired
    VipService vipService;
    /**
     * @Description 分页模糊查询vip
     * @param vname
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Vip>
     * @date 2021/7/19 22:57
     * @author William
     */
    @RequestMapping("/getVips")
    public PageInfo<Vip> getVips(String vname, int pageNum, int pageSize){
        return vipService.getVips(vname,pageNum,pageSize);
    }
    /**
     * @Description 会员充值
     * @param vip
     * @return int
     * @date 2021/7/20 8:22
     * @author William
     */
    @RequestMapping("/recharge")
    public int recharge(@RequestBody Vip vip){
        return vipService.recharge(vip);
    }
    /**
     * @Description 新增会员
     * @param vip
     * @return int
     * @date 2021/7/20 8:25
     * @author William
     */
    @RequestMapping("/addVip")
    public int addVip(@RequestBody Vip vip){
        return vipService.addVip(vip);
    }
    /**
     * @Description 修改会员信息
     * @param vip
     * @return int
     * @date 2021/7/20 8:25
     * @author William
     */
    @RequestMapping("/updateVip")
    public int updateVip(@RequestBody Vip vip){
        return vipService.updateVip(vip);
    }
    /**
     * @Description 通过vid查找vip对象
     * @param vid
     * @return com.example.emall.entity.Vip
     * @date 2021/7/25 9:52
     * @author William
     */
    @RequestMapping("/getVipById")
    public Vip getVipById(int vid){
        return vipService.getVipById(vid);
    }
}
