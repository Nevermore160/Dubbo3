package com.example.service.Impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.bean.UserAddress;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心（暴露服务）
 *    1）导入dubbo依赖
 *    2)导入zookeeper的客户端
 *    3）配置服务器
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference  //远程引用，不用自动注入
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //1.查询用户的收货地址
        System.out.println("用户名:" + userId);

        List<UserAddress> userAddREssList = userService.getUserAddREssList(userId);
        for (UserAddress address : userAddREssList) {
            System.out.println(address.getUserAddress());
        }
        System.out.println(userAddREssList);
        return userAddREssList;
    }
}
