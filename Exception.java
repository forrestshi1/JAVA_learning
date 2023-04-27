package default1;
//ctrl +alt+ t 选择包围
public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

        try {
            //尝试执行可能会引发异常的代码
            c = a / b;
        } catch (ArithmeticException e) {
            //捕获并处理算术异常
            System.err.println("除数不能为零");
        }finally {
            //无论是否发生异常，都会执行的代码
            System.out.println("finally");
        }

        System.out.println("结果： " + c);






    }




}
