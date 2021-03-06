package com.ljsh.demo1.service;


import com.ljsh.demo1.dao.PersonDao;
import com.ljsh.demo1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName : 服务层传值
 * package : com.example.demo.service
 * Description : TODO
 *
 * @date : 2019/12/16 10:39
 * @Author : yangchen
 */
    @Service
    public class PersonService {
        @Autowired
        PersonDao personDao;

        /*
            Service层介于controller和dao之间作为服务层进行一些逻辑处理，
            这里逻辑太简单所以知识单纯调用dao所以不做注释
         */
        public List<Person> getAll(){
            return personDao.getAll();
        }

        public Person getPersonByID(int id){
            return personDao.getPersonByID(id);
        }

        public void  delete(int id){
            personDao.delete(id);
        }

        public void update(Person p){
            personDao.update(p);
        }

        public void newp(Person p){
            personDao.newp(p);
        }
    }
