package default1;
//boolean -> Boolean
//char -> Character
//byte -> Byte
//int -> Integer
//long -> long
//float -> Float
//double -> Double
//short -> Short
public class WrapperClass {
    public static void main(String args[]){
        //演示int <--> Integer 的装箱和拆箱
        //jdk5前是手动装箱和拆箱
        //手动装箱 int->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int->Integer
        Integer integer2 = n2; //底层使用的是 Integer.valueOf(n2)
        //自动拆箱 Integer->int
        int n3 = integer2; //底层仍然使用的是 intValue()方法

        //三元运算符【是一个整体】精度按照最高的来
        Object obj1 = true? new Integer(1) : new Double(2.0);
        System.out.println(obj1);// 什么? 1.0

        //两个对象，不能使用==比较
        Integer i1 = new Integer(1);
        Integer j1 = new Integer(1);
        System.out.println(i1 == j1);

        Integer m = 1; //底层 Integer.valueOf(1);
        Integer n = 1;//底层 Integer.valueOf(1);
        System.out.println(m == n); //T
        //所以，这里主要是看范围 -128 ~ 127 就是直接返回
        //，否则，就new Integer(xx)，创建新的对象，所以地址不一样
        Integer x = 128;//底层Integer.valueOf(1);
        Integer y = 128;//底层Integer.valueOf(1);
        System.out.println(x == y);//False
    }





    }

