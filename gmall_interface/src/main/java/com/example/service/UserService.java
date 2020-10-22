package com.example.service;

import com.example.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddREssList(String userId);
}
