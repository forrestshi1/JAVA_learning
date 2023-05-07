package default2;
// Vector底层是数组，线程安全，效率低，底层扩容机制，1.5倍
import java.util.Vector;

@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        //无参构造器
        //有参数的构造
        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
        System.out.println("vector.size()=" + vector.size());
        System.out.println("vector.capacity()=" + vector.capacity());//10，扩容机制，1.5倍
        System.out.println("vector.get(0)=" + vector.get(0));

    }
}
