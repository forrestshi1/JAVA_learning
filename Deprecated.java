package default1;
//@Deprecated" 是一个注解（Annotation），用于标记已经过时的类、方法、字段或构造函数。
public class Deprecated {
    public static void main(String[] args){
        A a = new A();
        a.show();
        System.out.println(a.n1);
        System.out.println(tt);

    }


    @java.lang.Deprecated
    static class A{
     void show(){
         System.out.println("show...");
     }
     public int n1 = 10;
    }

    @java.lang.Deprecated
    static String tt = "tt";
}
