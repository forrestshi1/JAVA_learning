package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

@MapperScan(
        basePackages = "com.example.demo",
        annotationClass = Repository.class)
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class SqlApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SqlApplication.class, args);
    }
    // 注入事务管理器,它由 Spring Boot 自动生成
    @Autowired
    PlatformTransactionManager transactionManager = null;

    // 使用后初始化方法,观察自动生成的事务管理器
    @PostConstruct
    public void viewTransactionManager() {
// 启动前加入断点观测
        System.out.println(transactionManager.getClass().getName());
    }
}
