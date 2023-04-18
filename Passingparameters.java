import java.util.ArrayList;
import java.util.List;

public class Passingparameters {
    public static void main(String[] args) {
        int x = 10;
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println("调用方法前：x = " + x);
        System.out.println("调用方法前：list = " + list);
        changeValue(x, list);
        System.out.println("调用方法后：x = " + x);
        System.out.println("调用方法后：list = " + list);
    }

    public static void changeValue(int num, List<String> list) {
        num = 20;
        list.set(0, "orange");//传递对象类型时为引用传参 会改变值
        					//传递值类型时为值传参，函数内为形参，不改变实际值
    }
}
