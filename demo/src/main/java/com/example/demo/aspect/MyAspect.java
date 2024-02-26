package com.example.demo.aspect;
import com.example.demo.impl.UserValidatorImpl;
import com.example.demo.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1) // 定义切面的优先级,值越小优先级越高
public class MyAspect {
    @DeclareParents(
            value= "com.example.demo.impl.UserServiceImpl+",
            defaultImpl= UserValidatorImpl.class) // 引入接口, value指定目标类, defaultImpl指定引入接口的实现类
    public UserValidator userValidator;
    @Pointcut("execution(* com.example.demo.impl.UserServiceImpl.printUser(..))")
    //execution 表示在执行的时候,拦截里面的正则匹配的方法; * 表示任意返回类型的方法;com.springboot.chapter4.aspect.service.impl.UserServiceImpl 指定目标对象的全限定名称;printUser 指定目标对象的方法; (..)表示任意参数进行匹配。
    public void pointCut() {
    }
    @Before("pointCut() && args(user)")//args(user)表示匹配的方法必须有一个User类型的参数
    public void beforeParam(JoinPoint point, User user) {
        Object[] args = point.getArgs();
        System.out.println("before ......");
    }
    @After("pointCut()")
    public void after() {
        System.out.println("after ......");
    }
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }
}