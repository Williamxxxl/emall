package com.example.emall.mapper;

import com.example.emall.entity.Provider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Classname ProviderMapper
 * @Description TODO
 * @Date 2021/7/20 13:17
 * @Created by William
 */
@Mapper
public interface ProviderMapper {
    @Select("select * from provider where pname like concat('%',#{pname},'%') order by pid desc")
    public List<Provider> getProviders(String pname);
    @Insert("insert into provider(pname) value(#{pname})")
    public int addProvider(String pname);
    @Delete("delete from provider where pid=#{pid}")
    public int delProvider(int pid);
    @Update("update provider set pname=#{pname} where pid=#{pid}")
    public int updateProvider(String pname,int pid);
}
