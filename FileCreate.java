package default2;
import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class FileCreate {
    public static void main(String[] args) {
        // Create a file


    }
    //方式1：new File(String pathname)
    @Test
    public void create1() throws IOException {
        String filePath = "D:\\test.txt";
        File file = new File(filePath);

        file.createNewFile();
        System.out.println("File is created");
    }

    //方式2：new File(File parent, String child)
      @Test
    public void create2() throws IOException {
        File file  = new File("D:\\");//父目录
        String fileName = "test1.txt";//子目录
        File file1 = new File(file,fileName);
        file1.createNewFile();
        System.out.println("File is created");
    }

    //方式3：new File(String parent, String child) 根据父目录和子目录创建File对象
    @Test
    public void create3() throws IOException {
        String parentPath = "D:\\";
        String fileName = "test2.txt";
        File file = new File(parentPath,fileName);
        file.createNewFile();
        System.out.println("File is created");
    }







}