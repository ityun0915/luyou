package com.gn.service;

import com.gn.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getUserList(Integer pn);
}
