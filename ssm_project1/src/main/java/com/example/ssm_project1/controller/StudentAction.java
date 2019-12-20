package com.example.ssm_project1.controller;

import com.example.ssm_project1.model.entity.Student;
import com.example.ssm_project1.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName : 学生控制类
 * package : com.example.ssm_project1.controller
 * Description : TODO
 *
 * @date : 2019/12/20 13:41
 * @Author : yangchen
 */
@Controller
public class StudentAction {
    @Autowired
    //持有一个业务层对象
    private StudentService service;

    @RequestMapping("/findall")
    public String findAll(Model model){
        List<Student> list=service.findAll();
        model.addAttribute("student",list);
        return "show";
    }

    //ajax查询数据
    @RequestMapping("/findbysid")
    @ResponseBody
    public Student findBySid(@RequestParam("sid") int sid){
        return service.findBySid(sid);
    }

}
