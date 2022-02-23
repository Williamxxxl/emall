package com.example.emall.mapper;

import com.example.emall.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname EmpMapper
 * @Description TODO
 * @Date 2021/7/19 15:28
 * @Created by William
 */
@Mapper
public interface EmpMapper {
    public List<Emp> getEmps(String nickname);
    public int changeState(Emp emp);
    public int addEmp(Emp emp);
    public int delEmp(int eid);
    public int updateEmp(Emp emp);
    public Emp empLogin(Emp emp);

}
