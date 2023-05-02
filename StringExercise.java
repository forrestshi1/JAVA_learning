package default1;

public class StringExercise {
    public static void main(String[] args) {
        //String的intern()方法

        String s1 = "hspedu";  //s1 指向池中的 “hspedu”
        String s2 = "java"; // s2 指向池中的 “java”
        String s3 = new String("java");//指向堆中对象
        String s4 = "hspedujava";//指向常量池”java”
        //intern() 方法返回常量池地址
        String s6 = (s1 + s2).intern();//s6 指向池中的   “hspedujava”

        System.out.println(s2 == s3); //F, s2指向常量池，s3指向堆中对象
        System.out.println(s4 == s6); //T, s4指向常量池，s6指向常量池
        System.out.println(s4.equals(s6));//T, 比较内容



        //演示,String变量相加和常量相加的区别
        String a = "hello"; //创建 a对象
        String b = "abc";//创建 b对象

        String c = a + b;//底层使用的是 StringBuilder, c指向堆中的对象, value[] -> 池中 "helloabc"
        String d = "helloabc";//指向常量池
        System.out.println(c == d);//f
        String e = "hello" + "abc";//直接看池， e指向常量池
        System.out.println(d == e);//t
    }
}

