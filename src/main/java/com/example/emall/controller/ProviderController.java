package com.example.emall.controller;

import com.example.emall.entity.Provider;
import com.example.emall.service.ProviderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Classname ProviderController
 * @Description TODO
 * @Date 2021/7/20 13:36
 * @Created by William
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    ProviderService providerService;
    /**
     * @Description 获取供应商列表,并根据名称模糊查询分页
     * @param pname
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Provider>
     * @date 2021/7/29 15:50
     * @author William
     */
    @RequestMapping("/getProviders")
    public PageInfo<Provider> getProviders(String pname,int pageNum, int pageSize){
        return providerService.getProviders(pname,pageNum,pageSize);
    }
    /**
     * @Description 新增供应商
     * @param pname
     * @return int
     * @date 2021/7/29 15:51
     * @author William
     */
    @RequestMapping("/addProvider")
    public int addProvider(String pname){
        return providerService.addProvider(pname);
    }
    /**
     * @Description 删除供应商
     * @param pid
     * @return int
     * @date 2021/7/29 15:51
     * @author William
     */
    @RequestMapping("/delProvider")
    public int delProvider(int pid){
        return providerService.delProvider(pid);
    }
    /**
     * @Description 修改供应商
     * @param pname
     * @param pid
     * @return int
     * @date 2021/7/29 15:51
     * @author William
     */
    @RequestMapping("/updateProvider")
    public int updateProvider(String pname,int pid){
        return providerService.updateProvider(pname,pid);
    }
}