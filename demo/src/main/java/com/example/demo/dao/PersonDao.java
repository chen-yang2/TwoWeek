package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName : 个人dao接口
 * package : com.example.demo.dao
 * Description : TODO
 *
 * @date : 2019/12/16 10:07
 * @Author : yangchen
 */


public interface PersonDao {
    /*
    查所有
    return List<Person>
     */
    List<Person> getAll();

    /*
    根据ID查询
    {id} 要查询人员的 id
     */
    Person getPersonByID(int id);

    /*
    删除
    {id} 要删除人员的 id
     */
    void delete(int id);

    /*
    更新
    {p} 要更新的Person实例
     */
    void update(Person p);

    /*
    增加
    {p} 要新增的Person实例
     */
    void newp(Person p);
}
