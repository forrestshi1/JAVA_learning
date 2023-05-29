package default2;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

//字节输入流
public class FileInputStream_ {
    public static void main(String[] args) {


    }

    @Test
    public void test1() throws IOException {
        String filePath = "d:\\test.txt";
        int readdata = 0;

        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
             fileInputStream = new FileInputStream(filePath);
            //从输入流中读取数据的下一个字节，如果没有输入可用，则此方法将阻塞
            //如果返回-1，表示读取到文件的末尾
            while ((readdata = fileInputStream.read()) != -1) {
                System.out.print((char) readdata);//不换行
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //关闭此文件输入流并释放与此流有关的所有系统资源
            fileInputStream.close();
        }
    }

    @Test
    public void test2() throws IOException {
        String filePath = "d:\\test.txt";
        int readdata = 0;
        int readlen = 0;
        byte[] buf = new byte[8];//每次读取8个字节
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
             fileInputStream = new FileInputStream(filePath);
            //从输入流中读取数据的下一个字节，如果没有输入可用，则此方法将阻塞
            //如果返回-1，表示读取到文件的末尾
            //如果读取到的字节不足8个，就返回实际读取到的字节数
            while ((readlen = fileInputStream.read(buf)) != -1) {//这个表达式首先会执行 fileInputStream.read(buf) 方法，buf满了以后
                                                           // 将读取到的字节数赋值给变量 readlen，然后将 readlen 的值作为整个表达式的结果返回。
                System.out.print(new String(buf,0,readlen));//建一个新的字符串对象，它的内容是 buf 数组中从索引 0 开始
                                                               // 、长度为 readlen 的一段字节数据转换成的字符串。

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //关闭此文件输入流并释放与此流有关的所有系统资源
            fileInputStream.close();
        }
    }





}
