package com.example.demo;

import com.example.demo.Config.AppConfig;
import com.example.demo.pojp.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Test {
    private static Logger log = Logger.getLogger(String.valueOf(Test.class));
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getName());
    }
}
