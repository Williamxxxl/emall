package com.example.emall.service;

import com.example.emall.entity.Vip;
import com.example.emall.mapper.VipMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname VipService
 * @Description TODO
 * @Date 2021/7/19 22:52
 * @Created by William
 */
@Service
public class VipService {
    @Autowired
    VipMapper vipMapper;

    public PageInfo<Vip> getVips(String vname, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Vip> vips = vipMapper.getVips(vname);
        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
        return vipPageInfo;
    }
    public int recharge(Vip vip){
        return vipMapper.recharge(vip);
    }
    public int addVip(Vip vip){
        return vipMapper.addVip(vip);
    }
    public int updateVip(Vip vip){
        return vipMapper.updateVip(vip);
    }
    public Vip getVipById(int vid){
        return vipMapper.getVipById(vid);
    }
}
