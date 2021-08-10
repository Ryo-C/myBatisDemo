package com.ryo.mybatisdemo.springbootmybatis.model;

public class User {

    private Integer id;
    private String name;
    private String Position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", Position='" + Position + '\'' +
                ", id=" + id +
                '}';
    }
}
