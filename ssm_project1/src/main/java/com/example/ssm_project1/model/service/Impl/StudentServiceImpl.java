package com.example.ssm_project1.model.service.Impl;

import com.example.ssm_project1.model.dao.StudentDao;
import com.example.ssm_project1.model.entity.Student;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName : 学生服务实现类
 * package : com.example.ssm_project1.model.service.Impl
 * Description : TODO
 *
 * @date : 2019/12/20 13:44
 * @Author : yangchen
 */
public class StudentServiceImpl {
    @Resource
    private StudentDao studentDao;

    public List<Student> findAll(){
        return studentDao.findAll();
    }

    public void add(String sname,int cid,String sex,String birthplace){

    }

    public Student findBySid(int sid){
    return studentDao.findBySid(sid);
    }
}
