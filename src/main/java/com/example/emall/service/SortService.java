package com.example.emall.service;

import com.example.emall.entity.Sort;
import com.example.emall.mapper.SortMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SortService
 * @Description TODO
 * @Date 2021/7/20 13:19
 * @Created by William
 */
@Service
public class SortService {
    @Autowired
    SortMapper sortMapper;
    public PageInfo<Sort> getSorts(String sname,int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Sort> sorts = sortMapper.getSorts(sname);
        PageInfo<Sort> sortPageInfo = new PageInfo<>(sorts);
        return sortPageInfo;
    }

    public int addSort(String sname){
        return sortMapper.addSort(sname);
    }

    public int delSort(int sid){
        return sortMapper.delSort(sid);
    }

    public int updateSort(String sname,int sid){
        return sortMapper.updateSort(sname,sid);
    }
}
