package default1;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

//StringBuilder比StringBuffer更快，但是线程不安全，一般用于单线程，多线程用StringBuffer。用法和StringBuffer一样。
public class StringBuilder1 {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        java.lang.StringBuffer buffer = new java.lang.StringBuffer("");


        startTime = System.currentTimeMillis();//获取当前时间
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接 20000次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));





        java.lang.StringBuilder builder = new java.lang.StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder 拼接 20000次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));


        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }
}
