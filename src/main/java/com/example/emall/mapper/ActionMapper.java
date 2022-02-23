package com.example.emall.mapper;

import com.example.emall.entity.Action;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname ActionMapper
 * @Description TODO
 * @Date 2021/7/24 11:23
 * @Created by William
 */
@Mapper
public interface ActionMapper {
    @Select("select * from action")
    public List<Action> getActions();
}
