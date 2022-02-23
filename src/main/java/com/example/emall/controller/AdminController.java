package com.example.emall.controller;

import com.example.emall.entity.Admin;
import com.example.emall.service.AdminService;
import com.example.emall.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname AdminController
 * @Description TODO
 * @Date 2021/7/19 15:10
 * @Created by William
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    /**
     * @Description 管理员登录
     * @param admin
     * @return com.example.emall.entity.Admin
     * @date 2021/7/19 15:25
     * @author William
     */
    @RequestMapping("/getLogin")
    public Admin getLogin(@RequestBody Admin admin){
        return adminService.getLogin(admin);
    }

}
