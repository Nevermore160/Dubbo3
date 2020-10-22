package com.example.service.Impl;

import com.example.bean.UserAddress;
import com.example.service.OrderService;
import com.example.service.UserService;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心（暴露服务）
 *    1）导入dubbo依赖
 *    2)导入zookeeper的客户端
 *    3）配置服务器
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */

public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public void initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> userAddREssList = userService.getUserAddREssList(userId);
        System.out.println(userAddREssList);
    }
}
