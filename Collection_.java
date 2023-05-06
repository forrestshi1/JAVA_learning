package default1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection_ {
    public static void main(String[] args) {
        //1. 集合主要是两组(单列集合 , 双列集合)，单列集合用来存储一个一个的对象，双列集合用来存储键值对。
        //2. Collection 接口有两个重要的子接口 List Set , 他们的实现子类都是单列集合
        //3. Map 接口的实现子类 是双列集合，存放的 K-V 对

        //Collection
        //Map
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");


        HashMap hashMap = new HashMap();
        hashMap.put("NO1", "北京");


        //4. Collection 接口的常用方法
        List list = new ArrayList();
//        add:添加单个元素
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println("list=" + list);//[jack, 10, true]
//        remove:删除指定元素
        //list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        System.out.println("list=" + list);//[jack, 10]
//        contains:查找元素是否存在
        System.out.println(list.contains("jack"));//T
//        size:获取元素个数
        System.out.println(list.size());//2
//        isEmpty:判断是否为空
        System.out.println(list.isEmpty());//F
//        clear:清空
        list.clear();
        System.out.println("list=" + list);
//        addAll:添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list=" + list);//
//        containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//T
//        removeAll：删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list=" + list);//[聊斋]
//        说明：以ArrayList实现类来演示.
    }
}
