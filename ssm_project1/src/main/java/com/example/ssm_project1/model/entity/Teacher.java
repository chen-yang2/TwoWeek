package com.example.ssm_project1.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : 老师实体类
 * package : com.example.ssm_project1.model.entity
 * Description : TODO
 *
 * @date : 2019/12/20 13:43
 * @Author : yangchen
 */
@Setter
@Getter
@ToString
public class Teacher {
    private int tid;
    private String tname;
    private Classes classes;
public Teacher(){

}
public Teacher(int tid,String tname,Classes classes){

}

}
