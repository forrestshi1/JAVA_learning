package default2;
import org.junit.Test;

import java.io.*;

public class BufferRW_ {//抽象类
    public static void main(String[] args) throws IOException {
        String filepath = "d:\\test22.txt";
        //创建bufferedReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        //读取数据
        String line;//按行读取
        //返回Null时表示读取到文件末尾
        while((line = bufferedReader.readLine()) != null ){
            System.out.println(line);//读取一行数据
        }

        //关闭流
        bufferedReader.close();

    }

    @Test
    public void BufferWriter_() throws IOException {
        String filepath = "d:\\test22.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
            bw.write("forrest is handsome");
            bw.newLine();
            bw.write("ziz is ugly");
            //try 语句块中声明的 BufferedWriter 对象，会在语句块结束时自动关闭。无论是否发生异常，都会执行关闭。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
