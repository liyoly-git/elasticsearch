package com.example.elasticsearch.controller;

import com.example.elasticsearch.dao.UserDao;
import com.example.elasticsearch.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ly
 * @date 2019/12/23
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @PostMapping("/addUser")
    public  String addUser(String username,String password,Integer age){
        User user = new User();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return String.valueOf(userDao.save(user).getId());
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(Integer id){
        userDao.deleteById(id);
        return "success";
    }

    @PutMapping("/updateUser")
    public String updateUser(Integer id,String username,String password,Integer age){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return String.valueOf(userDao.save(user).getId());
    }

    @GetMapping("/getUser")
    public User getUser(Integer id){
        return userDao.findById(id).get();
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers(){
        return userDao.findAll();
    }
}
