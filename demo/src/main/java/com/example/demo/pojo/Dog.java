package com.example.demo.pojo;

import com.example.demo.def.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】是看门用的。");
    }
}
