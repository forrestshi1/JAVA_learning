public class FinalExample {
    // 定义常量 MY_CONSTANT，使用 final 关键字表示该变量为不可变量 必须附初始值
    private final int MY_CONSTANT = 10;

    // 使用 final 关键字修饰方法，防止该方法被子类重写
    public final void printConstant() {
        System.out.println("The constant value is: " + MY_CONSTANT); // 打印常量值
    }

    // 使用 final 关键字修饰类，防止该类被继承，但可以实例化
    public final class FinalClass {
        // 类体
    }

    // 使用 final 关键字修饰参数，防止该参数被修改
    public void myMethod(final int myParam) {
        // 该方法无法修改 myParam 的值
    }
}
