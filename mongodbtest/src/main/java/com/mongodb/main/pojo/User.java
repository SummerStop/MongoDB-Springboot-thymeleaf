package com.mongodb.main.pojo;

import org.springframework.data.annotation.Id;

public class User {

    private String username;
    private String password;
    private String name;
    private int age;
    private String mail;
    private String sex;

    public User() {
        super();
    }

    public User(String username, String password, String name, int age, String mail, String sex) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
