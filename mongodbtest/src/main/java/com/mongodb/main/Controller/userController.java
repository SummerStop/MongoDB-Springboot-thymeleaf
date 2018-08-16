package com.mongodb.main.Controller;

import com.mongodb.main.dao.UserDao;
import com.mongodb.main.pojo.User;
import com.mongodb.main.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class userController {
    @Autowired
    private userService us;
    @Autowired
    private MongoTemplate mongoTemplate;

    //设置首页
    @RequestMapping(value = "/")
    public String index(){
        return "userLogin";
    }

    @RequestMapping(value = "/userLogin.action", method = RequestMethod.POST)
    public String userList(@Param("usernmae") String username, @Param("password") String password, Model model) {
        User user = us.findUserByUsername(username);
        System.out.println("username:"+username+"\npassword:"+password);
        if(user!= null){
            if(user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "loginSuccess";
            }
            else{
                System.out.println("密码不正确");
            }
        }
        else{
            System.out.println("用户不存在");
        }
        return "userLogin";
    }

    @ResponseBody
    @RequestMapping("/find")
    public List<User> find(){
        return mongoTemplate.findAll(User.class);
       }
}
