package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 需要导入springboot整合dubbo的依赖以及一些其他依赖
 */
@EnableDubbo
@SpringBootApplication
public class BootUserServicePrviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServicePrviderApplication.class, args);
    }

}
