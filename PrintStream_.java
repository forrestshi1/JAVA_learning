package default2;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 演示PrintStream （字节打印流/输出流）
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        /*源码
             public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }

         */
        out.print("john, hello");
        //因为print底层使用的是write , 所以我们可以直接调用write进行打印/输出
        out.write("forrest".getBytes());//write() 方法是用于写入数据到输出流的方法，但是它的参数类型是字节数组（byte[]）
        out.close();

        //我们可以去修改打印流输出的位置/设备
        // public static void setOut(PrintStream out) {
        //        checkIO();
        //        setOut0(out); // native 方法，修改了out
        //   }
        System.setOut(new PrintStream("d:\\f1.txt"));
        System.out.println("hello,");


    }
}
