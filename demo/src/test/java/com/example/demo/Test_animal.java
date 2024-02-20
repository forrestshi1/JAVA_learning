package com.example.demo;

import com.example.demo.Config.AppConfig;
import com.example.demo.def.Person;
import com.example.demo.pojo.BusinessPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_animal {
    public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    Person person = ctx.getBean(BusinessPerson.class);
    person.service();
    }
}
