package com.example.demo;

import com.example.demo.Config.AppConfig;
import com.example.demo.pojo.ScopeBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BEAN_TEST {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);
        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
        System.out.println(scopeBean1 == scopeBean2);
    }

}
