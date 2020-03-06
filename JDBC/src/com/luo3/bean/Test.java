package com.luo3.bean;

import java.sql.Blob;
import java.util.Date;

public class Test {
    private int id;
    private String name;
    private Date birth;
    private Blob photo;

    public Test() {
    }

    public Test(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }




    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
