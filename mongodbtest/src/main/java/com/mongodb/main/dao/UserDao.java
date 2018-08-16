package com.mongodb.main.dao;

import com.mongodb.main.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

public interface UserDao extends MongoRepository<User, String>{
    /**
     * 根据用户名查询对象
     * @param username
     * @return
     */
    public User findUserByUsername(String username);

    /**
     * 更新对象
     * @param user
     */
     //public void updateUser(User user);

}