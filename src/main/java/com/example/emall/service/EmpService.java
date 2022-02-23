package com.example.emall.service;

import com.example.emall.entity.Emp;
import com.example.emall.mapper.EmpMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname EmpService
 * @Description TODO
 * @Date 2021/7/19 15:45
 * @Created by William
 */
@Service
public class EmpService {
    @Autowired
    EmpMapper empMapper;
    public PageInfo<Emp> getEmps(String nickname, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Emp> emps = empMapper.getEmps(nickname);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps);
        return empPageInfo;
    }
    public int changeState(Emp emp){
        return empMapper.changeState(emp);
    }
    public int addEmp(Emp emp){
        return empMapper.addEmp(emp);
    }
    public int delEmp(int eid){
        return empMapper.delEmp(eid);
    }
    public int updateEmp(Emp emp){
        return empMapper.updateEmp(emp);
    }
    public Emp empLogin(Emp emp){
        return empMapper.empLogin(emp);}
}
