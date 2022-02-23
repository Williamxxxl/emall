package com.example.emall.controller;

import com.example.emall.entity.Vclass;
import com.example.emall.service.VclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname VclassController
 * @Description TODO
 * @Date 2021/7/19 21:58
 * @Created by William
 */
@RestController
@RequestMapping("/vclass")
public class VclassController {
    @Autowired
    VclassService vclassService;

    /**
     * @Description 获取vip类别列表
     * @return java.util.List<com.example.emall.entity.Vclass>
     * @date 2021/7/29 15:53
     * @author William
     */
    @RequestMapping("/getClasses")
    public List<Vclass> getClasses(){
        return vclassService.getClasses();
    }
}
