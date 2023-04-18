public class AndOr {
    boolean a = true;
    boolean b = false;
    int a1 = -1;
    static int b1 = 1;// main函数只能访问静态变量或者实例化类

    public static void main(String[] args) {
        AndOr andOr = new AndOr();
        if (andOr.a1 < 0 && AndOr.b1 > 0) {//&&表示and
            System.out.println("yes");
        } 
        if (andOr.a || andOr.b) { //||表示or
            System.out.println("no");
        }
    }
}
