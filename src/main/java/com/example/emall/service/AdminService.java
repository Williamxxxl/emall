package com.example.emall.service;

import com.example.emall.entity.Admin;
import com.example.emall.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname AdminService
 * @Description TODO
 * @Date 2021/7/19 15:09
 * @Created by William
 */
@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    public Admin getLogin(Admin admin){
        return adminMapper.getLogin(admin);
    }
}
