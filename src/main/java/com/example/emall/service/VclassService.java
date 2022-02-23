package com.example.emall.service;

import com.example.emall.entity.Vclass;
import com.example.emall.mapper.VclassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname VclassService
 * @Description TODO
 * @Date 2021/7/19 21:56
 * @Created by William
 */
@Service
public class VclassService {
    @Autowired
    VclassMapper vclassMapper;
    public List<Vclass> getClasses(){
        return vclassMapper.getClasses();
    }
}
