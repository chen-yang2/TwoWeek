package com.example.ssm_project1.model.dao;

import com.example.ssm_project1.model.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName : 学生DAO接口
 * package : com.example.ssm_project1.model.dao
 * Description : TODO
 *
 * @date : 2019/12/20 13:42
 * @Author : yangchen
 */
public interface StudentDao {
    //查找所有学生信息
    public List<Student> findAll();
    //添加学生信息
    public void add(@Param("sname") String sname,@Param("cid") int cid,@Param("sex") String sex,@Param("birthplace") String birthplace);
    //根据学号查学生
    public Student findBySid(int sid);


}
