package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")// 通过该注解将User类标注为一个Bean
public class User {
    @Value("1")
    private Long id;
    @Value("张三")
    private String name;
    @Value("note_1")
    private String note;

    // 赋值字符串
    @Value("#{'使用 Spring EL 赋值字符串'}")
    private String str = null;
    // 科学计数法赋值
    @Value("#{9.3E3}")
    private double d;
    // 赋值浮点数
    @Value("#{3.14}")
    private float pi;

    @Value("#{user.str?.toUpperCase()}")
    private String otherBeanProp = null;


    //数学运算
    @Value("#{1+2}")
    private int run;
//浮点数比较运算
    @Value("#{user.pi == 3.14f}")
    private boolean piFlag;
//字符串比较运算
    @Value("#{user.str eq 'Spring Boot'}")
    private boolean strFlag;
//字符串连接
    @Value("#{user.str + ' 连接字符串'}")
    private String strApp = null;
//三元运算
    @Value("#{user.d > 1000 ? '大于' : '小于'}")
    private String resultDesc = null;















    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public String getOtherBeanProp() {
        return otherBeanProp;
    }

    public void setOtherBeanProp(String otherBeanProp) {
        this.otherBeanProp = otherBeanProp;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public boolean isPiFlag() {
        return piFlag;
    }

    public void setPiFlag(boolean piFlag) {
        this.piFlag = piFlag;
    }

    public boolean isStrFlag() {
        return strFlag;
    }

    public void setStrFlag(boolean strFlag) {
        this.strFlag = strFlag;
    }

    public String getStrApp() {
        return strApp;
    }

    public void setStrApp(String strApp) {
        this.strApp = strApp;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
