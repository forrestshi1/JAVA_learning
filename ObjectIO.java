package default2;

import org.junit.Test;

import java.io.*;
//序列化有可继承性，如果父类没有实现序列化，子类实现了序列化，那么父类的属性也会被序列化
public class ObjectIO {
    public static void main(String[] args) throws IOException {
        //创建流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\test.txt"));
        //写入对象
        oos.writeInt(100);//写入基本类型数据,整数
        oos.writeBoolean(true);//写入基本类型数据,布尔类型
        oos.writeChar('a');//写入基本类型数据,字符类型
        oos.writeDouble(3.14);//写入基本类型数据,浮点类型
        oos.writeUTF("中国");//写入基本类型数据,字符串类型
        //写入对象
        oos.writeObject(new Person1("张三", 23,"blue","china"));//序列化对象
        oos.writeObject(new Person1("李四", 24,"white","japan"));//序列化对象
        //关闭流
        oos.close();
        System.out.println("写入完毕");
    }
    @Test
    public void OIS() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\test.txt"));
        //读取数据
        System.out.println(ois.readInt());//读取基本类型数据
        System.out.println(ois.readBoolean());//读取基本类型数据
        System.out.println(ois.readChar());//读取基本类型数据
        System.out.println(ois.readDouble());//读取基本类型数据
        System.out.println(ois.readUTF());//读取基本类型数据
        //读取对象
        System.out.println(ois.readObject());//反序列化对象
        System.out.println(ois.readObject());//反序列化对象
        //关闭流
        ois.close();



    }
}
 class Person1 implements java.io.Serializable {//实现序列化接口
    private String name;
    private int age;
     private static final long serialVersionUID = 1L;//序列化的版本号，可以提高兼容性,类似于升级版类的版本号

     //transient和static关键字修饰的变量不会被序列化
     //序列化对象时，如果对象的成员变量是一个对象，那么这个对象的类型也需要实现序列化接口
     private static String color;
     private transient String nation;

    public Person1(String name, int age, String color, String nation) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
    }

     public String toString() {
         return "person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", color='" + color + '\'' +
                 ", nation='" + nation + '\'' +
                 '}';
     }
}
