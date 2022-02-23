package com.example.emall.service;

import com.example.emall.entity.Provider;
import com.example.emall.mapper.ProviderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ProviderService
 * @Description TODO
 * @Date 2021/7/20 13:26
 * @Created by William
 */
@Service
public class ProviderService {
    @Autowired
    ProviderMapper providerMapper;
    public PageInfo<Provider> getProviders(String pname,int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Provider> providers = providerMapper.getProviders(pname);
        PageInfo<Provider> providerPageInfo = new PageInfo<>(providers);
        return providerPageInfo;
    }
    public int addProvider(String pname){
        return providerMapper.addProvider(pname);
    }

    public int delProvider(int pid){
        return providerMapper.delProvider(pid);
    }

    public int updateProvider(String pname,int pid){
        return providerMapper.updateProvider(pname,pid);
    }
}
