package interface_1;

public interface AInterface {
    //写属性
    public int n1 = 10;//默认为public static final
    //写方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();

    //在jdk8后，可以有默认实现方法,需要使用default关键字修饰 可以直接调用，也可以被类覆盖重写
    default public void ok() {
        System.out.println("ok ...");
    }
    //在jdk8后, 可以有静态方法
    public static void cry() {
        System.out.println("cry ....");
    }
}
