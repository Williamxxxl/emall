package com.example.emall.mapper;

import com.example.emall.entity.Vclass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname VclassMapper
 * @Description TODO
 * @Date 2021/7/19 21:54
 * @Created by William
 */
@Mapper
public interface VclassMapper {
    @Select("select * from vclass")
    public List<Vclass> getClasses();
}
