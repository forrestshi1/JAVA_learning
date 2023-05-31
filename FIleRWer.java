package default2;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleRWer {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "d:\\test11.txt";
        FileReader fileReader = null;
        int data = ' ';
        //创建filereader对象
        try {
            fileReader = new FileReader(filePath);
            //读取数据
            while ((data =  fileReader.read()) != -1) {//这里的fileReader.read()返回的是int类型
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null)
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }
    }

    @Test
    public void readfile2(){
        String filePath = "d:\\test11.txt";
        FileReader fileReader = null;
        int len = 0;
        char[] buf = new char[8];//每次读取8个字节
        //创建filereader对象
        try {
            fileReader = new FileReader(filePath);
            //读取数据
            while ((len =  fileReader.read(buf)) != -1) {//这里的fileReader.read()返回的是int类型
                System.out.println(new String(buf,0,len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null)
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }

    }

    @Test
    public void writefile() throws IOException {
        String filePath = "d:\\test22.txt";
        FileWriter fileWriter = new FileWriter(filePath,true);//true表示追加写入
        try {
            fileWriter.write("forrest is handsome");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null)
                try {
                    fileWriter.close();//fileWriter.close()会自动调用flush()方法，所以不用再调用flush()方法
                                        //如果不关闭流，那么数据只是保存在缓冲区，并没有写入文件
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }

    }


}
