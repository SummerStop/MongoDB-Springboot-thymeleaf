package com.mongodb.main.service;

import com.mongodb.main.dao.UserDao;
import com.mongodb.main.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService{
    @Autowired
    private UserDao userDao;

    public User findUserByUsername(String username){
        System.out.println(username);
        System.out.println(userDao.findUserByUsername(username));
        return userDao.findUserByUsername(username);
    }
}
