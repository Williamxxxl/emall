package com.example.emall.controller;

import com.example.emall.entity.Sort;
import com.example.emall.service.SortService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname SortController
 * @Description TODO
 * @Date 2021/7/20 13:34
 * @Created by William
 */
@RestController
@RequestMapping("/sort")
public class SortController {
    @Autowired
    SortService sortService;
    /**
     * @Description 获取商品种类列表,并且分页
     * @param sname
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Sort>
     * @date 2021/7/29 15:51
     * @author William
     */
    @RequestMapping("/getSorts")
    public PageInfo<Sort> getSorts(String sname,int pageNum, int pageSize){
        return sortService.getSorts(sname,pageNum,pageSize);
    }
    /**
     * @Description 新增商品种类
     * @param sname
     * @return int
     * @date 2021/7/29 15:52
     * @author William
     */
    @RequestMapping("/addSort")
    public int addSort(String sname){
        return sortService.addSort(sname);
    }
    /**
     * @Description 删除种类
     * @param sid
     * @return int
     * @date 2021/7/29 15:52
     * @author William
     */
    @RequestMapping("/delSort")
    public int delSort(int sid){
        return sortService.delSort(sid);
    }
    /**
     * @Description 修改种类信息
     * @param sname
     * @param sid
     * @return int
     * @date 2021/7/29 15:52
     * @author William
     */
    @RequestMapping("/updateSort")
    public int updateSort(String sname,int sid){
        return sortService.updateSort(sname,sid);
    }

}
