package com.luo3.bean;

import java.util.Date;

/**
 *  ORM编程思想(object relational mapping)
 *  一个数据表对应一个java类
 *  表中一条记录对应java类中一个对象
 *  表中一个字段对应java类中一个属性
 */
public class User {
    private int id;
    private String name;
    private String password;
    private Date birth;

    public User() {
    }

    public User(int id, String name, String password, Date birth) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birth=" + birth +
                '}';
    }
}
