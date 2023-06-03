package default2;

import org.junit.Test;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\test2.txt",true));
        String line;//按行读取
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();


    }

    @Test
    public void BufferedIO() throws IOException {
        BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("d:\\jcw.jpg"));
        BufferedOutputStream BOS = new BufferedOutputStream(new FileOutputStream("d:\\jcw2.jpg"));

        //读写
        byte[] b = new byte[1024];//每次读取1024个字节
        int len;
        while ((len = BIS.read(b)) != -1) {
            BOS.write(b, 0, len);//写入,从0开始，写入len个字节
        }
        BIS.close();
        BOS.close();

    }
}
