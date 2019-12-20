package com.example.ssm_project1.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : 班级实体类
 * package : com.example.ssm_project1.model.entity
 * Description : TODO
 *
 * @date : 2019/12/20 13:42
 * @Author : yangchen
 */
@Setter
@Getter
@ToString
public class Classes {
    private int cid;
    private String cname;
    public Classes(){

    }
    public Classes(int cid,String cname){

    }
}
