package com.example.emall.controller;

import com.example.emall.entity.Action;
import com.example.emall.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname ActionController
 * @Description TODO
 * @Date 2021/7/24 11:26
 * @Created by William
 */
@RestController
@RequestMapping("/action")
public class ActionController {
    @Autowired
    ActionService actionService;
    /**
     * @Description 获取收银台操作列表
     * @return java.util.List<com.example.emall.entity.Action>
     * @date 2021/7/29 15:45
     * @author William
     */
    @RequestMapping("/getActions")
    public List<Action> getActions(){
        return actionService.getActions();
    }
}
