package default2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        System.out.println("col=" + col);
        //1. 先得到 col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2. 使用while循环遍历, 显示所有的快捷键的的快捷键 ctrl + j,快速生成 while => itit
        System.out.println("===第1次遍历===");
        while (iterator.hasNext()) {//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj = iterator.next();
            System.out.println("while loop ->obj=" + obj);
        }
      // 当退出while循环后 , 这时iterator迭代器，,如果希望再次遍历，需要重置我们的迭代器->iterator = col.iterator();



        System.out.println("===第二次遍历===");
        for (Object o : col) {
            System.out.println("for loop ->book=" + o);
        }

        //增强for，也可以直接在数组使用

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
