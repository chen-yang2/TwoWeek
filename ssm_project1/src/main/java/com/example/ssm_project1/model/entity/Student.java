package com.example.ssm_project1.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : 学生实体类
 * package : com.example.ssm_project1.model.entity
 * Description : TODO
 *
 * @date : 2019/12/20 13:42
 * @Author : yangchen
 */
@Setter
@Getter
@ToString
public class Student {
    private int sid;
    private String sname;
    private Classes classes;
    private String sex;
    private String birthplace;
    public Student(){

    }
    public Student(int sid,String sname,Classes classes,String sex,String birthplace){

    }
}
