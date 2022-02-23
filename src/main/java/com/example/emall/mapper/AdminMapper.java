package com.example.emall.mapper;

import com.example.emall.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname AdminMapper
 * @Description TODO
 * @Date 2021/7/19 15:07
 * @Created by William
 */
@Mapper
public interface AdminMapper {
    @Select("select * from admin where loginid=#{loginid} and loginpwd=#{loginpwd}")
    public Admin getLogin(Admin admin);
}
