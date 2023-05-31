package default2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStream_ {
    public static void main(String[] args) {


    }
    @Test
    public void writeFile() throws IOException {
    //写入文件，如果不存在则创建
    String filePath = "d:\\test11.txt";
    FileOutputStream fileOutputStream = null;


        try {
            //得到FileOutputStream对象，用于写入数据到文件
            //new FileOutputStream(filePath)表示覆盖写入
            //new FileOutputStream(filePath,true)表示追加写入
            fileOutputStream = new FileOutputStream(filePath,true);

            //写入数据
//            fileOutputStream.write('A');
            //fileOutputStream.write("forrest is handsome".getBytes(),0,5);//写入部分数据
            fileOutputStream.write("ziz is ugly".getBytes());//追加写入
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            fileOutputStream.close();
        }


    }
}


