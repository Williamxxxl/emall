package com.example.emall.mapper;

import com.example.emall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname GoodsMapper
 * @Description TODO
 * @Date 2021/7/20 13:54
 * @Created by William
 */
@Mapper
public interface GoodsMapper {
    public List<Goods> getGoodsList(Goods goods);
    public int addGoods(Goods goods);
    public int delGoods(int gid);
    public int updateGoods(Goods goods);
    public int changeState(Goods goods);
    public int changeIsdiscount(Goods goods);
}
