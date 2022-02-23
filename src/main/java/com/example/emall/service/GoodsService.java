package com.example.emall.service;

import com.example.emall.entity.Goods;
import com.example.emall.mapper.GoodsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GoodsService
 * @Description TODO
 * @Date 2021/7/20 14:43
 * @Created by William
 */
@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    public PageInfo<Goods> getGoodsList(Goods goods, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = goodsMapper.getGoodsList(goods);
        PageInfo<Goods> goodsPageInfo = new PageInfo<>(goodsList);
        return goodsPageInfo;
    }
    public int addGoods(Goods goods){
       return goodsMapper.addGoods(goods);
    }
    public int delGoods(int gid){
        return goodsMapper.delGoods(gid);
    }
    public int updateGoods(Goods goods){
        return goodsMapper.updateGoods(goods);
    }
    public int changeState(Goods goods){
        return goodsMapper.changeState(goods);
    }
    public int changeIsdiscount(Goods goods){
        return goodsMapper.changeIsdiscount(goods);
    }
}
