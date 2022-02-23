package com.example.emall.controller;

import com.example.emall.entity.Emp;
import com.example.emall.service.EmpService;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Classname EmpController
 * @Description TODO
 * @Date 2021/7/19 15:46
 * @Created by William
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    //服务器访问图片基本路径
    private static final String HEADPIC_SUBNAME="http://182.92.198.138:9001/img/";
    //图片上传后的路径
    private static final String FILEPATH="/home/mysoft/emall/headpic/";
    @Autowired
    EmpService empService;
    /**
     * @Description emp分页模糊查询
     * @param nickname
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<com.example.emall.entity.Emp>
     * @date 2021/7/19 16:05
     * @author William
     */
    @RequestMapping("/getEmps")
    public PageInfo<Emp> getEmps(String nickname, int pageNum, int pageSize){
        return empService.getEmps(nickname,pageNum,pageSize);
    }
    /**
     * @Description 禁用/解禁员工账户
     * @param emp
     * @return int
     * @date 2021/7/19 16:16
     * @author William
     */
    @RequestMapping("/changeState")
    public int changeState(@RequestBody Emp emp){
        return empService.changeState(emp);
    }
    /**
     * @Description 新员工建档
     * @param file
     * @param emp
     * @return int
     * @date 2021/7/19 18:33
     * @author William
     */
    @RequestMapping("/addEmp")
    public int addEmp(MultipartFile file, String emp ) {
//        String realPath = request.getSession().getServletContext().getRealPath("/img");
//        System.out.println(realPath);
        return empService.addEmp(getEmpInfo(file,emp));
    }
    /**
     * @Description 删除emp
     * @param eid
     * @return int
     * @date 2021/7/19 18:40
     * @author William
     */
    @RequestMapping("/delEmp")
    public int delEmp(int eid){
        return empService.delEmp(eid);
    }
    /**
     * @Description TODO
     * @param file
     * @param emp
     * @return int
     * @date 2021/7/20 10:59
     * @author William
     */
    @RequestMapping("/updateEmp")
    public int updateEmp(MultipartFile file, String emp ) {
        return empService.updateEmp(getEmpInfo(file,emp));
    }
    /**
     * @Description 收银员员工登录
     * @param emp
     * @return com.example.emall.entity.Emp
     * @date 2021/7/21 12:01
     * @author William
     */
    @RequestMapping("/empLogin")
    public Emp empLogin(@RequestBody Emp emp){
        System.out.println(8088);
        return empService.empLogin(emp);
    }

    /**
     * @Description 修改和添加共用方法
     * @param file
     * @param emp
     * @return com.example.emall.entity.Emp
     * @date 2021/7/27 8:48
     * @author William
     */
    public Emp getEmpInfo(MultipartFile file, String emp){
        String filePath = FILEPATH;//上传后的路径
        String filename = file.getOriginalFilename();//文件名
        String suffixname=filename.substring(filename.lastIndexOf("."));//后缀名
        filename= UUID.randomUUID()+suffixname;
        System.out.println(filename);
        File newfile = new File(filePath, filename);
        try {
            file.transferTo(newfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Emp emp1 = new Gson().fromJson(emp, Emp.class);
        emp1.setHeadpic(HEADPIC_SUBNAME+filename);
        return emp1;
    }

}
