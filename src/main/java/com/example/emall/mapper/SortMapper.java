package com.example.emall.mapper;

import com.example.emall.entity.Sort;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Classname SortMapper
 * @Description TODO
 * @Date 2021/7/20 13:09
 * @Created by William
 */
@Mapper
public interface SortMapper {
    @Select("select * from sort where sname like concat('%',#{sname},'%') order by sid")
    public List<Sort> getSorts(String sname);
    @Insert("insert into sort(sname) value(#{sname})")
    public int addSort(String sname);
    @Delete("delete from sort where sid=#{sid}")
    public int delSort(int sid);
    @Update("update sort set sname=#{sname} where sid=#{sid}")
    public int updateSort(String sname,int sid);
}
