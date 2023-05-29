package default2;
import org.junit.Test;

import java.io.File;

public class DirMethod {
    public static void main(String[] args) {

        //

    }
    @Test //文件删除(file.delete())
    //目录也被当做文件
    public void DelFile() {
        String filePath = "d:\\test1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("文件已删除");
            } else {
                System.out.println("文件删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    @Test //创建目录(file.mkdir()),创建多级目录(file.mkdirs())
    public void CreateDir() {
        String dirName = "d:\\test\\test1";
        File file = new File(dirName);
        if (file.exists()) {
            System.out.println("目录已存在");
        } else {
            if (file.mkdir()){
                System.out.println("目录创建成功");}
            else {
                System.out.println("目录创建失败");
            }
        }
    }





}
