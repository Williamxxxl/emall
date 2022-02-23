package com.example.emall.controller;

import com.example.emall.entity.Goods;
import com.example.emall.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Classname GoodsController
 * @Description TODO
 * @Date 2021/7/20 14:54
 * @Created by William
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    /**
     * @Description 获取商品列表,组合查询分页
     * @param goods
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Goods>
     * @date 2021/7/29 15:47
     * @author William
     */
    @RequestMapping("/getGoodsList")
    public PageInfo<Goods> getGoodsList(@RequestBody(required = false) Goods goods, int pageNum, int pageSize){
        return goodsService.getGoodsList(goods,pageNum,pageSize);
    }
    /**
     * @Description 新增商品
     * @param goods
     * @return int
     * @date 2021/7/29 15:48
     * @author William
     */
    @RequestMapping("/addGoods")
    public int addGoods(@RequestBody Goods goods){
        return goodsService.addGoods(goods);
    }
    /**
     * @Description 删除商品
     * @param gid
     * @return int
     * @date 2021/7/29 15:48
     * @author William
     */
    @RequestMapping("/delGoods")
    public int delGoods(int gid){
        return goodsService.delGoods(gid);
    }
    /**
     * @Description 修改商品信息
     * @param goods
     * @return int
     * @date 2021/7/29 15:49
     * @author William
     */
    @RequestMapping("/updateGoods")
    public int updateGoods(@RequestBody Goods goods){
        return goodsService.updateGoods(goods);
    }
    /**
     * @Description 修改产品上下架状态
     * @param goods
     * @return int
     * @date 2021/7/29 15:49
     * @author William
     */
    @RequestMapping("/changeState")
    public int changeState(@RequestBody Goods goods){
        return goodsService.changeState(goods);
    }
    /**
     * @Description 修改产品是否享受会员折扣
     * @param goods
     * @return int
     * @date 2021/7/29 15:49
     * @author William
     */
    @RequestMapping("changeIsdiscount")
    public int changeIsdiscount(@RequestBody Goods goods){
        return goodsService.changeIsdiscount(goods);
    }
}
