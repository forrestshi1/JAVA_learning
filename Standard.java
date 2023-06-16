package default2;

import java.util.Scanner;

public class Standard {
    public static void main(String[] args) {
        //System.in编译类型是InputStream，运行类型是BufferedInputStream
        //键盘输入的数据，都是先进入到内存的缓冲区中
       System.out.println(System.in.getClass());
       //System.out编译类型是PrintStream，运行类型是PrintStream
        //System.out是一个打印流，输出在控制台
         System.out.println(System.out.getClass());

         Scanner scanner = new Scanner(System.in);//创建一个扫描器对象，用于接收键盘数据
        System.out.println("使用next方式接收：");
        String next = scanner.next();//接收一个字符串，遇到空格就结束
        System.out.println("输出的内容为："+next);
    }
}
