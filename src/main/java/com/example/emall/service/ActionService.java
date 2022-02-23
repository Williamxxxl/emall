package com.example.emall.service;

import com.example.emall.entity.Action;
import com.example.emall.mapper.ActionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ActionService
 * @Description TODO
 * @Date 2021/7/24 11:25
 * @Created by William
 */
@Service
public class ActionService {
    @Autowired
    ActionMapper actionMapper;
    public List<Action> getActions(){
        return actionMapper.getActions();
    }
}
