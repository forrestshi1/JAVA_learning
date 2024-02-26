package com.example.demo.pojo;

import com.example.demo.dao.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫【\" + Cat.class.getSimpleName() + \"】是摸摸用的。");
    }
}
