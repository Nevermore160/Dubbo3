package com.example.service.Impl;

import com.example.bean.UserAddress;
import com.example.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddREssList(String userId) {
        UserAddress address1 = new UserAddress(1,"阿八八八","1","李老师","1234567890");
        UserAddress address2 = new UserAddress(2,"阿八八八吧","1","张老师","0987654321");

        return Arrays.asList(address1,address2);
    }
}
