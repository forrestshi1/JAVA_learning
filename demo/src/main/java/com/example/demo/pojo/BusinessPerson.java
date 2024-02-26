package com.example.demo.pojo;

import com.example.demo.dao.Animal;
import com.example.demo.dao.Person;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {


//    @Autowired
//    @Qualifier("dog")  //无参
    private Animal animal = null; //

    public BusinessPerson(@Autowired @Qualifier("dog") Animal animal){
        this.animal = animal;  //有参
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        this.animal = animal;

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用BeanFactoryAware的setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用BeanNameAware的setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用DisposableBean的destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用InitializingBean的afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用ApplicationContextAware的setApplicationContext");
    }

    @PostConstruct
    public void init(){
        System.out.println("自定义初始化");
    }

    @PreDestroy
    public void destroy1 (){
        System.out.println("自定义销毁");
    }
}
