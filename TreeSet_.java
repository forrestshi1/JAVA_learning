package default2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 韩顺平
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        //1. TreeSet 是SortedSet接口的实现类，可以排序

        //2. TreeSet 可以排序的方式有两种, 一种是自然排序，一种是定制排序
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用String的 compareTo方法进行字符串大小比较
                //按照长度大小排序
                //return ((String) o2).compareTo((String) o1);
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        //添加数据.
        treeSet.add("jack");
        treeSet.add("tom");//3
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");//3


        System.out.println("treeSet=" + treeSet);




    }
}
