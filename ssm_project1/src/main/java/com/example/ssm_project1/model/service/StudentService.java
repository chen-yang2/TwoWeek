package com.example.ssm_project1.model.service;

import com.example.ssm_project1.model.entity.Student;

import java.util.List;

/**
 * ClassName : 学生服务接口
 * package : com.example.ssm_project1.model.service.Impl
 * Description : TODO
 *
 * @date : 2019/12/20 13:43
 * @Author : yangchen
 */
public interface StudentService {
    public List<Student> findAll();
    public void add(String sname,int cid,String sex,String birthplace);
    public Student findBySid(int sid);


}
