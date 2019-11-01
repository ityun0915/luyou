package com.gn.service.impl;

import com.gn.mapper.UserMapper;
import com.gn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gn.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList(Integer pn) {

        List<User> userList = userMapper.getUserList();
        for(User user : userList){
            System.out.println("UserServiceImpl的 userlist:"+user.toString());
        }
        return userList;
    }
}
